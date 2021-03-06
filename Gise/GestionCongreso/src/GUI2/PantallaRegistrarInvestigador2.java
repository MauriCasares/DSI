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
import javax.swing.JOptionPane;
/**
 *
 * @author Ochan12
 */
public class PantallaRegistrarInvestigador2 extends javax.swing.JFrame {
//    private Connection con;
//    private ResultSet res;
//    private Statement stm;
    private static GestorRegistrarInvestigador gestor;
    private String nombreInvestigador;
    private String apellidoInvestigador;
    private String tipoDocumento;
    private long numeroDocumento;
    private int dia;
    private int mes;
    private int año;
    private java.sql.Date fechaNacimiento;
    private String universidad;
    private String facultad;
    private String centroInvestigacion;
    private String grupoInvestigacion;
    private ArrayList<String> areasInvestigacion;
    private ArrayList<String> titulos;
    public PantallaRegistrarInvestigador2() {
        super("Registrar Investigador");
        initComponents();
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
        tipoDocumento=cmb_TipoDocumento.getSelectedItem().toString();
    }
    public void tomarNumeroInvestigador()
    {
        numeroDocumento=Long.parseLong(txt_Numero.getText());
    }
    public void mostrarTiposDocumentos(ArrayList lista){
        DefaultComboBoxModel modeloComboTipoDoc = new DefaultComboBoxModel(lista.toArray());
        cmb_TipoDocumento.setModel(modeloComboTipoDoc);
    }
    public void mostrarAreasInvestigacion (ArrayList lista){
        DefaultComboBoxModel modeloComboAreaInvestigacion = new DefaultComboBoxModel(lista.toArray());
        cmb_AreaInvestigacion.setModel(modeloComboAreaInvestigacion);
    }
    public void tomarSeleccionFechaNacimiento(){
        dia = Integer.parseInt(cmb_dia.getSelectedItem().toString());
        mes = Integer.parseInt(cmb_mes.getSelectedItem().toString())-1;
        año = Integer.parseInt(cmb_año.getSelectedItem().toString());        
    }
    public void tomarSeleccionUniversidad(){
        universidad=cmb_Universidad.getSelectedItem().toString();
    }
    public void tomarSeleccionFacultad(){
        facultad=cmb_Facultad.getSelectedItem().toString();
    }
    private void tomarSeleccionCentroInvestigacion() {
        centroInvestigacion=cmb_CentroInvestigacion.getSelectedItem().toString();
    }
     private void tomarSeleccionGrupoInvestigacion() {
        grupoInvestigacion=cmb_GrupoInvestigacion.getSelectedItem().toString();
    }
     private void tomarSeleccionAreaInvestigacion(){
         areasInvestigacion.add(cmb_AreaInvestigacion.getSelectedItem().toString());
     }
     
     private void tomarSeleccionTitulos(){
         titulos.add(cmb_Titulo.getSelectedItem().toString());
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
        cmb_TipoDocumento = new javax.swing.JComboBox();
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
        btn_Siguiente2 = new javax.swing.JButton();
        lbl_areaInvesigacion = new javax.swing.JLabel();
        cmb_AreaInvestigacion = new javax.swing.JComboBox();
        btn_AgregarTodas = new javax.swing.JButton();
        cmb_ciudad = new javax.swing.JComboBox();
        cmb_provincia = new javax.swing.JComboBox();
        btn_Agregar = new javax.swing.JButton();
        DatosTitulo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmb_TipoTitulo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmb_Titulo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmb_Categoria = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        cmb_dia1 = new javax.swing.JComboBox();
        cmb_mes1 = new javax.swing.JComboBox();
        cmb_año1 = new javax.swing.JComboBox();
        btn_sumarTitulo = new javax.swing.JButton();
        btn_AgregarTitulos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("Registrar Investigador"); // NOI18N

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(420, 320));

        DatosPersonales.setPreferredSize(new java.awt.Dimension(420, 320));

        lbl_TipoDocumento.setText("Tipo de Documento:");

