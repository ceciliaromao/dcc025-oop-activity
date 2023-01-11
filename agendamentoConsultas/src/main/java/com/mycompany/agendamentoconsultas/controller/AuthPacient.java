/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.UserLists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mariacecilia
 */
public class AuthPacient implements ActionListener {
    private LoginPacient login;

    public AuthPacient(LoginPacient login) {
        this.login = login;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<UserLists.getPacients().size(); i++){
            if(UserLists.getPacients().get(i).getCpf().equals(login.getJtCPF().getText()) 
                && UserLists.getPacients().get(i).getPassword().equals(login.getJpPassword().getText())){
                login.getWindowFrame().setVisible(false);
                
                //Open agenda (tela principal)
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Por favor, tente novamente.", "Erro ao realizar login", JOptionPane.ERROR_MESSAGE);

    }
    
}
