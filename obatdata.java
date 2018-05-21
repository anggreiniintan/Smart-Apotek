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
public class obatdata extends Obat {
    private String id, namaobat, stok,cara_penggunaan,namakategori, deskrips, efek, harga,nama;
   konekDB db = null;
    public obatdata(){
        db=new konekDB();
    }
    
    
    public String getNamaobat(){
        return namaobat;
    }
    
    public void setNamaobat(String namaobat){
        this.namaobat=namaobat;
    }
    
    
    public String getstok(){
        return stok;
    }
    
    public void setstok(String stok){
        this.stok=stok;
    }
    
    
    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id=id;
    }
   
     
    public String getnamakategori(){
        return namakategori;
    }
    
    public void setnamakategori(String Nkategori){
        this.namakategori=Nkategori;
    }
   
    
    public String getCaraPenggunaan(){
        return cara_penggunaan;
    }
    
    public void setCaraPenggunaan(String cara_penggunaan){
        this.cara_penggunaan=cara_penggunaan;
    }
    
    public String getDeskripsi(){
        return deskrips;
    }
    
    public void setDeskripsi(String Deskripsi){
        this.deskrips=Deskripsi;
    }
    
    public String getEfek(){
        return efek;
    }
    
    public void setEfek(String efek){
        this.efek=efek;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String Harga){
        this.harga=Harga;
    }

    
    public void tambah(){        
        String sql="INSERT INTO dataobat VALUES ("+id+", '"+namaobat+"','"+cara_penggunaan+
                "','"+deskrips+"','"+efek+"',"+harga+","+stok+",'"+namakategori+"')";
               db.simpanData(sql);
     
    }
    
    public void edit(){
        String sql="UPDATE dataobat SET nama_obat='"+namaobat+
                "', cara_penggunaan='"+cara_penggunaan+
                "',deskripsi='"+deskrips+"',efek='"+efek
                   +"',harga="+harga+",nama='"+namakategori
                   +"' WHERE id="+id;
        db.simpanData(sql);
        
    }
    
    
    public void hapus(){
        String sql="DELETE FROM dataobat WHERE id="+id;
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }
    
     @Override
    public List tampil(){
        List<obatdata> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql= "SELECT * FROM dataobat";
           // String sql="SELECT dataobat.*,kategori.* FROM dataobat inner join KATEGORI on dataobat.id_kategori=KATEGORI.id_kategori ORDER BY dataobat.ID DESC";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                obatdata bm=new obatdata();
                bm.setid(rs.getString("id"));
                bm.setNamaobat(rs.getString("nama_obat"));
                bm.setCaraPenggunaan(rs.getString("cara_penggunaan"));
                bm.setDeskripsi(rs.getString("deskripsi"));
                bm.setEfek(rs.getString("efek"));
                bm.setHarga(rs.getString("harga"));
                bm.setstok(rs.getString("stok"));
                bm.setnamakategori(rs.getString("nama"));
//                bm.setnamakategori(rs.getString("kategori.nama"));
               data.add(bm);
            }               
            
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tampil data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }
   
    

}
