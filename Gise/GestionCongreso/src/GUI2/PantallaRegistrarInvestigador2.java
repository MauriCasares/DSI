/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import gestioncongreso.DataBase;
import gestioncongreso.TipoDocumento;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

import gestioncongreso.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Ochan12
 */
public class PantallaRegistrarInvestigador2 extends javax.swing.JFrame {
    private Connection con;
    private ResultSet res;
    private Statement stm;
    private static GestorRegistrarInvestigador gestor;
    private String nombreInvestigador;
    private String apellidoInvestigador;
    private String tipoDocumento;
    private long numeroDocumento;
    private int dia;
    private int mes;
    private int año;
    private java.sql.Date fechaNacimiento;
    
    public PantallaRegistrarInvestigador2() {
        super("Registrar Investigador");
        initComponents();
        mostrarTiposDocumentos(buscarTipoDocumento());
        int contador=1916;
       gestor = new GestorRegistrarInvestigador();
       Object[] vectorDias = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
       Object[] vectorMeses = {1,2,3,4,5,6,7,8,9,10,11,12};
       Object[] vectorAños = new Object[100];
        for (int i = 0; i < vectorAños.length-1; i++) {
            vectorAños[i] = contador;
            contador++;
        }
       DefaultComboBoxModel modeloDia = new DefaultComboBoxModel(vectorDias);
       DefaultComboBoxModel modeloMeses = new DefaultComboBoxModel(vectorMeses);
       DefaultComboBoxModel modeloAños = new DefaultComboBoxModel(vectorAños);
       cmb_dia.setModel(modeloDia);
       cmb_mes.setModel(modeloMeses);
       cmb_año.setModel(modeloAños);
       cmb_dia.setEnabled(false);
       cmb_mes.setEnabled(false);
       cmb_año.setEnabled(false);
    }
    public void tomarNombreInvestigador()
    {
        nombreInvestigador=txt_Nombre.getText();
    }
    public void tomarApellidoInvestigador()
    {
        apellidoInvestigador=txt_Apellido.getText();
    }
    public void tomarSeleccionTipoDocumento()
    {
        tipoDocumento=cmb_TipoDocumento1.getSelectedItem().toString();
    }
    public void tomarNumeroInvestigador()
    {
        numeroDocumento=Long.parseLong(txt_Numero.getText());
    }
    public void mostrarTiposDocumentos(ArrayList lista){
        DefaultComboBoxModel modeloComboTipoDoc = new DefaultComboBoxModel(lista.toArray());
        cmb_TipoDocumento1.setModel(modeloComboTipoDoc);
    }
    public void tomarSeleccionFechaNacimiento(){
        dia = Integer.parseInt(cmb_dia.getSelectedItem().toString());
        mes = Integer.parseInt(cmb_mes.getSelectedItem().toString())-1;
        año = Integer.parseInt(cmb_año.getSelectedItem().toString());        
    }
    
