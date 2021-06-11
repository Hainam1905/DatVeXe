/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author huynh
 */
public class UpEmp extends javax.swing.JDialog {

    /**
     * Creates new form UpEmp
     */
    String cmnd0; 
    String account0; 
    String active0; 
    public UpEmp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public UpEmp(java.awt.Frame parent, boolean modal,String cmnd, String first, String last, String phone, String sex, String account, String password, String kind, String active){
        super(parent, modal);
        initComponents();
        this.cmnd0 = cmnd;
        this.active0 = active; 
        this.account0 = account; 
        showInfor(cmnd, first, last, phone, sex, account, password,kind,active);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txCmnd = new javax.swing.JTextField();
        txFirst = new javax.swing.JTextField();
        txname = new javax.swing.JTextField();
        txPhone = new javax.swing.JTextField();
        txAccount = new javax.swing.JTextField();
        txPassword = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        cbActive = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btUpEmp = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbKind = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CMND");

        jLabel2.setText("Họ");

        jLabel3.setText("Tên");

        jLabel4.setText("SĐT");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Tên đăng nhập");

        jLabel7.setText("Mật khẩu");

        jLabel8.setText("Tình trạng làm việc");

        txPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPasswordActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdMale);
        rdMale.setText("Nam");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Nữ");

        cbActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Làm việc", "Đã nghỉ việc" }));
        cbActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbActiveItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("CẬP NHẬT THÔNG TIN NHÂN VIÊN");

