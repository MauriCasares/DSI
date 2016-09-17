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
public class Nodo<E> {
    private E info;
    private Nodo next;
    
    public Nodo(E x, Nodo n){
        info=x;
        next=n;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Nodo<E> getNext() {
        return next;
    }

    public void setNext(Nodo<E> next) {
        this.next = next;
    }
}
