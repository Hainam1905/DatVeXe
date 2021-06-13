/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_listTicket = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_cancelTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_listTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket_No", "Seat_Position", "Seat_Kind", "Is_Paid", "Passenger_Note", "Book_Time", "Staff_CMND", "Passenger_SDT", "Trip_No"
            }
        ));
        jScrollPane1.setViewportView(table_listTicket);

        jLabel1.setText("Danh sách vé của hành khách ");

        btn_back.setText("<");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_cancelTicket.setText("Hủy vé");
        btn_cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelTicketActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_back)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cancelTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelTicket)
                .addGap(7, 7, 7))
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
            deleteTicket(ticket_No);
            JOptionPane.showMessageDialog(this, "Đã hủy vé thành công");
            getData(sdt);
            
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_listTicket;
    // End of variables declaration//GEN-END:variables
}
