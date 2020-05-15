/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programcovid19;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HAFIDH RIDWAN FAKHRUDDIN
 */
public class sambungan {
    static Connection Koneksi;
    public static Connection getConnection(){
        try{
            Koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbresponsipbo","root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database Connection Failed");
        }
        return Koneksi;
    }
}
