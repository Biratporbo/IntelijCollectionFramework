//In this program, push button works with lambda expression -- version 2

package Java8.LambdaExpressions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaDemo10
{
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

        //create frame
        JFrame f = new JFrame("Understanding lambda expressions");

        //add button to the frame
        f.add(but);

        //set the size of the frame
        f.setSize(500, 350);

        //display the frame
        f.setVisible(true);

        //close the frame when close button of frame is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
