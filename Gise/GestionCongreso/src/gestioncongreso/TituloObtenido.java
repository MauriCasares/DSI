/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncongreso;

import java.sql.Date;

/**
 *
 * @author Gisela
 */
public class TituloObtenido {
    
    private Date fechaObtencion;
    private Titulo titulo;

    public TituloObtenido(Date fechaObtencion) {
        this.fechaObtencion = fechaObtencion;
    }

    public Date getFechaObtencion() {
        return fechaObtencion;
    }

    public void setFechaObtencion(Date fechaObtencion) {
        this.fechaObtencion = fechaObtencion;
    }

    @Override
    public String toString() {
        return "TituloObtenido " + "Fecha Obtencion= " + fechaObtencion;
    }
    
    
}
