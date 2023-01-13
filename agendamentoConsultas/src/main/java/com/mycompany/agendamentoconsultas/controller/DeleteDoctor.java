/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.view.DoctorRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Fernando
 */
public class DeleteDoctor implements ActionListener{
    
    private DoctorRegistrationScreenView screenView;
        
    public DeleteDoctor(DoctorRegistrationScreenView DocScreenView){
        this.screenView = DocScreenView;
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {
       int selectedIndex = screenView.getDoctorList().getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(screenView, "Selecione um Médico para excluír.");
        } else {
            DefaultListModel<Doctor> model = (DefaultListModel<Doctor>) screenView.getDoctorList().getModel();

            model.removeElementAt(selectedIndex);
            screenView.getDoctorList().setModel(model);
            screenView.getDoctorList().setSelectedIndex(selectedIndex);
            screenView.repaint();
        }
    }
}
