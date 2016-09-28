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
public interface IEstructuraLugares {
    
    public void agregarComponentes(IEstructuraLugares a);
    public CompuestoLugares[] getNombreJerarquia(int a,CompuestoLugares b);    
    public void quitarComponente(IEstructuraLugares a);
    public IEstructuraLugares[] obtenerHijo();
    
}
