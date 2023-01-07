/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.UserScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        
    }
}
