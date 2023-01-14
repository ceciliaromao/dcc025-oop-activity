/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.view.AgendaNoPacientScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class EditAgendaPacient implements ActionListener {
    private AgendaNoPacientScreenView screenView;
    private Pacient pacient;
    
    public EditAgendaPacient(AgendaNoPacientScreenView screenView,Pacient pacient){
        this.screenView = screenView;
        this.pacient = pacient;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Agenda> model = (DefaultListModel<Agenda>) screenView.getAgendaList().getModel();
        Agenda agendaOnEdit = model.getElementAt(screenView.getLastIndex());
        
         try {
            agendaOnEdit.setDatetime(screenView.getJtDate().getDate());
            agendaOnEdit.setDoctorName(screenView.getJtDoctorName().getText());
            agendaOnEdit.setPacientName(this.pacient.getName());
            agendaOnEdit.setDoctorSpecialty(screenView.getJtDoctorSpecialty().getText());

            
            JOptionPane.showMessageDialog(screenView, "Sucesso ao agendar consulta!");
        } catch (DateTimeException ex) {
            JOptionPane.showMessageDialog(screenView, ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        screenView.repaint();
    }
}