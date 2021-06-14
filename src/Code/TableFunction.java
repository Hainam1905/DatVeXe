/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import javax.swing.JTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class TableFunction {
    //Load data from database to table
    public void LoadData(JTable tb, String sql) {
        DefaultTableModel dtm = (DefaultTableModel)tb.getModel();
        dtm.setNumRows(0);
        
        Connection conn = datvexe.DatVeXe.layKetNoi();
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Vector vt;
            
            while(rs.next()) {
                vt = new Vector();
                for (int i = 1; i <= tb.getColumnCount(); i++) {
                    vt.add(rs.getString(i));
                }
                
                dtm.addRow(vt);
            }
            
//            if(dtm.getRowCount()==0){
//                vt=new Vector();
//                for(int i=1;i<=dtm.getColumnCount();i++){
//                    if(i==dtm.getColumnCount()/2){
//                        vt.add("(Trống)");
//                    }
//                    else vt.add("");
//                    }
//                dtm.addRow(vt);
//            }
            
            tb.setModel(dtm);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("lỗi kết nối database đến bảng");
        }
    }
    
    public String selectRow(JTable tb, int numRow) {
        try {
            return tb.getValueAt(tb.getSelectedRow(), numRow).toString();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
