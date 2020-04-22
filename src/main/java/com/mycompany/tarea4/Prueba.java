/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4;

/**
 *
 * @author Fran
 */
public class Prueba {
    //Main
    public static void main(String[] args) {
        //Creamos dos objetos
        Banquero banquero1 = new Banquero("Paco", "Pérez", "Bankia");
        Banquero banquero2 = new Banquero("Fernando", "Simón", "Unicaja");
        
        //Imprimimos por pantalla sus valores
        System.out.println(banquero1);
        System.out.println(banquero2);
        
    }
    
}