    private void setFechaNacimiento(int d, int m, int a)
    {
       Calendar cal=new GregorianCalendar();
        cal.set(Calendar.YEAR, a);
        cal.set(Calendar.MONTH, m);
        cal.set(Calendar.DAY_OF_MONTH, d);
        long f = cal.getTimeInMillis();
        
        fechaNacimiento = new java.sql.Date(f);
        
        
        System.out.println(fechaNacimiento);
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
    
    private void solicitarSeleccionFechaDeNacimiento()
    {
       cmb_dia.setEnabled(true);
       cmb_mes.setEnabled(true);
       cmb_año.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        DatosPersonales = new javax.swing.JPanel();
        lbl_TipoDocumento = new javax.swing.JLabel();
        cmb_dia = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_Numero = new javax.swing.JTextField();
        lbl_Nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Mail = new javax.swing.JTextField();
        btn_Siguiente1 = new javax.swing.JButton();
        cmb_TipoDocumento1 = new javax.swing.JComboBox();
        cmb_mes = new javax.swing.JComboBox();
        cmb_año = new javax.swing.JComboBox();
        btn_validar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        DatosAcademicos = new javax.swing.JPanel();
        lbl_Universidad = new javax.swing.JLabel();
        lbl_Facultad = new javax.swing.JLabel();
        lbl_CentroInvestigacion = new javax.swing.JLabel();
        lbl_GrupoInvestigacion = new javax.swing.JLabel();
        lbl_Ciudad = new javax.swing.JLabel();
        lbl_Provincia = new javax.swing.JLabel();
        cmb_Universidad = new javax.swing.JComboBox();
        cmb_Facultad = new javax.swing.JComboBox();
        cmb_CentroInvestigacion = new javax.swing.JComboBox();
        cmb_GrupoInvestigacion = new javax.swing.JComboBox();
        lbl_cargarCiudad = new javax.swing.JLabel();
        lbl_cargarProvincia = new javax.swing.JLabel();
        btn_Siguiente2 = new javax.swing.JButton();
        DatosTitulo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmb_TipoTitulo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmb_Titulo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmb_Categoria = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        btn_Siguiente3 = new javax.swing.JButton();
        cmb_dia1 = new javax.swing.JComboBox();
        cmb_mes1 = new javax.swing.JComboBox();
        cmb_año1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(420, 320));

        DatosPersonales.setPreferredSize(new java.awt.Dimension(420, 320));

        lbl_TipoDocumento.setText("Tipo de Documento:");

        cmb_dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Nº");

        txt_Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroActionPerformed(evt);
            }
        });

        lbl_Nombre.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Fecha de Nacimiento:");

        jLabel4.setText("Mail:");

        btn_Siguiente1.setText("Siguiente");
        btn_Siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Siguiente1ActionPerformed(evt);
            }
        });

        cmb_TipoDocumento1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_validar.setText("Validar");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });

        jLabel5.setText("Día");

        jLabel6.setText("Mes");

        jLabel11.setText("Año");

        javax.swing.GroupLayout DatosPersonalesLayout = new javax.swing.GroupLayout(DatosPersonales);
        DatosPersonales.setLayout(DatosPersonalesLayout);
        DatosPersonalesLayout.setHorizontalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_TipoDocumento)
                .addGap(4, 4, 4)
                .addComponent(cmb_TipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(btn_Siguiente1))
        );
        DatosPersonalesLayout.setVerticalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Nombre))
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbl_TipoDocumento))
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmb_TipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_validar))
                .addGap(18, 18, 18)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))))
                .addGap(19, 19, 19)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btn_Siguiente1))
        );

        jTabbedPane1.addTab("Datos Personales", DatosPersonales);

        DatosAcademicos.setPreferredSize(new java.awt.Dimension(420, 320));

        lbl_Universidad.setText("Universidad:");

        lbl_Facultad.setText("Facultad:");

        lbl_CentroInvestigacion.setText("Centro de Investigacion:");

        lbl_GrupoInvestigacion.setText("Grupo de Investigacion:");

        lbl_Ciudad.setText("Ciudad:");

        lbl_Provincia.setText("Provincia:");

        cmb_Universidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmb_Universidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_UniversidadActionPerformed(evt);
            }
        });

        cmb_Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        cmb_CentroInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        cmb_GrupoInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        lbl_cargarCiudad.setText("Aca va ciudad que la sacamos de la facu");

        lbl_cargarProvincia.setText("Aca va provincia que la sacamos de la facu");

        btn_Siguiente2.setText("Siguiente");
        btn_Siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Siguiente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosAcademicosLayout = new javax.swing.GroupLayout(DatosAcademicos);
        DatosAcademicos.setLayout(DatosAcademicosLayout);
        DatosAcademicosLayout.setHorizontalGroup(
            DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosAcademicosLayout.createSequentialGroup()
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbl_Universidad)
                        .addGap(10, 10, 10)
                        .addComponent(cmb_Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbl_Facultad)
                        .addGap(15, 15, 15)
                        .addComponent(cmb_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_CentroInvestigacion)
                        .addGap(11, 11, 11)
                        .addComponent(cmb_CentroInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_GrupoInvestigacion)
                        .addGap(15, 15, 15)
                        .addComponent(cmb_GrupoInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbl_Ciudad)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_cargarCiudad))
                    .addGroup(DatosAcademicosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbl_Provincia)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_cargarProvincia)))
                .addGap(18, 18, 18))
            .addComponent(btn_Siguiente2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        DatosAcademicosLayout.setVerticalGroup(
            DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosAcademicosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Universidad)
                    .addComponent(cmb_Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Facultad)
                    .addComponent(cmb_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CentroInvestigacion)
                    .addComponent(cmb_CentroInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_GrupoInvestigacion)
                    .addComponent(cmb_GrupoInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Ciudad)
                    .addComponent(lbl_cargarCiudad))
                .addGap(16, 16, 16)
                .addGroup(DatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Provincia)
                    .addComponent(lbl_cargarProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_Siguiente2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Académicos", DatosAcademicos);

        DatosTitulo.setPreferredSize(new java.awt.Dimension(420, 320));

        jLabel7.setText("Tipo de Título:");

        cmb_TipoTitulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel8.setText("Título:");

        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel9.setText("Categoría:");

        cmb_Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel10.setText("Fecha Obtención:");

        btn_Siguiente3.setText("Siguiente");

        cmb_dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_año1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout DatosTituloLayout = new javax.swing.GroupLayout(DatosTitulo);
        DatosTitulo.setLayout(DatosTituloLayout);
        DatosTituloLayout.setHorizontalGroup(
            DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosTituloLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmb_Titulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_TipoTitulo, 0, 219, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosTituloLayout.createSequentialGroup()
                        .addComponent(cmb_dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_año1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Siguiente3)
                .addContainerGap())
        );
        DatosTituloLayout.setVerticalGroup(
            DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosTituloLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmb_TipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btn_Siguiente3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Títulos", DatosTitulo);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed
        try {
            // TODO add your handling code here:
            this.tomarNombreInvestigador();
            this.tomarApellidoInvestigador();
            this.tomarSeleccionTipoDocumento();
            this.tomarNumeroInvestigador();
            gestor.tomarDatosInvestigador(nombreInvestigador, apellidoInvestigador , tipoDocumento, numeroDocumento);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_validarActionPerformed

    private void btn_Siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Siguiente1ActionPerformed
        
        try{
            this.tomarSeleccionFechaNacimiento();
            setFechaNacimiento(dia, mes, año);
            gestor.tomarFechaNacimientoSeleccionada(fechaNacimiento);
            
            jTabbedPane1.setSelectedIndex(1);
            
            gestor.buscarUniverdidades();
            }catch(Exception e){ System.out.println("Aguante talleres "+e.getMessage()); }
        
    }//GEN-LAST:event_btn_Siguiente1ActionPerformed

    private void txt_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroActionPerformed

    private void btn_Siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Siguiente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Siguiente2ActionPerformed

    private void cmb_UniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_UniversidadActionPerformed
        try {
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb_UniversidadActionPerformed
    private void tomarSeleccionUniversidad(){
        
    }
    private static void habilitarPantalla( PantallaRegistrarInvestigador2 pantalla)
    {
         pantalla.setVisible(true);
    }
    public void solicitarSeleccionFechaNacimiento(){
        this.solicitarSeleccionFechaDeNacimiento();
        
        //gestor.tomarFechaNacimientoSeleccionada(fechaNacimiento);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PantallaRegistrarInvestigador2 pantalla = new PantallaRegistrarInvestigador2();
                    habilitarPantalla(pantalla);
                    gestor.registrarInvestigador(pantalla);
         
                    
                } catch (SQLException ex) {
                    Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosAcademicos;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JPanel DatosTitulo;
    private javax.swing.JButton btn_Siguiente1;
    private javax.swing.JButton btn_Siguiente2;
    private javax.swing.JButton btn_Siguiente3;
    private javax.swing.JButton btn_validar;
    private javax.swing.JComboBox cmb_Categoria;
    private javax.swing.JComboBox cmb_CentroInvestigacion;
    private javax.swing.JComboBox cmb_Facultad;
    private javax.swing.JComboBox cmb_GrupoInvestigacion;
    private javax.swing.JComboBox cmb_TipoDocumento1;
    private javax.swing.JComboBox cmb_TipoTitulo;
    private javax.swing.JComboBox cmb_Titulo;
    private javax.swing.JComboBox cmb_Universidad;
    private javax.swing.JComboBox cmb_año;
    private javax.swing.JComboBox cmb_año1;
    private javax.swing.JComboBox cmb_dia;
    private javax.swing.JComboBox cmb_dia1;
    private javax.swing.JComboBox cmb_mes;
    private javax.swing.JComboBox cmb_mes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_CentroInvestigacion;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Facultad;
    private javax.swing.JLabel lbl_GrupoInvestigacion;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Provincia;
    private javax.swing.JLabel lbl_TipoDocumento;
    private javax.swing.JLabel lbl_Universidad;
    private javax.swing.JLabel lbl_cargarCiudad;
    private javax.swing.JLabel lbl_cargarProvincia;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Mail;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Numero;
    // End of variables declaration//GEN-END:variables
}
