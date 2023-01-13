/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariacecilia
 */
public class UserLists {
    private static List<Doctor> doctors;
    private static List<Admin> admins;
    private static List<Pacient> pacients;
    private static List<Agenda> horarios;
    
    static {
        doctors = new ArrayList<>();
        admins = new ArrayList<>();
        pacients = new ArrayList<>();
        horarios = new ArrayList<>();
    }
    
    public static List<Pacient> getPacients() {
        return pacients;
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }
    
    public static List<Admin> getAdmins() {
        return admins;
    }

    public static List<Agenda> getHorarios() {
        return horarios;
    }
    
    public static void setDoctors(List<Doctor> doctors) {
        UserLists.doctors = doctors;
    }

    public static void setAdmins(List<Admin> admins) {
        UserLists.admins = admins;
    }

    public static void setPacients(List<Pacient> pacients) {
        UserLists.pacients = pacients;
    }

    public static void setHorarios(List<Agenda> horarios) {
        UserLists.horarios = horarios;
    }
    
    
}
