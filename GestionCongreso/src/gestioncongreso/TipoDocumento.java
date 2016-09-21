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
public class TipoDocumento {
    private String abreviatura;
    private String nombre;

    public TipoDocumento(String abreviatura, String nombre) {
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }
    /**
     * @return the abreviatura
     */
    public String getAbreviatura() {
        return abreviatura;
    }

    /**
     * @param abreviatura the abreviatura to set
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return "Abreviatura: "+abreviatura+" Nombre: "+nombre;
    }
    
}
