/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Aang
 */
public class Pembukuan {
    private String id, tanggal, harga;
    konekDB db = null;
    Statement st;
    Connection con;
    
    public Pembukuan(){
           db=new konekDB();
    }
   
     
    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id=id;
    }
  
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
   
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String Harga){
        this.harga=Harga;
    }
   
   
     public List tampil() throws SQLException{
        List<kasir> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql= "SELECT * FROM pembukuan";
            st=con.createStatement();
            rs=db.ambilData(sql);
             int no = 0;           
            while(rs.next()){                   
                no++;
               kasir kasir =  new kasir();
               kasir.setid(rs.getString("id"));
               kasir.setHarga(rs.getString("total_harga"));
               kasir.setTanggal(rs.getString("tanggal_masuk"));
               
               data.add(kasir);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tam"
                    + "pil data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }
   
    
     public void printStruk(){
       String sourceFileName = "./src/apotek/images/pengeluaranbarang.jasper";
       konekDB db = new konekDB();
        /**
         * Passing ReportTitle and Author as parameters
         */
       
            try {
                Map parameters = new HashMap();
                File report = new File(sourceFileName);
                JasperReport jreprt = (JasperReport)JRLoader.loadObject(report);
          JasperPrint jprintt = JasperFillManager.fillReport(jreprt, parameters, db.config());
          JasperViewer.viewReport(jprintt, true);
            } catch (JRException e) {
               e.printStackTrace();
            }
          }  

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     }
    

