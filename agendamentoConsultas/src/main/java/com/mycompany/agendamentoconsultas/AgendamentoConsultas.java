/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.RenderingHints.Key;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author mariacecilia
 */
public class AgendamentoConsultas {

    public static void main(String[] args) throws ParseException, IOException {
        String name;
        String birthStr;
        String gender;
        String address;
        String CPF;
        String phoneNumber;
        String email;
        String password;

        Scanner key = new Scanner(System.in);

        // Usuário seleciona se é "Paciente", "Administrador" ou "Médico"
        String op[] = {"Paciente", "Administrador", "Médico"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Você é: ", "Bem-vindo!",
                JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);
        System.out.println(escolha);

        // ************* Administrador - Início *************
        if (escolha == "Administrador") {

            String opADM_CRUD[] = {"Registrar usuário", "Consultar dados de usuário", "Editar usuário",
                "Excluir usuário"};
            String escolhaADM = (String) JOptionPane.showInputDialog(null, "Você quer: ", "Bem-vindo admin!",
                    JOptionPane.INFORMATION_MESSAGE, null, opADM_CRUD, opADM_CRUD[0]);
            System.out.println(escolhaADM);

            if (escolhaADM == "Registrar usuário") {

                String opADM[] = {"Paciente", "Médico", "Administrador"};
                String escolhaADM2 = (String) JOptionPane.showInputDialog(null, "Você irá registrar: ", "Registro",
                        JOptionPane.INFORMATION_MESSAGE, null, opADM, opADM[0]);

                if (escolhaADM2 == "Paciente") {

                    name = JOptionPane.showInputDialog(null, "Informe o nome do usuário: ", "Nome");

                    CPF = JOptionPane.showInputDialog(null, "Informe o CPF do usuário: ", "CPF");

                    String opHealth[] = {"UNIMED", "AMIL", "SulAmerica", "Nenhum"};
                    String choiceHealth = (String) JOptionPane.showInputDialog(null, "informe se tem plano de saúde: ",
                            "Health Insurance", JOptionPane.INFORMATION_MESSAGE, null, opHealth, opHealth[0]);

                    birthStr = JOptionPane.showInputDialog(null, "Informe a data de nascimento (dd/mm/aaaa):",
                            "Data de Nascimento");
                    System.out.println("Informe a data de nascimento (dd/mm/aaaa):");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date birthdate = simpleDateFormat.parse(birthStr);

                    String Gender[] = {"M", "F"};
                    gender = (String) JOptionPane.showInputDialog(null, "Informe o gênero do usuário: ", "Gênero",
                            JOptionPane.INFORMATION_MESSAGE, null, Gender, Gender[0]);

                    address = JOptionPane.showInputDialog(null, "Informe o endereço do usuário: (Rua, nº e CEP)", "Endereço");

                    phoneNumber = JOptionPane.showInputDialog(null, "Informe o telefone do usuário: ", "Telefone");

                    email = JOptionPane.showInputDialog(null, "Informe o email do usuário: ", "Email");

                    password = JOptionPane.showInputDialog(null, "Peça ao paciente para digitar uam senha: ", "Senha");

                    Pacient p = new Pacient(CPF, choiceHealth, name, birthdate, address, gender, phoneNumber, email,
                            password);

                    System.out.println("Usuário " + p.getName() + " criado com sucesso!");
                    System.out.println(p.getBirthdate());

                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    String gsonPacient = new Gson().toJson(p);
                    System.out.println(gsonPacient);

                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("pacients.json", true));
                        bw.write("\n\n" + gsonPacient);
                        bw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }
        key.close();
//        
//        Scanner key = new Scanner(System.in);
//        
//        System.out.println("Informe o nome do usuário: ");
//        name = key.nextLine();
//        
//        System.out.println("Informe a data de nascimento (dd/mm/aaaa):");
//        birthStr = key.nextLine();
//        
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date birthdate = simpleDateFormat.parse(birthStr);
//                
//        System.out.println("Informe o gênero (F/M):");
//        gender = key.nextLine();
//        
//        Person p = new Person(name, birthdate, gender);
//        
//        System.out.println("Usuário " + p.getName() + " criado com sucesso!");
//        System.out.println(p.getBirthdate());

//        String json = String.join(" ", Files.readAllLines(Paths.get("pacients.json"),
//                StandardCharsets.UTF_8));
//        Gson gson = new Gson();
//        Pacient p = gson.fromJson(json, Pacient.class);
//        System.out.println(p);
    }
}
