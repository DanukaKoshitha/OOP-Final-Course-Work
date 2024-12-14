package defencesystem;


import defencesystem.Helecopter;
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Tank extends javax.swing.JFrame implements Observer{
     private final Observerble observable = Observerble.getInstance();
     private boolean clearToFire = false;

    public Tank() {
        initComponents();
        observable.addObserver(this);
        getContentPane().setBackground(Color.YELLOW);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbl_Are = new javax.swing.JLabel();
        btn_shoot = new javax.swing.JButton();
        btn_Missile = new javax.swing.JButton();
        btn_Laser = new javax.swing.JButton();
        lbl_solider = new javax.swing.JLabel();
        ComboBox_solider = new javax.swing.JComboBox<>();
        lbl_ammo = new javax.swing.JLabel();
        ComboBox_Ammo = new javax.swing.JComboBox<>();
        Slider_fuel = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_chat = new javax.swing.JTextArea();
        txt_send = new javax.swing.JTextField();
        btn_send = new javax.swing.JToggleButton();
        btn_Rotate = new javax.swing.JButton();
        lbl_fuel = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");

        lbl_Are.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Are.setText("Are Not Cleared");

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

        lbl_solider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_solider.setText("Solider Count");

        ComboBox_solider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboBox_solider.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ComboBox_soliderComponentHidden(evt);
            }
        });
        ComboBox_solider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_soliderActionPerformed(evt);
            }
        });

        lbl_ammo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ammo.setText("Ammo Count");

        ComboBox_Ammo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        ComboBox_Ammo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_AmmoActionPerformed(evt);
            }
        });

        Slider_fuel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Slider_fuel.setMajorTickSpacing(10);
        Slider_fuel.setMinorTickSpacing(10);
        Slider_fuel.setOrientation(javax.swing.JSlider.VERTICAL);
        Slider_fuel.setPaintLabels(true);
        Slider_fuel.setPaintTicks(true);
        Slider_fuel.setSnapToTicks(true);

        txt_chat.setColumns(20);
        txt_chat.setRows(5);
        jScrollPane2.setViewportView(txt_chat);

        btn_send.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        btn_Rotate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Rotate.setText("Rotate Shooting");

        lbl_fuel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_fuel.setText("Fuel");

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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Are, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_Laser, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                    .addComponent(btn_shoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn_Rotate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_Missile)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt_send, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbl_solider)
                                                    .addComponent(lbl_ammo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ComboBox_solider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ComboBox_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(lbl_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(Slider_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Are, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_shoot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Missile)
                            .addComponent(lbl_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Rotate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Laser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_solider, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox_solider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_ammo)
                                    .addComponent(ComboBox_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Slider_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    private void ComboBox_soliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_soliderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_soliderActionPerformed

    private void ComboBox_AmmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_AmmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_AmmoActionPerformed

    private void ComboBox_soliderComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ComboBox_soliderComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_soliderComponentHidden

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
            btn_Missile.setEnabled(false);
            btn_Missile.setBackground(Color.BLUE);
            btn_Laser.setEnabled(false);
            btn_Laser.setBackground(Color.BLUE);
            btn_Rotate.setEnabled(false);
            btn_Rotate.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        String message = "Tank : "+txt_send.getText();
        observable.ReceiveMsgs(message);
    }//GEN-LAST:event_btn_sendActionPerformed

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
            new Tank().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Ammo;
    private javax.swing.JComboBox<String> ComboBox_solider;
    private javax.swing.JSlider Slider_fuel;
    private javax.swing.JButton btn_Laser;
    private javax.swing.JButton btn_Missile;
    private javax.swing.JButton btn_Rotate;
    private javax.swing.JToggleButton btn_send;
    private javax.swing.JButton btn_shoot;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Are;
    private javax.swing.JLabel lbl_ammo;
    private javax.swing.JLabel lbl_fuel;
    private javax.swing.JLabel lbl_solider;
    private javax.swing.JTextArea txt_chat;
    private javax.swing.JTextField txt_send;
    // End of variables declaration//GEN-END:variables

    @Override
    public void AreaClear(boolean clear) {
         if(clear){
            lbl_Are.setText("Area Clear");
        }else{
            lbl_Are.setText("Area Not Clear");
        } 
    }

    @Override
    public void SendMessage(String text, char name) {
        if(name == 'T' || name == 'A'){
            txt_chat.append("Control Room : "+text+"\n");
        }
    }

    @Override
    public void positionChange(int level) {
        
         if (clearToFire) {
        btn_Rotate.setEnabled(level >= 80);
        btn_Rotate.setBackground(Color.RED);
        btn_Laser.setEnabled(level >= 60);
        btn_Laser.setBackground(Color.RED);
        btn_Missile.setEnabled(level >= 40);
        btn_Missile.setBackground(Color.RED);
        btn_shoot.setEnabled(level >= 20);
        btn_shoot.setBackground(Color.RED);
        } else {
        btn_shoot.setEnabled(false);
        btn_shoot.setBackground(Color.BLUE);
        btn_Missile.setEnabled(false);
        btn_Missile.setBackground(Color.BLUE);
        btn_Laser.setEnabled(false);
        btn_Laser.setBackground(Color.BLUE);
        btn_Rotate.setEnabled(false);
        btn_Rotate.setBackground(Color.BLUE);
        }
    }
}
