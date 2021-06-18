/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;

import java.sql.Connection;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author huynh
 */
public class CenSorTrip extends javax.swing.JFrame {
        DefaultTableModel dtf ;
    /**
     * Creates new form CencorTrip
     */
    public CenSorTrip() {
        initComponents();
        
        DatVeXe datvexe = new DatVeXe(); 
        Connection connection;
        connection = datvexe.layKetNoi();
        performed(dtf, connection);
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
        btDelete = new javax.swing.JButton();
        btAgree = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTrip = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        btDelete.setBackground(new java.awt.Color(0, 0, 255));
        btDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setText("Xóa");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btDelete);
        btDelete.setBounds(890, 630, 160, 40);

        btAgree.setBackground(new java.awt.Color(0, 0, 255));
        btAgree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btAgree.setForeground(new java.awt.Color(255, 255, 255));
        btAgree.setText("Phê duyệt");
        btAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgreeActionPerformed(evt);
            }
        });
        jPanel1.add(btAgree);
        btAgree.setBounds(560, 630, 160, 40);

        btExit.setBackground(new java.awt.Color(0, 0, 255));
        btExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btExit.setForeground(new java.awt.Color(255, 255, 255));
        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        jPanel1.add(btExit);
        btExit.setBounds(200, 630, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PHÊ DUYỆT CHUYẾN XE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 72, 330, 60);

        tbTrip.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbTrip.setForeground(new java.awt.Color(0, 0, 255));
        tbTrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã chuyến", "Tên nhà xe", "Nơi đi", "Nơi đến", "Ngày đi trong tuần", "Thời gian khởi hành", "Giá vé", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbTrip);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 1240, 410);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgreeActionPerformed
        if(tbTrip.getSelectedRow()==-1) return; 
        
        DatVeXe datvexe = new DatVeXe(); 
        Connection connection;
        connection = datvexe.layKetNoi();
       String tripNo = (String) tbTrip.getValueAt(tbTrip.getSelectedRow(), 0);
       String garaName = (String) tbTrip.getValueAt(tbTrip.getSelectedRow(), 1);
       
        int x = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn phê duyệt chuyến xe: "+tripNo+" của nhà xe "+garaName, "Phê duyệt chuyến xe", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Thao tác đã bị hủy");
            return;
           
        }else if(x==JOptionPane.YES_OPTION){
            String sql = "update ScheduleOfGara set AdminChecked = 'true' where TripOfGara_no=?";
            PreparedStatement pstt;
            try {
                pstt = connection.prepareStatement(sql);
                pstt.setString(1, tripNo);
                int result = pstt.executeUpdate();
                if(result>0){
                    JOptionPane.showMessageDialog(rootPane, "Phê duyệt chuyến xe thành công!");
                    performed(dtf, connection);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CenSorTrip.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_btAgreeActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(tbTrip.getSelectedRow()==-1) return; 
        
        DatVeXe datvexe = new DatVeXe(); 
        Connection connection;
        connection = datvexe.layKetNoi();
       String tripNo = (String) tbTrip.getValueAt(tbTrip.getSelectedRow(), 0);
       String garaName = (String) tbTrip.getValueAt(tbTrip.getSelectedRow(), 1);
       
        int x = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn xóa chuyến xe: "+tripNo+" của nhà xe "+garaName, "Xóa chuyến xe", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Thao tác đã bị hủy");
            return;
           
        }else if(x==JOptionPane.YES_OPTION){
            String sql = "delete ScheduleOfGara where TripOfGara_no=?";
            PreparedStatement pstt;
            try {
                pstt = connection.prepareStatement(sql);
                pstt.setString(1, tripNo);
                int result = pstt.executeUpdate();
                if(result>0){
                    JOptionPane.showMessageDialog(rootPane, "Đã xóa chuyến xe!");
                    performed(dtf, connection);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CenSorTrip.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(CenSorTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CenSorTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CenSorTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CenSorTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CenSorTrip().setVisible(true);
            }
        });
    }
    public void performed(DefaultTableModel dtf, Connection conn){
        dtf =new DefaultTableModel();
        ListSelectionModel listSelectionModel = tbTrip.getSelectionModel(); 
        listSelectionModel.setSelectionMode(listSelectionModel.SINGLE_SELECTION);
        tbTrip.setModel(dtf);
        
        dtf.addColumn("Mã chuyến");
        dtf.addColumn("Tên nhà xe");
        dtf.addColumn("Nơi đi");
        dtf.addColumn("Nơi đến");
        dtf.addColumn("Ngày đi trong tuần");
        dtf.addColumn("Thời gian khởi hành");
        dtf.addColumn("Giá vé");
        dtf.addColumn("Trạng thái");
        
        
        String sql = "select * from ScheduleOfGara where ScheduleOfGara.AdminChecked='false'";
            try {
                PreparedStatement pstt = conn.prepareStatement(sql);
                ResultSet rs = pstt.executeQuery(); 
                String tripNo = "";
                String garaName = "";
                String begin = "temp";
                String scheduleNo = "";
                String end = "temp";
                int dayOfWeek = 0;
                Date date = null; 
                int ticketPrice = 0; 
                String statement = "Chờ phê duyệt";
                
                while(rs.next()){
                    tripNo = rs.getString(1);
                    garaName = rs.getString(2);
//                    begin = rs.getString(3);
//                    end = rs.getString(4);
                    scheduleNo = rs.getString(3);
                    dayOfWeek = rs.getInt(4);
                    date = rs.getTime(5);
                    ticketPrice = rs.getInt(6);
                    
                    
                    String sql2 = "select Station.station_Name from Station,TotalScheduels,ScheduleOfGara where ScheduleOfGara.Schedule_no = TotalScheduels.SChedule_no and TotalScheduels.BeginStation = Station.station_No and ScheduleOfGara.Schedule_no=?";
                    PreparedStatement pstt2 = conn.prepareStatement(sql2);
                    pstt2.setString(1, scheduleNo);
                    ResultSet rs2 = pstt2.executeQuery();
                    while(rs2.next()){
                        begin  = rs2.getString(1);
                    }
                    
                    
                    String sql3 = "select Station.station_Name from Station,TotalScheduels,ScheduleOfGara where ScheduleOfGara.Schedule_no = TotalScheduels.SChedule_no and TotalScheduels.EndStation = Station.station_No and ScheduleOfGara.Schedule_no=?";
                    PreparedStatement pstt3 = conn.prepareStatement(sql3);
                    pstt3.setString(1, scheduleNo);
                    ResultSet rs3 = pstt3.executeQuery();
                    while(rs3.next()){
                        end  = rs3.getString(1);
                        System.out.println(end);
                    }
                    
                    
                    dtf.addRow(new Object[]{tripNo,garaName,begin,end,dayOfWeek,date,ticketPrice,statement});
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CenSorTrip.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgree;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTrip;
    // End of variables declaration//GEN-END:variables
}
