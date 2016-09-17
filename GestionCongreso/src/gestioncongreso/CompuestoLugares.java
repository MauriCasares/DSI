/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncongreso;
import java.util.Date;
import java.sql.DriverManager;
/**
 *
 * @author Ochan12
 */
public class CompuestoLugares implements estructuraLugares {
    private String descripcion, nombre;
    private Date fechaCreacion;
    private int nivel; //1-Universidad 2-Facultad 3-Centro 4-Grupo 5-Investigador
    private List hijo;
    
    @Override
    public void agregarComponentes(estructuraLugares a) {
       }

    @Override
    public String[] getNombreJerarquia(int niv, estructuraLugares a) {
        String[] s;
        
        return s;
        }

    

    @Override
    public void quitarComponente(estructuraLugares a) {
        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CompuestoLugares> getHijo() {
        return hijo;
    }

    public void setHijo(List<CompuestoLugares> hijo) {
        this.hijo = hijo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}
