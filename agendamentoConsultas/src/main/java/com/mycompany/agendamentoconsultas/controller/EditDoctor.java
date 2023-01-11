/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.UserScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class EditDoctor implements ActionListener {

    private UserScreenView screenView;

    public EditDoctor(UserScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        List<Doctor> userListFromFile;//TODO PUXAR ARQUIVO APÓS CRIAR TODO O ESQUEMA.
        Doctor doctorOnEdit = userListFromFile.get(screenView.getLastIndex());//TODO Implementar Mudança de Arraylist ´para Jlist para tornar isto possível!

        try {
            doctorOnEdit.setCrm(screenView.getJtDocument().getText());
            doctorOnEdit.setSpecialty(screenView.getJtSpecialty().getText());
            doctorOnEdit.setName(screenView.getJtName().getText());
            doctorOnEdit.setPhoneNumber(screenView.getJtPhoneNumber().getText());
            doctorOnEdit.setEmail(screenView.getJtEmail().getText());
            doctorOnEdit.setPassword(screenView.getJPasswordField().getPassword().toString());
        } catch (UserRegistrationException ex) {
            System.out.println("Algo deu errado ao editar o Doutor: " + ex.getMessage());
        }

        //TODO Integração com Arquivo Json de pacientes.
    }
}
