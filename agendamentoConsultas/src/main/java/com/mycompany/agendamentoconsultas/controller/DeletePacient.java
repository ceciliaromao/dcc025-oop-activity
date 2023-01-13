/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.view.PacientRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 *
 */
public class DeletePacient implements ActionListener {

    private PacientRegistrationScreenView screenView;

    public DeletePacient(PacientRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = screenView.getPacientList().getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(screenView, "Selecione um Paciente para excluír.");
        } else {
            DefaultListModel<Pacient> model = (DefaultListModel<Pacient>) screenView.getPacientList().getModel();

            model.removeElementAt(selectedIndex);
            screenView.getPacientList().setModel(model);
            screenView.getPacientList().setSelectedIndex(selectedIndex);
            screenView.repaint();
        }
    }

}
