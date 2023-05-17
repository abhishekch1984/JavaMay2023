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
     JButton button = new JButton("click");
     JTextField tf = new JTextField();
     button.setBounds(165, 135, 115, 55);
     tf.setBounds(180, 145, 130, 70); 
     // adding button on frame
     add(button);
     add(tf);
     // setting close operation
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     setSize(400, 500);
     setLayout(null);
     setVisible(true);
 }
  
 public static void main(String[] args)
 {
     new frameTest();
 }
}
