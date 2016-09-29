package gestioncongreso;

public class TipoDocumento {
    private String abreviatura;
    private String nombre;

    public TipoDocumento(String abreviatura, String nombre) {
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }


    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return "Abreviatura: "+abreviatura+" Nombre: "+nombre;
    }
    
}
