package Java8.LambdaExpressions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaDemo9 {

    public static void main(String[] args) {

        // Create a push button with label
        JButton but = new JButton("Click this button");

        // Passing anonymous inner class to addActionListener()
        but.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Anonymous inner class demo");
            }
        });

        // Create frame
        JFrame f = new JFrame("Understanding lambda expressions");

        // Add button to the frame
        f.add(but);

        // Set the size of the frame
        f.setSize(500, 350);

        // Display the frame
        f.setVisible(true);

        // Close the frame when close button is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}