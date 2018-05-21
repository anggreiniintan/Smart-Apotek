/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
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
public class kasir  {
    private String id, namaobat, harga, tanggal;
   konekDB db = null;
    
   public kasir(){
       db=new konekDB();
   }
   
   
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
  
     
    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id=id;
    }
  
    public String getNamaobat(){
        return namaobat;
    }
    
    public void setNamaobat(String namaobat){
        this.namaobat=namaobat;
    }
   
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String Harga){
        this.harga=Harga;
    }
   
    public void printStruk(DataBeanList dataBeanList, int totalharga){
        String sourceFileName = "./src/apotek/images/report1.jasper";
        ArrayList<DataBean> dataList = dataBeanList.getDataBeanList();

        JRBeanCollectionDataSource beanColDataSource =
        new JRBeanCollectionDataSource(dataList);

        Map parameters = new HashMap();
        parameters.put("ReportTitle", "Smart Apotek");
        parameters.put("totalharga", totalharga);

            try {
                File report = new File(sourceFileName);
                JasperReport jreprt = (JasperReport)JRLoader.loadObject(report);
          JasperPrint jprintt = JasperFillManager.fillReport(jreprt, parameters,beanColDataSource);
          JasperViewer.viewReport(jprintt,false);
               JasperFillManager.fillReportToFile(
               sourceFileName, parameters, beanColDataSource);
            } catch (JRException e) {
               e.printStackTrace();
            }
          }
     private List tampil(){
        List<obatdata> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql= "SELECT * FROM dataobat";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                obatdata bm=new obatdata();
                bm.setid(rs.getString("id"));
                bm.setNamaobat(rs.getString("nama_obat"));
                bm.setHarga(rs.getString("harga"));
                
               data.add(bm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tampil data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
