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
public class Empleado {
    private String apellido;
    private long cuil;
    private Date fechaIngreso;
    private int legajo;
    private String nombre;
    private int nroDocumento;
    private Usuario usuario;
    private TipoDocumento tipoDocumento;

    public Empleado(String apellido, long cuil, Date fechaIngreso, int legajo, String nombre, int nroDocumento) {
        this.apellido = apellido;
        this.cuil = cuil;
        this.fechaIngreso = fechaIngreso;
        this.legajo = legajo;
        this.nombre = nombre;
        this.nroDocumento = nroDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    @Override
    public String toString() {
        return "Empleado " + "Apellido= " + apellido + ", Cuil= " + cuil + ", FechaIngreso= " + fechaIngreso + ", Legajo= " + legajo + ", Nombre= " + nombre + ", Nro Documento= " + nroDocumento;
    }
    
}
