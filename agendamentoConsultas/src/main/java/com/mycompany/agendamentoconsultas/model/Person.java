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
public abstract class Person implements UsersInterface {
    //FIELDS
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private boolean active;
    
    public Person(String name, String phoneNumber, String email, String password) throws UserRegistrationException {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setPassword(password);
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws UserRegistrationException {
        String[] split = name.split(" ");
        if (split.length < 2 || name.length() < 5) throw new UserRegistrationException("Nome incompleto.");
        
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws UserRegistrationException {
        if (phoneNumber.length() < 10 || phoneNumber.length() > 11) throw new UserRegistrationException("Informe DDD e telefone. Apenas números");
        
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                throw new UserRegistrationException("Informe DDD e telefone. Apenas números");
            }
        }
         
        this.phoneNumber = "(" + phoneNumber.substring(0, 2) + ")" + phoneNumber.substring(2, 7) + "-" + phoneNumber.substring(7, 11);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws UserRegistrationException{
        if(!email.contains("@") || !email.contains(".")) throw new UserRegistrationException("Email incompleto.");
        String[] split = email.split("@");
        if (email.indexOf("@") > email.indexOf(".") || split.length != 2) throw new UserRegistrationException("Email inválido.");

        this.email = email.toLowerCase();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws UserRegistrationException{
        if(password.length() < 6) throw new UserRegistrationException("Senha deve possuir no mínimo 6 caracteres.");
        this.password = password;
    }
    
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }   
}
