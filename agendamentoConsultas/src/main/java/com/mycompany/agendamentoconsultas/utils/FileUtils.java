/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.utils;

import com.mycompany.agendamentoconsultas.model.UserLists;
import com.mycompany.agendamentoconsultas.view.ScreenView;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Giardini Nascimento Gonçalves
 * @author Maria Cecília Romão Santos
 * 
 */
public class FileUtils implements WindowListener{
    private ScreenView screenview;
    
    public FileUtils(ScreenView screenView){
        this.screenview = screenView;
    }
    
    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        File file = new File(path);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine())  content.append(reader.nextLine()).append("\n");
        
        return content.toString();
    }
    
    public static void writeFile(String path, String content) throws IOException {
        FileWriter fwFile;
        BufferedWriter bwFile;

        try{
            File file = new File(path);
            fwFile = new FileWriter(file, false);
            bwFile = new BufferedWriter(fwFile);
            bwFile.write(content + "\n");
            bwFile.close();
            fwFile.close();
        } catch(IOException e){
            System.err.println(e.toString() + "can not be written");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            String pacientFile = readFile("pacients.json");
            String doctorFile = readFile("doctors.json");
            String adminFile = readFile("admin.json");

            UserLists.setPacients(JSONUtils.toPacients(pacientFile)); 
            UserLists.setDoctors(JSONUtils.toDoctors(doctorFile));
            UserLists.setAdmin(JSONUtils.toAdmins(adminFile));

            this.screenview.repaint();

        } catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
