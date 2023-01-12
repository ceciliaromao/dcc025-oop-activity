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

    public Pacient(String cpf, String name, String phoneNumber, String email, String password) throws UserRegistrationException {
        super(name, phoneNumber, email, password);
        this.setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws UserRegistrationException{
        if(cpf.length() != 11) throw new UserRegistrationException("CPF inválido");
        
        for (int i = 0; i < cpf.length(); i++) {
            if (cpf.charAt(i) < '0' || cpf.charAt(i) > '9') {
                throw new UserRegistrationException("Informe apenas números no CPF");
            }
        }
        
        this.cpf = cpf;
    }  
}
