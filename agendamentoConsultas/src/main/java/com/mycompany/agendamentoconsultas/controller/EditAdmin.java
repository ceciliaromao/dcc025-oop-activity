/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Admin;
import com.mycompany.agendamentoconsultas.model.UserLists;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.AdminRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class EditAdmin implements ActionListener {

    private AdminRegistrationScreenView screenView;

    public EditAdmin(AdminRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DefaultListModel<Admin> model = (DefaultListModel<Admin>) screenView.getAdminList().getModel();
        Admin admOnEdit = model.getElementAt(screenView.getLastIndex());
        
         try {
            admOnEdit.setRegistration(screenView.getJtRegistration().getText());
            admOnEdit.setName(screenView.getJtName().getText());
            admOnEdit.setPhoneNumber(screenView.getJtPhoneNumber().getText());
            admOnEdit.setEmail(screenView.getJtEmail().getText());
            
            JOptionPane.showMessageDialog(screenView, "Sucesso ao atualizar Administrador!");
        } catch (UserRegistrationException ex) {
            JOptionPane.showMessageDialog(screenView, ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        screenView.repaint();
    }
}
