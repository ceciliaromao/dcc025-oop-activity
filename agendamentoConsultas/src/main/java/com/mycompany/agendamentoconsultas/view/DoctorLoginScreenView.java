/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.AuthDoctor;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class DoctorLoginScreenView implements ActionListener {
    private ScreenView screenView;
    private JFrame windowFrame;
    private JPanel mainPanel;
    private JTextField jtCRM;
    private JPasswordField jpPassword;

    public DoctorLoginScreenView(ScreenView screenView) {
        this.screenView = screenView;
        this.windowFrame = new JFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        displayLogin();
        screenView.setVisible(false);
    }

    public JTextField getJtCRM() {
        return jtCRM;
    }

    public JPasswordField getJpPassword() {
        return jpPassword;
    }

    public JFrame getWindowFrame() {
        return windowFrame;
    }
    
    private void displayLogin(){
        createWindow();
        createLogin();
        windowFrame.add(this.mainPanel);
        windowFrame.setVisible(true);
    }
    
    private void createWindow(){
        windowFrame.setSize(250, 140);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
    }
    
    private void cancelLogin(){
        windowFrame.setVisible(false);
        ScreenView newScreen = new ScreenView();
        newScreen.buildScreen();
    }
    
    private void createLogin(){
        int size = 15;
        
        JPanel jpLogin = new JPanel();
        JPanel jpButtons = new JPanel();
        
        jpLogin.add(new JLabel("CRM:"));
        this.jtCRM = new JTextField(size);
        jpLogin.add(this.jtCRM);
        
        jpLogin.add(new JLabel("Senha:"));
        this.jpPassword = new JPasswordField(size);
        jpLogin.add(this.jpPassword);
        
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.addActionListener(new AuthDoctor(this));
        jpButtons.add(btnEntrar);
        
        JButton btnCancel = new JButton("Cancelar");
        btnCancel.addActionListener((ActionEvent e) -> {
            cancelLogin();
        });
        jpButtons.add(btnCancel);
        
        this.mainPanel.add(jpLogin, BorderLayout.CENTER);
        this.mainPanel.add(jpButtons, BorderLayout.SOUTH);
        
    }
}
