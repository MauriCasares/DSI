package gestioncongreso;



public interface IEstructuraLugares {
    
    public void agregarComponentes(IEstructuraLugares a);
    public String[] getNombreJerarquia(int a,String b);    
    public void quitarComponente(IEstructuraLugares a);
    public IEstructuraLugares[] obtenerHijo();
    
}
