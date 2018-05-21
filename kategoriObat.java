/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class kategoriObat extends Obat {
    String id, nama;
    konekDB db=null;
    
    public kategoriObat(){
        db=new konekDB();
    }
    
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
   
    public void tambah(){        
        String sql="INSERT INTO KATEGORI VALUES ("+id+", '"+nama+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
     public void edit(){
        String sql="UPDATE KATEGORI SET NAMA='"+nama+"' WHERE "
                + "id_kategori="+id;
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }
    
    public void hapus(){
        String sql="DELETE FROM KATEGORI WHERE id_kategori="+id;
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }
    
    @Override
    public List tampil(){
        List<kategoriObat> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * FROM KATEGORI";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                kategoriObat km=new kategoriObat();
                km.setId(rs.getString("id_kategori"));
                km.setNama(rs.getString("nama"));
                data.add(km);
            }               
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tampil data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }

    
}
