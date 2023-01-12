/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.DoctorLoginScreenView;
import com.mycompany.agendamentoconsultas.model.UserLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class AuthDoctor implements ActionListener {
    private DoctorLoginScreenView login;

    public AuthDoctor(DoctorLoginScreenView login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<UserLists.getDoctors().size(); i++){
            if(UserLists.getDoctors().get(i).getCrm().equals(login.getJtCRM().getText()) 
                && UserLists.getDoctors().get(i).getPassword().equals(login.getJpPassword().getText())){
                login.getWindowFrame().setVisible(false);
                
                //Open agenda (tela principal)
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Por favor, tente novamente.", "Erro ao realizar login", JOptionPane.ERROR_MESSAGE);

    }
    
}
