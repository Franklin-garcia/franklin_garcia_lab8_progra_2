/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_progra2_franklin_garcia;

import java.io.Serializable;

/**
 *
 * @author Franklin Garcia
 */
public abstract class hadas implements comportamiento,Serializable {
     
protected String nombre;
protected int altura;
protected int edad;
protected int salud;
protected int poder;

private static final long SerialVersionUID = 777L;
    public hadas() {
    }

    public hadas(String nombre, int altura, int edad, int salud, int poder) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public abstract void atacar();
    
}