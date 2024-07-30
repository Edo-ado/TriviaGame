package ApartadoGrafico;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Edu18
 */
public class PrincipalJForm extends javax.swing.JFrame {

    public PrincipalJForm() {
        initComponents();
             
            
        
       
        

    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarBienvenida = new javax.swing.JButton();
        btnSalirBienvenida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GotThatTrivia");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(0, 0));
        setName("frBienvenida"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarBienvenida.setBackground(new java.awt.Color(255, 188, 180));
        btnIniciarBienvenida.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnIniciarBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarBienvenida.setText("Presiona para Iniciar");
        btnIniciarBienvenida.setBorder(null);
        btnIniciarBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarBienvenidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 440, 60));

        btnSalirBienvenida.setBackground(new java.awt.Color(255, 188, 180));
        btnSalirBienvenida.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSalirBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirBienvenida.setText("Salir");
        btnSalirBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirBienvenidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGfondos/FondoInicio.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirBienvenidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirBienvenidaActionPerformed

    private void btnIniciarBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarBienvenidaActionPerformed

        jfMenuPrincipal mp = new jfMenuPrincipal();

        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnIniciarBienvenidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarBienvenida;
    private javax.swing.JButton btnSalirBienvenida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
