/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenyewaanstudiomgrproud;

/**
 *
 * @author aryos
 */
import java.sql.*;
import javax.swing.*;

public class koneksi {

    private Connection koneksi;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //** driver mysql
            System.out.println("Berhasil Konek");
        } catch (ClassNotFoundException e) {
            System.out.println("Gagal Konek " + e);
        }
        String url = "jdbc:mysql://localhost:3306/penyewaanstudiomgrproud";
        try {
            koneksi = DriverManager.getConnection(url, "root", ""); //** user dan pass yang harus dibuat dengan privili
            System.out.println("Connection Established");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return koneksi;
    }
}
