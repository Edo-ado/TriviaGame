package ApartadoGrafico;

import Logic.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NameCharSelector2 extends javax.swing.JFrame {

    int posicion = 0;
    
    public NameCharSelector2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelector2 = new javax.swing.JPanel();
        cbThemesP2 = new javax.swing.JComboBox<>();
        btnListoP1 = new javax.swing.JButton();
        btnCancelarP2 = new javax.swing.JButton();
        txtgamertagp2 = new javax.swing.JTextField();
        jlbName2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrep2 = new javax.swing.JTextField();
        jlbName3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GotThatTrivia");
        setUndecorated(true);
        setResizable(false);

        jpSelector2.setPreferredSize(new java.awt.Dimension(703, 508));

        cbThemesP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Series y Películas", "Eventos Históricos", "Tecnologia", "Deporte", "Ciencia", "Arte", "Geografía", "VideoJuegos" }));
        cbThemesP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbThemesP2ActionPerformed(evt);
            }
        });

        btnListoP1.setText("Listo");
        btnListoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoP1ActionPerformed(evt);
            }
        });

        btnCancelarP2.setText("Cancelar");
        btnCancelarP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP2ActionPerformed(evt);
            }
        });

        txtgamertagp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgamertagp2ActionPerformed(evt);
            }
        });

        jlbName2.setText("Nombre");

        jLabel1.setText("Selecciona tu tema");

        txtNombrep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrep2ActionPerformed(evt);
            }
        });

        jlbName3.setText("gamertag");

        javax.swing.GroupLayout jpSelector2Layout = new javax.swing.GroupLayout(jpSelector2);
        jpSelector2.setLayout(jpSelector2Layout);
        jpSelector2Layout.setHorizontalGroup(
            jpSelector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelector2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpSelector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbName3)
                    .addComponent(cbThemesP2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jlbName2)
                    .addGroup(jpSelector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtgamertagp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtNombrep2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(389, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelector2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSelector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelarP2)
                    .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jpSelector2Layout.setVerticalGroup(
            jpSelector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelector2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlbName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombrep2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtgamertagp2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbThemesP2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarP2)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpSelector2, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelector2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP2ActionPerformed
        NameCharSelector1 selector1 = new NameCharSelector1();

        selector1.setVisible(true);
        selector1.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarP2ActionPerformed

    private void txtgamertagp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgamertagp2ActionPerformed
        cbThemesP2.requestFocus();
    }//GEN-LAST:event_txtgamertagp2ActionPerformed

    private void btnListoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoP1ActionPerformed
        

        if (txtgamertagp2.getText().isEmpty() || txtNombrep2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor rellenar los valores");
        } else {
            empezar em = new empezar();
            
            em.setVisible(true);
            em.setLocationRelativeTo(null);
            
            this.dispose();

           String categoria = cbThemesP2.getSelectedItem().toString();
           
            
            
            
            switch (categoria) {
                case "Series y Peliculas":
                    posicion = 0;
                    break;
                case "Eventos Históricos":
                    posicion = 1;
                    break;

                case "Tecnologia":
                    posicion = 2;
                    break;

                case "Deporte":
                    posicion = 3;
                    break;

                case "Ciencia":
                    posicion = 4;
                    break;

                case "Arte":
                    posicion = 5;
                    break;

                case "Geografía":
                    posicion = 6;
                    break;
                case "VideoJuegos":
                    posicion = 7;
                    break;
            }

            String Nombre = txtNombrep2.getText().toString();
            int Tema = posicion;
            String Alias = txtgamertagp2.getText().toString();

            Jugador j2 = new Jugador(Nombre, Alias, 0, Tema);
            
            
            
            

        }


    }//GEN-LAST:event_btnListoP1ActionPerformed

    private void cbThemesP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbThemesP2ActionPerformed


    }//GEN-LAST:event_cbThemesP2ActionPerformed

    private void txtNombrep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrep2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarP2;
    private javax.swing.JButton btnListoP1;
    private javax.swing.JComboBox<String> cbThemesP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbName2;
    private javax.swing.JLabel jlbName3;
    private javax.swing.JPanel jpSelector2;
    private javax.swing.JTextField txtNombrep2;
    private javax.swing.JTextField txtgamertagp2;
    // End of variables declaration//GEN-END:variables
}
