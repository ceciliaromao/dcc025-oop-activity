/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.DoctorRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Fernando
 */
public class DeleteDoctor implements ActionListener{
    
    private DoctorRegistrationScreenView ScreenView;
        
    public DeleteDoctor(DoctorRegistrationScreenView DocScreenView){
        this.ScreenView = DocScreenView;
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {
       //TODO
    }
}
