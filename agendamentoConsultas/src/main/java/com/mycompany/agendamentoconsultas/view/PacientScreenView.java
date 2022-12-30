/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

//import com.mycompany.agendamentoconsultas.controller.UpdatePacient;
import com.mycompany.agendamentoconsultas.model.Pacient;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author mariacecilia
 */
public class PacientScreenView extends JFrame {
    private JPanel userPanel;
    
    private JList<Pacient> pacientList;
    
    private int lastIndex;
    
    public PacientScreenView(){
        super("Cadastro de Pacientes");
        //this.addWindowListener(new UpdatePacient(this));
    }
    
}
