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
public abstract class Employee extends Person {
    //FIELDS
    private Person person;
    private String section;
    
    public Employee(Person person, String section, String name, Date birthdate, String address, String gender, String phoneNumber, String email, String password) {
        super(name, birthdate, address, gender, phoneNumber, email, password);
        this.person = person;
        this.section = section;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
    //METHODS
    //define escala (CREATE Agenda)
    
}
