/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentoconsultas.controller;

import com.mycompany.agendamentoconsultas.view.AdminRegistrationScreenView;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Fernando
 */
public class ListAdmins implements ListSelectionListener {

    private AdminRegistrationScreenView screenView;

    public ListAdmins(AdminRegistrationScreenView screenView) {
        this.screenView = screenView;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //TODO
    }
}
