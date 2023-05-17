package com.sbi;

import javax.swing.*;

//inheriting JFrame
public class frameTest extends JFrame
{
 JFrame frame;
 frameTest()
 {
     setTitle("this is also a title");

     // create button
     JButton button = new JButton("Find Now");
     JTextField tf = new JTextField();
     button.setBounds(165, 135, 115, 55);
     tf.setBounds(10, 135, 115, 55); 
     // adding button on frame
     add(button);
     add(tf);
     String val = tf.getText();
     // setting close operation
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     setSize(400, 500);
     setLayout(null);
     setVisible(true);
     
 }
 String onClk(String v) {
	 return "Hi i am " + v; 
 }
 
 public static void main(String[] args)
 {
     new frameTest();
 }
 
}
