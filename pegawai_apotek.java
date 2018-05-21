/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author User
 */
public class pegawai_apotek  {
    
    public String name;
    public String usename;
    public String alamat;
    public String pasw, hakakses;
    
    konekDB db = null;
    
    public pegawai_apotek(){
        db=new konekDB();
    }
    
    public String getnama(){
        return name;
    }
   
    public void setnama(String Nama){
        this.name=Nama;
    }
    
    public String getUsername(){
        return usename;
    }
   
    public void setUser(String USername){
        this.usename=USername;
    }
    
    public String getalamat(){
        return alamat;
    }
   
    public void setAlamat(String Alamat){
        this.alamat=Alamat;
    }
    
    
    public String getPW(){
        return pasw;
    }
   
    public void setPW(String Pw){
        this.pasw=Pw;
    }
    
    
    public String getHakAkses(){
        return hakakses;
    }
   
    public void setHakAkses(String Akses){
        this.hakakses=Akses;
    }
    
    
    public List cariLogin(String user,String pass){
        List<pegawai_apotek> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * FROM daftar WHERE USERNAME='"+user+"' AND PW='"+pass+"'";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                pegawai_apotek pm=new pegawai_apotek();
                pm.setnama(rs.getString("nama_lengkap"));
                pm.setUser(rs.getString("username"));
                pm.setPW(rs.getString("pw"));
                pm.setAlamat(rs.getString("alamat"));
                 pm.setHakAkses(rs.getString("hakakses"));
                data.add(pm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Login gagal, Pesan Error : \n"+x);
        }        
        return data;
    }     
  
 
}
