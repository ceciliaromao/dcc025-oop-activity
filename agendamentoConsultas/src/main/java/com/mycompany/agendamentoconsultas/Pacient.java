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
public class Pacient extends Person {
    //FIELDS
    //herda da classe Person
    String cpf;
    String healthInsurance;
    
    //METHODS
    //agendar - somente para si (UPDATE Agenda - polimorfismo de método de Person)
    
    //ver consultas agendadas (READ Agenda - search by pacient - polimorfismo de método de Person)

    public Pacient(String name, Date birthdate, String gender) {
        super(name, birthdate, gender);
    }
}
