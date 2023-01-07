/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class FileUtils {
    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        File f = new File(path);
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            content.append(reader.nextLine()).append("\n");
        }
        
        return content.toString();
    }
    
    public static void writeFile(String path, String content) throws IOException {
        FileWriter fwFile;
        BufferedWriter bwFile;

        File f = new File(path);

        fwFile = new FileWriter(f, false);
        bwFile = new BufferedWriter(fwFile);

        bwFile.write(content);

        bwFile.close();
        fwFile.close();
    }
}
