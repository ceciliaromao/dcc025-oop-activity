/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.view.AgendaNoPacientScreenView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Fernando
 */
public class ListAgendaNoPacient implements ListSelectionListener {

    private AgendaNoPacientScreenView screenView;
    private Pacient pacient;

    public ListAgendaNoPacient (AgendaNoPacientScreenView screenView,Pacient pacient) {
        this.screenView = screenView;
        this.pacient = pacient;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = screenView.getAgendaList().getSelectedIndex();
        
        if(index != -1){
            Agenda aAgenda = screenView.getAgendaList().getModel().getElementAt(index);
            if(aAgenda.getPacientName().equals("")){
                screenView.getJtDate().setDate(aAgenda.getDatetime());
                screenView.getJtDoctorName().setText(aAgenda.getDoctorName());
                screenView.getJtPacientName().setText(aAgenda.getPacientName());
                screenView.getJtDoctorSpecialty().setText(aAgenda.getDoctorSpecialty());

                screenView.setLastIndex(index);
            }
        }
    }
}
