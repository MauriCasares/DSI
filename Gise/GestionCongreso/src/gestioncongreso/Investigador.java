package gestioncongreso;

import java.util.ArrayList;
import java.util.Date;

public class Investigador implements IEstructuraLugares{
    private String apellido;
    private String mail;
    private String nombre;
    private long nroDocumento;
    private Date fechaNacimiento;
    private TituloObtenido tituloObtenido;
    private TipoDocumento tipoDocumento;
    private AreaInvestigacion areaInvestigacion;
    private CategoriaInvestigacion categoriaInvestigacion;

    public TituloObtenido getTituloObtenido() {
        return tituloObtenido;
    }

    public void setTituloObtenido(TituloObtenido tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public AreaInvestigacion getAreaInvestigacion() {
        return areaInvestigacion;
    }

    public void setAreaInvestigacion(AreaInvestigacion areaInvestigacion) {
        this.areaInvestigacion = areaInvestigacion;
    }

    public CategoriaInvestigacion getCategoriaInvestigacion() {
        return categoriaInvestigacion;
    }

    public void setCategoriaInvestigacion(CategoriaInvestigacion categoriaInvestigacion) {
        this.categoriaInvestigacion = categoriaInvestigacion;
    }
    public Investigador (long nroDocumento, TipoDocumento tipo ){
        this.nroDocumento=nroDocumento;
        this.tipoDocumento=tipo;
    }

    public Investigador(String apellido, String mail, String nombre, int nroDocumento, Date fechaNacimiento, TituloObtenido tituloObtenido, TipoDocumento tipoDocumento, AreaInvestigacion areaInvestigacion, CategoriaInvestigacion categoriaInvestigacion) {
        this.apellido = apellido;
        this.mail = mail;
        this.nombre = nombre;
        this.nroDocumento = nroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.tituloObtenido = tituloObtenido;
        this.tipoDocumento = tipoDocumento;
        this.areaInvestigacion = areaInvestigacion;
        this.categoriaInvestigacion = categoriaInvestigacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public boolean existeInvestigador(long nro,String tipo){
        return nro==nroDocumento && tipo.compareTo(tipoDocumento.getAbreviatura())==0;
    }

    @Override
    public void agregarComponentes(IEstructuraLugares a) {}

    
     @Override
    public void quitarComponente(IEstructuraLugares a) {}
    
    @Override
    public ArrayList getNombreJerarquia(int niv, String a){return null;}

    public IEstructuraLugares[] obtenerHijo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
