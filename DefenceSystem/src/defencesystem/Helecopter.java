package defencesystem;

import java.awt.*;

public class Helecopter extends javax.swing.JFrame implements Observer{
    private final Observerble observerble = Observerble.getInstance();
    private boolean clearToFire = false;

    public Helecopter() {
        observerble.addObserver(this);
        initComponents();
        getContentPane().setBackground(Color.darkGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblAre = new javax.swing.JLabel();
        btn_shoot = new javax.swing.JButton();
        btn_Missile = new javax.swing.JButton();
        btn_Laser = new javax.swing.JButton();
        lbl_soider = new javax.swing.JLabel();
        jComboBox_solider = new javax.swing.JComboBox<>();
        lbl_Ammo = new javax.swing.JLabel();
        jComboBox_Ammo = new javax.swing.JComboBox<>();
        j_Slider = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_chat = new javax.swing.JTextArea();
        txt_send = new javax.swing.JTextField();
        btn_search = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter");

        lblAre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAre.setText("Are Not Cleared");

        btn_shoot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_shoot.setText("Shoot");
        btn_shoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shootActionPerformed(evt);
            }
        });

        btn_Missile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Missile.setText("Missile Operation");
        btn_Missile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MissileActionPerformed(evt);
            }
        });

        btn_Laser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Laser.setText("Laser Operation");
        btn_Laser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaserActionPerformed(evt);
            }
        });

        lbl_soider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_soider.setText("Solider Count");

        jComboBox_solider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "140", "150", "160", "170", "180", "190", "200" }));
        jComboBox_solider.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboBox_soliderComponentHidden(evt);
            }
        });
        jComboBox_solider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_soliderActionPerformed(evt);
            }
        });

        lbl_Ammo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Ammo.setText("Ammo Count");

        jComboBox_Ammo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox_Ammo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AmmoActionPerformed(evt);
            }
        });

        j_Slider.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        j_Slider.setMajorTickSpacing(10);
        j_Slider.setMinorTickSpacing(10);
        j_Slider.setOrientation(javax.swing.JSlider.VERTICAL);
        j_Slider.setPaintLabels(true);
        j_Slider.setPaintTicks(true);
        j_Slider.setSnapToTicks(true);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_shoot, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Missile))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Laser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_send, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_soider)
                                    .addComponent(lbl_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_solider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(j_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_shoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Missile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Laser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_soider, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl_Ammo)))
                                .addGap(18, 18, 18)
                                .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox_solider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(j_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_shootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_shootActionPerformed

    private void btn_MissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MissileActionPerformed

    private void btn_LaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LaserActionPerformed

    private void jComboBox_soliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_soliderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_soliderActionPerformed

    private void jComboBox_AmmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AmmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AmmoActionPerformed

    private void jComboBox_soliderComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox_soliderComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_soliderComponentHidden

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            observerble.setPosition(true);
            clearToFire = true;

        } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            observerble.setPosition(false);
            clearToFire = false;
//            jSpinner1.setValue(0);
//            jSpinner2.setValue(0);
            btn_shoot.setEnabled(false);
            btn_shoot.setBackground(Color.cyan);
            btn_Missile.setEnabled(false);
            btn_Missile.setBackground(Color.cyan);
            btn_Laser.setEnabled(false);
            btn_Laser.setBackground(Color.cyan);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String message = "Helicopter : "+txt_send.getText();
        observerble.ReceiveMsgs(message);
    }//GEN-LAST:event_btn_searchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helecopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Laser;
    private javax.swing.JButton btn_Missile;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JButton btn_shoot;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox_Ammo;
    private javax.swing.JComboBox<String> jComboBox_solider;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider j_Slider;
    private javax.swing.JLabel lblAre;
    private javax.swing.JLabel lbl_Ammo;
    private javax.swing.JLabel lbl_soider;
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
       if(name == 'H' || name == 'A'){
            txt_chat.append("Control Room : "+text+"\n");
        }
    }

    @Override
    public void positionChange(int level) {
         if (clearToFire) {
        btn_Laser.setEnabled(level >= 60);
        btn_Laser.setBackground(Color.RED);
        btn_Missile.setEnabled(level >= 40);
        btn_Missile.setBackground(Color.YELLOW);
        btn_shoot.setEnabled(level >= 20);
        btn_shoot.setBackground(Color.orange);
        } else {
        btn_shoot.setEnabled(false);
        btn_shoot.setBackground(Color.BLUE);
        btn_Missile.setEnabled(false);
        btn_Missile.setBackground(Color.BLUE);
        btn_Laser.setEnabled(false);
        btn_Laser.setBackground(Color.BLUE);
        }
    }

//    @Override
//    public void SendMessage(String text, char name) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public void positionChange(int level) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    @Override
//    public void SendMessage(String text, char name) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
