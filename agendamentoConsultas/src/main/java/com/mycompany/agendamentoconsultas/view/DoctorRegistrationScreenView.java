/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.CreateDoctor;
import com.mycompany.agendamentoconsultas.controller.DeleteDoctor;
import com.mycompany.agendamentoconsultas.controller.EditDoctor;
import com.mycompany.agendamentoconsultas.controller.ListDoctors;
import com.mycompany.agendamentoconsultas.controller.ResetDoctorForm;
import com.mycompany.agendamentoconsultas.model.Doctor;
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
 * @author Fernando
 */
public class DoctorRegistrationScreenView extends JFrame{
    private JPanel DoctorPanel;
    private JList<Doctor> DoctorList;
    private JTextField jtName;
    private JTextField jtSpecialty;
    private JTextField jtPhoneNumber;
    private JTextField jtEmail;
    private JPasswordField jPasswordField;
    private JTextField jtCrm; 
    
    public DoctorRegistrationScreenView(){
        super("Cadastro de Médicos");
    }

    public JList<Doctor> getDoctorList() {
        return DoctorList;
    }

    public void setDoctorList(JList<Doctor> doctorList) {
        this.DoctorList = doctorList;
    }
    
    public JTextField getJtName() {
        return jtName;
    }

    public void setJtName(JTextField jtName) {
        this.jtName = jtName;
    }
    
    public JTextField getJtSpecialty() {
        return jtSpecialty;
    }

    public void setJtSpecialty(JTextField jtSpecialty) {
        this.jtSpecialty = jtSpecialty;
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

    public JPasswordField getJPasswordField() {
        return jPasswordField;
    }

    public void setJPasswordField(JPasswordField jPasswordField) {
        this.jPasswordField = jPasswordField;
    }

    public JTextField getJtCrm() {
        return jtCrm;
    }

    public void setJtCrm(JTextField jtCrm) {
        this.jtCrm = jtCrm;
    }

    
    private void createMenu(){
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(BorderFactory.createTitledBorder("Médicos:"));
        menuPanel.setPreferredSize(new Dimension(120, 200));
        
        DefaultListModel<Doctor> model = new DefaultListModel<>();
        
        DoctorList = new JList<>(model);
        DoctorList.setVisible(true);
        DoctorList.setPreferredSize(new Dimension(95, 300));
        DoctorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DoctorList.addListSelectionListener(new ListDoctors(this));
        
        menuPanel.add(new JScrollPane(DoctorPanel), BorderLayout.EAST);
        
        this.DoctorPanel.add(menuPanel, BorderLayout.WEST);
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
        
        JLabel jlCPF = new JLabel("CRM: ");
        jtCrm = new JTextField(20);
        panelLabel.add(jlCPF);
        panelTextField.add(jtCrm);
        
        JLabel jlSpecialty = new JLabel("Especialidade: ");
        jtSpecialty = new JPasswordField(20);
        panelLabel.add(jlSpecialty);
        panelTextField.add(jtSpecialty);
        
        JLabel jlPassword = new JLabel("Senha: ");
        jPasswordField = new JPasswordField(20);
        panelLabel.add(jlPassword);
        panelTextField.add(jPasswordField);
        
        formPanel.add(panelLabel, BorderLayout.WEST);
        formPanel.add(panelTextField, BorderLayout.EAST);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btnCreate = new JButton("Adiciona");
        btnCreate.addActionListener(new CreateDoctor(this));
        painelBotoes.add(btnCreate);
        
        JButton btnDelete = new JButton("Remove");
        btnDelete.addActionListener(new DeleteDoctor(this));
        painelBotoes.add(btnDelete);
        
        JButton btnUpdate = new JButton("Atualiza");
        btnUpdate.addActionListener(new EditDoctor(this));
        painelBotoes.add(btnUpdate);
        
        JButton btnReset = new JButton("Limpa");
        btnReset.addActionListener(new ResetDoctorForm(this));
        painelBotoes.add(btnReset);
        
        formPanel.add(painelBotoes, BorderLayout.SOUTH);
        
        this.DoctorPanel.add(formPanel, BorderLayout.CENTER);
    }
    
    public void display(){
        this.setSize(300, 200);
        this.setVisible(true);
        
        this.DoctorPanel = new JPanel();
        this.DoctorPanel.setLayout(new BorderLayout());
        
        createMenu();
        createForm();
        
        this.add(this.DoctorPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}
