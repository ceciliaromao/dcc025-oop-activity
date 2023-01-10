/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Admin;
import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.UserScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 *
 */
public class CreateUser implements ActionListener {

    private UserScreenView screenView;

    public CreateUser(UserScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        List<Person> userList = new ArrayList<>();

        String document = screenView.getJtDocument().getText();

        try {
            switch (document.length()) {
                case 11:
                    userList.add(new Pacient(document,
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            screenView.getJPasswordField().getPassword().toString()
                    ));
                    break;
                case 8:
                    userList.add(new Doctor(document,
                            screenView.getJtSpecialty().getText(),
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            screenView.getJPasswordField().getPassword().toString()));
                    break;
                case 5:
                    userList.add(new Admin(document,
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            screenView.getJPasswordField().getPassword().toString()));

                    break;
                default:
                    throw new AssertionError();
            }
        } catch (UserRegistrationException ex) {
            System.out.println("Algo deu errado ao criar o usuário: " + ex.getMessage());
        }
       
    }
}
