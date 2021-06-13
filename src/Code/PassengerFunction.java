/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PassengerFunction {
    private String phoneNumber;
    private String account;
    private String firstName;
    private String lastName;
    private String email;

    public PassengerFunction(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        LoadPassenger();
    }
    
    private void LoadPassenger() {
        Connection conn = datvexe.DatVeXe.layKetNoi();
        String sql = "SELECT * FROM Passenger P WHERE P.Passenger_SDT = '" + this.phoneNumber + "'";
        
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()) {
                this.firstName = rs.getString(2);
                this.lastName = rs.getString(3);
                this.email = rs.getString(4);
                this.account = rs.getString(5);
            }
            
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            Logger.getLogger(PassengerFunction.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void EditInfor(String firstName, String lastName, String email) {
        Connection connect=datvexe.DatVeXe.layKetNoi();
        String sql = "UPDATE PASSENGER SET Passenger_Email = ?, Passenger_First_Name = ?, Passenger_Last_Name = ? WHERE Passenger_SDT = '" + phoneNumber + "'";
        
        try {
            PreparedStatement ps=connect.prepareStatement(sql);
            //ps.setString(1, account);
            ps.setString(1, email);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.executeUpdate();
            
            ps.close();
            connect.close();
        } catch (Exception e) {
            Logger.getLogger(PassengerFunction.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void DeletePassenger() {
        Connection con =datvexe.DatVeXe.layKetNoi();
        String sql="DELETE FROM Passenger WHERE Passenger_SDT = '" + phoneNumber + "'";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.executeUpdate();
            
            ps.close();
            con.close();
        } catch (Exception e) {
            Logger.getLogger(PassengerFunction.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
