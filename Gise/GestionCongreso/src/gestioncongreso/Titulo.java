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
public class Titulo {
    private String descripcion;
    private String nombre;
    private TipoTitulo tipoTitulo;
    
    public Titulo(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Titulo " + "Descripcion= " + descripcion + ", Nombre= " + nombre;
    }
    
    
}
