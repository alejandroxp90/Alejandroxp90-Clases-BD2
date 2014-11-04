/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio.uno;

/**
 *
 * @author Alejandro
 */
public class Auto {
    private String nombre;
    private int cuatrimestre;
    private String profesor;  

    public Auto() {
    }

    public Auto(String nombre, int cuatrimestre, String profesor) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Auto(String nombre, int cuatrimestre) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }

    public Auto(int cuatrimestre, String profesor) {
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
    }
    
}
