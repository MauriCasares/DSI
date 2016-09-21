/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncongreso;
import java.util.Date;
import java.sql.*;
/**
 *
 * @author Ochan12
 */
public class CompuestoLugares implements estructuraLugares{
    
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
        
    @Override
    public void agregarComponentes(estructuraLugares a) {
       }

    @Override
    public String[] getNombreJerarquia(int niv, CompuestoLugares a) {
        
        String[] s = null;
        
        
        if (a != null) {
            //String especificacion = "WHERE NOMBRE IS LIKE "+a.getNombre();
            switch (niv) {
                case 2://FACULTAD
                    s = new String[contarElementos("FACULTAD",a.getNombre())];
                    s=listarElementos(s,"FACULTAD",a.getNombre());
                    break;
                case 3://CENTRO
                    s = new String[contarElementos("CENTRO_INVESTIGACION",a.getNombre())];
                    s=listarElementos(s,"CENTRO_INVESTIGACION",a.getNombre());
                    break;
                case 4://GRUPO
                    s = new String[contarElementos("GRUPO_INVESTIGACION",a.getNombre())];
                    s=listarElementos(s,"GRUPO_INVESTIGACION",a.getNombre());
                    break;

            }

        } else {
            s = new String[contarElementos("UNIVERSIDAD",null)];
            System.out.println("ELEMENTOS CONTADOS");
            s=listarElementos(s,"UNIVERSIDAD");

        }
        return s;

    }

    

    @Override
    public void quitarComponente(estructuraLugares a) {
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
    
    public int contarElementos(String s, String padre) {
        int contador = 0;
        try {
            String rs;
            con = DataBase.getConnection();
            stm = con.createStatement();
            res = null;
            if (padre == null) {
                rs = "SELECT * FROM " + s;
                res = stm.executeQuery(rs);
                while (res.next()) {
                    contador++;
                }
            } else {
                    rs = "SELECT * FROM " + s + " WHERE ID LIKE "+ buscarID(s,padre);
                res = stm.executeQuery(rs);
                while (res.next()) {
                    contador++;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return contador;
    }
    //PARA UNIVERSIDAD
    public String[] listarElementos(String[] s,String a){
    
    int i=0;
    try{
        String rs;
        con=DataBase.getConnection();
        stm = con.createStatement();        
        rs="SELECT * FROM "+a;
        res=stm.executeQuery(rs);
                    while(res.next()){
                        System.out.println("LISTANDO");
                        s[i]=res.getString(2);
                        i++;
                    }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    
    
    return s;
    }
    
    //PARA LOS DEMAS, CAMBIAN LOS PARAMETROS
    public String[] listarElementos(String [] s,String a,String padre){
        System.out.println("Listar elementos");
    int i=0;
    try{
        String rs;
        con=DataBase.getConnection();
        stm = con.createStatement();
        rs="SELECT NOMBRE FROM "+a;
        res=stm.executeQuery(rs);
                    while(res.next()){
                        s[i]=res.getString(1);
                        i++;
                    }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    
    
    return s;
    }
    
    
    
    public int buscarID(String nombre,String padre){
        System.out.println("Buscar id");
        int i=0;
        try{
        con=DataBase.getConnection();
        stm = con.createStatement();        
        res=stm.executeQuery("SELECT * FROM "+nombre.toUpperCase()+" WHERE NOMBRE LIKE "+padre.toUpperCase());
        System.out.println(res.getString("ID"));
        i = res.getInt(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return i;
    }
    
        
}

