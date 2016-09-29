package gestioncongreso;

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
