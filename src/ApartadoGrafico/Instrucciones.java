/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ApartadoGrafico;

import javax.swing.ImageIcon;

/**
 *
 * @author Edu18
 */
public class Instrucciones extends javax.swing.JFrame {

    /**
     * Creates new form Instrucciones
     */
    public Instrucciones() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInstrucciones = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GotThatTrivia");
        setUndecorated(true);
        setResizable(false);

        jpInstrucciones.setBackground(new java.awt.Color(51, 51, 51));

        btnVolver.setBackground(new java.awt.Color(30, 30, 30));
        btnVolver.setText("Atras");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Preguntas aleatorias: Las preguntas son seleccionadas aleatoriamente de una base\n de datos.\nEsto evita que los jugadores puedan memorizar las preguntas y respuestas.\n\n2. Respuestas únicas: Cada pregunta tiene una respuesta única y correcta. \nSi un jugador responde correctamente, se le otorga un punto.\n\n3. Penalización por errores: Se pierde un punto si la respuesta es erronea.\n\n4.Categorías: Se divide las preguntas en categorías temáticas, como historia, ciencia, deportes, \n etc. Esto ayuda a los jugadores a enfocarse en áreas específicas y\n a variar el tipo de preguntas.\n\n5. No se permite ayuda externa: Los jugadores no deben recibir ayuda externa,\n como buscar en Internet o pedir ayuda a otros jugadores.\n La respuesta debe ser propia y basada en su conocimiento.\n\n6. Puntuación acumulativa: La puntuación de cada jugador se acumula a lo largo del juego.\n El jugador con la puntuación más alta al final del juego es el ganador.\n");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jpInstruccionesLayout = new javax.swing.GroupLayout(jpInstrucciones);
        jpInstrucciones.setLayout(jpInstruccionesLayout);
        jpInstruccionesLayout.setHorizontalGroup(
            jpInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInstruccionesLayout.createSequentialGroup()
                        .addGap(0, 693, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpInstruccionesLayout.setVerticalGroup(
            jpInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInstruccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false );
    }//GEN-LAST:event_btnVolverActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel jpInstrucciones;
    // End of variables declaration//GEN-END:variables
}