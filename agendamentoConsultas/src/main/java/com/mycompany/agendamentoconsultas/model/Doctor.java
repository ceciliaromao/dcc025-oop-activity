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

    public Doctor(String crm, String specialty, String name, String phoneNumber, String email, String password) throws UserRegistrationException {
        super(name, phoneNumber, email, password);
        this.setCrm(crm);
        this.specialty = specialty;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws UserRegistrationException {
        if (crm.length() != 7) throw new UserRegistrationException("Informe CRM no formato: 99999UF");
        for (int i = 0; i < 5; i++) {
            if (crm.charAt(i) < '0' || crm.charAt(i) > '9') {
                throw new UserRegistrationException("Informe CRM no formato: 99999UF");
            }
        }
        if (crm.charAt(5) < 'A' || crm.charAt(5) > 'Z') throw new UserRegistrationException("Informe CRM no formato: 99999UF");
        if (crm.charAt(6) < 'A' || crm.charAt(6) > 'Z') throw new UserRegistrationException("Informe CRM no formato: 99999UF");
         
        this.crm = crm.substring(0,5) + "-" + crm.substring(5);
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
