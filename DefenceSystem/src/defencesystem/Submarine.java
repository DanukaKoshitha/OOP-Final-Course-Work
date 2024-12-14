package defencesystem;


import defencesystem.Helecopter;
import java.awt.Color;

public class Submarine extends javax.swing.JFrame implements Observer{
private final Observerble observable = Observerble.getInstance();
    private boolean clearToFire = false;
    
    public Submarine() {
        observable.addObserver(this);
        initComponents();
        getContentPane().setBackground(Color.CYAN);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        lblAre = new javax.swing.JLabel();
        btn_shoot = new javax.swing.JButton();
        btn_sonar = new javax.swing.JButton();
        btn_tomahawk = new javax.swing.JButton();
        lbl_solider = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_amount = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        slider_Enargy = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_chat = new javax.swing.JTextArea();
        txt_send = new javax.swing.JTextField();
        btn_search = new javax.swing.JToggleButton();
        btn_Trident = new javax.swing.JButton();
        slide_roxigen = new javax.swing.JSlider();
        lbl_Enargy = new javax.swing.JLabel();
        lbl_oxigen = new javax.swing.JLabel();
        lbloxigan = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jSlider1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setSize(new java.awt.Dimension(200, 400));

        lblAre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAre.setText("Are Not Cleared");

        btn_shoot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_shoot.setText("Shoot");
        btn_shoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shootActionPerformed(evt);
            }
        });

        btn_sonar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sonar.setText(" Sonar Operation");
        btn_sonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sonarActionPerformed(evt);
            }
        });

        btn_tomahawk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tomahawk.setText("Tomahawk Misslle");
        btn_tomahawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tomahawkActionPerformed(evt);
            }
        });

        lbl_solider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_solider.setText("Solider Count");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboBox1ComponentHidden(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lbl_amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_amount.setText("Ammount Count");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        slider_Enargy.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        slider_Enargy.setMajorTickSpacing(10);
        slider_Enargy.setMinorTickSpacing(10);
        slider_Enargy.setOrientation(javax.swing.JSlider.VERTICAL);
        slider_Enargy.setPaintLabels(true);
        slider_Enargy.setPaintTicks(true);
        slider_Enargy.setSnapToTicks(true);

        txt_chat.setColumns(20);
        txt_chat.setRows(5);
        jScrollPane2.setViewportView(txt_chat);

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_search.setText("Send");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_Trident.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Trident.setText("Trident-2 Misslle");
        btn_Trident.setActionCommand("");

        slide_roxigen.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        slide_roxigen.setMajorTickSpacing(10);
        slide_roxigen.setMinorTickSpacing(10);
        slide_roxigen.setOrientation(javax.swing.JSlider.VERTICAL);
        slide_roxigen.setPaintLabels(true);
        slide_roxigen.setPaintTicks(true);
        slide_roxigen.setSnapToTicks(true);

        lbl_Enargy.setText("Enargy");

        lbloxigan.setText("Oxigen");

        jCheckBox1.setBackground(new java.awt.Color(43, 67, 231));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_shoot, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btn_sonar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_tomahawk)
                                .addGap(60, 60, 60)
                                .addComponent(btn_Trident))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_solider)
                                    .addComponent(lbl_amount))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_Enargy, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(slider_Enargy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(lbl_oxigen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(slide_roxigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbloxigan)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblAre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btn_shoot))
                            .addComponent(btn_sonar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_tomahawk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btn_Trident)))
                        .addGap(17, 17, 17)
                        .addComponent(jCheckBox1)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_solider)
                                .addGap(20, 20, 20)
                                .addComponent(lbl_amount))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_oxigen)
                            .addGap(3, 3, 3)
                            .addComponent(lbloxigan)
                            .addGap(5, 5, 5)
                            .addComponent(slide_roxigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_Enargy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(slider_Enargy, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_shootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_shootActionPerformed

    private void btn_sonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sonarActionPerformed

    private void btn_tomahawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tomahawkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tomahawkActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ComponentHidden

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            observable.setPosition(true);
            clearToFire = true;
        } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            observable.setPosition(false);
            clearToFire = false;
//            jSpinner1.setValue(0);
//            jSpinner2.setValue(0);
            btn_shoot.setEnabled(false);
            btn_shoot.setBackground(Color.BLUE);
            btn_sonar.setEnabled(false);
            btn_sonar.setBackground(Color.BLUE);
            btn_tomahawk.setEnabled(false);
            btn_tomahawk.setBackground(Color.BLUE);
            btn_Trident.setEnabled(false);
            btn_Trident.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String message = "Submarian : "+txt_send.getText();
        observable.ReceiveMsgs(message);
    }//GEN-LAST:event_btn_searchActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Helecopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helecopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helecopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helecopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Submarine().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Trident;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JButton btn_shoot;
    private javax.swing.JButton btn_sonar;
    private javax.swing.JButton btn_tomahawk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAre;
    private javax.swing.JLabel lbl_Enargy;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_oxigen;
    private javax.swing.JLabel lbl_solider;
    private javax.swing.JLabel lbloxigan;
    private javax.swing.JSlider slide_roxigen;
    private javax.swing.JSlider slider_Enargy;
    private javax.swing.JTextArea txt_chat;
    private javax.swing.JTextField txt_send;
    // End of variables declaration//GEN-END:variables

    @Override
    public void AreaClear(boolean clear) {
         if(clear){
            lblAre.setText("Area Clear");
        }else{
            lblAre.setText("Area Not Clear");
        }
    }

    @Override
    public void SendMessage(String text, char name) {
         if(name == 'S' || name == 'A'){
            txt_chat.append("Control Room : "+text+"\n");
        }
    }

    @Override
    public void positionChange(int level) {
        if (clearToFire) {
        btn_Trident.setEnabled(level >= 80);
        btn_Trident.setBackground(Color.RED);
        btn_tomahawk.setEnabled(level >= 60);
        btn_tomahawk.setBackground(Color.RED);
        btn_sonar.setEnabled(level >= 40);
        btn_sonar.setBackground(Color.RED);
        btn_shoot.setEnabled(level >= 20);
        btn_shoot.setBackground(Color.RED);
        } else {
        btn_shoot.setEnabled(false);
        btn_shoot.setBackground(Color.BLUE);
        btn_sonar.setEnabled(false);
        btn_sonar.setBackground(Color.BLUE);
        btn_tomahawk.setEnabled(false);
        btn_tomahawk.setBackground(Color.BLUE);
        btn_Trident.setEnabled(false);
        btn_Trident.setBackground(Color.BLUE);
        }
    }
}


    

