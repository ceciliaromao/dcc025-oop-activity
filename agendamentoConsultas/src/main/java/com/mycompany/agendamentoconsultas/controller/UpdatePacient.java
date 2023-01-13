/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.utils.FileUtils;
import com.mycompany.agendamentoconsultas.utils.JSONUtils;
import com.mycompany.agendamentoconsultas.view.PacientRegistrationScreenView;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author mariacecilia
 */
public class UpdatePacient implements WindowListener {
    private static final String PATH = "pacients.json";
    private final PacientRegistrationScreenView screenView;
    
    public UpdatePacient(PacientRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            String data = FileUtils.readFile(PATH);
            List<Pacient> pacients = JSONUtils.toPacients(data);
            
            DefaultListModel<Pacient> model = new DefaultListModel<>();
            
            for (Pacient pacient : pacients) {
                model.addElement(pacient);
            }
            
            screenView.getPacientList().setModel(model);
            screenView.repaint();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(screenView, "Não foi possível carregar os dados");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            ListModel<Pacient> model = screenView.getPacientList().getModel();
            List<Pacient> pacients = new ArrayList<>();
            
            for (int i = 0; i < model.getSize(); i++) {
                pacients.add(model.getElementAt(i));
            }
            
            String toJSON = JSONUtils.pToJSON(pacients);
            System.out.println("toJSON = " + toJSON);
            
            FileUtils.writeFile(PATH, toJSON);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(screenView, "Não foi possivel salvar os dados");
        }
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
        System.out.println("Ativado");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
