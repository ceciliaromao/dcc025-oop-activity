/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.model;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 *
 */
public class Doctor extends Person {
    //FIELDS
    private String crm;
    private String specialty;

    public Doctor(String crm, String specialty, String name, String email, String password) throws UserRegistrationException {
        super(name, email, password);
        this.crm = crm;
        this.specialty = specialty;
        this.setDocument(crm);
    }

    public Doctor(String crm, String specialty, String name, String phoneNumber, String email, String password) throws UserRegistrationException {
        super(name, phoneNumber, email, password);
        this.crm = crm;
        this.specialty = specialty;
        this.setDocument(crm);
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
    
    @Override
    public boolean login(String document, String password) {
        // TODO Implement login logic
        return false;
    }        
}
