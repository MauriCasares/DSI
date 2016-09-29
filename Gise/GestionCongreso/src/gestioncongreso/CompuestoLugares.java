package gestioncongreso;
import java.util.Date;
import java.sql.*;
import java.util.*;

public class CompuestoLugares implements IEstructuraLugares{
    
    private String descripcion, nombre;
    private Date fechaCreacion;
    private int nivel; //1-Universidad 2-Facultad 3-Centro 4-Grupo 5-Investigador
    private List hijo;
    private static Connection con;
    private Statement stm;
    private ResultSet res;
    
    public CompuestoLugares(String d, String n, int niv){
        descripcion =d;
        nombre=n;
        nivel=niv;
    }
    public CompuestoLugares(){
        
    }
    
    public CompuestoLugares(String n){
        nombre=n;
    }
        
    @Override
    public void agregarComponentes(IEstructuraLugares a) {
       }

    //@Override
//    public CompuestoLugares[] getNombreJerarquia(int niv, CompuestoLugares a) {
//        
//        CompuestoLugares[] s = null;
//        
//        
//        if (a != null) {
//              
//            switch (niv) {
//                case 2://FACULTAD
//                    s = new CompuestoLugares[contarElementos("FACULTAD",a.getNombre())];
//                    s=listarElementos(s,"FACULTAD",a.getNombre());
//                    break;
//                case 3://CENTRO
//                    s = new CompuestoLugares[contarElementos("CENTRO_INVESTIGACION",a.getNombre())];
//                    s=listarElementos(s,"CENTRO_INVESTIGACION",a.getNombre());
//                    break;
//                case 4://GRUPO
//                    s = new CompuestoLugares[contarElementos("GRUPO_INVESTIGACION",a.getNombre())];
//                    s=listarElementos(s,"GRUPO_INVESTIGACION",a.getNombre());
//                    break;
//
//            }
//
//        } else {
//            s = new CompuestoLugares[contarElementos("UNIVERSIDAD",null)];
//            System.out.println("ELEMENTOS CONTADOS");
//            s=listarElementos(s,"UNIVERSIDAD");
//
//        }
//        return s;
//
//    }
    @Override
    public ArrayList getNombreJerarquia(int niv, String seleccionado) {
        
       ArrayList nombres = null;   
        
        if (seleccionado != null) {
              
            switch (niv) {
                case 2://FACULTAD
                    nombres = listarElementos("FACULTAD", "UNIVERSIDAD", seleccionado);
                    break;
                case 3://CENTRO
                    nombres = listarElementos("CENTRO_INVESTIGACION", "FACULTAD", seleccionado);
                    break;
                case 4://GRUPO
                    nombres = listarElementos("GRUPO_INVESTIGACION", "CENTRO_INVESTIGACION", seleccionado);
                    break;
            }
        } else {
            nombres = listarElementos("UNIVERSIDAD", null, null); 
        }
        return nombres;
    }
    

    @Override
    public void quitarComponente(IEstructuraLugares a) {
        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CompuestoLugares> getHijo() {
        return hijo;
    }

    public void setHijo(List<CompuestoLugares> hijo) {
        this.hijo = hijo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    

    //PARA UNIVERSIDAD
    public ArrayList listarElementos(String nombreTabla, String nombreTablaPadre, String padre){
        ArrayList lista= new ArrayList();
        String sql = "";
        
        
        if (padre != null) {
            sql = "SELECT * FROM " + nombreTabla + " NT JOIN " + nombreTablaPadre + " TP ON TN.ID_"+nombreTablaPadre+" = TP.ID_"+nombreTablaPadre+" WHERE NOMBRE_"+nombreTablaPadre+" LIKE "+ padre;
            
        } else {
            sql = ("SELECT * FROM " + nombreTabla);
        }
            try {
                con = DataBase.getConnection();
                stm = con.createStatement();

                res = stm.executeQuery(sql);
                while (res.next()) {
                    lista.add(res.getString("NOMBRE_"+ nombreTabla));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
    return lista;
    }
    
    //PARA LOS DEMAS, CAMBIAN LOS PARAMETROS
//    public CompuestoLugares[] listarElementos(CompuestoLugares [] s,String a,String padre){
//        System.out.println("Listar elementos");
//    int i=0;
//    try{
//        String rs;
//        con=DataBase.getConnection();
//        stm = con.createStatement();
//        rs="SELECT * FROM "+a;
//        res=stm.executeQuery(rs);
//                    while(res.next()){
//                        
//                        i++;
//                    }
//            }catch(Exception e){
//            System.out.println(e.getMessage());}
//    
//    return s;
//    }
    
    
    public int buscarID(String nombre,String padre){
        int i = 0;
        try {
            con = DataBase.getConnection();
            stm = con.createStatement();
            res = stm.executeQuery("SELECT * FROM " + nombre.toUpperCase() + " WHERE NOMBRE LIKE " + padre.toUpperCase());
            System.out.println(res.getString(1));
            i = res.getInt(1);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return i;
    }

    @Override
    public IEstructuraLugares[] obtenerHijo() {
       return null; 
    }
    
        
}

