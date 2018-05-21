/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class konekDB {
     static Statement ConnecrDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Connection con;
    public static Statement stm = null;
    private String url;
    private Statement user;
    
    public static Connection config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
        return con;
    }
     public static void insert(String id, String totharga){
         
        String query = "INSERT INTO pembukuan VALUES('"+
                id+"', '"+totharga+"', "+"now())";
        konekDB.exec(query);
        
    }
    
    public static void exec(String query){
        try{
            stm = (Statement) con.createStatement();
            int rowsEffected = stm.executeUpdate(query);
            System.out.println(rowsEffected+"baris data berubah");
        }catch (Exception e) {
            System.out.println("exec salah");
            System.out.println("salah : "+e);
                    
        }
    }
    
    
    public ResultSet ambilData(String sql){
        ResultSet rs=null;
        try{
            config();
            rs=stm.executeQuery(sql);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Ambil Data Gagal, Pesan error : \n"+x);
        }
        return rs;
    }
    
      public void simpanData(String sql){
        try{            
            config();
            stm.executeUpdate(sql);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Simpan Data Gagal, Pesan error : \n"+x);
             }
        }
      
      public void tutupKoneksi(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
            stm.close();
            con.close();
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"Tutup Koneksi Gagal, Pesan error \n"+x);
        }
    }
}
