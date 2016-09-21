/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncongreso;

/**
 *
 * @author Gisela
 */
public class Ciudad {
    private int CP;
    private String nombre;

    public Ciudad(int CP, String nombre) {
        this.CP = CP;
        this.nombre = nombre;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad " + "CP= " + CP + ", Nombre= " + nombre;
    }
    
    
}
