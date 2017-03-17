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
public class salamandras extends hadas{
    private int alas;
    private int dano_extra;

    public salamandras() {
        super();
    }

    public salamandras(int alas, String nombre, int altura, int edad, int salud, int poder) {
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
        salud=683;
        poder=71;
    }
    
}
