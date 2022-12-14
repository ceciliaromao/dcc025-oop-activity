/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.utils.FileUtils;
import java.awt.BorderLayout;
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
        
        JButton btnSecretaria = new JButton("Paciente");
        btnSecretaria.addActionListener(new LoginPacient(this));
        jpButtons.add(btnSecretaria);
        
        JButton btnMedico = new JButton("Sou médico(a)");
        btnMedico.addActionListener(new LoginMedico(this));
        jpButtons.add(btnMedico);
        
        this.principal.add(jpButtons, BorderLayout.WEST);
    }
    
    public void createScreenView(){
        createWindow();
        createLogin();
    }
}
