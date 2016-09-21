/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncongreso;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Ochan12
 */
public class CompuestoLugares implements IEstructuraLugares {
    private String descripcion, nombre;
    private Date fechaCreacion;
    private int nivel; //1-Universidad 2-Facultad 3-Centro 4-Grupo 5-Investigador
    private List hijo;
    private static Connection con;
    private Statement stm;
    private ResultSet res;
    
    @Override
    public void agregarComponentes(IEstructuraLugares a) {
       }

    @Override
    public String[] getNombreJerarquia(int niv, CompuestoLugares a) {
        
        String[] s = null;
        String especificacion = "WHERE NOMBRE IS LIKE "+a.getNombre();
        
        if (a != null) {
            switch (niv) {
                case 2://FACULTAD
                    s = new String[contarElementos("FACULTAD",a.getNombre())];
                    s=listarElementos("UNIVERSIDAD");
                    break;
                case 3://CENTRO
                    s = new String[contarElementos("CENTRO_INVESTIGACION",a.getNombre())];
                    s=listarElementos("UNIVERSIDAD");
                    break;
                case 4://GRUPO
                    s = new String[contarElementos("GRUPO_INVESTIGACION",a.getNombre())];
                    s=listarElementos("UNIVERSIDAD");
                    break;

            }

        } else {
            s = new String[contarElementos("UNIVERSIDAD",null)];
            s=listarElementos("UNIVERSIDAD");

        }
        return s;

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
                rs = "SELECT * FROM " + s + " WHERE ID LIKE ";
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
    public String[] listarElementos(String a){
    String[] s=null;
    int i=0;
    try{
        String rs;
        con=DataBase.getConnection();
        stm = con.createStatement();
        ResultSet res=null;
        rs="SELECT NOMBRE FROM "+a;
                    res=stm.executeQuery(rs);
                    while(res.next()){
                        s[i]=res.getNString(0);
                        i++;
                    }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    
    
    return s;
    }
    
    //PARA LOS DEMAS, CAMBIAN LOS PARAMETROS
    public String[] listarElementos(String a,String padre){
    String[] s=null;
    int i=0;
    try{
        String rs;
        con=DataBase.getConnection();
        stm = con.createStatement();
        ResultSet res=null;
        rs="SELECT NOMBRE FROM "+a;
                    res=stm.executeQuery(rs);
                    while(res.next()){
                        s[i]=res.getNString(1);
                        i++;
                    }
            }catch(Exception e){
            System.out.println(e.getMessage());}
    
    
    return s;
    }
    
    
    
    public int buscarID(String padre,String nombre){
        ResultSet res=null;
        int i=0;
        try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT ID FROM "+padre.toUpperCase()+" WHERE NOMBRE = "+nombre.toUpperCase());
        i = res.getInt(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return i;
    }
    
}
