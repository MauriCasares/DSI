package GUI;

import java.awt.*;
import javax.swing.*;

public class PantallaRegistrarInvestigador2 extends javax.swing.JFrame {

    public PantallaRegistrarInvestigador2() {
        super("Registrar Investigador");
        initComponents();
        
        JPanel p_investigador = new PanelInvestigador();
        JPanel p_facultad = new PanelFacultad();
        JPanel p_titulo = new PanelTitulo();
        
        p_cuerpo.add(p_investigador, "investigador");
        p_cuerpo.add(p_facultad, "facultad" );
        p_cuerpo.add(p_titulo, "titulo");
        
        carta = (CardLayout) this.p_cuerpo.getLayout();
        
        seleccionarPestaña(investigador);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_cuerpo = new javax.swing.JPanel();
        p_encabezado = new javax.swing.JPanel();
        lbl_investigador = new javax.swing.JLabel();
        lbl_facultad = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        p_cuerpo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        p_cuerpo.setForeground(new java.awt.Color(240, 240, 240));
        p_cuerpo.setLayout(new java.awt.CardLayout());
        getContentPane().add(p_cuerpo, java.awt.BorderLayout.CENTER);

        p_encabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        p_encabezado.setForeground(new java.awt.Color(240, 240, 240));
        p_encabezado.setOpaque(false);
        p_encabezado.setPreferredSize(new java.awt.Dimension(500, 30));
        p_encabezado.setLayout(new javax.swing.BoxLayout(p_encabezado, javax.swing.BoxLayout.LINE_AXIS));

        lbl_investigador.setBackground(new java.awt.Color(0, 102, 153));
        lbl_investigador.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_investigador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_investigador.setText("Investigador");
        lbl_investigador.setMaximumSize(new java.awt.Dimension(100, 30));
        lbl_investigador.setMinimumSize(new java.awt.Dimension(100, 30));
        lbl_investigador.setOpaque(true);
        lbl_investigador.setPreferredSize(new java.awt.Dimension(100, 30));
        lbl_investigador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_investigadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_investigadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_investigadorMouseExited(evt);
            }
        });
        p_encabezado.add(lbl_investigador);

        lbl_facultad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_facultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_facultad.setText("Facultad");
        lbl_facultad.setToolTipText("");
        lbl_facultad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_facultad.setMaximumSize(new java.awt.Dimension(100, 30));
        lbl_facultad.setMinimumSize(new java.awt.Dimension(200, 30));
        lbl_facultad.setName(""); // NOI18N
        lbl_facultad.setOpaque(true);
        lbl_facultad.setPreferredSize(new java.awt.Dimension(100, 30));
        lbl_facultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_facultadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_facultadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_facultadMouseExited(evt);
            }
        });
        p_encabezado.add(lbl_facultad);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Titulo");
        lbl_titulo.setMaximumSize(new java.awt.Dimension(100, 30));
        lbl_titulo.setMinimumSize(new java.awt.Dimension(100, 30));
        lbl_titulo.setOpaque(true);
        lbl_titulo.setPreferredSize(new java.awt.Dimension(100, 30));
        lbl_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_tituloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_tituloMouseExited(evt);
            }
        });
        p_encabezado.add(lbl_titulo);

        getContentPane().add(p_encabezado, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_investigadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_investigadorMouseEntered
        if(!investigador_select){
            lbl_investigador.setBackground(new java.awt.Color(0,153,153));
            lbl_investigador.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_lbl_investigadorMouseEntered

    private void lbl_investigadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_investigadorMouseExited
        if(!investigador_select){
            lbl_investigador.setBackground(colorDeseleccionado);
            lbl_investigador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lbl_investigadorMouseExited

    private void lbl_facultadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_facultadMouseEntered
        if(!facultad_select){
            lbl_facultad.setBackground(new java.awt.Color(0,153,153));
            lbl_facultad.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_lbl_facultadMouseEntered

    private void lbl_facultadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_facultadMouseExited
        if(!facultad_select){
            lbl_facultad.setBackground(colorDeseleccionado);
            lbl_facultad.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lbl_facultadMouseExited

    private void lbl_tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tituloMouseExited
        if(!titulo_select){
            lbl_titulo.setBackground(colorDeseleccionado);
            lbl_titulo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lbl_tituloMouseExited

    private void lbl_tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tituloMouseEntered
        if(!titulo_select){
            lbl_titulo.setBackground(new java.awt.Color(0,153,153));
            lbl_titulo.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_lbl_tituloMouseEntered

    private void lbl_investigadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_investigadorMouseClicked
        seleccionarPestaña(this.investigador);
    }//GEN-LAST:event_lbl_investigadorMouseClicked

    private void lbl_facultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_facultadMouseClicked
        seleccionarPestaña(this.facultad);
        
    }//GEN-LAST:event_lbl_facultadMouseClicked

    private void lbl_tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tituloMouseClicked
        seleccionarPestaña(this.titulo);
    }//GEN-LAST:event_lbl_tituloMouseClicked

    
    private void seleccionarPestaña(int i){
        lbl_investigador.setBackground(colorDeseleccionado);
        lbl_facultad.setBackground(colorDeseleccionado);
        lbl_titulo.setBackground(colorDeseleccionado);
        
        lbl_investigador.setForeground(Color.BLACK);
        lbl_facultad.setForeground(Color.BLACK);
        lbl_titulo.setForeground(Color.BLACK);
        
        switch (i){
            case investigador:
                investigador_select = true;
                facultad_select = false;
                titulo_select = false;
                
                carta.show(this.p_cuerpo, "investigador");
                lbl_investigador.setBackground(colorSeleccionado);
                lbl_investigador.setForeground(Color.WHITE);
                
                break;
            case facultad:
                investigador_select = false;
                facultad_select = true;
                titulo_select = false;
                
                carta.show(this.p_cuerpo, "facultad");
                lbl_facultad.setBackground(colorSeleccionado);
                lbl_facultad.setForeground(Color.WHITE);
                
                break;
            case titulo:
                investigador_select = false;
                facultad_select = false;
                titulo_select = true;
                
                carta.show(this.p_cuerpo, "titulo");
                lbl_titulo.setBackground(colorSeleccionado);
                lbl_titulo.setForeground(Color.WHITE);
                
                break;
        }
    }
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistrarInvestigador2().setVisible(true);
            }
        });
    }

    
    
    private final java.awt.Color colorDeseleccionado = new java.awt.Color(240,240,240);
    private final java.awt.Color colorSeleccionado = new java.awt.Color(0,102,153);
    
    
    private final int investigador = 1;
    private final int facultad = 2;
    private final int titulo = 3;
    
    
    private CardLayout carta;
    private boolean investigador_select;
    private boolean facultad_select;
    private boolean titulo_select;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_facultad;
    private javax.swing.JLabel lbl_investigador;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel p_cuerpo;
    private javax.swing.JPanel p_encabezado;
    // End of variables declaration//GEN-END:variables
}
