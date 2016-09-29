package gestioncongreso;

import java.util.ArrayList;

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
