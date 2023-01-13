/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.view.DoctorRegistrationScreenView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Fernando
 */
public class ListDoctors implements ListSelectionListener {

    private DoctorRegistrationScreenView screenView;

    public ListDoctors(DoctorRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = screenView.getDoctorList().getSelectedIndex();

        if (index != -1) {
            Doctor oDoutor = screenView.getDoctorList().getModel().getElementAt(index);

            screenView.getJtCrm().setText(oDoutor.getCrm());
            screenView.getJtSpecialty().setText(oDoutor.getSpecialty());
            screenView.getJtName().setText(oDoutor.getName());
            screenView.getJtPhoneNumber().setText(oDoutor.getPhoneNumber());
            screenView.getJtEmail().setText(oDoutor.getEmail());
            screenView.getJtPassword().setText(oDoutor.getPassword());

            screenView.setLastIndex(index);

        }

    }
}
