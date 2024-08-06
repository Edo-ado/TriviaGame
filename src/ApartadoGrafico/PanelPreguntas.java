
package ApartadoGrafico;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PanelPreguntas extends javax.swing.JFrame {

    public PanelPreguntas() {
        initComponents();
         
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRendirse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPreguntaArea = new javax.swing.JTextArea();
        btnRespuesta2 = new javax.swing.JButton();
        btnRespuesta3 = new javax.swing.JButton();
        btnRespuesta1 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRendirse.setText("Rendirse");
        btnRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendirseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        txtPreguntaArea.setColumns(20);
        txtPreguntaArea.setRows(5);
        jScrollPane1.setViewportView(txtPreguntaArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 39, 709, 242));

        btnRespuesta2.setText("jButton2");
        btnRespuesta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 419, 240, 57));

        btnRespuesta3.setText("jButton2");
        btnRespuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 320, 249, 57));

        btnRespuesta1.setText("jButton2");
        btnRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuesta1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 320, 240, 57));

        lblNombre.setText("//Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 11, 104, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendirseActionPerformed
        jfMenuPrincipal mp = new jfMenuPrincipal();
        
        int respuesta;
        
        respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de rendirte?\n"
                + "Esto te devolvera al menu principal");
        if (respuesta == 0) {
            mp.setVisible(true);
            mp.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnRendirseActionPerformed

    private void btnRespuesta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRespuesta2ActionPerformed

    private void btnRespuesta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRespuesta3ActionPerformed

    private void btnRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRespuesta1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRendirse;
    private javax.swing.JButton btnRespuesta1;
    private javax.swing.JButton btnRespuesta2;
    private javax.swing.JButton btnRespuesta3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JTextArea txtPreguntaArea;
    // End of variables declaration//GEN-END:variables
}
