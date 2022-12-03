/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

import java.util.Date;

/**
 *
 * @author brunopedrosa
 * @author eduardooliveira
 * @author mariacecilia
 * @author maycondouglas
 * 
 */
public class Admin extends Employee{
    //FIELDS
    private Employee employee;
    private String registration;
    

    public Admin(Employee employee, String registration, Person person, String section, String name, Date birthdate, String address, String gender, String phoneNumber, String email, String password) {
        super(person, section, name, birthdate, address, gender, phoneNumber, email, password);
        this.employee = employee;
        this.registration = registration;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
    
    
    //METHODS
    //registrar usuários (CREATE Users)
    
    //consultar dados de usuários ativos (READ Users)
    
    //editar usuários (UPDATE Users)
    
    //excluir usuários (DELETE Users)
    
     
    //define escala geral (CREATE Agenda - herda de Service)
    
    //realiza agendamento geral (UPDATE Agenda - herda de Person)
    
    //consulta agenda geral (READ Agenda - herda de Person)
    
    //desmarca consulta (DELETE Agenda) 
}
