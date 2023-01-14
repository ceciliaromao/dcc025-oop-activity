/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.AdminLoginScreenView;
import com.mycompany.agendamentoconsultas.model.UserLists;
import com.mycompany.agendamentoconsultas.view.AdminMainScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class AuthAdmin implements ActionListener {
    private AdminLoginScreenView login;

    public AuthAdmin(AdminLoginScreenView login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<UserLists.getAdmins().size(); i++){
            if(UserLists.getAdmins().get(i).getRegistration().equals(login.getJtRegistration().getText()) 
                && UserLists.getAdmins().get(i).getPassword().equals(login.getJpPassword().getText())){
                login.getWindowFrame().setVisible(false);
                AdminMainScreenView adminView = new AdminMainScreenView(UserLists.getAdmins().get(i));
                adminView.buildScreen();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Por favor, tente novamente.", "Erro ao realizar login", JOptionPane.ERROR_MESSAGE);

    }
    
}
