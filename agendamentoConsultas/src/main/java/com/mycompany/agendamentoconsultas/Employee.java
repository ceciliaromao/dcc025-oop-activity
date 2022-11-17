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
public class Employee extends Person {
    //FIELDS
    //herda da classe Person
    String section;
    
    //METHODS
    //define escala (CREATE Agenda)

    public Employee(String name, Date birthdate, String gender) {
        super(name, birthdate, gender);
    }
    
}
