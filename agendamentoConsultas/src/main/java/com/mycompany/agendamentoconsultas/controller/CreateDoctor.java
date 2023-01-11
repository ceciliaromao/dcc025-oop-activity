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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class CreateDoctor implements ActionListener{
        private UserScreenView screenView;
    
    public CreateDoctor(UserScreenView screenView) {
        this.screenView = screenView;
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
    
         List<Person> userList = new ArrayList<>();
         
         try{
             userList.add(new Doctor (screenView.getJtDocument().getText(),
                           screenView.getJtSpecialty().getText(),
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            screenView.getJPasswordField().getPassword().toString()));
         }catch(UserRegistrationException ex){
             System.out.println("Algo deu errado ao criar o Médico: " + ex.getMessage());
         }
        
         
         //TODO Integração com Arquivo Json de pacientes.
    } 
}
