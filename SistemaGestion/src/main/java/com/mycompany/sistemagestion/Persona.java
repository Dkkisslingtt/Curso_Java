/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion;

/**
 *
 * @author dkkissling
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setNombre(String valor){
        nombre= valor;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
}
