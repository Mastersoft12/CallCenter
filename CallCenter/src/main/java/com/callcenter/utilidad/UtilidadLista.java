/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.callcenter.utilidad;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author faamarti
 */
public class UtilidadLista {

    public static void llenarJlist(String valor, DefaultListModel modeloLista, JList<String> jList1) {
        modeloLista.addElement(valor);
        jList1.setModel(modeloLista);
    }
}


