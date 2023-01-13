/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.view.AdminRegistrationScreenView;
import com.mycompany.agendamentoconsultas.view.AgendaDoctorScreenView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Fernando
 */
public class ListAgendaDoctor implements ListSelectionListener {

    private AgendaDoctorScreenView screenView;

    public ListAgendaDoctor (AgendaDoctorScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = screenView.getAgendaList().getSelectedIndex();
        
        if(index != -1){
            Agenda aAgenda = screenView.getAgendaList().getModel().getElementAt(index);
            
            screenView.getJtDate().setDate(aAgenda.getDatetime());
            screenView.getJtDoctorName().setText(aAgenda.getDoctorName());
            screenView.getJtPacientName().setText(aAgenda.getPacientName());
            screenView.getJtDoctorSpecialty().setText(aAgenda.getDoctorSpecialty());
            
            screenView.setLastIndex(index);
            
        }
    }
}
