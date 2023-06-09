/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajogrupal2;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Santiago Jimenez Escobar
 *  Kevin Andres Zapata Nuñez
 */
public class TrabajoGrupal2 {

    public static void main(String[] args) {

        Autenticacion login = new Autenticacion();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
}
