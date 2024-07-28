package ApartadoGrafico;

import Logic.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NameCharSelector1 extends javax.swing.JFrame {

    int posicion = 0;

    public NameCharSelector1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelector1 = new javax.swing.JPanel();
        cbThemesP1 = new javax.swing.JComboBox<>();
        btnListoP1 = new javax.swing.JButton();
        btnCancelarP1 = new javax.swing.JButton();
        txtNombreP1 = new javax.swing.JTextField();
        jlbName1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtGamerTag = new javax.swing.JTextField();
        jlbName3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GotThatTrivia");
        setUndecorated(true);
        setResizable(false);

        cbThemesP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Series y Películas", "Eventos Históricos", "Tecnologia", "Deporte", "Ciencia", "Arte", "Geografía", "VideoJuegos" }));
        cbThemesP1.setToolTipText("");
        cbThemesP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbThemesP1ActionPerformed(evt);
            }
        });

        btnListoP1.setText("Listo");
        btnListoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoP1ActionPerformed(evt);
            }
        });

        btnCancelarP1.setText("Cancelar");
        btnCancelarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP1ActionPerformed(evt);
            }
        });

        txtNombreP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreP1ActionPerformed(evt);
            }
        });

        jlbName1.setText("Nombre");

        jLabel1.setText("Selecciona tu tema");

        txtGamerTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGamerTagActionPerformed(evt);
            }
        });

        jlbName3.setText("gamertag");

        javax.swing.GroupLayout jpSelector1Layout = new javax.swing.GroupLayout(jpSelector1);
        jpSelector1.setLayout(jpSelector1Layout);
        jpSelector1Layout.setHorizontalGroup(
            jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelector1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbName3)
                    .addComponent(jLabel1)
                    .addComponent(cbThemesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbName1)
                    .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtGamerTag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtNombreP1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(395, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelector1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelarP1)
                    .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jpSelector1Layout.setVerticalGroup(
            jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelector1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlbName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGamerTag, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbThemesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarP1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelector1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelector1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP1ActionPerformed
        jfMenuPrincipal mp = new jfMenuPrincipal();

        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarP1ActionPerformed

    private void txtNombreP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreP1ActionPerformed

    }//GEN-LAST:event_txtNombreP1ActionPerformed

    private void btnListoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoP1ActionPerformed

        if (txtGamerTag.getText().isEmpty() || txtNombreP1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor rellenar los valores");
        } else {
            NameCharSelector2 selector2 = new NameCharSelector2();
            selector2.setVisible(true);
            selector2.setLocationRelativeTo(null);
            this.dispose();

            String categoria = cbThemesP1.getSelectedItem().toString();
           

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

            String Nombre = txtNombreP1.getText().toString();
            int Tema = posicion;
            String Alias = txtGamerTag.getText().toString();

            Jugador j1 = new Jugador(Nombre, Alias, 0, Tema);

        }

        /*categoria = cbThemesP1.getSelectedItem().toString();
        cat = (int) cbThemesP1.getSelectedItem();
        /*Series y Películas
        Eventos Históricos
        Tecnologia
        Deporte
        Ciencia
        Arte
        Geografía
        VideoJuegos*/

    }//GEN-LAST:event_btnListoP1ActionPerformed

    private void cbThemesP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbThemesP1ActionPerformed

    }//GEN-LAST:event_cbThemesP1ActionPerformed

    private void txtGamerTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGamerTagActionPerformed

    }//GEN-LAST:event_txtGamerTagActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarP1;
    private javax.swing.JButton btnListoP1;
    private javax.swing.JComboBox<String> cbThemesP1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbName1;
    private javax.swing.JLabel jlbName3;
    private javax.swing.JPanel jpSelector1;
    private javax.swing.JTextField txtGamerTag;
    private javax.swing.JTextField txtNombreP1;
    // End of variables declaration//GEN-END:variables
}
