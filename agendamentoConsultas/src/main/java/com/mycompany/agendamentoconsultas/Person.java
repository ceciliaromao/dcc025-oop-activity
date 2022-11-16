/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

/**
 *
 * @author brunopedrosa
 * @author eduardooliveira
 * @author mariacecilia
 * @author maycondouglas
 *
 */
public class Person {

    //FIELDS
    private String name;
    private String birthdate;
    private String address;
    private String gender;
    private String phoneNumber;
    private String email;
    private String password;
       
    //METHODS
    //realiza agendamento (UPDATE Agenda)

    //consultar agenda (READ Agenda)
    
    //Construtor
    public Person(String name, String birthdate, String gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }
    
    //getters
    public String getName() {
        return name;
    }
    
    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
