/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Admin;
import com.mycompany.agendamentoconsultas.view.AdminRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class DeleteAdmin implements ActionListener{
    private AdminRegistrationScreenView screenView;
    
    
    public DeleteAdmin(AdminRegistrationScreenView AdmScreenView){
        this.screenView = AdmScreenView;
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {    
        int selectedIndex = screenView.getAdminList().getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(screenView, "Selecione um Administrador para excluír.");
        } else {
            DefaultListModel<Admin> model = (DefaultListModel<Admin>) screenView.getAdminList().getModel();

            model.removeElementAt(selectedIndex);
            screenView.getAdminList().setModel(model);
            screenView.getAdminList().setSelectedIndex(selectedIndex);
            screenView.repaint();
        }
    }
}
