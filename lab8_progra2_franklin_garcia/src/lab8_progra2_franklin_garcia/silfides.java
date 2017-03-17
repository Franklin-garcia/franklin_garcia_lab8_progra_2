/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_progra2_franklin_garcia;

/**
 *
 * @author Franklin Garcia
 */
public class silfides extends hadas {
    private int alas;

    public silfides() {
        super();
    }

    public silfides(int alas, String nombre, int altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void atacar() {
        salud=563;
        poder=67;
        
    }
    
}
