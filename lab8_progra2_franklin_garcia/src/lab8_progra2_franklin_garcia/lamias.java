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
public class lamias extends hadas {

    private int aleta;
    private int branquias;

    public lamias() {
        super();
    }

    public lamias(int aleta, int branquias, String nombre, int altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
     
    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void atacar() {
        salud=475;
        poder=57;
    }
}
