package LabAssignment2;

import javax.swing.*;

public class Qno11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Salin");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu runMenu = new JMenu("Run");
        JMenu sourceMenu = new JMenu("Source");
        JMenu refactorMenu = new JMenu("Refactor");
        JMenu navigateMenu = new JMenu("Navigate");
        JMenu searchMenu = new JMenu("Search");
        JMenu projectMenu = new JMenu("Project");
        JMenu windowMenu = new JMenu("Window");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem openProject = new JMenuItem("Open Project");
        JMenuItem closeProject = new JMenuItem("Close Project");
        JMenuItem buildAll = new JMenuItem("Build All");
        JMenuItem buildProject = new JMenuItem("Build Project");

        projectMenu.add(openProject);
        projectMenu.add(closeProject);
        projectMenu.add(buildAll);
        projectMenu.add(buildProject);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(runMenu);
        menuBar.add(sourceMenu);
        menuBar.add(refactorMenu);
        menuBar.add(navigateMenu);
        menuBar.add(searchMenu);
        menuBar.add(projectMenu);
        menuBar.add(windowMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
