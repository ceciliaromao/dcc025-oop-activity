/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.utils.FileUtils;
import com.mycompany.agendamentoconsultas.utils.JSONUtils;
import com.mycompany.agendamentoconsultas.view.AgendaDoctorScreenView;
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
 * @author Fernando
 */
public class UpdateAgendaDoctor  implements WindowListener {
    private static final String PATH = "agenda.json";
    private final AgendaDoctorScreenView screenView;
    
    public UpdateAgendaDoctor(AgendaDoctorScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            String data = FileUtils.readFile(PATH);
            List<Agenda> horariosAgenda = JSONUtils.toHorariosAgenda(data);
            
            DefaultListModel<Agenda> model = new DefaultListModel<>();
            
            for (Agenda agenda : horariosAgenda) {
                model.addElement(agenda);
            }
            
            screenView.getAgendaList().setModel(model);
            screenView.repaint();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(screenView, "Não foi possível carregar os dados");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            ListModel<Agenda> model = screenView.getAgendaList().getModel();
            List<Agenda> agendas = new ArrayList<>();
            
            for (int i = 0; i < model.getSize(); i++) {
                agendas.add(model.getElementAt(i));
            }
            
            String toJSON = JSONUtils.agToJSON(agendas);
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
