/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.agendamentoconsultas;

import java.util.Scanner;

/**
 *
 * @author mariacecilia
 */
public class AgendamentoConsultas {

    public static void main(String[] args) {
        String name;
        String birthdate;
        String gender;
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("Informe o nome do usuário: ");
        name = key.nextLine();
        
        System.out.println("Informe a data de nascimento (dd/mm/aaaa):");
        birthdate = key.nextLine();
        
        System.out.println("Informe o gênero (F/M):");
        gender = key.nextLine();
        
        Person p = new Person(name, birthdate, gender);
        
        System.out.println("Usuário " + p.getName() + " criado com sucesso!");
    }
}
