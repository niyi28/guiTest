package com.company;
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*https://www.guru99.com/java-swing-gui.html*/
          /*  JFrame frame = new JFrame("Hangman Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            JButton button = new JButton("Press");
            JButton button1 = new JButton("My Lord, My Lord");
            frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.getContentPane().add(button1); // Adds Button to content pane of frame
            frame.setVisible(true);*/

        JFrame frame = new JFrame("Hangman Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("FILE");
        JMenu help = new JMenu("Help");
        JMenu shiva = new JMenu("Shiva");
        mb.add(file);
        mb.add(help);
        mb.add(shiva);

        JMenuItem underFile1 = new JMenuItem("Open");
        JMenuItem underFile2 = new JMenuItem("Save as");
        file.add(underFile1);
        file.add(underFile2);

        JMenuItem underHelp = new JMenuItem("You can check the internet");

        help.add(underHelp);


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
        frame.getContentPane().add(BorderLayout.NORTH, mb); // Adds Button to content pane of frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel); // Adds Button to content pane of frame
        frame.getContentPane().add(BorderLayout.CENTER, ta); // Adds Button to content pane of frame
        // Adds Button to content pane of frame

        frame.setVisible(true);
    }
}
