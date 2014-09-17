

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComputerParts extends JApplet implements ActionListener{
    //step1 declare objects you need
    JButton btnram, btnhdd, btnmboard;
    JButton btnpower, btnoptical, btncpu, btnvideo;
    JLabel lblanswer;
    String htmlstyle="<HTML><FONTFACE=Arial><p style='padding:10px; background-color:black; color:white; font-size:16px;'>";
            
public void init() {
    //step2 create objects
        btnram=new JButton("RAM");
        btnhdd=new JButton("Hard Disk");
        btnmboard=new JButton("Motherboard");
        btnpower=new JButton("Power Supply");
        btnoptical=new JButton("Optical Drive");
        btncpu=new JButton("CPU");
        btnvideo=new JButton("Video Card");
        lblanswer=new JLabel("Definition goes here");
        
    //step3 add components to applet
        setLayout (new FlowLayout());
        add(btncpu);
        add(btnram);
        add(btnmboard);
        add(btnhdd);
        add(btnpower);
        add(btnoptical);
        add(btnvideo);
        add(lblanswer);
    
        //step4 attach buttons to button code
        btncpu.addActionListener(this);
        btnram.addActionListener(this);
        btnmboard.addActionListener(this);
        btnpower.addActionListener(this);
        btnoptical.addActionListener(this);
        btnhdd.addActionListener(this);
        btnvideo.addActionListener(this);
        
        
}

  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btncpu)lblanswer.setText(htmlstyle+"CPU is the brains of the computer");
        if (e.getSource()==btnram)lblanswer.setText(htmlstyle+"RAM stands for Random Access Memory.<br> It is temporary memory for programs in use.");
        if (e.getSource()==btnmboard)lblanswer.setText(htmlstyle+"The motherboard serves to connect all<br>of the parts of a computer together.");
        if (e.getSource()==btnhdd)lblanswer.setText(htmlstyle+"The hard drive is the computer's main storage media<br>device that permanently stores all data<br>on the computer.");
        if (e.getSource()==btnpower)lblanswer.setText(htmlstyle+"Optical drives retrieve and/or store data on optical<br>discs like CDs, DVDs, and BDs (Blu-ray discs).");
        if (e.getSource()==btnoptical)lblanswer.setText(htmlstyle+"Power supply converts mains AC to low-voltage<br>regulated DC power for the internal components<br>of a computer.");
        if (e.getSource()==btnvideo)lblanswer.setText(htmlstyle+"Video card is an expansion card which generates<br>a feed of output images to a display.");
    }
}

