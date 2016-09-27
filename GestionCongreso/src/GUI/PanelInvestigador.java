/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author LaWebStore
 */
public class PanelInvestigador extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public PanelInvestigador() {
        initComponents();
        date_fechaNacimiento.enableInputMethods(false);
    }

    public void mostrarTiposDocumentos(ArrayList lista){
        DefaultComboBoxModel modeloComboTipoDoc = new DefaultComboBoxModel(lista.toArray());
        cmb_tipoDocumento.setModel(modeloComboTipoDoc);
    }
    
    public void solicitarFechaNacimiento(){
        date_fechaNacimiento.enableInputMethods(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_tipoDocumento = new javax.swing.JLabel();
        lbl_nroDocumento = new javax.swing.JLabel();
        lbl_FechaNacimiento = new javax.swing.JLabel();
        lbl_eMail = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_eMail = new javax.swing.JTextField();
        cmb_tipoDocumento = new javax.swing.JComboBox();
        date_fechaNacimiento = new javax.swing.JFormattedTextField();
        txt_nroDocumento = new javax.swing.JFormattedTextField();
        btn_validar = new javax.swing.JButton();

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        setMaximumSize(new java.awt.Dimension(500, 270));
        setMinimumSize(new java.awt.Dimension(500, 270));
        setPreferredSize(new java.awt.Dimension(500, 270));
        setLayout(null);

        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nombre.setText("Nombre:");
        lbl_nombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_nombre.setAlignmentX(0.5F);
        add(lbl_nombre);
        lbl_nombre.setBounds(10, 100, 120, 15);

        lbl_apellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_apellido.setText("Apellido:");
        add(lbl_apellido);
        lbl_apellido.setBounds(10, 140, 120, 14);

        lbl_tipoDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tipoDocumento.setText("Tipo Documento:");
        add(lbl_tipoDocumento);
        lbl_tipoDocumento.setBounds(-10, 60, 120, 14);

        lbl_nroDocumento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nroDocumento.setText("Número:");
        add(lbl_nroDocumento);
        lbl_nroDocumento.setBounds(190, 60, 50, 14);

        lbl_FechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_FechaNacimiento.setText("Fecha Nacimiento:");
        add(lbl_FechaNacimiento);
        lbl_FechaNacimiento.setBounds(10, 190, 120, 15);

        lbl_eMail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_eMail.setText("E-mail:");
        add(lbl_eMail);
        lbl_eMail.setBounds(10, 230, 120, 14);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        add(txt_nombre);
        txt_nombre.setBounds(150, 100, 300, 20);

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        add(txt_apellido);
        txt_apellido.setBounds(150, 140, 300, 20);

        txt_eMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eMailActionPerformed(evt);
            }
        });
        add(txt_eMail);
        txt_eMail.setBounds(150, 230, 300, 20);

        cmb_tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmb_tipoDocumento);
        cmb_tipoDocumento.setBounds(120, 60, 60, 20);

        date_fechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date_fechaNacimiento.setText("dd/mm/yyyy");
        add(date_fechaNacimiento);
        date_fechaNacimiento.setBounds(150, 190, 300, 20);

        txt_nroDocumento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        add(txt_nroDocumento);
        txt_nroDocumento.setBounds(250, 60, 130, 20);

        btn_validar.setText("Validar");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });
        add(btn_validar);
        btn_validar.setBounds(390, 60, 65, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_eMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eMailActionPerformed

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_validarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_validar;
    private javax.swing.JComboBox cmb_tipoDocumento;
    private javax.swing.JFormattedTextField date_fechaNacimiento;
    private javax.swing.JLabel lbl_FechaNacimiento;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_eMail;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nroDocumento;
    private javax.swing.JLabel lbl_tipoDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_eMail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JFormattedTextField txt_nroDocumento;
    // End of variables declaration//GEN-END:variables
}
