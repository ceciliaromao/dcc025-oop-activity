/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.view.AgendaPacientScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class DeleteAgendaPacient implements ActionListener{
    private AgendaPacientScreenView screenView;
    
    
    public DeleteAgendaPacient(AgendaPacientScreenView AgendaScreenView){
        this.screenView = AgendaScreenView;
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {    
        int selectedIndex = screenView.getAgendaList().getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(screenView, "Selecione um Horário para excluír.");
        } else {
            DefaultListModel<Agenda> model = (DefaultListModel<Agenda>) screenView.getAgendaList().getModel();

            model.removeElementAt(selectedIndex);
            screenView.getAgendaList().setModel(model);
            screenView.getAgendaList().setSelectedIndex(selectedIndex);
            screenView.repaint();
        }
    }
}
