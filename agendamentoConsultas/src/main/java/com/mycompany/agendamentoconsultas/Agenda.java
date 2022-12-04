/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas;

import java.util.Date;
/**
 *
 * @author mariacecilia
 */
public class Agenda {
    private int id = 0;
    private Date datetime;
    private String pacientCPF;
    private String pacientName;
    private String doctorCRM;
    private String doctorName;
    private String doctorSpecialty;
    private String createdBy;
    private Date createdAt;
    private String updatedBy;
    private Date updatedAt;
    private String deletedBy; //if != null não é visível na agenda
    private Date deletedAt; //if != null não é visível na agenda
    
    
    public Agenda(Date datetime, String doctorCRM, String doctorName, String doctorSpecialty, String createdBy) {
        this.id = id++;
        this.datetime = datetime;
        this.doctorCRM = doctorCRM;
        this.doctorName = doctorName;
        this.doctorSpecialty = doctorSpecialty;
        this.createdBy = createdBy;
        this.createdAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getPacientCPF() {
        return pacientCPF;
    }

    public void setPacientCPF(String pacientCPF) {
        this.pacientCPF = pacientCPF;
    }

    public String getPacientName() {
        return pacientName;
    }

    public void setPacientName(String pacientName) {
        this.pacientName = pacientName;
    }

    public String getDoctorCRM() {
        return doctorCRM;
    }

    public void setDoctorCRM(String doctorCRM) {
        this.doctorCRM = doctorCRM;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
    
    
    
    
}
