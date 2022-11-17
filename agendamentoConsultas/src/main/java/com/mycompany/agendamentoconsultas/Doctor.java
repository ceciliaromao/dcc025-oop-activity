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
public class Doctor extends Employee{
    //FIELDS
    //herda da classe Service
    String crm;
    String specialty;
    
    //METHODS
    //consultar agenda (READ Agenda - search by doctor - polimorfismo de método de Person)
    
    //definir escala - apenas na própria agenda (CREATE Agenda - polimorfismo de método de Service)

    public Doctor(String name, Date birthdate, String gender) {
        super(name, birthdate, gender);
    }
}
