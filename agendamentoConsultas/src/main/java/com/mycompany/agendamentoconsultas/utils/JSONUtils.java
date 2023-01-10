/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.agendamentoconsultas.model.Doctor;
import com.mycompany.agendamentoconsultas.model.Pacient;
import com.mycompany.agendamentoconsultas.model.Person;
import com.mycompany.agendamentoconsultas.model.UserRegistrationException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class JSONUtils {
    public static String toJSON(Person user){
        Gson gson = new Gson();
        return gson.toJson(user);
    }
    
    public static String toJSON(List<Person> users){
        Gson gson = new Gson();
        return gson.toJson(users);
    }
    
    public static Person toPerson(String json){
        Gson gson = new Gson();
        Person user = gson.fromJson(json, Person.class);
        return user;
    }
    
    public static List<Person> toPersons(String json){
        Gson gson = new Gson();
        Type personType = new TypeToken<ArrayList<Person>>(){}.getType();
        List<Person> users = gson.fromJson(json, personType);
        return users;
    }
}
