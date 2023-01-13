/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.CreatePacient;
import com.mycompany.agendamentoconsultas.controller.DeletePacient;
import com.mycompany.agendamentoconsultas.controller.EditPacient;
import com.mycompany.agendamentoconsultas.controller.ListPacients;
import com.mycompany.agendamentoconsultas.controller.UpdatePacient;
import com.mycompany.agendamentoconsultas.model.Pacient;
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
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class PacientRegistrationScreenView extends JFrame {
    private JPanel pacientPanel;
    private JList<Pacient> pacientList;
    private JTextField jtName;
    private JTextField jtPhoneNumber;
    private JTextField jtEmail;
    private JTextField jtPassword;
    private JTextField jtCPF; 
    private int lastIndex;
    
    public PacientRegistrationScreenView(){
        super("Cadastro de Pacientes");
        this.addWindowListener(new UpdatePacient(this));
    }

    public JList<Pacient> getPacientList() {
        return pacientList;
    }

    public void setPacientList(JList<Pacient> pacientList) {
        this.pacientList = pacientList;
    }
    
    public JTextField getJtName() {
        return jtName;
    }

    public void setJtName(JTextField jtName) {
        this.jtName = jtName;
    }

    public JTextField getJtPhoneNumber() {
        return jtPhoneNumber;
    }

    public void setJtPhoneNumber(JTextField jtPhoneNumber) {
        this.jtPhoneNumber = jtPhoneNumber;
    }

    public JTextField getJtEmail() {
        return jtEmail;
    }

    public void setJtEmail(JTextField jtEmail) {
        this.jtEmail = jtEmail;
    }

    public JTextField getJtPassword() {
        return jtPassword;
    }

    public void setJtPassword(JTextField jPasswordField) {
        this.jtPassword = jPasswordField;
    }

    public JTextField getJtCPF() {
        return jtCPF;
    }

    public void setJtCPF(JTextField jtCPF) {
        this.jtCPF = jtCPF;
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
        
        DefaultListModel<Pacient> model = new DefaultListModel<>();
        
        pacientList = new JList<>(model);
        pacientList.setVisible(true);
        pacientList.setPreferredSize(new Dimension(95, 300));
        pacientList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        pacientList.addListSelectionListener(new ListPacients(this));
        
        menuPanel.add(new JScrollPane(pacientList), BorderLayout.EAST);
        
        this.pacientPanel.add(menuPanel, BorderLayout.WEST);
    }
    
    private void createForm(){
        JPanel formPanel = new JPanel();
        formPanel.setBorder(BorderFactory.createTitledBorder("Formulário"));
        formPanel.setLayout(new BorderLayout());
        
        JPanel panelLabel = new JPanel(new GridLayout(0, 1));
        JPanel panelTextField = new JPanel(new GridLayout(0, 1));
        
        JLabel jlName = new JLabel("Nome: ");
        jtName = new JTextField(20);
        panelLabel.add(jlName);
        panelTextField.add(jtName);
        
        JLabel jlPhoneNumber = new JLabel("Telefone: ");
        jtPhoneNumber = new JTextField(20);
        panelLabel.add(jlPhoneNumber);
        panelTextField.add(jtPhoneNumber);
        
        JLabel jlEmail = new JLabel("Email: ");
        jtEmail = new JTextField(20);
        panelLabel.add(jlEmail);
        panelTextField.add(jtEmail);
        
        JLabel jlCPF = new JLabel("CPF: ");
        jtCPF = new JTextField(20);
        panelLabel.add(jlCPF);
        panelTextField.add(jtCPF);
        
        JLabel jlPassword = new JLabel("Senha: ");
        jtPassword = new JPasswordField(20);
        panelLabel.add(jlPassword);
        panelTextField.add(jtPassword);
        
        formPanel.add(panelLabel, BorderLayout.WEST);
        formPanel.add(panelTextField, BorderLayout.EAST);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btnCreate = new JButton("Adiciona");
        btnCreate.addActionListener(new CreatePacient(this));
        painelBotoes.add(btnCreate);
        
        JButton btnDelete = new JButton("Remove");
        btnDelete.addActionListener(new DeletePacient(this));
        painelBotoes.add(btnDelete);
        
        JButton btnUpdate = new JButton("Atualiza");
        btnUpdate.addActionListener(new EditPacient(this));
        painelBotoes.add(btnUpdate);
        
        JButton btnBack = new JButton("Voltar");
        //btnBack.addActionListener(???);
        painelBotoes.add(btnBack);
                
        formPanel.add(painelBotoes, BorderLayout.SOUTH);
        
        this.pacientPanel.add(formPanel, BorderLayout.CENTER);
    }
    
    public void display(){
        this.setSize(450, 200);
        this.setVisible(true);
        
        this.pacientPanel = new JPanel();
        this.pacientPanel.setLayout(new BorderLayout());
        
        createMenu();
        createForm();
        
        this.add(this.pacientPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}
