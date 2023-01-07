/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.view.UserScreenView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class ListUsers implements ListSelectionListener{
    private UserScreenView screenView;

    public ListUsers(UserScreenView screenView) {
        this.screenView = screenView;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
    
    }
}
