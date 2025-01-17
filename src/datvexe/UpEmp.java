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
    String cmnd0=""; 
    String account0=""; 
    String active0="";
    String phone0 = "";
    int empty = -1;
    int duplicateCMND = -2; 
    int duplicatePhone = -3; 
    int duplicateAccount = -4; 
    public UpEmp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public UpEmp(java.awt.Frame parent, boolean modal,String cmnd, String first, String last, String phone, String sex, String account, String password, String kind, String active){
        super(parent, modal);
        initComponents();
        this.cmnd0 = cmnd;
        
        this.active0 = active; 
        if(account!=null){
        this.account0 = account; 
        }
        this.phone0 = phone; 
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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txname = new javax.swing.JTextField();
        txAccount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txCmnd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKind = new javax.swing.JComboBox<>();
        btUpEmp = new javax.swing.JButton();
        cbActive = new javax.swing.JComboBox<>();
        rdFemale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txFirst = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Tình trạng làm việc");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 360, 190, 17);
        jPanel1.add(txname);
        txname.setBounds(470, 250, 180, 30);
        jPanel1.add(txAccount);
        txAccount.setBounds(780, 270, 330, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("CẬP NHẬT THÔNG TIN NHÂN VIÊN");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 160, 330, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("SĐT");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 300, 60, 17);
        jPanel1.add(txPhone);
        txPhone.setBounds(230, 320, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Họ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 220, 80, 20);
        jPanel1.add(txCmnd);
        txCmnd.setBounds(230, 450, 420, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CMND");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 420, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Tên đăng nhập");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 240, 130, 17);

        cbKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lí", "Nhân viên", "Chủ nhà xe" }));
        jPanel1.add(cbKind);
        cbKind.setBounds(440, 380, 210, 20);

        btUpEmp.setBackground(new java.awt.Color(5, 87, 169));
        btUpEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btUpEmp.setForeground(new java.awt.Color(255, 255, 255));
        btUpEmp.setText("Cập nhật nhân viên");
        btUpEmp.setBorderPainted(false);
        btUpEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btUpEmp);
        btUpEmp.setBounds(490, 530, 340, 50);

        cbActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Làm việc", "Đã nghỉ việc" }));
        cbActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbActiveItemStateChanged(evt);
            }
        });
        jPanel1.add(cbActive);
        cbActive.setBounds(230, 380, 190, 20);

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Nữ");
        jPanel1.add(rdFemale);
        rdFemale.setBounds(560, 320, 93, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Chức vụ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(440, 360, 77, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Mật khẩu");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 310, 130, 17);

        txPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txPassword);
        txPassword.setBounds(780, 340, 330, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Tên");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 220, 80, 17);
        jPanel1.add(txFirst);
        txFirst.setBounds(230, 250, 190, 30);

        buttonGroup1.add(rdMale);
        rdMale.setText("Nam");
        jPanel1.add(rdMale);
        rdMale.setBounds(440, 320, 93, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Giới tính");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 300, 120, 17);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/iconTong.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 20, 160, 123);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/BackGround.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPasswordActionPerformed

    private void btUpEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpEmpActionPerformed
        
        DatVeXe datvexe  = new DatVeXe();
        Connection conn = datvexe.layKetNoi();
        String phonePattern = "0[0-9]{9}";
        
        String cmnd = txCmnd.getText().trim(); 
        String first = txFirst.getText().trim(); 
        String last = txname.getText().trim();
        String phone = txPhone.getText().trim(); 
        String sex; 
        if(rdMale.isSelected()){
            sex = "Nam";
        }else{
            sex = "Nữ";
        }
        String account = txAccount.getText().trim(); 
        String password = txPassword.getText().trim(); 
        String kind = (String) cbKind.getSelectedItem(); 
        if(kind.equals("Quản lí")){
            kind = "boss";
        }else if(kind.equals("Nhân viên")){
            kind = "staff";
        }else if(kind.equals("Chủ nhà xe")){
            kind = "gara";
        }
        
        int checkResult = checkInfor(cmnd, phone, account, conn);
        if(checkResult==empty){
            JOptionPane.showMessageDialog(rootPane, "Các thông tin không được để trống!");
            return ;
        }
        else if(checkResult==duplicateCMND){
            JOptionPane.showMessageDialog(rootPane, "Chứng minh thư đã được đăng kí! \nVui lòng kiếm tra lại");
            return ;
        }
        else if(checkResult==duplicatePhone){
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại đã được đăng kí!\nVui lòng chọn số điện thoại khác!");
            return ;
        }
        else if(checkResult==duplicateAccount){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã được sử dụng!\nVui lòng chọn tên đăng nhập khác!");
            return ;
        }
        if(phone.length()!=10 || phone.matches(phonePattern)==false){
           JOptionPane.showMessageDialog(rootPane, "Số điện thoại sai định dạng");
            return; 
       }
        String cmndPattern = "[0-9]{10}";
       if(cmnd.length()!=10 || cmnd.matches(cmndPattern)==false){
           JOptionPane.showMessageDialog(rootPane, "Chứng minh nhân dân sai định dạng");
            return; 
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
                String sql = "UPDATE Staff set Staff_CMND=?,Staff_First_Name=?,Staff_Last_Name=?,Staff_SDT=?,Staff_Gender=?,Staff_Account=NULL,Active=? where Staff_CMND=?";
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
    
    public int checkInfor(String cmnd, String phone, String account,Connection conn){
        if(cmnd.trim().equals("")||phone.trim().equals("")||account.trim().equals("")){
            return -1; 
        }
        
        if(this.cmnd0.equals(cmnd)==false){
            String sql ="select Staff_CMND from staff where Staff_CMND=?";
            try {
                PreparedStatement pstt = conn.prepareStatement(sql);
                pstt.setString(1, cmnd);
                ResultSet rs = pstt.executeQuery();
                if(rs.next()){
                    return -2; 
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(this.phone0.equals(phone)==false){
            String sql ="select * from staff where Staff_SDT=?";
            PreparedStatement pstt;
            try {
                pstt = conn.prepareStatement(sql);
                pstt.setString(1, phone);
                ResultSet rs = pstt.executeQuery();
                if(rs.next()){
                    return -3; 
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        if(this.account0.equals(account)==false){
            String sql ="select * from staff where Staff_Account=?";
            PreparedStatement pstt;
            try {
                pstt = conn.prepareStatement(sql);
                pstt.setString(1, account);
                ResultSet rs = pstt.executeQuery();
                if(rs.next()){
                    return -4; 
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        return 0;
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpEmp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbActive;
    private javax.swing.JComboBox<String> cbKind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
