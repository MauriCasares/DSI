package gestioncongreso;

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
