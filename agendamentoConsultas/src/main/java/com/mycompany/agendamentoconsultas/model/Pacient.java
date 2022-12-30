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
public class Pacient extends Person {
    //FIELDS
    private String cpf;

    public Pacient(String cpf, String name, String email, String password) {
        super(name, email, password);
        this.cpf = cpf;
    }

    public Pacient(String cpf, String name, String gender, String phoneNumber, String email, String password) {
        super(name, gender, phoneNumber, email, password);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean login(String document, String password) {
        // TODO Implement login logic
        return false;
    }    
}
