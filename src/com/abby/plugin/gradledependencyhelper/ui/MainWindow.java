package com.abby.plugin.gradledependencyhelper.ui;


import com.abby.plugin.gradledependencyhelper.ThreadManager;
import com.abby.plugin.gradledependencyhelper.network.MavenBean;
import com.abby.plugin.gradledependencyhelper.network.SearchApi;
import com.alibaba.fastjson.JSON;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import org.apache.http.util.TextUtils;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.JTable.AUTO_RESIZE_OFF;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    public static String mDependency=null;
    public static String mDeveloper=null;
    private JPanel mTopPanel;
    private JPanel mBottomPanel;
    private JScrollPane mTablePanel;
    private JBTable mTable;
    private JTextField mName;
    private MavenBean mData;
    public MainWindow() {
        super();
        setPreferredSize(new Dimension(1000,600));
        setTitle("GradleDependencyHelper");
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)screenSize.getWidth();
        int height=(int)screenSize.getHeight();
        setLocation(new Point(width/2-500,height/2-300));
        initUI();
        setVisible(true);
        setResizable(false);

    }

    private void initUI() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        mTopPanel=new JPanel();
        mTopPanel.setPreferredSize(new Dimension(1000,60));
        mTopPanel.setLayout(new BorderLayout());
        mTopPanel.setBorder(BorderFactory.createEmptyBorder(10,100,10,100));
        mTopPanel.add(new JLabel("Dependency Name:"),BorderLayout.WEST);
        mName=new JTextField();
        mTopPanel.add(mName,BorderLayout.CENTER);
        JButton searchButton=new JButton("search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThreadManager.initThreadPool();
                ThreadManager.execute(new Runnable() {
                    @Override
                    public void run() {
                        onSearch();
                    }
                });

            }
        });


        mName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()==KeyEvent.VK_ENTER){
                    ThreadManager.initThreadPool();
                    ThreadManager.execute(new Runnable() {
                        @Override
                        public void run() {
                            onSearch();
                        }
                    });
                }
            }
        });


        mTopPanel.add(searchButton,BorderLayout.EAST);
        c.add(mTopPanel,BorderLayout.NORTH);

        mTable=new JBTable();
        mTable.setFont(new Font("Serif",Font.PLAIN,30));
        mTable.setAutoResizeMode(AUTO_RESIZE_OFF);
        mTable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()==KeyEvent.VK_COPY){
                    copyToBoard();
                }
            }
        });

        mTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){

                    mDependency=mData.getResponse().getDocs().get(mTable.getSelectedRow()).getA();
                    mDeveloper=mData.getResponse().getDocs().get(mTable.getSelectedRow()).getG();
                    MainDialog mDialog=new MainDialog();
                    mDialog.pack();
                    mDialog.setVisible(true);

                }
            }
        });



        mTablePanel=new JBScrollPane(mTable);
        mTablePanel.setPreferredSize(new Dimension(1000,490));
        mTablePanel.setLayout(new ScrollPaneLayout());

        c.add(mTablePanel,BorderLayout.CENTER);


        JButton cancelButton=new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        cancelButton.setPreferredSize(new Dimension(100,50));


        JButton copyButton=new JButton("Copy");
        copyButton.setPreferredSize(new Dimension(100,50));
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyToBoard();
            }
        });



        mBottomPanel=new JPanel();
        mBottomPanel.setPreferredSize(new Dimension(1000,50));
        mBottomPanel.setLayout(new BorderLayout());
        mBottomPanel.setBorder(BorderFactory.createEmptyBorder(0,780,0,20));
        mBottomPanel.add(copyButton,BorderLayout.WEST);
        mBottomPanel.add(cancelButton,BorderLayout.EAST);
        c.add(mBottomPanel,BorderLayout.SOUTH);

    }

    public static void main(String args[]) {
        new MainWindow();
    }


    private void onSearch(){
        String s=mName.getText();
        if(TextUtils.isEmpty(s)){
            return;
        }
        String jsonString= SearchApi.getDependency(s,null,false);
        if(jsonString==null){
            return;
        }

        mData= JSON.parseObject(jsonString,MavenBean.class);
        if(mData==null){
            return;
        }
        int size=mData.getResponse().getDocs().size();
        Object[][] tableData=new Object[size][2];

        for(int i=0;i<size;i++){
            tableData[i][0]=mData.getResponse().getDocs().get(i).getId();
            tableData[i][1]=mData.getResponse().getDocs().get(i).getLatestVersion();
        }
        Object[] columnNames = {"Dependency","LatestVersion"};

        if(tableData.length==0){
            return;
        }
        mTable.setModel(new DefaultTableModel(tableData,columnNames){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        mTable.getColumnModel().getColumn(0).setPreferredWidth(750);
        mTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        mTable.setRowHeight(30);
        mTable.revalidate();

    }


    private void copyToBoard(){

        if(mTable==null || mData==null){
            return;
        }
        int row=mTable.getSelectedRow();
        String dependency="";
        try{
            dependency=mData.getResponse().getDocs().get(row).getId()+":"+mData.getResponse().getDocs().get(row).getLatestVersion();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        JTextArea area=new JTextArea(dependency);
        area.setText(dependency);
        area.selectAll();
        area.copy();
        JOptionPane.showMessageDialog(null,"You have successfully copy the dependency: "+dependency+"\nTurn to your gradle file and press ctrl+v to paste.","Tip", JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
    }

}
