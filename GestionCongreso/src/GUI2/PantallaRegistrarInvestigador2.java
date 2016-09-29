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
        jPanel1 = new javax.swing.JPanel();
        lbl_TipoDocumento = new javax.swing.JLabel();
        cmb_TipoDocumento = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_Numero = new javax.swing.JTextField();
        btn_Validar = new javax.swing.JButton();
        lbl_Nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nacimiento = new javax.swing.JTextField();
        txt_Mail = new javax.swing.JTextField();
        btn_Siguiente = new javax.swing.JButton();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Siguiente1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmb_TipoTitulo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmb_Titulo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmb_Categoria = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btn_Siguiente2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_TipoDocumento.setText("Tipo de Documento:");

        cmb_TipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Nº");

        txt_Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumeroActionPerformed(evt);
            }
        });

        btn_Validar.setText("Validar");
        btn_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ValidarActionPerformed(evt);
            }
        });

        lbl_Nombre.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Fecha de Nacimiento:");

        jLabel4.setText("Mail:");

        btn_Siguiente.setText("Siguiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Siguiente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(lbl_Nombre)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txt_Apellido)
                                .addComponent(txt_Nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_Mail, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Validar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_TipoDocumento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TipoDocumento)
                    .addComponent(cmb_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Validar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Siguiente)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Personales", jPanel1);

        DatosAcat.setLayout(null);

        lbl_Universidad.setText("Universidad:");
        DatosAcat.add(lbl_Universidad);
        lbl_Universidad.setBounds(70, 60, 60, 14);

        lbl_Facultad.setText("Facultad:");
        DatosAcat.add(lbl_Facultad);
        lbl_Facultad.setBounds(80, 90, 45, 14);

        lbl_CentroInvestigacion.setText("Centro de Investigacion:");
        DatosAcat.add(lbl_CentroInvestigacion);
        lbl_CentroInvestigacion.setBounds(10, 120, 119, 14);

        lbl_GrupoInvestigacion.setText("Grupo de Investigacion:");
        DatosAcat.add(lbl_GrupoInvestigacion);
        lbl_GrupoInvestigacion.setBounds(10, 150, 115, 14);

        lbl_Ciudad.setText("Ciudad:");
        DatosAcat.add(lbl_Ciudad);
        lbl_Ciudad.setBounds(90, 180, 37, 14);

        lbl_Provincia.setText("Provincia:");
        DatosAcat.add(lbl_Provincia);
        lbl_Provincia.setBounds(80, 210, 47, 14);

        cmb_Universidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        DatosAcat.add(cmb_Universidad);
        cmb_Universidad.setBounds(140, 60, 250, 20);

        cmb_Facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        DatosAcat.add(cmb_Facultad);
        cmb_Facultad.setBounds(140, 90, 250, 20);

        cmb_CentroInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        DatosAcat.add(cmb_CentroInvestigacion);
        cmb_CentroInvestigacion.setBounds(140, 120, 250, 20);

        cmb_GrupoInvestigacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        DatosAcat.add(cmb_GrupoInvestigacion);
        cmb_GrupoInvestigacion.setBounds(140, 150, 250, 20);

        jLabel5.setText("Aca va ciudad que la sacamos de la facu");
        DatosAcat.add(jLabel5);
        jLabel5.setBounds(140, 180, 193, 14);

        jLabel6.setText("Aca va provincia que la sacamos de la facu");
        DatosAcat.add(jLabel6);
        jLabel6.setBounds(140, 210, 205, 14);

        btn_Siguiente1.setText("Siguiente");
        DatosAcat.add(btn_Siguiente1);
        btn_Siguiente1.setBounds(300, 240, 77, 23);

        jTabbedPane1.addTab("Datos Académicos", DatosAcat);

        jLabel7.setText("Tipo de Título:");

        cmb_TipoTitulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel8.setText("Título:");

        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel9.setText("Categoría:");

        cmb_Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel10.setText("Fecha Obtención:");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setText("dd/mm/aaaa");

        btn_Siguiente2.setText("Siguiente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmb_TipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmb_Titulo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_Categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Siguiente2)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_TipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_Siguiente2)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Títulos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroActionPerformed

    private void btn_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ValidarActionPerformed
        
        try {
            int num = Integer.parseInt(txt_Numero.getText());
            
            if (gestor.validarInvestigador( num, cmb_TipoDocumento.getSelectedItem().toString())) {
                System.out.println("Hemoz podido validarrrr");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btn_ValidarActionPerformed
    private static void habilitarPantalla( PantallaRegistrarInvestigador2 R)
    {
         R.setVisible(true);
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
                    PantallaRegistrarInvestigador2 R = new PantallaRegistrarInvestigador2();
                    habilitarPantalla(R);
                    gestor.registrarInvestigador(R);
                } catch (SQLException ex) {
                    Logger.getLogger(PantallaRegistrarInvestigador2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosAcat;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JButton btn_Siguiente1;
    private javax.swing.JButton btn_Siguiente2;
    private javax.swing.JButton btn_Validar;
    private javax.swing.JComboBox cmb_Categoria;
    private javax.swing.JComboBox cmb_CentroInvestigacion;
    private javax.swing.JComboBox cmb_Facultad;
    private javax.swing.JComboBox cmb_GrupoInvestigacion;
    private javax.swing.JComboBox cmb_TipoDocumento;
    private javax.swing.JComboBox cmb_TipoTitulo;
    private javax.swing.JComboBox cmb_Titulo;
    private javax.swing.JComboBox cmb_Universidad;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_CentroInvestigacion;
    private javax.swing.JLabel lbl_Ciudad;
    private javax.swing.JLabel lbl_Facultad;
    private javax.swing.JLabel lbl_GrupoInvestigacion;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Provincia;
    private javax.swing.JLabel lbl_TipoDocumento;
    private javax.swing.JLabel lbl_Universidad;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Mail;
    private javax.swing.JTextField txt_Nacimiento;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Numero;
    // End of variables declaration//GEN-END:variables
}
