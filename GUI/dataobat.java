/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik.GUI;


import apotik.kategoriObat;
import apotik.konekDB;
import static apotik.konekDB.config;
import apotik.obatdata;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dinda
 */
public class dataobat extends javax.swing.JFrame {
   DefaultTableModel tab;
    obatdata m = new obatdata();
    List<obatdata> dataObat = new ArrayList<>();
    kategoriObat km=new kategoriObat();
    List<kategoriObat> dataKategori=new ArrayList<>();
    Connection con= konekDB.config();
    Statement st;
    ResultSet rs;
    
    /**
     * Creates new form kasir
     */
    public dataobat() {
        initComponents();
        this.setExtendedState(dataobat.MAXIMIZED_BOTH);
        reset();
        siapIsi(false);
        Tambah.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
       
        //isiKategori();
        buatTabel();
        tampilTabel();
        id.setVisible(true);
        tampilCombo();
        setLocationRelativeTo(null);
//        buatTabelkategori();
//        tampilTabelkategori();
    }

        private void siapIsi(boolean x) {
        id.setEnabled(x);
        namaobat.setEnabled(x);
        carpengg.setEnabled(x);
        dessk.setEnabled(x);
        ef.setEnabled(x);
        harga.setEnabled(x);
        stok.setEnabled(x);
        
        
    }
        
      private void tampilCombo(){ 
          try{
              String sql = "select nama from kategori";
              st=con.createStatement();
              rs= st.executeQuery(sql);
              
              while(rs.next()){
                  String name = rs.getString("nama");
             
                  combokat.addItem(name);
              }
          }catch(Exception e){
              
          }
      }

