/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.PacientLoginScreenView;
import com.mycompany.agendamentoconsultas.model.UserLists;
import com.mycompany.agendamentoconsultas.view.PacientMainScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class AuthPacient implements ActionListener {
    private PacientLoginScreenView login;

    public AuthPacient(PacientLoginScreenView login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<UserLists.getPacients().size(); i++){
            if(UserLists.getPacients().get(i).getCpf().equals(login.getJtCPF().getText()) 
                && UserLists.getPacients().get(i).getPassword().equals(login.getJPassword().toString())){
                login.getWindowFrame().setVisible(false);
                PacientMainScreenView pacientView = new PacientMainScreenView(UserLists.getPacients().get(i));
                pacientView.buildScreen();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Por favor, tente novamente.", "Erro ao realizar login", JOptionPane.ERROR_MESSAGE);

    }
    
}
