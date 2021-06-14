/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;


import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huynh
 */
public class InventoryProfit extends javax.swing.JFrame {
    DefaultTableModel dtf; 
    /**
     * Creates new form Inventory
     */
    public InventoryProfit() {
        initComponents();
        
        DatVeXe datvexe = new DatVeXe(); 
        Connection connection;
        connection = datvexe.layKetNoi();
        showDetail(dtf, connection);
        System.out.println("vao day + 34");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProfit = new javax.swing.JTable();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("THỐNG KÊ DOANH THU");

        tbProfit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nhà xe", "Số vé bán ra ", "Doanh thu"
            }
        ));
        jScrollPane1.setViewportView(tbProfit);

        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExit)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InventoryProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryProfit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryProfit().setVisible(true);
            }
        });
    }
    public void showDetail(DefaultTableModel dtf, Connection conn){
        dtf = new DefaultTableModel();
        ListSelectionModel listSelectionModel = tbProfit.getSelectionModel(); 
        listSelectionModel.setSelectionMode(listSelectionModel.SINGLE_SELECTION);
        tbProfit.setModel(dtf);
        
        System.out.println(" vào day 150");
        dtf.addColumn("Tên nhà xe");
        dtf.addColumn("Số vé bán ra");
        dtf.addColumn("Doanh thu");
        
        String sql = "select * from Gara";
        String sql2 = "select * from ScheduleOfGara where Gara_Name=?";
        String sql3 = "select * from Trip where TripOfGara_no=?";
        String sql4 = "select count (*) from Ticket where Trip_No=?";
        
        PreparedStatement pstt;
        PreparedStatement pstt2;
        PreparedStatement pstt3;
        PreparedStatement pstt4;
        try {
            pstt = conn.prepareStatement(sql);
            ResultSet rs = pstt.executeQuery();
            while(rs.next()){
                
                //in ra tam thoi: 
                String garaname = rs.getString(1);
                int totalOfTicket =0; 
                float profit = 0; 
                int ticketPrice= 0; 
                float percentProfit =  0.05f; 
                String garapicture = rs.getString(2); 
                String review = rs.getString(3);
                
                //
                
                pstt2 = conn.prepareStatement(sql2);
                pstt2.setString(1, garaname);
                ResultSet rs2 = pstt2.executeQuery();
                while(rs2.next()){
                   
                    String tripOfGaraNo = rs2.getString(1);
                   
                     ticketPrice = rs2.getInt(6);
                    pstt3 = conn.prepareStatement(sql3);
                    pstt3.setString(1, tripOfGaraNo);
                   ResultSet rs3 = pstt3.executeQuery();
                   while(rs3.next()){
                       
                       String tripNo = rs3.getString(1);
//                       System.out.println(rs3.getString(1)+"-"+rs3.getString(2));
                        pstt4 = conn.prepareStatement(sql4);
                        pstt4.setString(1,tripNo);
                        ResultSet rs4 = pstt4.executeQuery();
                        while(rs4.next()){
                            int quantity = rs4.getInt(1);
//                            System.out.println(garaname+"-"+quantity);
                            totalOfTicket+=quantity;
                            profit +=  quantity*ticketPrice*percentProfit;
                           
                        }
                   }
                }
                
                //tam thoi: 
                dtf.addRow(new Object[]{garaname,totalOfTicket,profit});
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(InventoryProfit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProfit;
    // End of variables declaration//GEN-END:variables
}
