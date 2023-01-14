/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.model.Pacient;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class PacientMainScreenView extends JFrame{
    private JPanel screenPanel;
    private Pacient pacient;
    
    public PacientMainScreenView(Pacient pacient){
        this.pacient = pacient;
    }
    
    private void display(){
        this.add(this.screenPanel);
        this.setVisible(true);
    }
    
    public void createWindow(){
        this.setSize(320, 140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.screenPanel = new JPanel();
        this.screenPanel.setLayout(new BorderLayout());
    }
    
    private void createMenu(){
        
        JPanel jpButtons = new JPanel();
        jpButtons.setBorder(BorderFactory.createTitledBorder("Paciente: " + pacient.getName()));
        jpButtons.setLayout(new FlowLayout());
        jpButtons.setPreferredSize(new Dimension(300, 180));
        
        JButton btnUpdateAgenda = new JButton("Agendar consulta");
        //btnUpdateAgenda.addActionListener(new FreeAgendaScreenView(this));    >>>> TODO
        jpButtons.add(btnUpdateAgenda);  
        
        JButton btnReadAgenda = new JButton("Verificar consultas agendadas");
        //btnReadAgenda.addActionListener(new PacientAgendaScreenView(this.pacient));     >>>> TODO
        jpButtons.add(btnReadAgenda);
        
        this.screenPanel.add(jpButtons, BorderLayout.WEST);
    }
    
    public void buildScreen(){
        createWindow();
        createMenu();
        display();
    }
}
