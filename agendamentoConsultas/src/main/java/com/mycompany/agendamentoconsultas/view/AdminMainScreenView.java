/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.model.Admin;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class AdminMainScreenView extends JFrame{
    private JPanel screenPanel;
    private Admin admin;
    
    public AdminMainScreenView(Admin admin){
        this.admin = admin;
    }
    
    public void display(){
        this.add(this.screenPanel);
        this.setVisible(true);
    }
    
    public void createWindow(){
        this.setSize(320, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.screenPanel = new JPanel();
        this.screenPanel.setLayout(new BorderLayout());
    }
    
    private void createMenu(){
        
        JPanel jpButtons = new JPanel();
        jpButtons.setBorder(BorderFactory.createTitledBorder("Paciente: " + admin.getName()));
        jpButtons.setLayout(new FlowLayout());
        jpButtons.setPreferredSize(new Dimension(300, 180));
        
        JButton btnPacient = new JButton("Registro de Pacientes");
        btnPacient.addActionListener((ActionEvent e) -> {
            goToPacientRegistration();
        });
        jpButtons.add(btnPacient);
        
        JButton btnDoctor = new JButton("Registro de Médicos");
        btnDoctor.addActionListener((ActionEvent e) -> {
            goToDoctorRegistration();
        });
        jpButtons.add(btnDoctor);
        
        JButton btnAdmin = new JButton("Registro de Administradores");
        btnAdmin.addActionListener((ActionEvent e) -> {
            goToAdminRegistration();
        });
        jpButtons.add(btnAdmin);
        
        this.screenPanel.add(jpButtons, BorderLayout.WEST);
    }
    
    private void goToPacientRegistration(){
        this.setVisible(false);
        PacientRegistrationScreenView newView = new PacientRegistrationScreenView();
        newView.display();
    }
    
    private void goToDoctorRegistration(){
        this.setVisible(false);
        DoctorRegistrationScreenView newView = new DoctorRegistrationScreenView();
        newView.display();
    }
    
    private void goToAdminRegistration(){
        this.setVisible(false);
        AdminRegistrationScreenView newView = new AdminRegistrationScreenView();
        newView.display();
    }
    
    public void buildScreen(){
        createWindow();
        createMenu();
        display();
    }
}
