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

/**
 *
 * @author Fernando
 */
public class CreateDoctor implements ActionListener {

    private DoctorRegistrationScreenView screenView;

    public CreateDoctor(DoctorRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       DefaultListModel<Doctor> model = (DefaultListModel<Doctor>) screenView.getDoctorList().getModel();

        try {
            model.addElement(new Doctor(screenView.getJtCrm().getText(),
                    screenView.getJtSpecialty().getText(),
                    screenView.getJtName().getText(),
                    screenView.getJtPhoneNumber().getText(),
                    screenView.getJtEmail().getText(),
                    screenView.getJPasswordField().getPassword().toString()));
        } catch (UserRegistrationException ex) {
            System.out.println("Algo deu errado ao criar o Médico: " + ex.getMessage());
        }
        screenView.getDoctorList().setModel(model);
        screenView.repaint();
    }
}
