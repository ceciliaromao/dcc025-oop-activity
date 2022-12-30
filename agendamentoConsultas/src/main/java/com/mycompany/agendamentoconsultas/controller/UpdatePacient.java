/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.PacientScreenView;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class UpdatePacient implements WindowListener{
    private static final String PATH = "..\\utils\\pacients.json";
    private final PacientScreenView screenView;

    public UpdatePacient(PacientScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //TODO
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //TODO
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated"); 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    
}
