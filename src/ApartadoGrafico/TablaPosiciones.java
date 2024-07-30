package ApartadoGrafico;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TablaPosiciones extends javax.swing.JFrame {

    public TablaPosiciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtTablaCalificacion = new javax.swing.JTextArea();
        btnActualizatabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTablaCalificacion.setEditable(false);
        txtTablaCalificacion.setColumns(20);
        txtTablaCalificacion.setRows(5);
        txtTablaCalificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTablaCalificacion.setEnabled(false);
        jScrollPane2.setViewportView(txtTablaCalificacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 29, 656, 368));

        btnActualizatabla.setText("Actualizar");
        btnActualizatabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizatablaActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizatabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 415, 198, 48));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 433, 112, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizatablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizatablaActionPerformed

        //tostring

    }//GEN-LAST:event_btnActualizatablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizatabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtTablaCalificacion;
    // End of variables declaration//GEN-END:variables
}
