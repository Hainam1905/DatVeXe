/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Admin
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpManger = new javax.swing.JTabbedPane();
        pPassengerManager = new javax.swing.JPanel();
        spPassengerManager = new javax.swing.JScrollPane();
        tbPassengerManager = new javax.swing.JTable();
        pFunction = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tLastName = new javax.swing.JTextField();
        tFirstName = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tCellPhone = new javax.swing.JTextField();
        tAccount = new javax.swing.JTextField();
        btAddAcount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSetting = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btESC = new javax.swing.JButton();
        lbErrorFirstName = new javax.swing.JLabel();
        lbErrorLastName = new javax.swing.JLabel();
        lbErrorEmail = new javax.swing.JLabel();
        lbErrorAccout = new javax.swing.JLabel();
        lbErrorNumber = new javax.swing.JLabel();
        tPassword = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        lbErrorPassword = new javax.swing.JLabel();
        pScheduelManager = new javax.swing.JPanel();
        spScheduelManager = new javax.swing.JScrollPane();
        tbScheduelManager = new javax.swing.JTable();
        btAddScheduel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPassengerManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số điện thoại", "Họ", "Tên", "Email", "Tài khoản"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPassengerManager.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbPassengerManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPassengerManagerMouseClicked(evt);
            }
        });
        spPassengerManager.setViewportView(tbPassengerManager);

        jLabel4.setText("Email");

        jLabel5.setText("Số điện thoại*");

        tLastName.setEditable(false);

        tFirstName.setEditable(false);
        tFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFirstNameActionPerformed(evt);
            }
        });

        tEmail.setEditable(false);
        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

        tCellPhone.setEditable(false);

        tAccount.setEditable(false);

        btAddAcount.setText("Thêm tài khoản");
        btAddAcount.setEnabled(false);
        btAddAcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAcountActionPerformed(evt);
            }
        });

        jLabel1.setText("Tài khoản *");

        btSetting.setText("Sửa");
        btSetting.setEnabled(false);
        btSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSettingActionPerformed(evt);
            }
        });

        jLabel2.setText("Họ*");

        btDelete.setText("Xóa");
        btDelete.setEnabled(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên*");

        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btESC.setText("Hủy");
        btESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btESCActionPerformed(evt);
            }
        });

        lbErrorFirstName.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorFirstName.setText("Tên không được bỏ trống");

        lbErrorLastName.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorLastName.setText("Họ không được bỏ trống");

        lbErrorEmail.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorEmail.setText("Email không hợp lệ");

        lbErrorAccout.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorAccout.setText("Tài khoản không hợp lệ");

        lbErrorNumber.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorNumber.setText("Số điện thoại không được bỏ trống");

        lbPassword.setText("Mật khẩu*");

        lbErrorPassword.setForeground(new java.awt.Color(255, 0, 51));
        lbErrorPassword.setText("Mật khẩu không hợp lệ");

        javax.swing.GroupLayout pFunctionLayout = new javax.swing.GroupLayout(pFunction);
        pFunction.setLayout(pFunctionLayout);
        pFunctionLayout.setHorizontalGroup(
            pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFunctionLayout.createSequentialGroup()
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFunctionLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btESC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFunctionLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAddAcount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pFunctionLayout.createSequentialGroup()
                                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbErrorFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addGroup(pFunctionLayout.createSequentialGroup()
                                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(tLastName)))
                                    .addComponent(lbErrorLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)))
                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pFunctionLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pFunctionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pFunctionLayout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbErrorEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pFunctionLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbErrorAccout))
                                .addGap(39, 39, 39)
                                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pFunctionLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbErrorNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFunctionLayout.createSequentialGroup()
                                        .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbErrorPassword))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFunctionLayout.setVerticalGroup(
            pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFunctionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbErrorFirstName)
                    .addComponent(lbErrorEmail)
                    .addComponent(lbErrorNumber))
                .addGap(43, 43, 43)
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFunctionLayout.createSequentialGroup()
                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbErrorLastName)
                            .addComponent(lbErrorAccout)))
                    .addGroup(pFunctionLayout.createSequentialGroup()
                        .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbErrorPassword)))
                .addGap(53, 53, 53)
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddAcount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btESC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout pPassengerManagerLayout = new javax.swing.GroupLayout(pPassengerManager);
        pPassengerManager.setLayout(pPassengerManagerLayout);
        pPassengerManagerLayout.setHorizontalGroup(
            pPassengerManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spPassengerManager)
            .addGroup(pPassengerManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pFunction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pPassengerManagerLayout.setVerticalGroup(
            pPassengerManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPassengerManagerLayout.createSequentialGroup()
                .addComponent(spPassengerManager, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 327, Short.MAX_VALUE)
                .addGap(98, 98, 98))
        );

        tpManger.addTab("Quản lý khách hàng", pPassengerManager);

        tbScheduelManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên nhà xe", "Điểm đi", "Điểm đến", "Thứ", "Thời gian", "Giá vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spScheduelManager.setViewportView(tbScheduelManager);

        btAddScheduel.setText("Thêm chuyến xe");

        javax.swing.GroupLayout pScheduelManagerLayout = new javax.swing.GroupLayout(pScheduelManager);
        pScheduelManager.setLayout(pScheduelManagerLayout);
        pScheduelManagerLayout.setHorizontalGroup(
            pScheduelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spScheduelManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(pScheduelManagerLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btAddScheduel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pScheduelManagerLayout.setVerticalGroup(
            pScheduelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pScheduelManagerLayout.createSequentialGroup()
                .addComponent(spScheduelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAddScheduel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 349, Short.MAX_VALUE))
        );

        tpManger.addTab("Quản lý chuyến xe", pScheduelManager);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tpManger, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tpManger, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbPassengerManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPassengerManagerMouseClicked
        //        if (tbPassengerManager.getSelectionModel().isSelectionEmpty()) return;
        //        if (!(tbPassengerManager.isEnabled())) return;
        //
        //        setTextField(tbFunction.selectRow(tbPassengerManager, 0),
            //                tbFunction.selectRow(tbPassengerManager, 1),
            //                tbFunction.selectRow(tbPassengerManager, 2),
            //                tbFunction.selectRow(tbPassengerManager, 3),
            //                tbFunction.selectRow(tbPassengerManager, 4));
        //
        //        btSetting.setEnabled(true);
        //        btDelete.setEnabled(true);
        //        if (tAccount.getText().isEmpty()) {
            //            btAddAcount.setEnabled(true);
            //        }
        //        else {
            //            btAddAcount.setEnabled(false);
            //        }
    }//GEN-LAST:event_tbPassengerManagerMouseClicked

    private void tFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFirstNameActionPerformed

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tEmailActionPerformed

    private void btAddAcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAcountActionPerformed
        //        userFunction = Function.Add;
        //
        //        //Unlock
        //        tAccount.setEditable(true);
        //        btSave.setVisible(true);
        //        btESC.setVisible(true);
        //        lbPassword.setVisible(true);
        //        tPassword.setVisible(true);
    }//GEN-LAST:event_btAddAcountActionPerformed

    private void btSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSettingActionPerformed
        //Only Edit Name and Email
        //        tFirstName.setEditable(true);
        //        tLastName.setEditable(true);
        //        tEmail.setEditable(true);
        //
        //        btSave.setVisible(true);
        //        btESC.setVisible(true);
        //
        //        userFunction = Function.Edit;
    }//GEN-LAST:event_btSettingActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        //        userFunction = Function.Delete;
        //
        //        //Confirm
        //        int choose = JOptionPane.showConfirmDialog(this, "Xác nhận xóa khách hàng", "Thông báo", 0);
        //        if (choose == JOptionPane.OK_OPTION) {
            //            PassengerFunction psFunction = new PassengerFunction(tCellPhone.getText());
            //
            //            psFunction.DeletePassenger();
            //        }
        //
        //        Reset();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        //        //Check input
        //        if (!CheckInput()) return;
        //
        //        if (userFunction == Function.Add) AddAccount(tAccount.getText(), tPassword.getText(), tCellPhone.getText());
        //        else if (userFunction == Function.Edit) EditPassenger();
        //
        //        Reset();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btESCActionPerformed
        //        Reset();
    }//GEN-LAST:event_btESCActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAcount;
    private javax.swing.JButton btAddScheduel;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btESC;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSetting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbErrorAccout;
    private javax.swing.JLabel lbErrorEmail;
    private javax.swing.JLabel lbErrorFirstName;
    private javax.swing.JLabel lbErrorLastName;
    private javax.swing.JLabel lbErrorNumber;
    private javax.swing.JLabel lbErrorPassword;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JPanel pFunction;
    private javax.swing.JPanel pPassengerManager;
    private javax.swing.JPanel pScheduelManager;
    private javax.swing.JScrollPane spPassengerManager;
    private javax.swing.JScrollPane spScheduelManager;
    private javax.swing.JTextField tAccount;
    private javax.swing.JTextField tCellPhone;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tFirstName;
    private javax.swing.JTextField tLastName;
    private javax.swing.JTextField tPassword;
    private javax.swing.JTable tbPassengerManager;
    private javax.swing.JTable tbScheduelManager;
    private javax.swing.JTabbedPane tpManger;
    // End of variables declaration//GEN-END:variables
}