        cmb_dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_diaActionPerformed(evt);
            }
        });

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
                .addComponent(cmb_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(cmb_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_Siguiente1)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Datos Personales", DatosPersonales);

        DatosAcademicos.setPreferredSize(new java.awt.Dimension(420, 320));
        DatosAcademicos.setLayout(null);

        lbl_Universidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Universidad.setText("Universidad:");
        DatosAcademicos.add(lbl_Universidad);
        lbl_Universidad.setBounds(10, 20, 120, 14);

        lbl_Facultad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Facultad.setText("Facultad:");
        DatosAcademicos.add(lbl_Facultad);
        lbl_Facultad.setBounds(10, 50, 120, 14);

        lbl_CentroInvestigacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CentroInvestigacion.setText("Centro de Investigacion:");
        DatosAcademicos.add(lbl_CentroInvestigacion);
        lbl_CentroInvestigacion.setBounds(10, 80, 120, 14);

        lbl_GrupoInvestigacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_GrupoInvestigacion.setText("Grupo de Investigacion:");
        DatosAcademicos.add(lbl_GrupoInvestigacion);
        lbl_GrupoInvestigacion.setBounds(10, 110, 120, 14);

        lbl_Ciudad.setText("Ciudad:");
        DatosAcademicos.add(lbl_Ciudad);
        lbl_Ciudad.setBounds(90, 190, 37, 14);

        lbl_Provincia.setText("Provincia:");
        DatosAcademicos.add(lbl_Provincia);
        lbl_Provincia.setBounds(80, 220, 47, 14);

        cmb_Universidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmb_Universidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_UniversidadActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_Universidad);
        cmb_Universidad.setBounds(140, 20, 260, 20);

        cmb_Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmb_Facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_FacultadActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_Facultad);
        cmb_Facultad.setBounds(140, 50, 260, 20);

        cmb_CentroInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmb_CentroInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CentroInvestigacionActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_CentroInvestigacion);
        cmb_CentroInvestigacion.setBounds(140, 80, 260, 20);

        cmb_GrupoInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmb_GrupoInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_GrupoInvestigacionActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_GrupoInvestigacion);
        cmb_GrupoInvestigacion.setBounds(140, 110, 260, 20);

        btn_Siguiente2.setText("Siguiente");
        btn_Siguiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Siguiente2ActionPerformed(evt);
            }
        });
        DatosAcademicos.add(btn_Siguiente2);
        btn_Siguiente2.setBounds(311, 258, 90, 23);

        lbl_areaInvesigacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_areaInvesigacion.setText("Área de Investigación:");
        DatosAcademicos.add(lbl_areaInvesigacion);
        lbl_areaInvesigacion.setBounds(10, 152, 120, 14);

        cmb_AreaInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_AreaInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_AreaInvestigacionActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_AreaInvestigacion);
        cmb_AreaInvestigacion.setBounds(140, 149, 140, 20);

        btn_AgregarTodas.setText("Agregar");
        btn_AgregarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarTodasActionPerformed(evt);
            }
        });
        DatosAcademicos.add(btn_AgregarTodas);
        btn_AgregarTodas.setBounds(320, 150, 80, 23);

        cmb_ciudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ciudadActionPerformed(evt);
            }
        });
        DatosAcademicos.add(cmb_ciudad);
        cmb_ciudad.setBounds(140, 190, 260, 20);

        cmb_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DatosAcademicos.add(cmb_provincia);
        cmb_provincia.setBounds(140, 220, 260, 20);

        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_Agregar.setText("+");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        DatosAcademicos.add(btn_Agregar);
        btn_Agregar.setBounds(280, 150, 40, 21);

        jTabbedPane1.addTab("Datos Académicos", DatosAcademicos);

        DatosTitulo.setPreferredSize(new java.awt.Dimension(420, 320));

        jLabel7.setText("Tipo de Título:");

        cmb_TipoTitulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel8.setText("Título:");

        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel9.setText("Categoría:");

        cmb_Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel10.setText("Fecha Obtención:");

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        cmb_dia1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_mes1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_año1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_sumarTitulo.setText("+");
        btn_sumarTitulo.setName("btn_sumarTitulo"); // NOI18N
        btn_sumarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarTituloActionPerformed(evt);
            }
        });

        btn_AgregarTitulos.setText("Agregar");
        btn_AgregarTitulos.setName("btn_agregarTitulos"); // NOI18N
        btn_AgregarTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarTitulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosTituloLayout = new javax.swing.GroupLayout(DatosTitulo);
        DatosTitulo.setLayout(DatosTituloLayout);
        DatosTituloLayout.setHorizontalGroup(
            DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosTituloLayout.createSequentialGroup()
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
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
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosTituloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Siguiente3))
                    .addGroup(DatosTituloLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosTituloLayout.createSequentialGroup()
                                    .addComponent(cmb_dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_mes1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_año1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmb_TipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DatosTituloLayout.createSequentialGroup()
                                .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sumarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_AgregarTitulos)))
                        .addGap(0, 8, Short.MAX_VALUE)))
