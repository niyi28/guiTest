package com.company;
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
        /*https://www.youtube.com/watch?v=G4jMzEGMKfg
        https://stackoverflow.com/questions/38907492/is-there-a-wysiwyg-option-for-intellij-idea-when-creating-a-gui-like-netbeans
*/
        // write your code here
        /*https://www.guru99.com/java-swing-gui.html*/
          /*  JFrame frame = new JFrame("Hangman Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            JButton button = new JButton("Press");
            frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.getContentPane().add(button1); // Adds Button to content pane of frame
            frame.setVisible(true);*/
        /*System.out.println("HOW TO PLAY \n ===========");
        System.out.println(username + ", use your keyboard and guess each letter in the word. \nIf you guess right, you get two points and if you guess wrong, you loose a point. BEST OF LUCK !");
        System.out.println("Press: P for PLAY");
        System.out.println("Press: I for INSTRUCTIONS");
        System.out.println("Press: C for CREDITS");
        System.out.println("Press: Q for QUIT");*/
        JFrame frame = new JFrame("Hangman Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JMenuBar gameOverview = new JMenuBar();
        JMenu play = new JMenu("Play");
        JMenu leaderBoard = new JMenu("Leader Board");
        JMenu instructions = new JMenu("Instructions");
        JMenu credits = new JMenu("Credits");
        JMenu quit = new JMenu("Quit");
        gameOverview.add(play);
        gameOverview.add(instructions);
        gameOverview.add(leaderBoard);
        gameOverview.add(credits);
        gameOverview.add(quit);




        JMenuItem underHelp = new JMenuItem("You can check the internet");

        instructions.add(underHelp);


        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        /*FlowLayout layout = new FlowLayout(FlowLayout.CENTER);*/
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        JTextArea ta = new JTextArea();
        /*frame.setLayout(layout);*/
        frame.getContentPane().add(BorderLayout.NORTH, gameOverview); // Adds Button to content pane of frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel); // Adds Button to content pane of frame
        frame.getContentPane().add(BorderLayout.CENTER, ta); // Adds Button to content pane of frame
        // Adds Button to content pane of frame

        frame.setVisible(true);
    }
}
