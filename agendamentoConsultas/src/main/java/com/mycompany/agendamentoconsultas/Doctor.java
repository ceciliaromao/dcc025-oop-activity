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
public class Doctor extends Employee {

    //FIELDS
    //herda da classe Service
    private Employee employee;
    private String crm;
    private String specialty;

    public Doctor(Employee employee, String crm, String specialty, Person person, String section, String name, Date birthdate, String address, String gender, String phoneNumber, String email, String password) {
        super(person, section, name, birthdate, address, gender, phoneNumber, email, password);
        this.employee = employee;
        this.crm = crm;
        this.specialty = specialty;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //METHODS
    //consultar agenda (READ Agenda - search by doctor - polimorfismo de método de Person)
    //definir escala - apenas na própria agenda (CREATE Agenda - polimorfismo de método de Service)
}
