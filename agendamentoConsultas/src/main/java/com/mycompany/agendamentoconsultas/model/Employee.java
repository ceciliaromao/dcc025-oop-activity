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
public abstract class Employee extends Person {
    
    public Employee(String name, String email, String password) {
        super(name, email, password);
    }
    
    public Employee(String name, String gender, String phoneNumber, String email, String password) {
        super(name, gender, phoneNumber, email, password);
    }
}
