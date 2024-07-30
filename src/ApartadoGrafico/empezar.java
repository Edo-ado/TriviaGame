package ApartadoGrafico;

import Logic.Jugador;
import java.awt.Color;

public class empezar extends javax.swing.JFrame {

    public static Jugador j1;
    public static Jugador j2;
    public static int posicion1;
    public static int posicion2;

    public empezar(Jugador j1, Jugador j2, int posicion1, int posicion2) {
        this.j1 = j1;
        this.j2 = j2;
        this.posicion1 = posicion1;
        this.posicion2 = posicion2;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        LinkEspadaChar1 = new javax.swing.JLabel();
        LinkEspadachar2 = new javax.swing.JLabel();
        jpChar1Panel = new javax.swing.JPanel();
        btnListo1 = new javax.swing.JToggleButton();
        lblNombrechar1 = new javax.swing.JLabel();
        lblAliaschar1 = new javax.swing.JLabel();
        lblTextoDelTemachar1 = new javax.swing.JLabel();
        jpChar1Panel1 = new javax.swing.JPanel();
        btnListo2 = new javax.swing.JToggleButton();
        lblNombreChar2 = new javax.swing.JLabel();
        lblAliaschar2 = new javax.swing.JLabel();
        lblTextoDelTemachar2 = new javax.swing.JLabel();
        FondoEmpezaro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setText("¿Empezar?");
        btnStart.setEnabled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 210, 70));

        LinkEspadaChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGfondos/LinkEspada.png"))); // NOI18N
        getContentPane().add(LinkEspadaChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        LinkEspadachar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGfondos/LinkEspada2.png"))); // NOI18N
        getContentPane().add(LinkEspadachar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jpChar1Panel.setBackground(new java.awt.Color(51, 51, 51));
        jpChar1Panel.setPreferredSize(new java.awt.Dimension(210, 208));

        btnListo1.setBackground(new java.awt.Color(255, 0, 0));
        btnListo1.setText("Listo");
        btnListo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListo1ActionPerformed(evt);
            }
        });

        lblNombrechar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombrechar1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrechar1.setText("Nombre");

        lblAliaschar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAliaschar1.setForeground(new java.awt.Color(255, 255, 255));
        lblAliaschar1.setText("Alias");

        lblTextoDelTemachar1.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoDelTemachar1.setText("Texto del tema");

        javax.swing.GroupLayout jpChar1PanelLayout = new javax.swing.GroupLayout(jpChar1Panel);
        jpChar1Panel.setLayout(jpChar1PanelLayout);
        jpChar1PanelLayout.setHorizontalGroup(
            jpChar1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChar1PanelLayout.createSequentialGroup()
                .addGroup(jpChar1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpChar1PanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnListo1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpChar1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombrechar1))
                    .addGroup(jpChar1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAliaschar1))
                    .addGroup(jpChar1PanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblTextoDelTemachar1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpChar1PanelLayout.setVerticalGroup(
            jpChar1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpChar1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombrechar1)
                .addGap(31, 31, 31)
                .addComponent(lblAliaschar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(lblTextoDelTemachar1)
                .addGap(18, 18, 18)
                .addComponent(btnListo1)
                .addContainerGap())
        );

        getContentPane().add(jpChar1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jpChar1Panel1.setBackground(new java.awt.Color(51, 51, 51));

        btnListo2.setBackground(new java.awt.Color(255, 0, 0));
        btnListo2.setText("Listo");
        btnListo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListo2ActionPerformed(evt);
            }
        });

        lblNombreChar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreChar2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreChar2.setText("Nombre");

        lblAliaschar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAliaschar2.setForeground(new java.awt.Color(255, 255, 255));
        lblAliaschar2.setText("Alias");

        lblTextoDelTemachar2.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoDelTemachar2.setText("Texto del tema");

        javax.swing.GroupLayout jpChar1Panel1Layout = new javax.swing.GroupLayout(jpChar1Panel1);
        jpChar1Panel1.setLayout(jpChar1Panel1Layout);
        jpChar1Panel1Layout.setHorizontalGroup(
            jpChar1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpChar1Panel1Layout.createSequentialGroup()
                .addGroup(jpChar1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpChar1Panel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnListo2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpChar1Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombreChar2))
                    .addGroup(jpChar1Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAliaschar2))
                    .addGroup(jpChar1Panel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblTextoDelTemachar2)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpChar1Panel1Layout.setVerticalGroup(
            jpChar1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpChar1Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreChar2)
                .addGap(31, 31, 31)
                .addComponent(lblAliaschar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(lblTextoDelTemachar2)
                .addGap(18, 18, 18)
                .addComponent(btnListo2)
                .addContainerGap())
        );

        getContentPane().add(jpChar1Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        FondoEmpezaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGfondos/FondoEmpezar.png"))); // NOI18N
        getContentPane().add(FondoEmpezaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        PanelPreguntas pp = new PanelPreguntas();

        pp.setVisible(true);

        //recibir el tema
        //mandar la pregunta del tema
        //mandar las respuestas de la pregunta
        //corregir el label de nombre
        pp.lblNombre.setText(j1.getNombre());

        //cerrar
        this.dispose();

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnListo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListo1ActionPerformed

        if (btnListo1.isSelected()) {
            if (btnListo2.isSelected()) {
                btnStart.setEnabled(true);
            }
        } else {
            btnStart.setEnabled(false);
        }
    }//GEN-LAST:event_btnListo1ActionPerformed

    private void btnListo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListo2ActionPerformed
        if (btnListo2.isSelected()) {
            if (btnListo1.isSelected()) {
                btnStart.setEnabled(true);
            }
        } else {
            btnStart.setEnabled(false);
        }
    }//GEN-LAST:event_btnListo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoEmpezaro;
    private javax.swing.JLabel LinkEspadaChar1;
    private javax.swing.JLabel LinkEspadachar2;
    private javax.swing.JToggleButton btnListo1;
    private javax.swing.JToggleButton btnListo2;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jpChar1Panel;
    private javax.swing.JPanel jpChar1Panel1;
    public javax.swing.JLabel lblAliaschar1;
    public javax.swing.JLabel lblAliaschar2;
    public javax.swing.JLabel lblNombreChar2;
    public javax.swing.JLabel lblNombrechar1;
    public javax.swing.JLabel lblTextoDelTemachar1;
    public javax.swing.JLabel lblTextoDelTemachar2;
    // End of variables declaration//GEN-END:variables
}
