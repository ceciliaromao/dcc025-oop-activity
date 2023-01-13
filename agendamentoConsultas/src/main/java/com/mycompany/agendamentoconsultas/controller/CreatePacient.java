/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;


import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.PacientRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 *
 */
public class CreatePacient implements ActionListener {

    private PacientRegistrationScreenView screenView;

    public CreatePacient(PacientRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Pacient> model = (DefaultListModel<Pacient>) screenView.getPacientList().getModel();

        try {
            model.addElement(new Pacient(screenView.getJtCPF().getText(),
                    screenView.getJtName().getText(),
                    screenView.getJtPhoneNumber().getText(),
                    screenView.getJtEmail().getText(),
                    screenView.getJPasswordField().getPassword().toString()));
        } catch (UserRegistrationException ex) {
            System.out.println("Algo deu errado ao criar o Paciente " + ex.getMessage());
        }
        screenView.getPacientList().setModel(model);
        screenView.repaint();

    }
}
