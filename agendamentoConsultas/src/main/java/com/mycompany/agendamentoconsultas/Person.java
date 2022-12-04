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
public abstract class Person {

    //FIELDS
    private String name;
    private Date birthdate;
    private String address;
    private String gender;
    private String phoneNumber;
    private String email;
    private String password;
       
    public Person(String name, Date birthdate, String gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }
    
    public Person(String name, Date birthdate, String address, String gender, String phoneNumber, String email, String password) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    //METHODS
    //realiza agendamento (UPDATE Agenda)

    //consultar agenda (READ Agenda)
    
    
    
    
    

    
}