>>>>>>> 97754da908eb677463a3afc2dc4fca98693b3445
                .addContainerGap())
        );
        DatosTituloLayout.setVerticalGroup(
            DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosTituloLayout.createSequentialGroup()
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosTituloLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sumarTitulo)
                            .addComponent(btn_AgregarTitulos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_TipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
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
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btn_registrar)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btn_Siguiente3)
>>>>>>> 97754da908eb677463a3afc2dc4fca98693b3445
                .addContainerGap())
        );

        jTabbedPane1.addTab("Títulos", DatosTitulo);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

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
            
            }catch(Exception e){ System.out.println("Aguante talleres "+e.getMessage()); }
        
    }//GEN-LAST:event_btn_Siguiente1ActionPerformed

    private void txt_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroActionPerformed

    private void btn_Siguiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Siguiente2ActionPerformed
        // TODO add your handling code here:
        gestor.tomarCiudadYProvinciaSeleccionadas();
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_Siguiente2ActionPerformed

    private void cmb_UniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_UniversidadActionPerformed
        this.tomarSeleccionUniversidad();
        gestor.tomarUniversidadSeleccionada(universidad);
    }//GEN-LAST:event_cmb_UniversidadActionPerformed

    private void cmb_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_diaActionPerformed

    private void cmb_FacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_FacultadActionPerformed
        this.tomarSeleccionFacultad();
        gestor.tomarFacultadSeleccionada(facultad);
    }//GEN-LAST:event_cmb_FacultadActionPerformed

    private void cmb_CentroInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CentroInvestigacionActionPerformed
        this.tomarSeleccionCentroInvestigacion();
        gestor.tomarCentroInvestigacionSeleccionado(centroInvestigacion);
    }//GEN-LAST:event_cmb_CentroInvestigacionActionPerformed

    private void cmb_GrupoInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_GrupoInvestigacionActionPerformed
        // TODO add your handling code here:ç
        this.tomarSeleccionGrupoInvestigacion();
        gestor.tomarGrupoInvestigacionSeleccionado(grupoInvestigacion);
    }//GEN-LAST:event_cmb_GrupoInvestigacionActionPerformed

    private void btn_AgregarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarTodasActionPerformed
        // TODO add your handling code here:
         gestor.tomarAreasInvestigacionSeleccionadas(areasInvestigacion);
    }//GEN-LAST:event_btn_AgregarTodasActionPerformed

    private void cmb_AreaInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_AreaInvestigacionActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_cmb_AreaInvestigacionActionPerformed

    private void cmb_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ciudadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmb_ciudadActionPerformed

    
    private void cmb_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_provinciaActionPerformed
        this.tomarSeleccionProvincia();
        gestor.tomarProvinciaSeleccionada(provincia);
    }//GEN-LAST:event_cmb_provinciaActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        JOptionPane cartel = new JOptionPane();
        cartel.setVisible(true);
        
    }//GEN-LAST:event_btn_registrarActionPerformed
    
    
    private void validarDatosMinimos(){
        if(txt_Apellido.getText().compareTo("") == 0){
            
        }
        
        if(txt_Nombre.getText().compareTo("") == 0){
            
        }
        
        if(txt_Numero.getText().compareTo("") == 0){
            
        }
        
        if(cmb_TipoDocumento.getSelectedIndex() == -1){
            
        }
        
        if(cmb_Facultad.getSelectedIndex() == -1){
            
        }
        
        if(cmb_Universidad.getSelectedIndex() == -1){
            
        }
        
        if(cmb_CentroInvestigacion.getSelectedIndex() == -1){
            
        }
        
        if(cmb_GrupoInvestigacion.getSelectedIndex() == -1){
            
        }
        
        if(cmb_AreaInvestigacion.getSelectedIndex() == -1){
            
        }
        
        if(cmb_Categoria.getSelectedIndex() == -1){
            
        }
    }
    
    
    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
        if(cmb_AreaInvestigacion.getSelectedIndex()!=-1)
         tomarSeleccionAreaInvestigacion();
         else
             javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un Area de investigacion");
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_sumarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarTituloActionPerformed
        // TODO add your handling code here:
        if(cmb_Titulo.getSelectedIndex()!=-1)
        tomarSeleccionTitulos();
        else
             javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un titulo");
    }//GEN-LAST:event_btn_sumarTituloActionPerformed

    private void btn_AgregarTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarTitulosActionPerformed
        // TODO add your handling code here:
        gestor.tomarTitulosSeleccionados(titulos);
    }//GEN-LAST:event_btn_AgregarTitulosActionPerformed

    
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
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_AgregarTitulos;
    private javax.swing.JButton btn_AgregarTodas;
    private javax.swing.JButton btn_Siguiente1;
    private javax.swing.JButton btn_Siguiente2;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_Siguiente3;
    private javax.swing.JButton btn_sumarTitulo;
    private javax.swing.JButton btn_validar;
    private javax.swing.JComboBox cmb_AreaInvestigacion;
    private javax.swing.JComboBox cmb_Categoria;
    private javax.swing.JComboBox cmb_CentroInvestigacion;
    private javax.swing.JComboBox cmb_Facultad;
    private javax.swing.JComboBox cmb_GrupoInvestigacion;
    private javax.swing.JComboBox cmb_TipoDocumento;
    private javax.swing.JComboBox cmb_TipoTitulo;
    private javax.swing.JComboBox cmb_Titulo;
    private javax.swing.JComboBox cmb_Universidad;
    private javax.swing.JComboBox cmb_año;
    private javax.swing.JComboBox cmb_año1;
    private javax.swing.JComboBox cmb_ciudad;
    private javax.swing.JComboBox cmb_dia;
    private javax.swing.JComboBox cmb_dia1;
    private javax.swing.JComboBox cmb_mes;
    private javax.swing.JComboBox cmb_mes1;
    private javax.swing.JComboBox cmb_provincia;
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
    private javax.swing.JLabel lbl_areaInvesigacion;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Mail;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Numero;
    // End of variables declaration//GEN-END:variables

    public void mostrarUniversidades(ArrayList nombreJerarquia) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel modeloComboUniversidades = new DefaultComboBoxModel(nombreJerarquia.toArray());
        cmb_Universidad.setModel(modeloComboUniversidades);
    }

    public void mostrarFacultades(ArrayList nombreJerarquia) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel modeloComboFacultades = new DefaultComboBoxModel(nombreJerarquia.toArray());
        cmb_Facultad.setModel(modeloComboFacultades);
    }

    public void mostrarCentrosDeInvestigacion(ArrayList nombreJerarquia) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel modeloComboCentros = new DefaultComboBoxModel(nombreJerarquia.toArray());
        cmb_CentroInvestigacion.setModel(modeloComboCentros);
    }

    public void mostrarGruposDeInvestigacion(ArrayList nombreJerarquia) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel modeloComboGruposInvestigacion = new DefaultComboBoxModel(nombreJerarquia.toArray());
        cmb_GrupoInvestigacion.setModel(modeloComboGruposInvestigacion);
    }
    
    public void mostrarTitulos(ArrayList titulos) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel modeloComboTitulos = new DefaultComboBoxModel(titulos.toArray());
        cmb_Titulo.setModel(modeloComboTitulos);
    }
