/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.view;

import com.mycompany.agendamentoconsultas.controller.CreateUser;
import com.mycompany.agendamentoconsultas.controller.DeleteUser;
import com.mycompany.agendamentoconsultas.controller.EditUser;
import com.mycompany.agendamentoconsultas.controller.ListUsers;
import com.mycompany.agendamentoconsultas.controller.ResetUserForm;
import com.mycompany.agendamentoconsultas.controller.UpdateUser;
import com.mycompany.agendamentoconsultas.model.Person;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class UserScreenView extends JFrame {
    private JPanel userPanel;
    
    private JList<Person> userList;
    
    private JTextField jtName;
    private JTextField jtPhoneNumber;
    private JTextField jtEmail;
    private JComboBox jcbType;
    private JTextField jtDocument;
    private JTextField jtSpecialty;
    private JPasswordField jPasswordField;
    
    private int lastIndex;
    
    public UserScreenView(){
        super("Cadastro de Pacientes");
        this.addWindowListener(new UpdateUser(this));
    }

    public JList<Person> getUserList() {
        return userList;
    }

    public void setUserList(JList<Person> userList) {
        this.userList = userList;
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

    public JComboBox getJcbType() {
        return jcbType;
    }

    public void setJcbType(JComboBox jcbType) {
        this.jcbType = jcbType;
    }

    public JTextField getJtDocument() {
        return jtDocument;
    }

    public void setJtDocument(JTextField jtDocument) {
        this.jtDocument = jtDocument;
    }

    public JTextField getJtSpecialty() {
        return jtSpecialty;
    }

    public void setJtSpecialty(JTextField jtSpecialty) {
        this.jtSpecialty = jtSpecialty;
    }

    public JPasswordField getJPasswordField() {
        return jPasswordField;
    }

    public void setJPasswordField(JPasswordField jPasswordField) {
        this.jPasswordField = jPasswordField;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }
    
    private void createMenu(){
        JPanel menuPanel = new JPanel();
        menuPanel.setBorder(BorderFactory.createTitledBorder("Usuários"));
        menuPanel.setPreferredSize(new Dimension(120, 200));
        
        DefaultListModel<Person> model = new DefaultListModel<>();
        
        userList = new JList<>(model);
        userList.setVisible(true);
        userList.setPreferredSize(new Dimension(95, 300));
        userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        userList.addListSelectionListener(new ListUsers(this));
        
        menuPanel.add(new JScrollPane(userList), BorderLayout.EAST);
        
        this.userPanel.add(menuPanel, BorderLayout.WEST);
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
        
        JLabel jlType = new JLabel("Tipo de Usuário: ");
        String[] options = {"Paciente", "Médico", "Administrador"};
        jcbType = new JComboBox(options);
        panelLabel.add(jlType);
        panelTextField.add(jcbType);
        
        JLabel jlDocument = new JLabel("Documento: ");
        jtDocument = new JTextField(20);
        panelLabel.add(jlDocument);
        panelTextField.add(jtDocument);
        
        JLabel jlSpecialty = new JLabel("Especialidade: ");
        jtSpecialty = new JTextField(20);
        panelLabel.add(jlSpecialty);
        panelTextField.add(jtSpecialty);
        
        JLabel jlPassword = new JLabel("Especialidade: ");
        jPasswordField = new JPasswordField(20);
        panelLabel.add(jlPassword);
        panelTextField.add(jPasswordField);
        
        formPanel.add(panelLabel, BorderLayout.WEST);
        formPanel.add(panelTextField, BorderLayout.EAST);
        
        JPanel painelBotoes = new JPanel();
        
        JButton btnCreate = new JButton("Adiciona");
        btnCreate.addActionListener(new CreateUser(this));//Reformular com base no novo design do software
        painelBotoes.add(btnCreate);
        
        JButton btnDelete = new JButton("Remove");
        btnDelete.addActionListener(new DeleteUser(this));
        painelBotoes.add(btnDelete);
        
        JButton btnUpdate = new JButton("Atualiza");
        btnUpdate.addActionListener(new EditUser(this));
        painelBotoes.add(btnUpdate);
        
        JButton btnReset = new JButton("Limpa");
        btnReset.addActionListener(new ResetUserForm(this));
        painelBotoes.add(btnReset);
        
        formPanel.add(painelBotoes, BorderLayout.SOUTH);
        
        this.userPanel.add(formPanel, BorderLayout.CENTER);
    }
    
    public void display(){
        this.setSize(300, 200);
        this.setVisible(true);
        
        this.userPanel = new JPanel();
        this.userPanel.setLayout(new BorderLayout());
        
        createMenu();
        createForm();
        
        this.add(this.userPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}
