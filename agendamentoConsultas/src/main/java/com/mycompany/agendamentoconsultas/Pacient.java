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
public class Pacient extends Person {
    //FIELDS
    private Person person;
    private String cpf;
    private String healthInsurance;
    
    public Pacient(Person person, String cpf, String healthInsurance, String name, Date birthdate, String address, String gender, String phoneNumber, String email, String password) {
        super(name, birthdate, address, gender, phoneNumber, email, password);
        this.person = person;
        this.cpf = cpf;
        this.healthInsurance = healthInsurance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }
    
    //METHODS
    
    //agendar - somente para si (UPDATE Agenda - polimorfismo de método de Person)
    
    //ver consultas agendadas (READ Agenda - search by pacient - polimorfismo de método de Person)
}
