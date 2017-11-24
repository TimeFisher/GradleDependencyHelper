package com.abby.plugin.gradledependencyhelper.actions;

import com.abby.plugin.gradledependencyhelper.ui.MainWindow;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class FindDependencyAction extends AnAction {


    private MainWindow window;
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

        window=new MainWindow();
        window.pack();
        window.setVisible(true);
    }
}
