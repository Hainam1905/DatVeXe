/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datvexe;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vanic
 */
public class DatVeXe{
    
    public static Connection layKetNoi(){
        Connection ketNoi = null;
        String url ="jdbc:sqlserver://;databaseName=QLyDatXe";
        String user = "sa";
        String password = "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(url, user, password);
            System.out.println("sucess connection");
        } catch (Exception e) {
            System.out.println("loi ket noi"+e);
        }
        return ketNoi;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here jdbc:sqlserver://;databaseName=QLyDatXe
        //layKetNoi();
        Login login = new Login(); 
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
