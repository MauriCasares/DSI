/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncongreso;

import java.util.ArrayList;

/**
 *
 * @author Gisela
 */
public class Provincia {
    public String nombre;
    public ArrayList<Ciudad> ciudad;

    public Provincia(String nombre, ArrayList<Ciudad> ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(ArrayList<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Provincia " + "Nombre= " + nombre + ", Ciudad=" + ciudad.toString();
    }
    
    
}
