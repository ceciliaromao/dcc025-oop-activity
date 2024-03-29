/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.agendamentoconsultas.model.Admin;
import com.mycompany.agendamentoconsultas.model.Agenda;
import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.Pacient;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class JSONUtils {
    public static String toJSON(Pacient pacient){
        Gson gson = new Gson();
        return gson.toJson(pacient);
    }
        public static String toJSON(Doctor doctor){
        Gson gson = new Gson();
        return gson.toJson(doctor);
    }
        public static String toJSON(Admin adm){
        Gson gson = new Gson();
        return gson.toJson(adm);
    }
        public static String toJSON(Agenda agenda){
        Gson gson = new Gson();
        return gson.toJson(agenda);
    }
    
    public static String pToJSON(List<Pacient> pacients){
        Gson gson = new Gson();
        return gson.toJson(pacients);
    }
    public static String dToJSON(List<Doctor> doctors){
        Gson gson = new Gson();
        return gson.toJson(doctors);
    }
    public static String aToJSON(List<Admin> admins){
        Gson gson = new Gson();
        return gson.toJson(admins);
    }
    public static String agToJSON(List<Agenda> horariosAgenda){
        Gson gson = new Gson();
        return gson.toJson(horariosAgenda);
    }
    
    public static Pacient toPacient(String json){
        Gson gson = new Gson();
        Pacient pacient = gson.fromJson(json, Pacient.class);
        return pacient;
    }public static Doctor toDoctor(String json){
        Gson gson = new Gson();
        Doctor doctor = gson.fromJson(json, Doctor.class);
        return doctor;
    }
    public static Admin toAdmin(String json){
        Gson gson = new Gson();
        Admin adm = gson.fromJson(json, Admin.class);
        return adm;
    }
    public static Agenda toAgenda(String json){
        Gson gson = new Gson();
        Agenda agenda = gson.fromJson(json, Agenda.class);
        return agenda;
    }
    
    public static List<Pacient> toPacients(String json){
        Gson gson = new Gson();
        Type userType = new TypeToken<ArrayList<Pacient>>(){}.getType();
        List<Pacient> pacients = gson.fromJson(json, userType);
        return pacients;
    }
    public static List<Doctor> toDoctors(String json){
        Gson gson = new Gson();
        Type userType = new TypeToken<ArrayList<Doctor>>(){}.getType();
        List<Doctor> doctors = gson.fromJson(json, userType);
        return doctors;
    }
    public static List<Admin> toAdmins(String json){
        Gson gson = new Gson();
        Type userType = new TypeToken<ArrayList<Admin>>(){}.getType();
        List<Admin> admins = gson.fromJson(json, userType);
        return admins;
    }
    public static List<Agenda> toHorariosAgenda(String json){
        Gson gson = new Gson();
        Type userType = new TypeToken<ArrayList<Agenda>>(){}.getType();
        List<Agenda> horariosAgenda = gson.fromJson(json, userType);
        return horariosAgenda;
    }
}
