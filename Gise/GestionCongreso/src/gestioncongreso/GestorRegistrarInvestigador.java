package gestioncongreso;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorRegistrarInvestigador {
    private Connection con;
    private ResultSet res ;
    private Statement stm;
    private GUI2.PantallaRegistrarInvestigador2 pantalla;
    private String nombreInvestigador;
    private String apellidoInvestigador;
    private String facultadInvestigador;
    private String tipoDocumento;
    private long nroDocumento;
    private String universidadInvestigador;
    private java.sql.Date fechaActual;
    private java.sql.Date fechaNacimiento;
    private ArrayList<CompuestoLugares> listaCompuesto;
    private String universidad;
    private String facultad;
    private String centroInvestigacion;
    private String grupoInvestigacion;
    
    public GestorRegistrarInvestigador(){
        
    }
    
    public void registrarInvestigador(GUI2.PantallaRegistrarInvestigador2 p) throws SQLException
    {
        pantalla = p;
        pantalla.mostrarTiposDocumentos(buscarTipoDocumento());              
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

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public java.sql.Date getFechaNacimiento() {
        setFechaActual();
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
        System.out.println("Fecha Actual: "+fechaActual);
        
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
    
    
    public void tomarDatosInvestigador(String nombre, String apellido, String tipoDoc, long nroDoc) throws SQLException{
        try{
        setNombreInvestigador(nombre);
        setApellidoInvestigador(apellido);
        if(validarInvestigador(nroDoc,tipoDoc))
        {   //no existe
            setNroDocumento(nroDoc);
            setTipoDocumento(tipoDoc);
            System.out.println("TIRO UN SOUT");
            pantalla.solicitarSeleccionFechaNacimiento();
        } else {javax.swing.JOptionPane.showMessageDialog(pantalla, "Ya existe un investigador con ese Documento");}
        }catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
        
        }
   public boolean validarInvestigador(long nroDoc,String tipoDoc) throws SQLException{
       
         try{
        con=DataBase.getConnection();
        stm = con.createStatement();        
        res=stm.executeQuery("SELECT * FROM Investigador I JOIN Tipo_Documento T ON I.id_tipo_documento=T.id_tipo_documento ");
        while(res.next()&&res!=null){           
            System.out.println(tipoDoc+" "+nroDoc);
            TipoDocumento t = new TipoDocumento(res.getString("abreviatura"),res.getString("nombre_tipo_documento"));
            Investigador inv=new Investigador(res.getLong("NRO_DOCUMENTO_INVESTIGADOR"),t);
            System.out.println(t.getAbreviatura()+" "+inv.getNroDocumento());
            
            if(inv.existeInvestigador(nroDoc, tipoDoc)){
                System.out.println("sergi roberto");
                return false; //existe
                }
            }
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         finally{
             con.close();
         }
        return true;
   } 

    public void tomarFechaNacimientoSeleccionada(java.sql.Date fecha){
        //try {
            setFechaNacimiento(fecha);
            setFechaActual();
            if (validarFechaNacimiento(fechaActual,fecha))
                this.buscarUniversidades();
       // } catch (SQLException ex) {
        //    Logger.getLogger(GestorRegistrarInvestigador.class.getName()).log(Level.SEVERE, null, ex);
        //}
             
    }
    public boolean validarFechaNacimiento(java.sql.Date fechaActual,java.sql.Date fechaNacimiento){
        return fechaNacimiento.before(fechaActual);
    }
    public void buscarUniversidades(){
         try{
        CompuestoLugares C = new CompuestoLugares();
        pantalla.mostrarUniversidades(C.getNombreJerarquia(1, null));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }  
    public List cargarDatos(){
        List datos=new List();
        int nivel = 1;
        for (int i = 1; i < 5; i++) {
            buscar(nivel,datos);
        }
        return datos;
    }
//    public CompuestoLugares[] buscarUniverdidades() throws SQLException{
//      CompuestoLugares C = new CompuestoLugares();  
//      return C.getNombreJerarquia(1, null);
//    }
    
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

    public void tomarUniversidadSeleccionada(String universidad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.universidad=universidad;
        this.buscarFacultadesDeUniversidad(universidad);
    }

    private void buscarFacultadesDeUniversidad(String universidad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT * FROM Facultades WHERE universidad= "+universidad);
        while(res.next()){
            
            CompuestoLugares compuesto = new CompuestoLugares();
            pantalla.mostrarFacultades(compuesto.getNombreJerarquia(2,universidad));
                       
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
         System.out.println("los encontro");
    }

    public void tomarFacultadSeleccionada(String facultad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         this.facultad=facultad;
        this.buscarCentrosDeFacultad(facultad);
    }

    private void buscarCentrosDeFacultad(String facultad) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT * FROM CentrosInestigacion WHERE facultad= "+facultad);
        while(res.next()){
            
            CompuestoLugares compuesto = new CompuestoLugares();
            pantalla.mostrarCentrosDeInvestigacion(compuesto.getNombreJerarquia(3,facultad));
                       
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         System.out.println("los encontro");
    }

    public void tomarCentroInvestigacionSeleccionado(String centroInvestigacion) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            this.centroInvestigacion=centroInvestigacion;
            this.buscarGruposDeCentro(centroInvestigacion);
    }

    private void buscarGruposDeCentro(String centroInvestigacion) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT * FROM GruposInvestigacion WHERE centro= "+centroInvestigacion);
        while(res.next()){
            
            CompuestoLugares compuesto = new CompuestoLugares();
            pantalla.mostrarGruposDeInvestigacion(compuesto.getNombreJerarquia(4,centroInvestigacion));
                       
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         System.out.println("los encontro");
    }

    public void tomarGrupoInvestigacionSeleccionado(String grupoInvestigacion) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.grupoInvestigacion=grupoInvestigacion;
        //this.buscarAreasInvestigacion();
    }
    
     private void buscarAreasInvestigacion()
    {
        ArrayList vectorAreaInvestigacion = new ArrayList();
        int i =0;
         try{
        con=DataBase.getConnection();
        stm = con.createStatement();
        
        res=stm.executeQuery("SELECT * FROM Area_Investigacion");
        while(res.next()){
            
            AreaInvestigacion t = new AreaInvestigacion(res.getString(3),res.getString(2));
            vectorAreaInvestigacion.add(t.getNombre());
                       
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         System.out.println("los encontro");
        
         pantalla.mostrarAreasInvestigacion (vectorAreaInvestigacion);
    }
     
     
    
}
