package ApartadoGrafico;

import Logic.Jugador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NameCharSelector2 extends javax.swing.JFrame {

    public static Jugador j2;
    public static Jugador j1;
    public static int posicion1;
    public static int posicion2;

    public NameCharSelector2(Jugador j1, int posicion1) {
        this.j1 = j1;
        this.posicion1 = posicion1;

        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelector1 = new javax.swing.JPanel();
        cbThemesP1 = new javax.swing.JComboBox<>();
        txtNombreP1 = new javax.swing.JTextField();
        jlbTema = new javax.swing.JLabel();
        txtGamerTag = new javax.swing.JTextField();
        jlbAlias = new javax.swing.JLabel();
        jpTeclado = new javax.swing.JPanel();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        BtnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        BtnP = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnRAYA = new javax.swing.JButton();
        btnPUNTO = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnEXCLAMATION = new javax.swing.JButton();
        btnCOMA = new javax.swing.JButton();
        btnAPOSTROFE = new javax.swing.JButton();
        btnPUNTO2 = new javax.swing.JButton();
        btnAND = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jlbNombre = new javax.swing.JLabel();
        btnAlternarTeclado = new javax.swing.JToggleButton();
        btntAlternarOpcion = new javax.swing.JToggleButton();
        lblSeleccionadaNombre = new javax.swing.JLabel();
        lblSeleccionadaAlias = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnListoP1 = new javax.swing.JButton();
        btnCancelarP1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GotThatTrivia");
        setMaximumSize(new java.awt.Dimension(1044, 793));
        setMinimumSize(new java.awt.Dimension(1044, 793));
        setUndecorated(true);
        setResizable(false);

        jpSelector1.setBackground(new java.awt.Color(0, 0, 0));
        jpSelector1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        cbThemesP1.setBackground(new java.awt.Color(0, 0, 0));
        cbThemesP1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        cbThemesP1.setForeground(new java.awt.Color(255, 255, 255));
        cbThemesP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Series y Películas", "Eventos Históricos", "Tecnologia", "Deporte", "Ciencia", "Arte", "Geografía", "VideoJuegos" }));
        cbThemesP1.setToolTipText("");
        cbThemesP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbThemesP1ActionPerformed(evt);
            }
        });

        txtNombreP1.setBackground(new java.awt.Color(0, 0, 0));
        txtNombreP1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        txtNombreP1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreP1.setEnabled(false);
        txtNombreP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreP1ActionPerformed(evt);
            }
        });

        jlbTema.setText("Selecciona tu tema");

        txtGamerTag.setBackground(new java.awt.Color(0, 0, 0));
        txtGamerTag.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        txtGamerTag.setForeground(new java.awt.Color(255, 255, 255));
        txtGamerTag.setEnabled(false);
        txtGamerTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGamerTagActionPerformed(evt);
            }
        });

        jlbAlias.setForeground(new java.awt.Color(255, 255, 255));
        jlbAlias.setText("Alias");

        jpTeclado.setBackground(new java.awt.Color(0, 0, 0));
        jpTeclado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(67, 66, 246), 5, true));

        btnB.setBackground(new java.awt.Color(0, 0, 0));
        btnB.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 255, 255));
        btnB.setText("B");
        btnB.setBorder(null);
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnA.setBackground(new java.awt.Color(0, 0, 0));
        btnA.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 255, 255));
        btnA.setText("A");
        btnA.setBorder(null);
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnJ.setBackground(new java.awt.Color(0, 0, 0));
        btnJ.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnJ.setForeground(new java.awt.Color(255, 255, 255));
        btnJ.setText("J");
        btnJ.setBorder(null);
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnK.setBackground(new java.awt.Color(0, 0, 0));
        btnK.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnK.setForeground(new java.awt.Color(255, 255, 255));
        btnK.setText("K");
        btnK.setBorder(null);
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnG.setBackground(new java.awt.Color(0, 0, 0));
        btnG.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 255, 255));
        btnG.setText("G");
        btnG.setBorder(null);
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setBackground(new java.awt.Color(0, 0, 0));
        btnH.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnH.setForeground(new java.awt.Color(255, 255, 255));
        btnH.setText("H");
        btnH.setBorder(null);
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnI.setBackground(new java.awt.Color(0, 0, 0));
        btnI.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnI.setForeground(new java.awt.Color(255, 255, 255));
        btnI.setText("I");
        btnI.setBorder(null);
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnF.setBackground(new java.awt.Color(0, 0, 0));
        btnF.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnF.setForeground(new java.awt.Color(255, 255, 255));
        btnF.setText("F");
        btnF.setBorder(null);
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        BtnD.setBackground(new java.awt.Color(0, 0, 0));
        BtnD.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        BtnD.setForeground(new java.awt.Color(255, 255, 255));
        BtnD.setText("D");
        BtnD.setBorder(null);
        BtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDActionPerformed(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(0, 0, 0));
        btnE.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnE.setForeground(new java.awt.Color(255, 255, 255));
        btnE.setText("E");
        btnE.setBorder(null);
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnL.setBackground(new java.awt.Color(0, 0, 0));
        btnL.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnL.setForeground(new java.awt.Color(255, 255, 255));
        btnL.setText("L");
        btnL.setBorder(null);
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnN.setForeground(new java.awt.Color(255, 255, 255));
        btnN.setText("N");
        btnN.setBorder(null);
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnM.setBackground(new java.awt.Color(0, 0, 0));
        btnM.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnM.setForeground(new java.awt.Color(255, 255, 255));
        btnM.setText("M");
        btnM.setBorder(null);
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnO.setBackground(new java.awt.Color(0, 0, 0));
        btnO.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnO.setForeground(new java.awt.Color(255, 255, 255));
        btnO.setText("O");
        btnO.setBorder(null);
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnR.setBackground(new java.awt.Color(0, 0, 0));
        btnR.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnR.setForeground(new java.awt.Color(255, 255, 255));
        btnR.setText("R");
        btnR.setBorder(null);
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnQ.setBackground(new java.awt.Color(0, 0, 0));
        btnQ.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnQ.setForeground(new java.awt.Color(255, 255, 255));
        btnQ.setText("Q");
        btnQ.setBorder(null);
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        BtnP.setBackground(new java.awt.Color(0, 0, 0));
        BtnP.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        BtnP.setForeground(new java.awt.Color(255, 255, 255));
        BtnP.setText("P");
        BtnP.setBorder(null);
        BtnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPActionPerformed(evt);
            }
        });

        btnT.setBackground(new java.awt.Color(0, 0, 0));
        btnT.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnT.setForeground(new java.awt.Color(255, 255, 255));
        btnT.setText("T");
        btnT.setBorder(null);
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnS.setBackground(new java.awt.Color(0, 0, 0));
        btnS.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnS.setForeground(new java.awt.Color(255, 255, 255));
        btnS.setText("S");
        btnS.setBorder(null);
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnV.setBackground(new java.awt.Color(0, 0, 0));
        btnV.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnV.setForeground(new java.awt.Color(255, 255, 255));
        btnV.setText("V");
        btnV.setBorder(null);
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnU.setBackground(new java.awt.Color(0, 0, 0));
        btnU.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnU.setForeground(new java.awt.Color(255, 255, 255));
        btnU.setText("U");
        btnU.setBorder(null);
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnW.setBackground(new java.awt.Color(0, 0, 0));
        btnW.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnW.setForeground(new java.awt.Color(255, 255, 255));
        btnW.setText("W");
        btnW.setBorder(null);
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnX.setBackground(new java.awt.Color(0, 0, 0));
        btnX.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnX.setForeground(new java.awt.Color(255, 255, 255));
        btnX.setText("X");
        btnX.setBorder(null);
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnY.setBackground(new java.awt.Color(0, 0, 0));
        btnY.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnY.setForeground(new java.awt.Color(255, 255, 255));
        btnY.setText("Y");
        btnY.setBorder(null);
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnRAYA.setBackground(new java.awt.Color(0, 0, 0));
        btnRAYA.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnRAYA.setForeground(new java.awt.Color(255, 255, 255));
        btnRAYA.setText("-");
        btnRAYA.setBorder(null);
        btnRAYA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAYAActionPerformed(evt);
            }
        });

        btnPUNTO.setBackground(new java.awt.Color(0, 0, 0));
        btnPUNTO.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnPUNTO.setForeground(new java.awt.Color(255, 255, 255));
        btnPUNTO.setText(".");
        btnPUNTO.setBorder(null);
        btnPUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPUNTOActionPerformed(evt);
            }
        });

        btnZ.setBackground(new java.awt.Color(0, 0, 0));
        btnZ.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnZ.setForeground(new java.awt.Color(255, 255, 255));
        btnZ.setText("Z");
        btnZ.setBorder(null);
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        btnEXCLAMATION.setBackground(new java.awt.Color(0, 0, 0));
        btnEXCLAMATION.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnEXCLAMATION.setForeground(new java.awt.Color(255, 255, 255));
        btnEXCLAMATION.setText("!");
        btnEXCLAMATION.setBorder(null);
        btnEXCLAMATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLAMATIONActionPerformed(evt);
            }
        });

        btnCOMA.setBackground(new java.awt.Color(0, 0, 0));
        btnCOMA.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnCOMA.setForeground(new java.awt.Color(255, 255, 255));
        btnCOMA.setText(",");
        btnCOMA.setBorder(null);
        btnCOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOMAActionPerformed(evt);
            }
        });

        btnAPOSTROFE.setBackground(new java.awt.Color(0, 0, 0));
        btnAPOSTROFE.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnAPOSTROFE.setForeground(new java.awt.Color(255, 255, 255));
        btnAPOSTROFE.setText("'");
        btnAPOSTROFE.setBorder(null);
        btnAPOSTROFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPOSTROFEActionPerformed(evt);
            }
        });

        btnPUNTO2.setBackground(new java.awt.Color(0, 0, 0));
        btnPUNTO2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnPUNTO2.setForeground(new java.awt.Color(255, 255, 255));
        btnPUNTO2.setText(".");
        btnPUNTO2.setBorder(null);
        btnPUNTO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPUNTO2ActionPerformed(evt);
            }
        });

        btnAND.setBackground(new java.awt.Color(0, 0, 0));
        btnAND.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnAND.setForeground(new java.awt.Color(255, 255, 255));
        btnAND.setText("&");
        btnAND.setBorder(null);
        btnAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANDActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("<-");
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTecladoLayout = new javax.swing.GroupLayout(jpTeclado);
        jpTeclado.setLayout(jpTecladoLayout);
        jpTecladoLayout.setHorizontalGroup(
            jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTecladoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpTecladoLayout.createSequentialGroup()
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpTecladoLayout.createSequentialGroup()
                                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpTecladoLayout.createSequentialGroup()
                                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnD, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpTecladoLayout.createSequentialGroup()
                                        .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpTecladoLayout.createSequentialGroup()
                                .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRAYA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEXCLAMATION, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAPOSTROFE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAND, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPUNTO2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTecladoLayout.setVerticalGroup(
            jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTecladoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPUNTO2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAND, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAPOSTROFE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEXCLAMATION, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRAYA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpTecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre");

        btnAlternarTeclado.setBackground(new java.awt.Color(0, 0, 0));
        btnAlternarTeclado.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        btnAlternarTeclado.setForeground(new java.awt.Color(255, 255, 255));
        btnAlternarTeclado.setText("Alternar Teclado");
        btnAlternarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternarTecladoActionPerformed(evt);
            }
        });

        btntAlternarOpcion.setBackground(new java.awt.Color(0, 0, 0));
        btntAlternarOpcion.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        btntAlternarOpcion.setForeground(new java.awt.Color(255, 255, 255));
        btntAlternarOpcion.setText("Alternar Opción");
        btntAlternarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntAlternarOpcionActionPerformed(evt);
            }
        });

        lblSeleccionadaNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblSeleccionadaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/link final.gif"))); // NOI18N

        lblSeleccionadaAlias.setBackground(new java.awt.Color(0, 0, 0));
        lblSeleccionadaAlias.setForeground(new java.awt.Color(0, 0, 0));
        lblSeleccionadaAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/link final.gif"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/textoNameSelector.png"))); // NOI18N

        btnListoP1.setBackground(new java.awt.Color(0, 0, 0));
        btnListoP1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        btnListoP1.setForeground(new java.awt.Color(255, 255, 255));
        btnListoP1.setText("Listo");
        btnListoP1.setBorder(null);
        btnListoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoP1ActionPerformed(evt);
            }
        });

        btnCancelarP1.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarP1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        btnCancelarP1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarP1.setText("Cancelar");
        btnCancelarP1.setBorder(null);
        btnCancelarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelector1Layout = new javax.swing.GroupLayout(jpSelector1);
        jpSelector1.setLayout(jpSelector1Layout);
        jpSelector1Layout.setHorizontalGroup(
            jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelector1Layout.createSequentialGroup()
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpSelector1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSeleccionadaNombre)
                                .addComponent(lblSeleccionadaAlias))
                            .addGap(47, 47, 47)
                            .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGamerTag, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbAlias)
                                .addComponent(jlbNombre)
                                .addComponent(txtNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbTema)
                            .addGap(166, 166, 166))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpSelector1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel1)))
                    .addGroup(jpSelector1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnAlternarTeclado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelector1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSelector1Layout.createSequentialGroup()
                        .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbThemesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntAlternarOpcion)))
                .addGap(71, 71, 71))
        );
        jpSelector1Layout.setVerticalGroup(
            jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelector1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSelector1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jlbTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbThemesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpSelector1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpSelector1Layout.createSequentialGroup()
                                .addComponent(lblSeleccionadaNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSeleccionadaAlias))
                            .addGroup(jpSelector1Layout.createSequentialGroup()
                                .addComponent(jlbNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreP1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jlbAlias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGamerTag, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(btnAlternarTeclado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jpSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarP1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntAlternarOpcion)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpSelector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSelector1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbThemesP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbThemesP1ActionPerformed

    }//GEN-LAST:event_cbThemesP1ActionPerformed

    private void txtNombreP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreP1ActionPerformed

    }//GEN-LAST:event_txtNombreP1ActionPerformed

    private void txtGamerTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGamerTagActionPerformed

    }//GEN-LAST:event_txtGamerTagActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        txtNombreP1.setText(txtNombreP1.getText() + "B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "C");
        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "C");
        }

    }//GEN-LAST:event_btnCActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "A");
        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "A");
        }

    }//GEN-LAST:event_btnAActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed

        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "J");
        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "J");
        }

    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed

        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "K");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "K");

        }
    }//GEN-LAST:event_btnKActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "G");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "G");

        }
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "H");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "H");

        }
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "I");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "I");

        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "F");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "F");

        }
    }//GEN-LAST:event_btnFActionPerformed

    private void BtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "D");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "D");

        }
    }//GEN-LAST:event_BtnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "E");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "E");

        }
    }//GEN-LAST:event_btnEActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "L");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "L");

        }
    }//GEN-LAST:event_btnLActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "N");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "N");

        }
    }//GEN-LAST:event_btnNActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "M");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "M");

        }
    }//GEN-LAST:event_btnMActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "O");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "O");

        }
    }//GEN-LAST:event_btnOActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "R");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "R");

        }
    }//GEN-LAST:event_btnRActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "Q");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "Q");

        }
    }//GEN-LAST:event_btnQActionPerformed

    private void BtnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "P");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "P");

        }
    }//GEN-LAST:event_BtnPActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "T");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "T");

        }
    }//GEN-LAST:event_btnTActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "S");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "S");

        }
    }//GEN-LAST:event_btnSActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "V");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "V");

        }
    }//GEN-LAST:event_btnVActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "U");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "U");

        }
    }//GEN-LAST:event_btnUActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "W");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "W");

        }
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "X");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "X");

        }
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "Y");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "Y");

        }
    }//GEN-LAST:event_btnYActionPerformed

    private void btnRAYAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAYAActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "-");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "-");

        }
    }//GEN-LAST:event_btnRAYAActionPerformed

    private void btnPUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPUNTOActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + ".");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + ".");

        }
    }//GEN-LAST:event_btnPUNTOActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "Z");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "Z");

        }
    }//GEN-LAST:event_btnZActionPerformed

    private void btnEXCLAMATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLAMATIONActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "!");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "!");

        }
    }//GEN-LAST:event_btnEXCLAMATIONActionPerformed

    private void btnCOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOMAActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + ",");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + ",");

        }
    }//GEN-LAST:event_btnCOMAActionPerformed

    private void btnAPOSTROFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPOSTROFEActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "'");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "'");

        }
    }//GEN-LAST:event_btnAPOSTROFEActionPerformed

    private void btnPUNTO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPUNTO2ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + ".");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + ".");

        }
    }//GEN-LAST:event_btnPUNTO2ActionPerformed

    private void btnANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANDActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "&");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "&");

        }
    }//GEN-LAST:event_btnANDActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "0");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "0");

        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "1");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "1");

        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "2");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "2");

        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "4");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "4");

        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "5");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "5");

        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "3");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "3");

        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "7");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "7");

        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "6");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "6");

        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "8");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "8");

        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            txtGamerTag.setText(txtGamerTag.getText() + "9");

        } else {
            txtNombreP1.setText(txtNombreP1.getText() + "9");

        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        if (txtNombreP1.getText().isEmpty()) {
            if (btntAlternarOpcion.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "El espacio esta vacio");

            }
        } else {
            if (btntAlternarOpcion.isSelected() == false) {
                txtNombreP1.setText(txtNombreP1.getText().substring(0, txtNombreP1.getText().length() - 1));
            }

        }

        if (txtGamerTag.getText().isEmpty()) {
            if (btntAlternarOpcion.isSelected() == true) {
                JOptionPane.showMessageDialog(null, "El espacio esta vacio");
            }

        } else {
            if (btntAlternarOpcion.isSelected() == true) {
                txtGamerTag.setText(txtGamerTag.getText().substring(0, txtGamerTag.getText().length() - 1));
            }

        }

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAlternarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternarTecladoActionPerformed

        if (btnAlternarTeclado.isSelected()) {
            txtNombreP1.setEnabled(true);
            txtGamerTag.setEnabled(true);
            jpTeclado.setVisible(false);
            btntAlternarOpcion.setVisible(false);
            lblSeleccionadaNombre.setVisible(true);
            lblSeleccionadaAlias.setVisible(true);

        } else {

            jpTeclado.setVisible(true);
            txtNombreP1.setEnabled(false);
            txtGamerTag.setEnabled(false);
            btnB.setEnabled(true);
            btntAlternarOpcion.setVisible(true);

        }
    }//GEN-LAST:event_btnAlternarTecladoActionPerformed

    private void btntAlternarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntAlternarOpcionActionPerformed
        if (btntAlternarOpcion.isSelected()) {
            lblSeleccionadaNombre.setVisible(false);
            lblSeleccionadaAlias.setVisible(true);
        }
        if (btntAlternarOpcion.isSelected() == false) {
            lblSeleccionadaNombre.setVisible(true);
            lblSeleccionadaAlias.setVisible(false);
        }

    }//GEN-LAST:event_btntAlternarOpcionActionPerformed

    private void btnListoP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoP1ActionPerformed

        if (txtGamerTag.getText().isEmpty() || txtNombreP1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor rellenar los valores");
        } else {

            String categoria = cbThemesP1.getSelectedItem().toString();

            switch (categoria) {
                case "Series y Peliculas":
                    posicion2 = 0;
                    break;
                case "Eventos Históricos":
                    posicion2 = 1;
                    break;

                case "Tecnologia":
                    posicion2 = 2;
                    break;

                case "Deporte":
                    posicion2 = 3;
                    break;

                case "Ciencia":
                    posicion2 = 4;
                    break;

                case "Arte":
                    posicion2 = 5;
                    break;

                case "Geografía":
                    posicion2 = 6;
                    break;
                case "VideoJuegos":
                    posicion2 = 7;
                    break;
            }

            String Nombre = txtNombreP1.getText().toString();
            int Tema = posicion2;
            String Alias = txtGamerTag.getText().toString();

            Jugador j2 = new Jugador(Nombre, Alias, 0, Tema);

            empezar em = new empezar(j1, j2, posicion1, posicion2);

            em.setVisible(true);
            em.setLocationRelativeTo(null);

            this.dispose();

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

    private void btnCancelarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP1ActionPerformed
        jfMenuPrincipal mp = new jfMenuPrincipal();

        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarP1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnD;
    private javax.swing.JButton BtnP;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAND;
    private javax.swing.JButton btnAPOSTROFE;
    private javax.swing.JToggleButton btnAlternarTeclado;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCOMA;
    private javax.swing.JButton btnCancelarP1;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEXCLAMATION;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnListoP1;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnPUNTO;
    private javax.swing.JButton btnPUNTO2;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnRAYA;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JToggleButton btntAlternarOpcion;
    private javax.swing.JComboBox<String> cbThemesP1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbAlias;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbTema;
    private javax.swing.JPanel jpSelector1;
    private javax.swing.JPanel jpTeclado;
    public javax.swing.JLabel lblSeleccionadaAlias;
    private javax.swing.JLabel lblSeleccionadaNombre;
    private javax.swing.JTextField txtGamerTag;
    private javax.swing.JTextField txtNombreP1;
    // End of variables declaration//GEN-END:variables
}
