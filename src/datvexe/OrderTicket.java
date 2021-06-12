/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanic
 */
public class OrderTicket extends javax.swing.JFrame {

    /**
     * Creates new form OrderTicket
     */
    boolean checkNewUser = false;
    public OrderTicket() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        clear();
    }
    
    public void clear(){
        txt_SDT.setText("");
        txt_firstName.setText("");
        txt_lastName.setText("");
        txt_note.setText("");
        txt_price.setText("");
        txt_staffCMND.setText("");
        cbb_bookTime.removeAllItems();
        cbb_noiDen.removeAllItems();
        cbb_noiDi.removeAllItems();
        cbb_seat.removeAllItems();
        cbb_seatKind.removeAllItems();
        cbb_tripName.removeAllItems();
        cb_isPaid.setSelected(false);
        
        label_firstName.setVisible(false);
        label_lastName.setVisible(false);
        txt_firstName.setVisible(false);
        txt_lastName.setVisible(false);
        getDataStation();
    }
    public void getDataStation(){
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql = "select station_Name from Station";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cbb_noiDi.addItem(rs.getString("station_Name"));
                cbb_noiDen.addItem(rs.getString("station_Name"));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("loi getDataStation"+e);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        txt_lastName = new javax.swing.JTextField();
        txt_firstName = new javax.swing.JTextField();
        cb_isPaid = new javax.swing.JCheckBox();
        label_lastName = new javax.swing.JLabel();
        label_firstName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbb_noiDi = new javax.swing.JComboBox<>();
        cbb_noiDen = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbb_tripName = new javax.swing.JComboBox<>();
        cbb_bookTime = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbb_seat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbb_seatKind = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_note = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txt_staffCMND = new javax.swing.JTextField();
        btn_order = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập số điện thoại hành khách:");

        txt_SDT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_SDTCaretUpdate(evt);
            }
        });
        txt_SDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_SDTFocusLost(evt);
            }
        });
        txt_SDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_SDTMouseExited(evt);
            }
        });
        txt_SDT.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txt_SDTCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_SDTInputMethodTextChanged(evt);
            }
        });

        txt_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastNameActionPerformed(evt);
            }
        });

        cb_isPaid.setText("thanh toán");

        label_lastName.setText("Họ (Last Name): ");

        label_firstName.setText("Tên (First Name): ");

        jLabel4.setText("Nơi đi:");

        jLabel5.setText("Nơi đến: ");

        jLabel6.setText("ngày giờ khởi hành: ");

        jLabel10.setText("chọn chuyến xe: ");

        cbb_tripName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbb_tripNameMouseClicked(evt);
            }
        });

        cbb_bookTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbb_bookTimeMouseClicked(evt);
            }
        });
        cbb_bookTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_bookTimeActionPerformed(evt);
            }
        });

        jLabel7.setText("chọn ghế: ");

        jLabel8.setText("Loại ghế: ");

        jLabel9.setText("Giá ghế: ");

        jLabel11.setText("Lưu ý của khách hàng: ");

        txt_note.setColumns(20);
        txt_note.setRows(5);
        jScrollPane2.setViewportView(txt_note);

        jLabel12.setText("CMND của nhân viên đặt vé: ");

        btn_order.setText("Đặt vé");

        btn_back.setText("<");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_SDT)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_lastName))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbb_noiDi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbb_noiDen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cbb_tripName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_firstName)
                            .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cbb_bookTime, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbb_seat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(cbb_seatKind, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cb_isPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel11)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_staffCMND)
                                        .addComponent(btn_order, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btn_back))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_lastName)
                    .addComponent(label_firstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_noiDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_noiDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_tripName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_bookTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_seatKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_isPaid))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staffCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_order, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastNameActionPerformed

    private void cbb_bookTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_bookTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_bookTimeActionPerformed

    public String[] searchNamePassenger(String sdt){
        String[] s = new String[2];
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql = "select Passenger_First_Name, Passenger_Last_Name from Passenger where Passenger_SDT = '"+sdt+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()){
                s[0]="";s[1] = "";
                return s;
            }else{
                s[0] = rs.getString("Passenger_Last_Name");
                s[1] = rs.getString("Passenger_First_Name");
            }
        } catch (Exception e) {
            System.out.println("loi searchNamePassenger"+e);
        }
        return s;
    } 
    private void txt_SDTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_SDTCaretUpdate
        
    }//GEN-LAST:event_txt_SDTCaretUpdate

    private void txt_SDTCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_SDTCaretPositionChanged
        
    }//GEN-LAST:event_txt_SDTCaretPositionChanged

    private void txt_SDTInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_SDTInputMethodTextChanged
        
    }//GEN-LAST:event_txt_SDTInputMethodTextChanged

    private void txt_SDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_SDTMouseExited
        
    }//GEN-LAST:event_txt_SDTMouseExited

    private void txt_SDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_SDTFocusLost
        String[] s = new String[2];
        s = searchNamePassenger(txt_SDT.getText());
        if (!s[0].equals("") && !s[1].equals("")){
            label_firstName.setVisible(true);
            label_lastName.setVisible(true);
            txt_firstName.setVisible(true);
            txt_lastName.setVisible(true);
            txt_lastName.setText(s[0]);
            txt_firstName.setText(s[1]);
            checkNewUser = false;
        }else if (!txt_SDT.getText().equals("")){
            JOptionPane.showMessageDialog(this, "SDT chưa được đăng ký\n vui lòng nhập vào họ và tên của hành khách mới" ,"Inane Eror",JOptionPane.ERROR_MESSAGE);
            txt_lastName.setText("");
            txt_firstName.setText("");
            label_firstName.setVisible(true);
            label_lastName.setVisible(true);
            txt_firstName.setVisible(true);
            txt_lastName.setVisible(true);
            checkNewUser = true;
        }else{
            label_firstName.setVisible(false);
            label_lastName.setVisible(false);
            txt_firstName.setVisible(false);
            txt_lastName.setVisible(false);
            checkNewUser = false;
        }
    }//GEN-LAST:event_txt_SDTFocusLost

    public String convertStationNametoStationNo(String station_Name){
        String Station_No = "";
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql ="select station_No from Station where station_Name ='"+station_Name+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Station_No = rs.getString("station_No");
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("loi convertStationNametoStationNo"+e);
        }
        return Station_No;
    }
    
    public String[] searchGaraName(String noiDi,String noiDen){
        String[] listGaraName = new String[100];
        int d = 0;
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql ="select GaraName from TotalScheduels t inner join ScheduelOfGara s on t.SChedule_no = s.Scheduel_no where BeginStation ='"+noiDi+"' and EndStation = '"+noiDen+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listGaraName[d] = rs.getString("GaraName");
                d++;
            }
        } catch (Exception e) {
            System.out.println("loi searchGaraName"+e);
        }
        return listGaraName;
    }
    private void cbb_tripNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_tripNameMouseClicked
        cbb_tripName.removeAllItems();
        String noiDi = String.valueOf(cbb_noiDi.getSelectedItem());
        String noiDen = String.valueOf(cbb_noiDen.getSelectedItem());
        String ma_NoiDi = convertStationNametoStationNo(noiDi);
        String ma_NoiDen = convertStationNametoStationNo(noiDen);
        String[] listGaraName = new String[100];
        listGaraName = searchGaraName(ma_NoiDi, ma_NoiDen);
        for (int i=0;i<=100;i++){
            if (listGaraName[i]!=null){
                cbb_tripName.addItem(listGaraName[i]);
            }else break;  
        }
    }//GEN-LAST:event_cbb_tripNameMouseClicked
    public String[] searchTime(String garaName){
        String[] listTime = new String[100];
        int d = 0;
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql ="select DepartTime from ScheduelOfGara where GaraName ='"+garaName+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listTime[d] = rs.getString("DepartTime");
                d++;
            }
        } catch (Exception e) {
            System.out.println("loi searchTime"+e);
        }
        return listTime;
    }
    private void cbb_bookTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_bookTimeMouseClicked
        cbb_bookTime.removeAllItems();
        String GaraName = String.valueOf(cbb_tripName.getSelectedItem());
        String[] listTime = searchTime(GaraName);
        for (int i = 0;i<=100;i++){
            if (listTime[i]!= null){
                cbb_bookTime.addItem(listTime[i]);
            }else break;
        }
    }//GEN-LAST:event_cbb_bookTimeMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       this.setVisible(false);
       ManageTicket mt = new ManageTicket();
        mt.setLocationRelativeTo(null);
        mt.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(OrderTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_order;
    private javax.swing.JCheckBox cb_isPaid;
    private javax.swing.JComboBox<String> cbb_bookTime;
    private javax.swing.JComboBox<String> cbb_noiDen;
    private javax.swing.JComboBox<String> cbb_noiDi;
    private javax.swing.JComboBox<String> cbb_seat;
    private javax.swing.JComboBox<String> cbb_seatKind;
    private javax.swing.JComboBox<String> cbb_tripName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_firstName;
    private javax.swing.JLabel label_lastName;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextArea txt_note;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_staffCMND;
    // End of variables declaration//GEN-END:variables
}