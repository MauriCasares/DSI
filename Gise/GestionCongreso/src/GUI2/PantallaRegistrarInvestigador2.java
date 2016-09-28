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
        gestor = new GestorRegistrarInvestigador();        
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
        tipoDocumento=cmb_dia.getSelectedItem().toString();
    }
    public void tomarNumeroInvestigador()
    {
        numeroDocumento=Long.parseLong(txt_Numero.getText());
    }
    public void mostrarTiposDocumentos(ArrayList lista){
        DefaultComboBoxModel modeloComboTipoDoc = new DefaultComboBoxModel(lista.toArray());
        cmb_dia.setModel(modeloComboTipoDoc);
    }
    public void tomarSeleccionFechaNacimiento(){
        dia= cmb_dia.getSelectedIndex()-1;
        mes=cmb_mes.getSelectedIndex()-1;
        año=cmb_año.getSelectedIndex()-1;        
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
        txt_Apellido = new javax.swing.JTextField();
        txt_Mail = new javax.swing.JTextField();
        btn_Siguiente1 = new javax.swing.JButton();
        cmb_TipoDocumento1 = new javax.swing.JComboBox();
        cmb_mes = new javax.swing.JComboBox();
        cmb_año = new javax.swing.JComboBox();
        btn_validar = new javax.swing.JButton();
        DatosAcat = new javax.swing.JPanel();
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
        setPreferredSize(new java.awt.Dimension(500, 500));

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

        javax.swing.GroupLayout DatosPersonalesLayout = new javax.swing.GroupLayout(DatosPersonales);
        DatosPersonales.setLayout(DatosPersonalesLayout);
        DatosPersonalesLayout.setHorizontalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosPersonalesLayout.createSequentialGroup()
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Nombre)
                            .addComponent(jLabel2)
                            .addComponent(lbl_TipoDocumento)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                                .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Mail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(cmb_TipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Numero, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                    .addComponent(txt_Apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosPersonalesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Siguiente1)))
                .addContainerGap())
        );
        DatosPersonalesLayout.setVerticalGroup(
            DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosPersonalesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TipoDocumento)
                    .addComponent(jLabel1)
                    .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_TipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btn_Siguiente1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Personales", DatosPersonales);

        DatosAcat.setPreferredSize(new java.awt.Dimension(420, 320));

        lbl_Universidad.setText("Universidad:");

        lbl_Facultad.setText("Facultad:");

        lbl_CentroInvestigacion.setText("Centro de Investigacion:");

        lbl_GrupoInvestigacion.setText("Grupo de Investigacion:");

        lbl_Ciudad.setText("Ciudad:");

        lbl_Provincia.setText("Provincia:");

        cmb_Universidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        cmb_Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        cmb_CentroInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        cmb_GrupoInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        lbl_cargarCiudad.setText("Aca va ciudad que la sacamos de la facu");

        lbl_cargarProvincia.setText("Aca va provincia que la sacamos de la facu");

        btn_Siguiente2.setText("Siguiente");

        javax.swing.GroupLayout DatosAcatLayout = new javax.swing.GroupLayout(DatosAcat);
        DatosAcat.setLayout(DatosAcatLayout);
        DatosAcatLayout.setHorizontalGroup(
            DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosAcatLayout.createSequentialGroup()
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbl_Universidad)
                        .addGap(10, 10, 10)
                        .addComponent(cmb_Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbl_Facultad)
                        .addGap(15, 15, 15)
                        .addComponent(cmb_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_CentroInvestigacion)
                        .addGap(11, 11, 11)
                        .addComponent(cmb_CentroInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_GrupoInvestigacion)
                        .addGap(15, 15, 15)
                        .addComponent(cmb_GrupoInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbl_Ciudad)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_cargarCiudad))
                    .addGroup(DatosAcatLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbl_Provincia)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_cargarProvincia)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosAcatLayout.createSequentialGroup()
                .addComponent(btn_Siguiente2)
                .addGap(0, 0, 0))
        );
        DatosAcatLayout.setVerticalGroup(
            DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosAcatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Universidad)
                    .addComponent(cmb_Universidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Facultad)
                    .addComponent(cmb_Facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CentroInvestigacion)
                    .addComponent(cmb_CentroInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_GrupoInvestigacion)
                    .addComponent(cmb_GrupoInvestigacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Ciudad)
                    .addComponent(lbl_cargarCiudad))
                .addGap(16, 16, 16)
                .addGroup(DatosAcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Provincia)
                    .addComponent(lbl_cargarProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_Siguiente2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Académicos", DatosAcat);

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

    private void txt_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroActionPerformed

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed
        try {
            // TODO add your handling code here:
            this.tomarNombreInvestigador();
            this.tomarApellidoInvestigador();
            this.tomarSeleccionTipoDocumento();
            this.tomarNumeroInvestigador();
            gestor.tomarDatosInvestigador(nombreInvestigador, apellidoInvestigador , tipoDocumento, numeroDocumento);

        } catch (SQLException ex) {
            Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_validarActionPerformed

    private void btn_Siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Siguiente1ActionPerformed
        // TODO add your handling code here:
        tomarSeleccionUniversidad();
    }//GEN-LAST:event_btn_Siguiente1ActionPerformed
    private void tomarSeleccionUniversidad(){
        
    }
    private static void habilitarPantalla( PantallaRegistrarInvestigador2 pantalla)
    {
         pantalla.setVisible(true);
    }
    public void solicitarSeleccionFechaNacimiento(){
        this.tomarSeleccionFechaNacimiento();
        gestor.tomarFechaNacimientoSeleccionada(fechaNacimiento);
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
    private javax.swing.JPanel DatosAcat;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
