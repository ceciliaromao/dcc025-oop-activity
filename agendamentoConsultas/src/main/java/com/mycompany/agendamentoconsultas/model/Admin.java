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
public class Admin extends Person {
    private String registration;

    public Admin(String registration, String name, String phoneNumber, String email, String password) throws UserRegistrationException {
        super(name, phoneNumber, email, password);
        this.registration = registration;

    }
    
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Override
    public boolean login(String document, String password) {
        // TODO Implement login logic
        return false;
    }
}
