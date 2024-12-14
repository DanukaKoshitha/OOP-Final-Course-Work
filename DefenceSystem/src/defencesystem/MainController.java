package defencesystem;

import defencesystem.Helecopter;
import java.awt.Color;
import java.awt.*;

public class MainController extends javax.swing.JFrame {
    private final Observerble observerble ;
    
    
    private String selectType = null;
    private final String[] comboList = {"All","Helicopter","Tank","Submarian"};
    private boolean clearPosition = false;

    public MainController() {
        initComponents();
        getContentPane().setBackground(Color.RED);
        observerble = Observerble.getInstance();
        observerble.setControlRoom(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn_information = new javax.swing.JToggleButton();
        jComboBox_SelectDefence = new javax.swing.JComboBox<>();
        lbl_count = new javax.swing.JLabel();
        lbl_position = new javax.swing.JLabel();
        lbl_fuel = new javax.swing.JLabel();
        Slider_position = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_sendma = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_recive = new javax.swing.JTextArea();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        btn_send = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_Ammo = new javax.swing.JLabel();
        lbl_count1 = new javax.swing.JLabel();
        lbl_count2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_send = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainControllerRoom");

        btn_information.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_information.setText("Controller Iformation");
        btn_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informationActionPerformed(evt);
            }
        });

        jComboBox_SelectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Submarine", "Tank", " " }));
        jComboBox_SelectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SelectDefenceActionPerformed(evt);
            }
        });

        lbl_count.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_count.setText("Recive Massage");

        lbl_position.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_position.setText("Position");

        lbl_fuel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_fuel.setText("Fuel Amount");

        Slider_position.setMajorTickSpacing(10);
        Slider_position.setPaintLabels(true);
        Slider_position.setPaintTicks(true);
        Slider_position.setSnapToTicks(true);
        Slider_position.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Slider_positionStateChanged(evt);
            }
        });

        txtArea_sendma.setColumns(20);
        txtArea_sendma.setRows(5);
        jScrollPane1.setViewportView(txtArea_sendma);

        txt_recive.setColumns(20);
        txt_recive.setRows(5);
        jScrollPane2.setViewportView(txt_recive);

        checkbox1.setLabel("Send private");

        checkbox2.setLabel("Send Clear");
        checkbox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox2ItemStateChanged(evt);
            }
        });

        btn_send.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        jLabel4.setText("0");

        jLabel5.setText("0");

        jLabel6.setText("0");

        lbl_Ammo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Ammo.setText("Ammo Amount");

        lbl_count1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_count2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_count2.setText("Send Massage");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Fuel Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_position, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_Ammo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Slider_position, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_count, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_count1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_count2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jComboBox_SelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_information, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_information, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_SelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lbl_Ammo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_position)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                            .addComponent(lbl_fuel))
                                        .addGap(27, 27, 27)))
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addGap(111, 111, 111)))
                        .addComponent(Slider_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_count1)
                            .addComponent(lbl_count, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_count2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_send, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_informationActionPerformed

    private void jComboBox_SelectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SelectDefenceActionPerformed
        selectType = (String) jComboBox_SelectDefence.getSelectedItem();
       jLabel6.setText("0");
       jLabel4.setText("0");
    }//GEN-LAST:event_jComboBox_SelectDefenceActionPerformed

    private void checkbox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox2ItemStateChanged
         if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            observerble.notifyObserverses(true); 
            } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            observerble.notifyObserverses(false);
        } 
    }//GEN-LAST:event_checkbox2ItemStateChanged

    private void Slider_positionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Slider_positionStateChanged
         if(clearPosition==true){
            int levelOld = Slider_position.getValue();
            observerble.setPositionLevel(levelOld);
        }
    }//GEN-LAST:event_Slider_positionStateChanged

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
         String message = txt_send.getText();
        
            if(selectType!=null){
                if(selectType.equals(comboList[0])){
                    txtArea_sendma.append(comboList[0]+" : "+message+"\n");
                    observerble.sendSMS(message,'A');
                }else if(selectType.equals(comboList[1])){
                    txtArea_sendma.append(comboList[1]+" : "+message+"\n");
                    observerble.sendSMS(message,'H');
                }else if(selectType.equals(comboList[2])){
                    txtArea_sendma.append(comboList[2]+" : "+message+"\n");
                    observerble.sendSMS(message,'T');
                }else{
                    txtArea_sendma.append(comboList[3]+" : "+message+"\n");
                    observerble.sendSMS(message,'S');
                }
            }
    }//GEN-LAST:event_btn_sendActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainController().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Slider_position;
    private javax.swing.JToggleButton btn_information;
    private javax.swing.JButton btn_send;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private javax.swing.JComboBox<String> jComboBox_SelectDefence;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Ammo;
    private javax.swing.JLabel lbl_count;
    private javax.swing.JLabel lbl_count1;
    private javax.swing.JLabel lbl_count2;
    private javax.swing.JLabel lbl_fuel;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JTextArea txtArea_sendma;
    private javax.swing.JTextArea txt_recive;
    private javax.swing.JTextField txt_send;
    // End of variables declaration//GEN-END:variables
public void setPositon(boolean position){
        if(position){
            jLabel1.setText("Defence Position");
            clearPosition = true;
            }else{
            jLabel1.setText("Defence NOT Position");
            clearPosition = false;
        }
    }

    public void ReceiveMsgs(String text){
        txt_recive.append(text+"\n");
    }
    

}
