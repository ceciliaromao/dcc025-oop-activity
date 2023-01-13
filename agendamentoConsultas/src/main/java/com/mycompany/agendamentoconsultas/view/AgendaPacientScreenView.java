/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.CreateAgendaDoctor;
import com.mycompany.agendamentoconsultas.controller.CreateAgendaPacient;
import com.mycompany.agendamentoconsultas.controller.DeleteAgendaDoctor;
import com.mycompany.agendamentoconsultas.controller.DeleteAgendaPacient;
import com.mycompany.agendamentoconsultas.controller.EditAgendaDoctor;
import com.mycompany.agendamentoconsultas.controller.EditAgendaPacient;
import com.mycompany.agendamentoconsultas.controller.ListAgendaDoctor;
import com.mycompany.agendamentoconsultas.controller.ListAgendaPacient;
import com.mycompany.agendamentoconsultas.model.Agenda;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import org.apache.jmeter.gui.util.JDateField;

/**
 *
 * @author Fernando
 */
public class AgendaPacientScreenView extends JFrame{
     private JPanel agendaPanel;
    private JList<Agenda> agendaList;
    private JDateField jtDatetime;
    private JTextField jtPacientName;
    private JTextField jtDoctorName;
    private JTextField jtDoctorSpecialty;
    private int lastIndex;
    
    public AgendaPacientScreenView(){
        super("Registro de Horários");
    }

    public JList<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(JList<Agenda> horariosList) {
        this.agendaList = horariosList;
    }
    
    public JDateField getJtDate(){
        return jtDatetime;
    }
       
    public void setJtDate(JDateField novaData){
        this.jtDatetime = novaData;
    }
    public JTextField getJtPacientName(){
        return jtPacientName;
    }
    
    public void setJtPacientName(JTextField novoNome){
        this.jtPacientName = novoNome;
    }
    
    public JTextField getJtDoctorName(){
        return jtDoctorName ;
    }
    
    public void setJtDoctorName(JTextField novoNome){
        this.jtDoctorName = novoNome;
    }
    
    public JTextField getJtDoctorSpecialty(){
        return jtDoctorSpecialty;
    }
    
    public void setJtDoctorSpecialty(JTextField novaEspec){
        this.jtDoctorSpecialty = novaEspec;
    } 

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }
    
    private void createMenu(){
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pacientes:"));
        menuPanel.setPreferredSize(new Dimension(120, 200));
        
        DefaultListModel<Agenda> model = new DefaultListModel<>();
        
        agendaList = new JList<>(model);
        agendaList.setVisible(true);
        agendaList.setPreferredSize(new Dimension(95, 300));
        agendaList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        agendaList.addListSelectionListener(new ListAgendaPacient(this));
        
        menuPanel.add(new JScrollPane(agendaList), BorderLayout.EAST);
        
        this.agendaPanel.add(menuPanel, BorderLayout.WEST);
    }
    
    private void createForm(){
        JPanel formPanel = new JPanel();
        formPanel.setBorder(BorderFactory.createTitledBorder("Formulário"));
        formPanel.setLayout(new BorderLayout());
        
        JPanel panelLabel = new JPanel(new GridLayout(0, 1));
        JPanel panelTextField = new JPanel(new GridLayout(0, 1));
        
        JLabel jlDate = new JLabel("Email: ");
        jtDatetime = new JDateField();
        panelLabel.add(jlDate);
        panelTextField.add(jtDatetime);
        
        JLabel jlDocName = new JLabel("Nome do Médico: ");
        jtDoctorName = new JTextField(20);
        panelLabel.add(jlDocName);
        panelTextField.add(jtDoctorName);
        
        JLabel jlPacName = new JLabel("Telefone: ");
        jtPacientName = new JTextField(20);
        panelLabel.add(jlPacName);
        panelTextField.add(jtPacientName);
       
        JLabel jlSpecialty = new JLabel("CPF: ");
        jtDoctorSpecialty = new JTextField(20);
        panelLabel.add(jlSpecialty);
        panelTextField.add(jtDoctorSpecialty);
        
        
        formPanel.add(panelLabel, BorderLayout.WEST);
        formPanel.add(panelTextField, BorderLayout.EAST);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btnCreate = new JButton("Adiciona");
        btnCreate.addActionListener(new CreateAgendaPacient(this));
        painelBotoes.add(btnCreate);
        
        JButton btnDelete = new JButton("Remove");
        btnDelete.addActionListener(new DeleteAgendaPacient(this));
        painelBotoes.add(btnDelete);
        
        JButton btnUpdate = new JButton("Atualiza");
        btnUpdate.addActionListener(new EditAgendaPacient(this));
        painelBotoes.add(btnUpdate);
        
        formPanel.add(painelBotoes, BorderLayout.SOUTH);
        
        this.agendaPanel.add(formPanel, BorderLayout.CENTER);
    }
    
    public void display(){
        this.setSize(300, 200);
        this.setVisible(true);
        
        this.agendaPanel = new JPanel();
        this.agendaPanel.setLayout(new BorderLayout());
        
        createMenu();
        createForm();
        
        this.add(this.agendaPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}
