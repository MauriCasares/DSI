/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncongreso;

/**
 *
 * @author Ochan12
 * @param <E>
 */
public class List<E extends IEstructuraLugares> {
    private Nodo<E> frente;
    private int size;

      
    public void add(E x){
        Nodo<E> nuevo = new Nodo<>( x, frente );
        
    }
    

    public Nodo<E> getFrente() {
        return frente;
    }

    public void setFrente(Nodo<E> frente) {
        this.frente = frente;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
