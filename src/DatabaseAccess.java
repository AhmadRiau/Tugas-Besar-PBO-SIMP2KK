// @author SPR Production
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatabaseAccess{
    Connection cn;
    
    // konstruktor
    public DatabaseAccess(Connection cn) {     
        this.cn = cn;                   // menyalin connection yang digunakan di kelas pemanggil
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            this.cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    // method menyimpan data
    public void simpanData(String quer){        
        try {
            // membuat connection                                   
            // menjalankan query pada database
            cn.createStatement().executeUpdate(quer);            
            // pesan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        }catch (SQLException ex) {
            // error jika data gagal disimpan karena ada kolom yang kosong
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ada data yang kosong");
            System.out.println(ex);
        } 
        // error jika data gagal disimpan karena class com.mysql.jdbc.Driver tidak ada
         
    }
    
      // method untuk mengupdate data
    public void editData(String quer){
        try {
            // melakukan connection pada database
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            // menjalankan query
            cn.createStatement().executeUpdate(quer);            
            // menampilkan pesan berhasil update
            JOptionPane.showMessageDialog(null, "Data diperbarui");
        
        // menampilkan pesan jika gagal
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // method untuk menghapus data
    public void hapusData(String quer){
        try {
            // melakukan connection pada database
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            // menjalankan query
            cn.createStatement().executeUpdate(quer);
            // menampilkan pesan berhasil update
            JOptionPane.showMessageDialog(null, "Data dihapus");
        
        // menampilkan pesan jika gagal
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccess.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// ============================== Method untuk akses tabel pasien ==============================
    
    // method untuk mengosongkan 
    public void pasienResetTampil(JTextField txtNo, JTextField txtNama, JComboBox cmbJK, JComboBox cmbGoldar, JTextField txtUsia, JTextField txtDate, JTextField txtKeluhan){
        txtNo.setText("");
        txtNama.setText("");
        cmbJK.setSelectedItem("-");
        cmbGoldar.setSelectedItem("-");  
        txtUsia.setText("");
        txtDate.setText("");
        txtKeluhan.setText("");
    }
    
    // method untuk melakukan pencarian data
    public void pasienSearchData(JTextField txtNoPasien, JTextField txtNamaPasien, JComboBox cmbJK, 
            JComboBox cmbGoldar, JTextField txtUsia, JTextField txtDate, JTextField txtKeluhan, String quer){
        // id sebagai variabel yang dicari di database
        String id = txtNoPasien.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // membuat connection
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            // menjalankan query pada database
            Statement st2 = cn.createStatement();
            ResultSet rs = st2.executeQuery(quer);          

            // jika variabel id tidak ada yang sama pada database dijalankan blok if
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Data tidak ada");
                System.out.println("ResultSet in empty in Java");
                txtNoPasien.setText("");
                txtNamaPasien.setText("");
                cmbJK.setSelectedItem("-");
                cmbGoldar.setSelectedItem("-");
                txtUsia.setText("");
                txtDate.setText("");
                txtKeluhan.setText("");
            // jika variabel id ada di database ditampilkan data yang ada di kolom inputan    
            } else {
                do {
                    // isi kolom ditulis sesuai return rs.getString(nama_kolom_di_database)
                    txtNamaPasien.setText(rs.getString("nama_pasien"));
                    cmbJK.setSelectedItem(rs.getString("jenis_kelamin"));
                    cmbGoldar.setSelectedItem(rs.getString("goldar"));
                    txtUsia.setText(rs.getString("usia"));
                    txtDate.setText(rs.getString("tanggal_masuk"));
                    txtKeluhan.setText(rs.getString("keluhan"));    
                // dijalankan selama rs.next true
                } while (rs.next());
            }
        // menerima pesan error    
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// ============================== Method untuk akses tabel dokter ==============================
    // method untuk mengosongkan (not done)
    public void petugasResetTampil(JTextField txtNoPetugas, JTextField txtNamaPetugas, JComboBox cmbJKPetugas, 
            JComboBox cmbBidang, JComboBox cmbRuang, JComboBox cmbJdwl, JComboBox cmbjam){
        txtNoPetugas.setText("");
        txtNamaPetugas.setText("");
        cmbJKPetugas.setSelectedItem("-");
        cmbBidang.setSelectedItem("-");
        cmbRuang.setSelectedItem("-");
        cmbJdwl.setSelectedItem("-");
        cmbjam.setSelectedItem("-"); 
    }
    
    // method untuk melakukan pencarian data
    public void petugasSearchData(JTextField txtNoPetugas, JTextField txtNamaPetugas, JComboBox cmbJKPetugas, 
            JComboBox cmbBidang, JComboBox cmbRuang, JComboBox cmbJdwl, JComboBox cmbjam, String quer){
        // id sebagai variabel yang dicari di database
        String id = txtNoPetugas.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // membuat connection
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            // menjalankan query pada database            
            Statement st2 = cn.createStatement();
            ResultSet rs = st2.executeQuery(quer);          

            // jika variabel id tidak ada yang sama pada database dijalankan blok if
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Data tidak ada");
                System.out.println("ResultSet in empty in Java");
                txtNoPetugas.setText("");
                txtNamaPetugas.setText("");
                cmbJKPetugas.setSelectedItem("-");
                cmbBidang.setSelectedItem("-");
                cmbRuang.setSelectedItem("-");
                cmbJdwl.setSelectedItem("-");
                cmbjam.setSelectedItem("-");
            // jika variabel id ada di database ditampilkan data yang ada di kolom inputan    
            } else {
                do {
                    // isi kolom ditulis sesuai return rs.getString(nama_kolom_di_database)
                    txtNamaPetugas.setText(rs.getString("nama_petugas"));
                    cmbJKPetugas.setSelectedItem(rs.getString("jk_petugas"));
                    cmbBidang.setSelectedItem(rs.getString("bidang_petugas"));
                    cmbRuang.setSelectedItem(rs.getString("ruang_petugas"));
                    cmbJdwl.setSelectedItem(rs.getString("jadwal_petugas"));
                    cmbjam.setSelectedItem(rs.getString("jam_kerja"));    
                // dijalankan selama rs.next true
                } while (rs.next());
            }
        // menerima pesan error    
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
// ============================== Method untuk akses tabel jadwal ==============================
    public void jadwal(String jdwlIn, JTable tblIn){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            String query2 = "SELECT * FROM petugas WHERE jadwal_petugas = '"+jdwlIn+"'";
            Statement st2 = conn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            DefaultTableModel tm;
            tm = (DefaultTableModel) tblIn.getModel();
            tm.setRowCount(0);
            while (rs2.next()) {
                String nomor = rs2.getString("nomor_petugas");
                String nama = rs2.getString("nama_petugas");
                String jk = rs2.getString("jk_petugas");
                String bidang = rs2.getString("bidang_petugas");
                String ruang = rs2.getString("ruang_petugas");
                String jdwl = rs2.getString("jadwal_petugas");
                String jam = rs2.getString("jam_kerja");
                tm.addRow(new Object[]{nomor, nama, jk, bidang, ruang, jdwl, jam});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!", "Input Data Status", 0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// ============================== Method untuk akses tabel pasien ==============================
    public void rekapResetTampil(JTextField txtNoRekap, JComboBox cmbNmPetugas, JComboBox cmbNmPasien, 
            JTextField txtKegiatan, JTextField txtTgl){
        txtNoRekap.setText("");
        cmbNmPetugas.setSelectedItem("-");
        cmbNmPasien.setSelectedItem("-");        
        txtKegiatan.setText("");
        txtTgl.setText("");
    }
    
    public void rekapSearchData(JTextField txtNoRekap, JComboBox cmbNmPetugas, JComboBox cmbNmPasien, 
            JTextField txtKegiatan, JTextField txtTgl, String quer){
        // id sebagai variabel yang dicari di database
        String id = txtNoRekap.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // membuat connection
            cn = DriverManager.getConnection("jdbc:mysql://localhost/simp2kk", "root", "");
            // menjalankan query pada database
            String query2 = quer;
            Statement st2 = cn.createStatement();
            ResultSet rs = st2.executeQuery(query2);          

            // jika variabel id tidak ada yang sama pada database dijalankan blok if
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Data tidak ada");
                System.out.println("ResultSet in empty in Java");
                txtNoRekap.setText("");
                cmbNmPetugas.setSelectedItem("-");
                cmbNmPasien.setSelectedItem("-");        
                txtKegiatan.setText("");
                txtTgl.setText("");
            // jika variabel id ada di database ditampilkan data yang ada di kolom inputan    
            } else {
                do {
                    // isi kolom ditulis sesuai return rs.getString(nama_kolom_di_database)                    
                    cmbNmPetugas.setSelectedItem(rs.getString("nama_petugas"));
                    cmbNmPasien.setSelectedItem(rs.getString("nama_pasien"));        
                    txtKegiatan.setText(rs.getString("kegiatan"));
                    txtTgl.setText(rs.getString("tanggal_rekap"));  
                // dijalankan selama rs.next true
                } while (rs.next());
            }
        // menerima pesan error    
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
