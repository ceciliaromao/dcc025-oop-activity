/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.view.AgendaPacientScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fernando
 */
public class CreateAgendaPacient implements ActionListener {

    private AgendaPacientScreenView screenView;

    public CreateAgendaPacient(AgendaPacientScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Agenda> model = (DefaultListModel<Agenda>) screenView.getAgendaList().getModel();

        try {
            model.addElement(new Agenda(
                    screenView.getJtDate().getDate(),
                    screenView.getJtPacientName().getText(),
                    screenView.getJtDoctorName().getText(),
                    screenView.getJtDoctorSpecialty().getText()));
                    
        } catch (DateTimeException ex) {
            System.out.println("Algo deu errado ao criar o Horário " + ex.getMessage());
        }
        screenView.getAgendaList().setModel(model);
        screenView.repaint();

    }
}