    private void buatTabel() {
        tab = new DefaultTableModel(); // deklarasi untuk membuat data
        tab.addColumn("ID");
        tab.addColumn("Nama Obat");
        tab.addColumn("Cara Penggunaan");
        tab.addColumn("Deskripsi");
        tab.addColumn("Efek");
        tab.addColumn("Harga");
        tab.addColumn("Stok");
        tab.addColumn("kategori");
        
       
        tabeldataobat.setModel(tab);
        //Untuk mengatur lebar kolom
        tabeldataobat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);                
        tabeldataobat.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabeldataobat.getColumnModel().getColumn(1).setPreferredWidth(100);        
        tabeldataobat.getColumnModel().getColumn(2).setPreferredWidth(125); 
        tabeldataobat.getColumnModel().getColumn(3).setPreferredWidth(125); 
        tabeldataobat.getColumnModel().getColumn(4).setPreferredWidth(125);
        tabeldataobat.getColumnModel().getColumn(5).setPreferredWidth(65);        
        tabeldataobat.getColumnModel().getColumn(6).setPreferredWidth(65); 
        tabeldataobat.getColumnModel().getColumn(7).setPreferredWidth(75);         
                
         
    }

    private void tampilTabel() {
        tab.getDataVector().removeAllElements(); // kalau tidak pakai ini data akan double
       tab.fireTableDataChanged();
       dataObat.clear();
        dataObat = m.tampil();
        for (int x = 0; x < dataObat.size(); x++) {
            Object[] data = new Object[8]; // anggap x baris
            data[0] = dataObat.get(x).getid();
            data[1] = dataObat.get(x).getNamaobat();
            data[2] = dataObat.get(x).getCaraPenggunaan();
            data[3] = dataObat.get(x).getDeskripsi();
            data[4] = dataObat.get(x).getEfek();
            data[5] = dataObat.get(x).getHarga();
            data[6] = dataObat.get(x).getstok();
            data[7] = dataObat.get(x).getnamakategori();
            tab.addRow(data);
        }
    }
      
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sfdg = new javax.swing.JLabel();
        sdfdg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        namaobat = new javax.swing.JTextField();
        carpengg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dessk = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ef = new javax.swing.JTextArea();
        harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldataobat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combokat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 190, 90));

        sfdg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sfdg.setText("ID");

        sdfdg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sdfdg.setText("Nama Obat");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cara Penggunaan");

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        namaobat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        carpengg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carpengg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpenggActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Deskripsi");

        dessk.setColumns(20);
        dessk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dessk.setRows(5);
        jScrollPane2.setViewportView(dessk);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Efek Samping");

        ef.setColumns(20);
        ef.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ef.setRows(5);
        jScrollPane3.setViewportView(ef);

        harga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tabeldataobat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabeldataobat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabeldataobat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataobatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldataobat);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/images/barusmall.png"))); // NOI18N

        Tambah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Kembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Stok");

        stok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Kategori");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("DATA OBAT");

        combokat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Tambah)
                                .addGap(18, 18, 18)
                                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 108, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(sdfdg)
                                            .addComponent(sfdg)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(carpengg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                            .addComponent(stok, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(harga, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaobat, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combokat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sfdg))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(sdfdg))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(namaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(carpengg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combokat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabeldataobatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataobatMouseClicked
       
        int baris= tabeldataobat.getSelectedRow();
             TableModel model = tabeldataobat.getModel();
               
            id.setText(model.getValueAt(baris, 0).toString());
            namaobat.setText(model.getValueAt(baris, 1).toString());
            carpengg.setText(model.getValueAt(baris, 2).toString());
            dessk.setText(model.getValueAt(baris, 3).toString());
            ef.setText(model.getValueAt(baris, 4).toString());
            harga.setText(model.getValueAt(baris, 5).toString());
            stok.setText(model.getValueAt(baris, 6).toString());
            String kat = model.getValueAt(baris, 7).toString();
            Tambah.setText("Tambah");
            edit.setText("Edit");
            Tambah.setEnabled(true);
            simpan.setEnabled(false);
            hapus.setEnabled(true);
            edit.setEnabled(true);
       
    }//GEN-LAST:event_tabeldataobatMouseClicked

    private void carpenggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpenggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carpenggActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
         dispose();
        halamanAdmin a = new halamanAdmin();
        dispose();
        a.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        if (Tambah.getText().equalsIgnoreCase("tambah")) {
            Tambah.setText("Batal");
              reset();
            siapIsi(true);
            Tambah.setEnabled(true);
            simpan.setEnabled(true);
            hapus.setEnabled(false);
            edit.setEnabled(false);
         } else {
            Tambah.setText("Tambah");
              reset();
            siapIsi(false);
            Tambah.setEnabled(true);
            simpan.setEnabled(false);
            hapus.setEnabled(false);
            edit.setEnabled(false);
           }

        // TODO add your handling code here:
    }//GEN-LAST:event_TambahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
    
        if (id.getText().isEmpty() || namaobat.getText().isEmpty()
                || carpengg.getText().isEmpty() || dessk.getText().isEmpty()
                || harga.getText().isEmpty() || stok.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lengkapi inputan ");
        } else {
            String kat = combokat.getSelectedItem().toString();
            m.setid(id.getText());
            m.setNamaobat(namaobat.getText());
            m.setCaraPenggunaan(carpengg.getText());
            m.setDeskripsi(dessk.getText());
            m.setEfek(ef.getText());
            m.setHarga(harga.getText());
            m.setstok(stok.getText());
            m.setnamakategori(kat);
            if (Tambah.getText().equalsIgnoreCase("batal")) {
                m.tambah();
            } else if (edit.getText().equalsIgnoreCase("batal")) {
                m.setNamaobat(namaobat.getText());
                m.edit();
            }
              reset();
            siapIsi(false);
            tampilTabel();
            Tambah.setEnabled(  true); 
            simpan.setEnabled(false);
            hapus.setEnabled(false);
            edit.setEnabled(false);
           
            Tambah.setText("Tambah");
            edit.setText("Edit");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int baris=tabeldataobat.getSelectedRow();  
        m.setid(tabeldataobat.getModel().getValueAt(baris, 0).toString());
        m.hapus();
        reset();
        tampilTabel(); // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       if (edit.getText().equalsIgnoreCase("edit")) {
            edit.setText("Batal");            
            siapIsi(true);
           id.setEditable(false);
            Tambah.setEnabled(false);
            simpan.setEnabled(true);
            hapus.setEnabled(false);
            edit.setEnabled(true);
            
        } else {
            edit.setText("Edit");
         id.setEnabled(false);
            siapIsi(false);
            Tambah.setEnabled(true);
            simpan.setEnabled(false);
            hapus.setEnabled(false);
            edit.setEnabled(true);
           }
// TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    
     private void reset(){
        id.setText("");
        namaobat.setText("");
         
        carpengg.setText("");
        dessk.setText("");
        ef.setText("");
        harga.setText("");
        stok.setText("");
       
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataobat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataobat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Tambah;
    private javax.swing.JTextField carpengg;
    private javax.swing.JComboBox<String> combokat;
    private javax.swing.JTextArea dessk;
    private javax.swing.JButton edit;
    private javax.swing.JTextArea ef;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField namaobat;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sdfdg;
    private javax.swing.JLabel sfdg;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tabeldataobat;
    // End of variables declaration//GEN-END:variables
}
