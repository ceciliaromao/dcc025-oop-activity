/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.LoginPacient;
import com.mycompany.agendamentoconsultas.utils.FileUtils;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mariacecilia
 */
public class ScreenView extends JFrame{
    private JPanel mainScreen;
    
    public ScreenView(){}
    
    private void display(){
        this.add(this.mainScreen);
        this.setVisible(true);
    }
    
    public void createWindow(){
        this.setSize(320, 140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new FileUtils(this));
        this.mainScreen = new JPanel();
        this.mainScreen.setLayout(new BorderLayout());
    }
    
    private void createLogin(){
        
        JPanel jpButtons = new JPanel();
        jpButtons.setBorder(BorderFactory.createTitledBorder("Login"));
        jpButtons.setLayout(new FlowLayout());
        jpButtons.setPreferredSize(new Dimension(150, 180));
        
        JButton btnPacient = new JButton("Paciente");
        btnPacient.addActionListener(new LoginPacient(this));
        jpButtons.add(btnPacient);  
        
        this.mainScreen.add(jpButtons, BorderLayout.WEST);
    }
    
    public void createScreenView(){
        createWindow();
        createLogin();
    }
}
