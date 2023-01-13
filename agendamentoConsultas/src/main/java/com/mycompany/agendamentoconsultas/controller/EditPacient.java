/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import com.mycompany.agendamentoconsultas.view.PacientRegistrationScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class EditPacient implements ActionListener {
    private PacientRegistrationScreenView screenView;
    
    public EditPacient(PacientRegistrationScreenView screenView){
        this.screenView = screenView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Pacient> model = (DefaultListModel<Pacient>) screenView.getPacientList().getModel();
        Pacient pacOnEdit = model.getElementAt(screenView.getLastIndex());
        
         try {
            pacOnEdit.setCpf(screenView.getJtCPF().getText());
            pacOnEdit.setName(screenView.getJtName().getText());
            pacOnEdit.setPhoneNumber(screenView.getJtPhoneNumber().getText());
            pacOnEdit.setEmail(screenView.getJtEmail().getText());
            
            JOptionPane.showMessageDialog(screenView, "Sucesso ao atualizar Paciente!");
        } catch (UserRegistrationException ex) {
            JOptionPane.showMessageDialog(screenView, ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        screenView.repaint();
    }
}
