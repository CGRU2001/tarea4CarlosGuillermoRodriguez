/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4;

/**
 *
 * @author carlos
 */
public class Banquero {
    private String nombre, apellido, sucursal;
    
    public Banquero(){
        this.nombre = "";
        this.apellido = "";
        this.sucursal = "";
    }

    public Banquero(String nombre, String apellido, String sucursal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
}
