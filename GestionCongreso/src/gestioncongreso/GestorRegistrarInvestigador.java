package gestioncongreso;
import java.util.*;
import java.sql.*;
/**import java.util.*;
 *
 * @author Gisela
 */
public class GestorRegistrarInvestigador {
    private Connection con;
    private ResultSet res ;
    private Statement stm;
    private GUI2.PantallaRegistrarInvestigador2 pantalla;
    private String nombreInvestigador;
    private String apellidoInvestigador;
    private String facultadInvestigador;
    private String tipoDocumento;
    private int nroDocumento;
    private String universidadInvestigador;
    private java.sql.Date fechaActual;
    private java.sql.Date fechaNacimiento;
    private ArrayList<CompuestoLugares> listaCompuesto;
    
    public void registrarInvestigador(GUI2.PantallaRegistrarInvestigador2 p) throws SQLException
    {
        pantalla=p;
        pantalla.mostrarTiposDocumentos(buscarTipoDocumento());
        //pantalla.solicitarSeleccionFechaNacimiento();
        setFechaActual();
        getFechaActual();     
        if(validarFechaNacimiento());
        cargarDatos();
            
        
        
    }
    

    public String getNombreInvestigador() {
        return nombreInvestigador;
    }

    public void setNombreInvestigador(String nombreInvestigador) {
        this.nombreInvestigador = nombreInvestigador;
    }

    public String getApellidoInvestigador() {
        return apellidoInvestigador;
    }

    public void setApellidoInvestigador(String apellidoInvestigador) {
        this.apellidoInvestigador = apellidoInvestigador;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public java.sql.Date getFechaActual() {
      
        return fechaActual;
        
    }    
    
    public void setFechaActual() {
        Calendar d= Calendar.getInstance();
        long fecha = d.getTimeInMillis();
        fechaActual= new java.sql.Date(fecha);
        
    }
    
    private ArrayList buscarTipoDocumento()
    {
        ArrayList vectorTipoDoc = new ArrayList();
        int i =0;
         try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT * FROM Tipo_Documento");
        while(res.next()){
            
            TipoDocumento t = new TipoDocumento(res.getString(2),res.getString(1));
            vectorTipoDoc.add(t.getAbreviatura());
                       
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         System.out.println("los encontro");
        return vectorTipoDoc;
    }
    public void tomarDatosInvestigador(String nombre, String apellido, String tipoDoc, int nroDoc){
        setNombreInvestigador(nombre);
        setApellidoInvestigador(apellido);
        setNroDocumento(nroDoc);
        setTipoDocumento(tipoDoc);
        
    }
   public boolean validarInvestigador(int nroDoc,String tipoDoc) throws SQLException{
       
         try{
        con=DataBase.getConnection();
        stm = con.createStatement();        
        res=stm.executeQuery("SELECT * FROM Investigador I JOIN Tipo_Documento T ON I.id_tipo_documento=T.id_tipo_documento ");
        while(res.next()&&res!=null){           
            
            TipoDocumento t = new TipoDocumento(res.getString("abreviatura"),res.getString("nombre_tipo_documento"));
            Investigador inv=new Investigador(res.getInt("NRO_DOCUMENTO_INVESTIGADOR"),t);
            if(t!=null&&inv!=null)
            if(inv.existeInvestigador(nroDoc, tipoDoc)) return false;
            
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         finally{
             con.close();
         }
        return true; //false existe ,true no existe
   } 

    /**
     *
     * @param fecha
     */
    public void tomarFechaNacimientoSeleccionada(java.sql.Date fecha){
        setFechaNacimiento(fecha);
    }
    public boolean validarFechaNacimiento(){
        return fechaNacimiento.before(fechaActual);
    }
    
    public List cargarDatos(){
        List datos=new List();
        int nivel = 1;
        for (int i = 1; i < 5; i++) {
            buscar(nivel,datos);
        }
        return datos;
    }
    public void buscarUniverdidades() throws SQLException{
       
         try{
             
        con=DataBase.getConnection();
        stm = con.createStatement();        
        res=stm.executeQuery("SELECT * FROM Universidad");
        
        while(res.next()){
            //CompuestoLugares comp=new CompuestoLugares(res.getString("nombre_universidad"),1);

        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
             con.close();
         }
       
    }
    
    public List buscar(int nivel,List datos){
      String compuesto = "UNIVERSIDAD",descripcion,nombre;
      switch(nivel){
          case 2: compuesto = "FACULTAD";
              break;
          case 3: compuesto = "CENTRO_INVESTIGACION";
              break;
          case 4: compuesto = "GRUPO_INVESTIGACION";
              break;
              }
      try{
        con = DataBase.getConnection();
        stm = con.createStatement();
        res=stm.executeQuery("SELECT * FROM "+compuesto);
        while(res.next()){
            descripcion = res.getString("DESCRIPCION_"+compuesto);
            nombre = res.getString("NOMBRE_"+compuesto);
            CompuestoLugares nuevo = new CompuestoLugares(descripcion,nombre,nivel);
            datos.add(nuevo);
            
        }
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      return datos;
    }
    
}
