/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.UserScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class EditPacient implements ActionListener {

    private UserScreenView screenView;

    public EditPacient(UserScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        List<Person> userListFromFile;//TODO PUXAR ARQUIVO APÓS CRIAR TODO O ESQUEMA.
        Pacient pacientOnEdit = screenView.getUserList().getSelectedValue();

        try {
            pacientOnEdit.setCpf(screenView.getJtDocument().getText());
            pacientOnEdit.setName(screenView.getJtName().getText());
            pacientOnEdit.setPhoneNumber(screenView.getJtPhoneNumber().getText());
            pacientOnEdit.setEmail(screenView.getJtEmail().getText());
            pacientOnEdit.setPassword(screenView.getJPasswordField().getPassword().toString());
        } catch (UserRegistrationException ex) {
            System.out.println("Algo deu errado ao editar o Paciente: " + ex.getMessage());
        }

        //TODO Integração com Arquivo Json de pacientes.
    }
}
