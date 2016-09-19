/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncongreso;


/**
 *
 * @author Ochan12
 */
public interface estructuraLugares {
    
    public void agregarComponentes(estructuraLugares a);
    public String[] getNombreJerarquia(int a,CompuestoLugares b);    
    public void quitarComponente(estructuraLugares a);
    
}
