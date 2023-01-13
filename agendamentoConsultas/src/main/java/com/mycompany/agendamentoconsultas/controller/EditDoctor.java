/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.DoctorRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class EditDoctor implements ActionListener {
    private DoctorRegistrationScreenView screenView;
    
    public EditDoctor(DoctorRegistrationScreenView screenView){
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Doctor> model = (DefaultListModel<Doctor>) screenView.getDoctorList().getModel();
        Doctor docOnEdit = model.getElementAt(screenView.getLastIndex());
        
         try {
            docOnEdit.setCrm(screenView.getJtCrm().getText());
            docOnEdit.setSpecialty(screenView.getJtSpecialty().getText());
            docOnEdit.setName(screenView.getJtName().getText());
            docOnEdit.setPhoneNumber(screenView.getJtPhoneNumber().getText());
            docOnEdit.setEmail(screenView.getJtEmail().getText());
            
            JOptionPane.showMessageDialog(screenView, "Sucesso ao atualizar Médico!");
        } catch (UserRegistrationException ex) {
            JOptionPane.showMessageDialog(screenView, ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        screenView.repaint();
    }
}