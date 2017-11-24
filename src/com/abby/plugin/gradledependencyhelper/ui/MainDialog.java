package com.abby.plugin.gradledependencyhelper.ui;


import com.abby.plugin.gradledependencyhelper.ThreadManager;
import com.abby.plugin.gradledependencyhelper.network.DetailBean;
import com.abby.plugin.gradledependencyhelper.network.GithubBean;
import com.abby.plugin.gradledependencyhelper.network.SearchApi;
import com.alibaba.fastjson.JSON;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import static javax.swing.JTable.AUTO_RESIZE_OFF;


public class MainDialog extends JDialog {

    public JButton copyButton;
    public JButton cancleButton;
    public JPanel contenPane;


    private JScrollPane listPane;
    private JList list1;
    private JLabel developer;
    private JLabel lastupdate;
    private JLabel home;
    private JPanel bottomPane;
    private JLabel description;


    private DetailBean mDetail;
    private String[] data;
    public MainDialog() {
        setContentPane(contenPane);
        setModal(true);
        setResizable(false);
        setTitle(MainWindow.mDependency);

        description.setPreferredSize(new Dimension(850,35));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setLocation(new Point(width / 2 - 250, height / 2 - 200));
        loadData();


        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getClickCount()==2){
                    copyToBoard();
                }
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyToBoard();
            }
        });

        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDialog.this.dispose();
            }
        });

    }

    private void getDetail(){
        String s= SearchApi.getDependency(MainWindow.mDependency,MainWindow.mDeveloper,false);
        if(s==null){
            return;
        }

        mDetail=JSON.parseObject(s,DetailBean.class);

        int size=mDetail.getResponse().getDocs().size();
        data=new String[size];
        for(int i=0;i<size;i++){
            data[i]=mDetail.getResponse().getDocs().get(i).getId();
        }

        list1.setListData(data);

    }

    private void getGithub(){
        String jsonString=SearchApi.getDependency(MainWindow.mDependency,null,true);
        GithubBean githubBean=JSON.parseObject(jsonString,GithubBean.class);

        if (githubBean != null && githubBean.getItems().size() != 0 && githubBean.getItems().get(0).getName().toUpperCase().equals(MainWindow.mDependency.toUpperCase())) {

            String disText = "<html><HTML><body>" + "Description: " + githubBean.getItems().get(0).getDescription() + "<br></body></html>";

            description.setText(disText);
            developer.setText("Developer: " + githubBean.getItems().get(0).getOwner().getLogin());
            lastupdate.setText("Last Update: " + githubBean.getItems().get(0).getUpdated_at());
            home.setText("<html><a href='" + githubBean.getItems().get(0).getHomepage() + "'>" + githubBean.getItems().get(0).getHomepage() + "</a></html>");
            home.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    try {
                        Runtime.getRuntime().exec("cmd.exe /c start " + githubBean.getItems().get(0).getHomepage());
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            });
            home.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseMoved(e);
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }

            });
        }
    }


    private void loadData(){

        ThreadManager.initThreadPool();
        ThreadManager.execute(new Runnable() {
            @Override
            public void run() {
                getGithub();
                getDetail();
            }
        });
    }

    private void copyToBoard(){
        if(list1==null || mDetail==null){
            return;
        }

        int index=list1.getSelectedIndex();
        String dependency="";
        try{
            dependency=mDetail.getResponse().getDocs().get(index).getId();
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


