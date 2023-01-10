/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Admin;
import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.view.UserScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import java.util.Arrays;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class CreateUser implements ActionListener {
    private UserScreenView screenView;
    
    public CreateUser(UserScreenView screenView){
        this.screenView = screenView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        DefaultListModel<Person> model = (DefaultListModel<Person>) screenView.getUserList().getModel();
        
        try{
         
            String document = screenView.getJtDocument().getText();
                    
            switch (document.length())  {
                case 11:
                    model.addElement(new Pacient(document,
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            Arrays.toString(screenView.getJtPasswordField().getPassword())));
                    break;
                case 8:
                    model.addElement(new Doctor(document,
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            Arrays.toString(screenView.getJtPasswordField().getPassword())));
                    break;
                case 5:
                    model.addElement(new Admin(document,
                            screenView.getJtName().getText(),
                            screenView.getJtPhoneNumber().getText(),
                            screenView.getJtEmail().getText(),
                            Arrays.toString(screenView.getJtPasswordField().getPassword())));
                    break;
                default:
                    throw new AssertionError();
            }
                    
        }catch(UserRegistrationException ex){
            System.out.println("Erro na criação de usuário: "+ ex.getMessage());
        }
        
        screenView.getUserList().setModel(model);
        screenView.repaint();
    }
}
