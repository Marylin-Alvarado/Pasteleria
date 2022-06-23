/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Edison
 */
public class Persona {
    private String nombre;
    private String cedula;
    private String apellido;

    public Persona() {
    }
    
    

    public Persona(String nombre, String cedula, String apellido) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
