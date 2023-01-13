/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.CreateAdmin;
import com.mycompany.agendamentoconsultas.controller.DeleteAdmin;
import com.mycompany.agendamentoconsultas.controller.EditAdmin;
import com.mycompany.agendamentoconsultas.controller.ListAdmins;
import com.mycompany.agendamentoconsultas.controller.ResetAdminForm;
import com.mycompany.agendamentoconsultas.model.Admin;
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
public class AdminRegistrationScreenView extends JFrame{
    private JPanel adminPanel;
    private JList<Admin> adminList;
    private JTextField jtName;
    private JTextField jtPhoneNumber;
    private JTextField jtEmail;
    private JPasswordField jPasswordField;
    private JTextField jtRegistration; 
    private int lastIndex;
    
    public AdminRegistrationScreenView(){
        super("Cadastro de Administradores");
    }

    public JList<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(JList<Admin> admList) {
        this.adminList = admList;
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

    public JPasswordField getJPasswordField() {
        return jPasswordField;
    }

    public void setJPasswordField(JPasswordField jPasswordField) {
        this.jPasswordField = jPasswordField;
    }

    public JTextField getJtRegistration() {
        return jtRegistration;
    }

    public void setJtRegistration(JTextField jtreg) {
        this.jtRegistration = jtreg;
    }
    
    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    
    private void createMenu(){
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(BorderFactory.createTitledBorder("Médicos:"));
        menuPanel.setPreferredSize(new Dimension(120, 200));
        
        DefaultListModel<Admin> model = new DefaultListModel<>();
        
        adminList = new JList<>(model);
        adminList.setVisible(true);
        adminList.setPreferredSize(new Dimension(95, 300));
        adminList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        adminList.addListSelectionListener(new ListAdmins(this));
        
        adminPanel.add(new JScrollPane(menuPanel), BorderLayout.EAST);
        
        this.adminPanel.add(menuPanel, BorderLayout.WEST);
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
        
        JLabel jlCPF = new JLabel("Matrícula: ");
        jtRegistration = new JTextField(20);
        panelLabel.add(jlCPF);
        panelTextField.add(jtRegistration);
        
        JLabel jlPassword = new JLabel("Senha: ");
        jPasswordField = new JPasswordField(20);
        panelLabel.add(jlPassword);
        panelTextField.add(jPasswordField);
        
        formPanel.add(panelLabel, BorderLayout.WEST);
        formPanel.add(panelTextField, BorderLayout.EAST);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btnCreate = new JButton("Adiciona");
        btnCreate.addActionListener(new CreateAdmin(this));
        painelBotoes.add(btnCreate);
        
        JButton btnDelete = new JButton("Remove");
        btnDelete.addActionListener(new DeleteAdmin(this));
        painelBotoes.add(btnDelete);
        
        JButton btnUpdate = new JButton("Atualiza");
        btnUpdate.addActionListener(new EditAdmin(this));
        painelBotoes.add(btnUpdate);
        
        JButton btnReset = new JButton("Limpa");
        btnReset.addActionListener(new ResetAdminForm(this));
        painelBotoes.add(btnReset);
        
        formPanel.add(painelBotoes, BorderLayout.SOUTH);
        
        this.adminPanel.add(formPanel, BorderLayout.CENTER);
    }
    
    public void display(){
        this.setSize(300, 200);
        this.setVisible(true);
        
        this.adminPanel = new JPanel();
        this.adminPanel.setLayout(new BorderLayout());
        
        createMenu();
        createForm();
        
        this.add(this.adminPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}