        btUpEmp.setText("Cập nhật nhân viên");
        btUpEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpEmpActionPerformed(evt);
            }
        });

        jLabel10.setText("Chức vụ");

        cbKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Quản lí", "Nhân viên", "Chủ nhà xe" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txCmnd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(69, 69, 69)
                                .addComponent(rdMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(rdFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txAccount)
                                    .addComponent(txPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(cbKind, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(cbActive, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txname, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btUpEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btUpEmp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPasswordActionPerformed

    private void btUpEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpEmpActionPerformed
        
        DatVeXe datvexe  = new DatVeXe();
        Connection conn = datvexe.layKetNoi();
        
        
        String cmnd = txCmnd.getText(); 
        String first = txFirst.getText(); 
        String last = txname.getText();
        String phone = txPhone.getText(); 
        String sex; 
        if(rdMale.isSelected()){
            sex = "Nam";
        }else{
            sex = "Nữ";
        }
        String account = txAccount.getText(); 
        String password = txPassword.getText(); 
        String kind = (String) cbKind.getSelectedItem(); 
        if(kind.equals("Quản lí")){
            kind = "boss";
        }else if(kind.equals("Nhân viên")){
            kind = "staff";
        }else if(kind.equals("Chủ nhà xe")){
            kind = "gara";
        }
        
        String active = (String) cbActive.getSelectedItem();
        boolean activeBool; 
        if(active.equals("Làm việc")){
            activeBool = true;
            
            //truoc do lam, bay gio van lam: 
            if(active0.equals(active)){
                    String sql1 = "UPDATE Account SET Password = ?, Kind = ? where Account.Account=?";
                    try {
                        PreparedStatement pstt1 = conn.prepareStatement(sql1);
                        pstt1.setString(1, password);
                        pstt1.setString(2, kind);
                        pstt1.setString(3, account);

                        int result = pstt1.executeUpdate(); 
                        if(result>0){
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                            //update thong tin ca nhan cua nhan vien: 
                    String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account=?,Active=? where Staff_CMND=?";
                    try {
                        PreparedStatement pstt  = conn.prepareStatement(sql);
                        pstt.setString(1, cmnd);
                        pstt.setString(2, first);
                        pstt.setString(3, last);
                        pstt.setString(4, phone);
                        pstt.setString(5, sex);
                        pstt.setString(6, account);
                        pstt.setBoolean(7,activeBool);
                        pstt.setString(8,this.cmnd0);
                        int result = pstt.executeUpdate(); 
                        if(result>0){
                            JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công!");

                            this.dispose();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
            }
            
            //truoc do nghi, gio lam lai: 
            else{
                if(account.equals("noneactive")){
                    JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không được là 'noneactive' ");
                    return; 
                }
                
                
                String sql1 = "Insert into Account values(?,?,?)";
                    try {
                        PreparedStatement pstt1 = conn.prepareStatement(sql1);
                        pstt1.setString(1, account);
                        pstt1.setString(2, password);
                        pstt1.setString(3, kind);

                        int result = pstt1.executeUpdate(); 
                        if(result>0){
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                        String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account=?,Active=? where Staff_CMND=?";
                      try {
                          PreparedStatement pstt  = conn.prepareStatement(sql);
                          pstt.setString(1, cmnd);
                          pstt.setString(2, first);
                          pstt.setString(3, last);
                          pstt.setString(4, phone);
                          pstt.setString(5, sex);
                          pstt.setString(6, account);
                          pstt.setBoolean(7,activeBool);
                          pstt.setString(8,this.cmnd0);
                          int result = pstt.executeUpdate(); 
                          if(result>0){
                              JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công!");

                              this.dispose();
                          }
                      } catch (SQLException ex) {
                          Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
                      }    
            }
            
            
            
        
        
        
//        String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account=?,Active=? where Staff_CMND=?";
//        try {
//            PreparedStatement pstt  = conn.prepareStatement(sql);
//            pstt.setString(1, cmnd);
//            pstt.setString(2, first);
//            pstt.setString(3, last);
//            pstt.setString(4, phone);
//            pstt.setString(5, sex);
//            pstt.setString(6, account);
//            pstt.setBoolean(7,activeBool);
//            pstt.setString(8,this.cmnd0);
//            int result = pstt.executeUpdate(); 
//            if(result>0){
//                JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công!");
//                
//                this.dispose();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        }
        //CAP NHAT:  KHONG LAM VIEC
        
        else{
            activeBool = false; 
        //truoc do nghi, bay gio van nghi: 
        if(active0.equals(active)){
            String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account='noneactive',Active=? where Staff_CMND=?";
        try {
            PreparedStatement pstt  = conn.prepareStatement(sql);
            pstt.setString(1, cmnd);
            pstt.setString(2, first);
            pstt.setString(3, last);
            pstt.setString(4, phone);
            pstt.setString(5, sex);
            pstt.setBoolean(6,activeBool);
            pstt.setString(7,this.cmnd0);
            int result = pstt.executeUpdate(); 
            if(result>0){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công!");
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        
        //truoc do lam, bay gio nghi: 
        else{
                String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account='noneactive',Active=? where Staff_CMND=?";
                try {
                    PreparedStatement pstt  = conn.prepareStatement(sql);
                    pstt.setString(1, cmnd);
                    pstt.setString(2, first);
                    pstt.setString(3, last);
                    pstt.setString(4, phone);
                    pstt.setString(5, sex);
                    pstt.setBoolean(6,activeBool);
                    pstt.setString(7,this.cmnd0);
                    int result = pstt.executeUpdate(); 
                    
                } catch (SQLException ex) {
                    Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
        String sql1 = "DELETE Account where Account.Account=?";
        try {
            PreparedStatement pstt1 = conn.prepareStatement(sql1);
            
            pstt1.setString(1, this.account0);
            
            int result = pstt1.executeUpdate(); 
            if(result>0){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật nhân viên thành công!");
                this.dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        
        
          
        
        
        
        }
        
        
        
        
    }//GEN-LAST:event_btUpEmpActionPerformed

    private void cbActiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbActiveItemStateChanged
       if(cbActive.getSelectedIndex()==0){
           txAccount.setEditable(true);
           txPassword.setEditable(true);
       }else{
           txAccount.setEditable(false);
           txPassword.setEditable(false);
       }
    }//GEN-LAST:event_cbActiveItemStateChanged
    public void checkInfo(){
    //cac truong khong duoc de trong: 
    
    //truong chuc vu khong duoc de trong: 
    
    }   
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
            java.util.logging.Logger.getLogger(UpEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpEmp dialog = new UpEmp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    public void showInfor(String cmnd, String first, String last, String phone, String sex, String account, String password,String kind, String active){
        txCmnd.setText(cmnd);
        txFirst.setText(first);
        txname.setText(last);
        txPhone.setText(phone);
        if(sex.equals("Nam")){
            rdMale.setSelected(true);
        }else{
            rdFemale.setSelected(true);
        }
        
        txAccount.setText(account);
        txPassword.setText(password);
        
        cbKind.setSelectedItem(kind);
        System.out.println("kind la: "+kind);
        System.out.println("active la: "+active);
        cbActive.setSelectedItem(active);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpEmp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbActive;
    private javax.swing.JComboBox<String> cbKind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txAccount;
    private javax.swing.JTextField txCmnd;
    private javax.swing.JTextField txFirst;
    private javax.swing.JTextField txPassword;
    private javax.swing.JTextField txPhone;
    private javax.swing.JTextField txname;
    // End of variables declaration//GEN-END:variables
}
