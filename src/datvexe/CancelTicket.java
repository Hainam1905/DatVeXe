/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vanic
 */
public class CancelTicket extends javax.swing.JFrame {

    /**
     * Creates new form CancelTicket
     */
    public String sdt = "";
    public CancelTicket(String sdt) {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.sdt = sdt;
        getData(sdt);
    }

    public void getData(String sdt){
        DefaultTableModel dtm = (DefaultTableModel) table_listTicket.getModel();
        dtm.setNumRows(0);
        Vector vt;
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql = "select * from Ticket where Passenger_SDT ='"+sdt+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getString("Ticket_No"));
                vt.add(rs.getString("Seat_Position"));
                vt.add(rs.getString("Seat_Kind"));
                vt.add(rs.getString("Is_Paid"));
                vt.add(rs.getString("Passenger_Note"));
                vt.add(rs.getString("Book_Time"));
                vt.add(rs.getString("Staff_CMND"));
                vt.add(rs.getString("Passenger_SDT"));
                vt.add(rs.getString("Trip_No"));
                dtm.addRow(vt);
            }
        } catch (Exception e) {
            System.out.println("loi getData"+e);
        }
        table_listTicket.setModel(dtm);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cancelTicket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_listTicket = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_cancelTicket.setBackground(new java.awt.Color(0, 0, 255));
        btn_cancelTicket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cancelTicket.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelTicket.setText("Hủy vé");
        btn_cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelTicket);
        btn_cancelTicket.setBounds(960, 590, 140, 40);

        table_listTicket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table_listTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã số vé", "Vị trí ghế", "Loại ghế", "Thanh toán", "Lưu ý của khách hàng", "Thời gian xe chạy", "CMND của nhân viên", "SĐT của khách hàng", "Mã chuyến đi"
            }
        ));
        jScrollPane1.setViewportView(table_listTicket);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 222, 1040, 340);

        btn_back.setBackground(new java.awt.Color(0, 0, 255));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Trở về");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(980, 70, 130, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Danh sách vé của hành khách:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 160, 210, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/iconTong.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 20, 160, 123);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/BackGround.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void deleteTicket(String ticket_No){
        Connection ketNoi = DatVeXe.layKetNoi();
        String sql = "delete from Ticket where Ticket_No ='"+ticket_No+"'";
        try {
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi deleteTicket");
        }
    }
    private void btn_cancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelTicketActionPerformed
        int row = table_listTicket.getSelectedRow();
        if (row != -1){
            String ticket_No = String.valueOf(table_listTicket.getValueAt(row, 0));
            String dateTicket = String.valueOf(table_listTicket.getValueAt(row, 5));
            LocalDateTime today = LocalDateTime.now();
            String now = String.valueOf(today);
            now = now.substring(0,10)+" "+ now.substring(11,19);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d2 = null;
            Date d1 = null;
            try {
                d2 = format.parse(dateTicket);
                d1 = format.parse(now);
            } catch (Exception e) {
            }
            long diff = d2.getTime() - d1.getTime();
            long diffMinutes = diff / (60 * 1000);
            if (diffMinutes >= 0 && diffMinutes <= 30){
                JOptionPane.showMessageDialog(this, "Phải hủy vé trước khi xe chạy 30 phút","Inane Error",JOptionPane.ERROR_MESSAGE);
            }else{
                deleteTicket(ticket_No);
                JOptionPane.showMessageDialog(this, "Đã hủy vé thành công");
                getData(sdt);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Hãy chọn vé muốn hủy trên bảng vé","Inane Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_cancelTicketActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.setVisible(false);
        ManageTicket m = new ManageTicket();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
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
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelTicket("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancelTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_listTicket;
    // End of variables declaration//GEN-END:variables
}
