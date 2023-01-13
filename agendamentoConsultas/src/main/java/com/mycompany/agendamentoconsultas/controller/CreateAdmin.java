/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Admin;
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
public class CreateAdmin implements ActionListener {

    private AdminRegistrationScreenView screenView;

    public CreateAdmin(AdminRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DefaultListModel<Admin> model = (DefaultListModel<Admin>) screenView.getAdminList().getModel();

        try {
            model.addElement(new Admin(screenView.getJtRegistration().getText(),
                    screenView.getJtName().getText(),
                    screenView.getJtPhoneNumber().getText(),
                    screenView.getJtEmail().getText(),
                    screenView.getJtPassword().getText()));
        } catch (UserRegistrationException ex) {
            JOptionPane.showMessageDialog(screenView, ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        screenView.getAdminList().setModel(model);
        screenView.repaint();
    }
}
