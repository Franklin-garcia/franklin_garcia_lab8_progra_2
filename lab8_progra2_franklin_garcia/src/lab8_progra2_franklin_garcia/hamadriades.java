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
public class hamadriades extends hadas{
    private int salud_extra;

    public hamadriades() {
        super();
    }

    public hamadriades(int salud_extra, String nombre, int altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.salud_extra = salud_extra;
    }

    public int getSalud_extra() {
        return salud_extra;
    }

    public void setSalud_extra(int salud_extra) {
        this.salud_extra = salud_extra;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void atacar() {
        salud=373;
        poder=78;
        salud_extra=173;
    }
    
    
}
