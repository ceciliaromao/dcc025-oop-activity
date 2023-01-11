/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.model;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class Controller {
    private static List<Pacient> pacients;
    private static List<Doctor> doctors;
    private static List<Admin> admins;
    
     static {
        pacients = new ArrayList<>();
        doctors = new ArrayList<>();
        admins = new ArrayList<>();
    }
     
     
     public static List<Pacient> getPacients(){
         return pacients;
     }
     
     public static List<Doctor> getDoctors(){
         return doctors;
     }
     
     public static List<Admin> getAdmins(){
         return admins;
     }
     
     public static void SetPatients(List<Pacient> newPatientList){
         pacients = newPatientList;
     }
     
     public static void SetDoctors(List<Doctor> newDoctorList){
         doctors = newDoctorList;
     }
     
     public static void SetAdmins(List<Admin> newAdmList){
         admins = newAdmList;
     }
}
