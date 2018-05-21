/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotik.GUI;

import apotik.konekDB;
import static apotik.konekDB.con;
import apotik.obatdata;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Aang
 */
public class tampilanUSer extends javax.swing.JFrame {
    DefaultTableModel tab;
    obatdata m = new obatdata();
    List<obatdata> dataObat = new ArrayList<>();
     Statement st;
    ResultSet rs;
    konekDB db = new konekDB();

    
    /**
     * Creates new form kasir
     */
    public tampilanUSer() {
        initComponents();
        this.setExtendedState(tampilanUSer.MAXIMIZED_BOTH);
       
        //isiKategori();
        buatTabel();
        tampilTabel();
        id.setVisible(true);
        setLocationRelativeTo(null);
        db.config();
    }

    private void buatTabel() {
        tab = new DefaultTableModel();
        tab.addColumn("ID");
        tab.addColumn("Nama Obat");
        tab.addColumn("Cara Penggunaan");
        tab.addColumn("Deskripsi");
        tab.addColumn("Efek");
        tab.addColumn("Harga");
        tab.addColumn("Stok");
        tab.addColumn("kategori Id");
        
       
        tabeldataobat.setModel(tab);
        //Untuk mengatur lebar kolom
        tabeldataobat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);                
        tabeldataobat.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabeldataobat.getColumnModel().getColumn(1).setPreferredWidth(100);        
        tabeldataobat.getColumnModel().getColumn(2).setPreferredWidth(200); 
        tabeldataobat.getColumnModel().getColumn(3).setPreferredWidth(390); 
        tabeldataobat.getColumnModel().getColumn(4).setPreferredWidth(300);
        tabeldataobat.getColumnModel().getColumn(5).setPreferredWidth(75);        
        tabeldataobat.getColumnModel().getColumn(6).setPreferredWidth(75); 
        tabeldataobat.getColumnModel().getColumn(7).setPreferredWidth(75);         
                
         
    }

    private void tampilTabel() {
        tab.getDataVector().removeAllElements();
        tab.fireTableDataChanged();
        dataObat.clear();
        dataObat = m.tampil();
        for (int x = 0; x < dataObat.size(); x++) {
            Object[] data = new Object[8];
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldataobat = new javax.swing.JTable();
        harga = new javax.swing.JTextField();
        carpengg = new javax.swing.JTextField();
        id_kategori = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sfdg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dessk = new javax.swing.JTextArea();
        sdfdg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ef = new javax.swing.JTextArea();
        stok = new javax.swing.JTextField();
        namaobat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pencarian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 190, 90));

        jPanel1.setBackground(new java.awt.Color(240, 190, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apotek/images/black.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Informasi Obat");

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

        carpengg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpenggActionPerformed(evt);
            }
        });

        id_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kategoriActionPerformed(evt);
            }
        });

        jLabel6.setText("Deskripsi");

        sfdg.setText("ID");

        dessk.setColumns(20);
        dessk.setRows(5);
        jScrollPane2.setViewportView(dessk);

        sdfdg.setText("Nama Obat");

        jLabel5.setText("Cara Penggunaan");

        jLabel4.setText("Harga");

        jLabel3.setText("Stok");

        jLabel7.setText("Efek Samping");

        ef.setColumns(20);
        ef.setRows(5);
        jScrollPane3.setViewportView(ef);

        jLabel8.setText("Kategori");

        pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencarianActionPerformed(evt);
            }
        });
        pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pencarianKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Pencarian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(236, 236, 236)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(sdfdg)
                                    .addComponent(sfdg)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(harga, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                            .addComponent(carpengg, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namaobat, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 95, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(id_kategori)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(jLabel7)))
                                .addGap(65, 65, 65)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sfdg))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sdfdg))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(carpengg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
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
        id_kategori.setText(model.getValueAt(baris, 7).toString());
       
    }//GEN-LAST:event_tabeldataobatMouseClicked

    private void carpenggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpenggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carpenggActionPerformed

    private void id_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_kategoriActionPerformed

    private void pencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianKeyPressed
        DefaultTableModel tab= new DefaultTableModel();
        tab.addColumn("ID");
        tab.addColumn("Nama Obat");
        tab.addColumn("Cara Penggunaan");
        tab.addColumn("Deskripsi");
        tab.addColumn("Efek");
        tab.addColumn("Harga");
        tab.addColumn("Stok");
        tab.addColumn("kategori Id");
        tabeldataobat.setModel(tab);
        //Untuk mengatur lebar kolom
        tabeldataobat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);                
        tabeldataobat.getColumnModel().getColumn(0).setPreferredWidth(75);
        tabeldataobat.getColumnModel().getColumn(1).setPreferredWidth(100);        
        tabeldataobat.getColumnModel().getColumn(2).setPreferredWidth(200); 
        tabeldataobat.getColumnModel().getColumn(3).setPreferredWidth(390); 
        tabeldataobat.getColumnModel().getColumn(4).setPreferredWidth(300);
        tabeldataobat.getColumnModel().getColumn(5).setPreferredWidth(75);        
        tabeldataobat.getColumnModel().getColumn(6).setPreferredWidth(75); 
        tabeldataobat.getColumnModel().getColumn(7).setPreferredWidth(75);         
      

            
        try{
            String sql = "SELECT * FROM dataobat WHERE id LIKE '%"+pencarian.getText()+
                    "%' or nama_obat LIKE '%"+pencarian.getText()+"%' or cara_penggunaan LIKE '%"+pencarian.getText()+
                    "%' or deskripsi LIKE '%"+pencarian.getText()+"%' or harga LIKE '%"+pencarian.getText()+
                    "%' or harga LIKE '%"+pencarian.getText()+"%' or stok LIKE '%"+pencarian.getText()+
                    "%' or nama LIKE '%"+pencarian.getText()+
                    "%'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                tab.addRow(new Object[]{
                rs.getString("id"), rs.getString("nama_obat"),rs.getString("cara_penggunaan"),
                    rs.getString("deskripsi"),rs.getString("efek"),rs.getString("harga"),
                    rs.getString("stok"),rs.getString("nama")
                });
            }
            tabeldataobat.setModel(tab);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }    
    }//GEN-LAST:event_pencarianKeyPressed

    private void pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pencarianActionPerformed

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
            java.util.logging.Logger.getLogger(tampilanUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilanUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilanUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilanUSer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilanUSer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carpengg;
    private javax.swing.JTextArea dessk;
    private javax.swing.JTextArea ef;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id_kategori;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField pencarian;
    private javax.swing.JLabel sdfdg;
    private javax.swing.JLabel sfdg;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tabeldataobat;
    // End of variables declaration//GEN-END:variables
}
