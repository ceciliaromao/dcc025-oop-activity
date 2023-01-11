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
    private static List<Admin> admin;
    private static List<Pacient> pacients;
    
    static {
        doctors = new ArrayList<>();
        admin = new ArrayList<>();
        pacients = new ArrayList<>();
    }
    
    public static List<Pacient> getPacients() {
        return pacients;
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }
    
    public static List<Admin> getAdmins() {
        return admin;
    }
 
    public static void setDoctors(List<Doctor> doctors) {
        UserLists.doctors = doctors;
    }

    public static void setAdmin(List<Admin> admin) {
        UserLists.admin = admin;
    }

    public static void setPacients(List<Pacient> pacients) {
        UserLists.pacients = pacients;
    }
}
