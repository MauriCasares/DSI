package gestioncongreso;

import java.util.ArrayList;

public interface IEstructuraLugares {
    
    public void agregarComponentes(IEstructuraLugares a);
    public ArrayList getNombreJerarquia(int a,String b);    
    public void quitarComponente(IEstructuraLugares a);
    public IEstructuraLugares[] obtenerHijo();
    
}
