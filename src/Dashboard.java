//@author SPR Production

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Dashboard extends javax.swing.JFrame {
    Connection cn;
    
    // objek untuk mengakses tabel pada database   
    DatabaseAccess dbPasien = new DatabaseAccess(cn);
    DatabaseAccess dbPetugas = new DatabaseAccess(cn);
    DatabaseAccess dbRekap = new DatabaseAccess(cn);
    
    // konstruktor
    public Dashboard() {
        setIcon();
        initComponents();
        mainPanel.removeAll();

        // mengatur tabel pasien
        tampilTabelPasien();
        tampilTabelPetugas();  
        tampilTabelRekap();
        
        loadPetugas();
        loadPasien();
        
        mainPanel.add(panelDashboard);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
     
    // jangan diganngu kode di bawah
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        petugas = new javax.swing.JLabel();
        jadwal = new javax.swing.JLabel();
        pasien = new javax.swing.JLabel();
        tentang = new javax.swing.JLabel();
        rekap = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        headPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        panelPasien = new javax.swing.JPanel();
        panelTampilPasien = new javax.swing.JPanel();
        jScrollPanePasien = new javax.swing.JScrollPane();
        tblPasien = new javax.swing.JTable();
        jTampilPasien = new javax.swing.JLabel();
        btnKembaliPasien = new javax.swing.JButton();
        btnCetakPasien = new javax.swing.JButton();
        panelDataPasien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNamaPasien = new javax.swing.JTextField();
        txtNoPasien = new javax.swing.JTextField();
        txtUsia = new javax.swing.JTextField();
        txtKeluhan = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        cmbJK = new javax.swing.JComboBox<>();
        cmbGoldar = new javax.swing.JComboBox<>();
        btnPasienSimpanData = new javax.swing.JButton();
        btnPasienHapusData = new javax.swing.JButton();
        btnPasienReset = new javax.swing.JButton();
        btnPasienEditData = new javax.swing.JButton();
        btnTampilPasien = new javax.swing.JButton();
        btnCariPasien = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        panelPetugas = new javax.swing.JPanel();
        panelTampilPetugas = new javax.swing.JPanel();
        jScrollPanePetugas = new javax.swing.JScrollPane();
        tblPetugas = new javax.swing.JTable();
        jTampilPetugas = new javax.swing.JLabel();
        btnKembaliPetugas = new javax.swing.JButton();
        btnCetakPetugas = new javax.swing.JButton();
        panelDataPetugas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNamaPetugas = new javax.swing.JTextField();
        txtNoPetugas = new javax.swing.JTextField();
        cmbJKPetugas = new javax.swing.JComboBox<>();
        cmbBidang = new javax.swing.JComboBox<>();
        cmbRuangan = new javax.swing.JComboBox<>();
        cmbJadwal = new javax.swing.JComboBox<>();
        cmbJam = new javax.swing.JComboBox<>();
        btnPetugasSimpanData = new javax.swing.JButton();
        btnPetugasHapusData = new javax.swing.JButton();
        btnPetugasReset = new javax.swing.JButton();
        btnPetugasEditData = new javax.swing.JButton();
        btnTampilPetugas = new javax.swing.JButton();
        btnCariPetugas = new javax.swing.JToggleButton();
        panelTentang = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        panelJadwal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJadwal = new javax.swing.JTable();
        btnSenin = new javax.swing.JButton();
        btnSelasa = new javax.swing.JButton();
        btnRabu = new javax.swing.JButton();
        btnKamis = new javax.swing.JButton();
        btnJumat = new javax.swing.JButton();
        btnSabtu = new javax.swing.JButton();
        btnMinggu = new javax.swing.JButton();
        btnDay = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        btnFull = new javax.swing.JButton();
        panelDashboard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        panelRekap = new javax.swing.JPanel();
        panelTampilRekap = new javax.swing.JPanel();
        jScrollPanelRekap = new javax.swing.JScrollPane();
        tblRekap = new javax.swing.JTable();
        jTampilRekap = new javax.swing.JLabel();
        btnKembaliRekap = new javax.swing.JButton();
        btnCetakiRekap = new javax.swing.JButton();
        panelDataRekap = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtNoRekap = new javax.swing.JTextField();
        txtRekapKegiatan = new javax.swing.JTextField();
        txtRekapTanggal = new javax.swing.JTextField();
        cmbRekapPetugas = new javax.swing.JComboBox<>();
        cmbRekapPasien = new javax.swing.JComboBox<>();
        btnRekapSimpanData = new javax.swing.JButton();
        btnRekapHapusData = new javax.swing.JButton();
        btnRekapReset = new javax.swing.JButton();
        btnRekapEditData = new javax.swing.JButton();
        btnTampilRekap = new javax.swing.JButton();
        btnCariRekap = new javax.swing.JToggleButton();
        bottomPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/007-book.png"))); // NOI18N
        logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        petugas.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        petugas.setForeground(new java.awt.Color(0, 0, 204));
        petugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/026-doctor.png"))); // NOI18N
        petugas.setText("Petugas");
        petugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petugasMouseClicked(evt);
            }
        });

        jadwal.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jadwal.setForeground(new java.awt.Color(0, 0, 204));
        jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/016-calendar.png"))); // NOI18N
        jadwal.setText("Jadwal");
        jadwal.setToolTipText("");
        jadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalMouseClicked(evt);
            }
        });

        pasien.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pasien.setForeground(new java.awt.Color(0, 0, 204));
        pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/064-medical-2.png"))); // NOI18N
        pasien.setText("Pasien");
        pasien.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienMouseClicked(evt);
            }
        });

        tentang.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        tentang.setForeground(new java.awt.Color(0, 0, 204));
        tentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/014-hospital.png"))); // NOI18N
        tentang.setText("Tentang");
        tentang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tentangMouseClicked(evt);
            }
        });

        rekap.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        rekap.setForeground(new java.awt.Color(0, 0, 204));
        rekap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/075-records.png"))); // NOI18N
        rekap.setText("Rekap");
        rekap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rekap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rekapMouseClicked(evt);
            }
        });

        dashboard.setFont(new java.awt.Font("Calibri", 0, 32)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 0, 204));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rekap, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tentang))
                .addGap(23, 23, 23))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rekap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tentang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        headPanel.setBackground(new java.awt.Color(255, 255, 255));

        banner.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        banner.setForeground(new java.awt.Color(0, 0, 204));
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("Sistem Informasi Manajemen Puskesmas II Karang Klesem");

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        panelPasien.setBackground(new java.awt.Color(255, 255, 255));
        panelPasien.setLayout(new java.awt.CardLayout());

        panelTampilPasien.setBackground(new java.awt.Color(255, 255, 255));
        panelTampilPasien.setPreferredSize(new java.awt.Dimension(800, 476));

        tblPasien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblPasien.setForeground(new java.awt.Color(0, 0, 204));
        tblPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomor", "Nama Pasien", "Gender", "Golongan Darah", "Usia", "Tanggal Masuk", "Keluhan"
            }
        ));
        jScrollPanePasien.setViewportView(tblPasien);

        jTampilPasien.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jTampilPasien.setForeground(new java.awt.Color(0, 0, 204));
        jTampilPasien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTampilPasien.setText("Data Pasien");
        jTampilPasien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnKembaliPasien.setBackground(new java.awt.Color(255, 255, 255));
        btnKembaliPasien.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnKembaliPasien.setForeground(new java.awt.Color(0, 0, 204));
        btnKembaliPasien.setText("Kelola Data");
        btnKembaliPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPasienActionPerformed(evt);
            }
        });

        btnCetakPasien.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakPasien.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnCetakPasien.setForeground(new java.awt.Color(0, 0, 204));
        btnCetakPasien.setText("Cetak Data");
        btnCetakPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPasienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTampilPasienLayout = new javax.swing.GroupLayout(panelTampilPasien);
        panelTampilPasien.setLayout(panelTampilPasienLayout);
        panelTampilPasienLayout.setHorizontalGroup(
            panelTampilPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilPasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTampilPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTampilPasien, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(panelTampilPasienLayout.createSequentialGroup()
                        .addComponent(btnKembaliPasien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetakPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPanePasien))
                .addContainerGap())
        );
        panelTampilPasienLayout.setVerticalGroup(
            panelTampilPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTampilPasienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTampilPasien)
                .addGap(21, 21, 21)
                .addComponent(jScrollPanePasien, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTampilPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembaliPasien)
                    .addComponent(btnCetakPasien))
                .addContainerGap())
        );

        panelPasien.add(panelTampilPasien, "card3");

        panelDataPasien.setBackground(new java.awt.Color(255, 255, 255));
        panelDataPasien.setPreferredSize(new java.awt.Dimension(800, 476));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Nomor");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Usia");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Golongan darah");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Keluhan");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Tanggal masuk");

        txtNamaPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNoPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtKeluhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbJK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbJK.setForeground(new java.awt.Color(0, 0, 204));
        cmbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki - Laki", "Perempuan" }));

        cmbGoldar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbGoldar.setForeground(new java.awt.Color(0, 0, 204));
        cmbGoldar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A", "B", "AB", "O" }));

        btnPasienSimpanData.setBackground(new java.awt.Color(255, 255, 255));
        btnPasienSimpanData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPasienSimpanData.setForeground(new java.awt.Color(0, 0, 204));
        btnPasienSimpanData.setText("Simpan");
        btnPasienSimpanData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasienSimpanData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPasienSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienSimpanDataActionPerformed(evt);
            }
        });

        btnPasienHapusData.setBackground(new java.awt.Color(255, 255, 255));
        btnPasienHapusData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPasienHapusData.setForeground(new java.awt.Color(0, 0, 204));
        btnPasienHapusData.setText("Hapus");
        btnPasienHapusData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasienHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienHapusDataActionPerformed(evt);
            }
        });

        btnPasienReset.setBackground(new java.awt.Color(255, 255, 255));
        btnPasienReset.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPasienReset.setForeground(new java.awt.Color(0, 0, 204));
        btnPasienReset.setText("Reset");
        btnPasienReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasienReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienResetActionPerformed(evt);
            }
        });

        btnPasienEditData.setBackground(new java.awt.Color(255, 255, 255));
        btnPasienEditData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPasienEditData.setForeground(new java.awt.Color(0, 0, 204));
        btnPasienEditData.setText("Update");
        btnPasienEditData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasienEditData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPasienEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienEditDataActionPerformed(evt);
            }
        });

        btnTampilPasien.setBackground(new java.awt.Color(255, 255, 255));
        btnTampilPasien.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnTampilPasien.setForeground(new java.awt.Color(0, 0, 204));
        btnTampilPasien.setText("Tampil Data");
        btnTampilPasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTampilPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilPasienActionPerformed(evt);
            }
        });

        btnCariPasien.setBackground(new java.awt.Color(255, 255, 255));
        btnCariPasien.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/042-heart-4.png"))); // NOI18N
        btnCariPasien.setBorder(null);
        btnCariPasien.setBorderPainted(false);
        btnCariPasien.setContentAreaFilled(false);
        btnCariPasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPasienActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Pasien");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDataPasienLayout = new javax.swing.GroupLayout(panelDataPasien);
        panelDataPasien.setLayout(panelDataPasienLayout);
        panelDataPasienLayout.setHorizontalGroup(
            panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPasienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataPasienLayout.createSequentialGroup()
                        .addComponent(btnTampilPasien)
                        .addGap(657, 657, 657))
                    .addGroup(panelDataPasienLayout.createSequentialGroup()
                        .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDataPasienLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelDataPasienLayout.createSequentialGroup()
                                        .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(20, 20, 20)
                                        .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbJK, javax.swing.GroupLayout.Alignment.TRAILING, 0, 472, Short.MAX_VALUE)
                                            .addComponent(txtKeluhan)
                                            .addComponent(txtUsia)
                                            .addComponent(txtDate)
                                            .addComponent(txtNamaPasien)
                                            .addGroup(panelDataPasienLayout.createSequentialGroup()
                                                .addComponent(txtNoPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCariPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cmbGoldar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelDataPasienLayout.createSequentialGroup()
                                        .addComponent(btnPasienSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPasienEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPasienHapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPasienReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))))
                        .addContainerGap())))
        );
        panelDataPasienLayout.setVerticalGroup(
            panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPasienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNoPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCariPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGoldar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(panelDataPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampilPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPasienSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPasienHapusData)
                    .addComponent(btnPasienReset)
                    .addComponent(btnPasienEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPasien.add(panelDataPasien, "card2");

        mainPanel.add(panelPasien, "card3");

        panelPetugas.setBackground(new java.awt.Color(255, 255, 255));
        panelPetugas.setLayout(new java.awt.CardLayout());

        panelTampilPetugas.setBackground(new java.awt.Color(255, 255, 255));
        panelTampilPetugas.setPreferredSize(new java.awt.Dimension(800, 476));

        tblPetugas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblPetugas.setForeground(new java.awt.Color(0, 0, 204));
        tblPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomor Petugas", "Nama Petugas", "Gender", "Bidang", "Ruangan", "Jadwal Kerja", "Jam Kerja"
            }
        ));
        jScrollPanePetugas.setViewportView(tblPetugas);
        if (tblPetugas.getColumnModel().getColumnCount() > 0) {
            tblPetugas.getColumnModel().getColumn(5).setHeaderValue("Jadwal Kerja");
            tblPetugas.getColumnModel().getColumn(6).setHeaderValue("Jam Kerja");
        }

        jTampilPetugas.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jTampilPetugas.setForeground(new java.awt.Color(0, 0, 204));
        jTampilPetugas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTampilPetugas.setText("Data Petugas");
        jTampilPetugas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnKembaliPetugas.setBackground(new java.awt.Color(255, 255, 255));
        btnKembaliPetugas.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnKembaliPetugas.setForeground(new java.awt.Color(0, 0, 204));
        btnKembaliPetugas.setText("Kelola Data");
        btnKembaliPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPetugasActionPerformed(evt);
            }
        });

        btnCetakPetugas.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakPetugas.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnCetakPetugas.setForeground(new java.awt.Color(0, 0, 204));
        btnCetakPetugas.setText("Cetak Data");
        btnCetakPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPetugasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTampilPetugasLayout = new javax.swing.GroupLayout(panelTampilPetugas);
        panelTampilPetugas.setLayout(panelTampilPetugasLayout);
        panelTampilPetugasLayout.setHorizontalGroup(
            panelTampilPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTampilPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTampilPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jScrollPanePetugas)
                    .addGroup(panelTampilPetugasLayout.createSequentialGroup()
                        .addComponent(btnKembaliPetugas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetakPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTampilPetugasLayout.setVerticalGroup(
            panelTampilPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTampilPetugasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTampilPetugas)
                .addGap(21, 21, 21)
                .addComponent(jScrollPanePetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTampilPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembaliPetugas)
                    .addComponent(btnCetakPetugas))
                .addContainerGap())
        );

        panelPetugas.add(panelTampilPetugas, "card3");

        panelDataPetugas.setBackground(new java.awt.Color(255, 255, 255));
        panelDataPetugas.setPreferredSize(new java.awt.Dimension(800, 476));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Nomor Petugas");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Jenis Kelamin");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Nama Petugas");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Bidang");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Data Petugas");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Ruangan");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Jadwal");

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("Jam Kerja");

        txtNamaPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNoPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbJKPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbJKPetugas.setForeground(new java.awt.Color(0, 0, 204));
        cmbJKPetugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki - Laki", "Perempuan" }));

        cmbBidang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbBidang.setForeground(new java.awt.Color(0, 0, 204));
        cmbBidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Petugas Keamanan", "Perawat", "Dokter", "Petugas Kebersihan", "Teknisi" }));

        cmbRuangan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbRuangan.setForeground(new java.awt.Color(0, 0, 204));
        cmbRuangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ruang Mawar", "Ruang Melati", "Ruang Anggrek", "Resepsionis" }));

        cmbJadwal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbJadwal.setForeground(new java.awt.Color(0, 0, 204));
        cmbJadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu", "Weekday", "Weekend", "Setiap Hari" }));

        cmbJam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbJam.setForeground(new java.awt.Color(0, 0, 204));
        cmbJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Shift Pagi", "Shift Siang", "Shift Sore", "Shift Malam", "Full Time", " " }));

        btnPetugasSimpanData.setBackground(new java.awt.Color(255, 255, 255));
        btnPetugasSimpanData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPetugasSimpanData.setForeground(new java.awt.Color(0, 0, 204));
        btnPetugasSimpanData.setText("Simpan");
        btnPetugasSimpanData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPetugasSimpanData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPetugasSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasSimpanDataActionPerformed(evt);
            }
        });

        btnPetugasHapusData.setBackground(new java.awt.Color(255, 255, 255));
        btnPetugasHapusData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPetugasHapusData.setForeground(new java.awt.Color(0, 0, 204));
        btnPetugasHapusData.setText("Hapus");
        btnPetugasHapusData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPetugasHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasHapusDataActionPerformed(evt);
            }
        });

        btnPetugasReset.setBackground(new java.awt.Color(255, 255, 255));
        btnPetugasReset.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPetugasReset.setForeground(new java.awt.Color(0, 0, 204));
        btnPetugasReset.setText("Reset");
        btnPetugasReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPetugasReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasResetActionPerformed(evt);
            }
        });

        btnPetugasEditData.setBackground(new java.awt.Color(255, 255, 255));
        btnPetugasEditData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnPetugasEditData.setForeground(new java.awt.Color(0, 0, 204));
        btnPetugasEditData.setText("Update");
        btnPetugasEditData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPetugasEditData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPetugasEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPetugasEditDataActionPerformed(evt);
            }
        });

        btnTampilPetugas.setBackground(new java.awt.Color(255, 255, 255));
        btnTampilPetugas.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnTampilPetugas.setForeground(new java.awt.Color(0, 0, 204));
        btnTampilPetugas.setText("Tampil Data");
        btnTampilPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTampilPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilPetugasActionPerformed(evt);
            }
        });

        btnCariPetugas.setBackground(new java.awt.Color(255, 255, 255));
        btnCariPetugas.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPetugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/042-heart-4.png"))); // NOI18N
        btnCariPetugas.setBorder(null);
        btnCariPetugas.setBorderPainted(false);
        btnCariPetugas.setContentAreaFilled(false);
        btnCariPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPetugasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDataPetugasLayout = new javax.swing.GroupLayout(panelDataPetugas);
        panelDataPetugas.setLayout(panelDataPetugasLayout);
        panelDataPetugasLayout.setHorizontalGroup(
            panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataPetugasLayout.createSequentialGroup()
                        .addComponent(btnTampilPetugas)
                        .addGap(657, 657, 657))
                    .addGroup(panelDataPetugasLayout.createSequentialGroup()
                        .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDataPetugasLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelDataPetugasLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnPetugasSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPetugasEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPetugasHapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPetugasReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDataPetugasLayout.createSequentialGroup()
                                        .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addGap(29, 29, 29)
                                        .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbJadwal, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbRuangan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbBidang, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbJKPetugas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNamaPetugas, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelDataPetugasLayout.createSequentialGroup()
                                                .addComponent(txtNoPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCariPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 17, Short.MAX_VALUE))
                                            .addComponent(cmbJam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        panelDataPetugasLayout.setVerticalGroup(
            panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataPetugasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(33, 33, 33)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNoPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCariPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJKPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(panelDataPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampilPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPetugasSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPetugasHapusData)
                    .addComponent(btnPetugasReset)
                    .addComponent(btnPetugasEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPetugas.add(panelDataPetugas, "card2");

        mainPanel.add(panelPetugas, "card3");

        panelTentang.setBackground(new java.awt.Color(255, 255, 255));
        panelTentang.setPreferredSize(new java.awt.Dimension(800, 476));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setText("Fajar Maulana");

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setText("Ahmad Riau Ardi");

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setText("Gigih Attayauban");

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 204));
        jLabel25.setText("Farah Sofiatul");

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/credit riau.jpg"))); // NOI18N
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/credit fajar.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/credit gigih.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/credit farah.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Icon designed by icongeek26 from Flaticon");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/035-web.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Created By");

        javax.swing.GroupLayout panelTentangLayout = new javax.swing.GroupLayout(panelTentang);
        panelTentang.setLayout(panelTentangLayout);
        panelTentangLayout.setHorizontalGroup(
            panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTentangLayout.createSequentialGroup()
                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTentangLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel23))
                                .addGap(85, 85, 85)
                                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel24))
                                .addGap(71, 71, 71)
                                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel25)))
                            .addGroup(panelTentangLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3)))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelTentangLayout.setVerticalGroup(
            panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTentangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(13, 13, 13)
                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27)))
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGroup(panelTentangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTentangLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(panelTentangLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)
                        .addGap(125, 125, 125))))
        );

        mainPanel.add(panelTentang, "card4");

        panelJadwal.setBackground(new java.awt.Color(255, 255, 255));

        tblJadwal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblJadwal.setForeground(new java.awt.Color(0, 0, 204));
        tblJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomor Petugas", "Nama Petugas", "Gender", "Bidang Petugas", "Ruangan", "Jadwal Petugas", "Jam Kerja"
            }
        ));
        jScrollPane1.setViewportView(tblJadwal);

        btnSenin.setBackground(new java.awt.Color(255, 255, 255));
        btnSenin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSenin.setForeground(new java.awt.Color(0, 0, 204));
        btnSenin.setText("Senin");
        btnSenin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeninActionPerformed(evt);
            }
        });

        btnSelasa.setBackground(new java.awt.Color(255, 255, 255));
        btnSelasa.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSelasa.setForeground(new java.awt.Color(0, 0, 204));
        btnSelasa.setText("Selasa");
        btnSelasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelasaActionPerformed(evt);
            }
        });

        btnRabu.setBackground(new java.awt.Color(255, 255, 255));
        btnRabu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnRabu.setForeground(new java.awt.Color(0, 0, 204));
        btnRabu.setText("Rabu");
        btnRabu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRabuActionPerformed(evt);
            }
        });

        btnKamis.setBackground(new java.awt.Color(255, 255, 255));
        btnKamis.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnKamis.setForeground(new java.awt.Color(0, 0, 204));
        btnKamis.setText("Kamis");
        btnKamis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKamisActionPerformed(evt);
            }
        });

        btnJumat.setBackground(new java.awt.Color(255, 255, 255));
        btnJumat.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnJumat.setForeground(new java.awt.Color(0, 0, 204));
        btnJumat.setText("Jum'at");
        btnJumat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJumatActionPerformed(evt);
            }
        });

        btnSabtu.setBackground(new java.awt.Color(255, 255, 255));
        btnSabtu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnSabtu.setForeground(new java.awt.Color(0, 0, 204));
        btnSabtu.setText("Sabtu");
        btnSabtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSabtuActionPerformed(evt);
            }
        });

        btnMinggu.setBackground(new java.awt.Color(255, 255, 255));
        btnMinggu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnMinggu.setForeground(new java.awt.Color(0, 0, 204));
        btnMinggu.setText("Minggu");
        btnMinggu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMingguActionPerformed(evt);
            }
        });

        btnDay.setBackground(new java.awt.Color(255, 255, 255));
        btnDay.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnDay.setForeground(new java.awt.Color(0, 0, 204));
        btnDay.setText("Weekday");
        btnDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDayActionPerformed(evt);
            }
        });

        btnEnd.setBackground(new java.awt.Color(255, 255, 255));
        btnEnd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEnd.setForeground(new java.awt.Color(0, 0, 204));
        btnEnd.setText("Weekend");
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });

        btnFull.setBackground(new java.awt.Color(255, 255, 255));
        btnFull.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnFull.setForeground(new java.awt.Color(0, 0, 204));
        btnFull.setText("Setiap Hari");
        btnFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJadwalLayout = new javax.swing.GroupLayout(panelJadwal);
        panelJadwal.setLayout(panelJadwalLayout);
        panelJadwalLayout.setHorizontalGroup(
            panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelJadwalLayout.createSequentialGroup()
                        .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSenin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFull)
                            .addGroup(panelJadwalLayout.createSequentialGroup()
                                .addComponent(btnRabu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKamis, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJumat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSabtu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinggu)
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelJadwalLayout.setVerticalGroup(
            panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJadwalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSenin)
                    .addComponent(btnSelasa)
                    .addComponent(btnKamis)
                    .addComponent(btnJumat)
                    .addComponent(btnSabtu)
                    .addComponent(btnRabu)
                    .addComponent(btnMinggu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDay)
                    .addComponent(btnEnd)
                    .addComponent(btnFull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        mainPanel.add(panelJadwal, "card5");

        panelDashboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Selamat Datang di SIMP2KK");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/doctor.png"))); // NOI18N

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel32)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        mainPanel.add(panelDashboard, "card6");

        panelRekap.setBackground(new java.awt.Color(255, 255, 255));
        panelRekap.setLayout(new java.awt.CardLayout());

        panelTampilRekap.setBackground(new java.awt.Color(255, 255, 255));
        panelTampilRekap.setPreferredSize(new java.awt.Dimension(800, 476));

        tblRekap.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tblRekap.setForeground(new java.awt.Color(0, 0, 204));
        tblRekap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor Kegiatan", "Nama Petugas", "Nama Pasien", "Kegiatan", "Tanggal Kegiatan"
            }
        ));
        jScrollPanelRekap.setViewportView(tblRekap);

        jTampilRekap.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jTampilRekap.setForeground(new java.awt.Color(0, 0, 204));
        jTampilRekap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTampilRekap.setText("Rekap Kegiatan");
        jTampilRekap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnKembaliRekap.setBackground(new java.awt.Color(255, 255, 255));
        btnKembaliRekap.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnKembaliRekap.setForeground(new java.awt.Color(0, 0, 204));
        btnKembaliRekap.setText("Kelola Data");
        btnKembaliRekap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliRekapActionPerformed(evt);
            }
        });

        btnCetakiRekap.setBackground(new java.awt.Color(255, 255, 255));
        btnCetakiRekap.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnCetakiRekap.setForeground(new java.awt.Color(0, 0, 204));
        btnCetakiRekap.setText("Cetak Data");
        btnCetakiRekap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakiRekapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTampilRekapLayout = new javax.swing.GroupLayout(panelTampilRekap);
        panelTampilRekap.setLayout(panelTampilRekapLayout);
        panelTampilRekapLayout.setHorizontalGroup(
            panelTampilRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilRekapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTampilRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTampilRekap, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jScrollPanelRekap)
                    .addGroup(panelTampilRekapLayout.createSequentialGroup()
                        .addComponent(btnKembaliRekap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetakiRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTampilRekapLayout.setVerticalGroup(
            panelTampilRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTampilRekapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTampilRekap)
                .addGap(21, 21, 21)
                .addComponent(jScrollPanelRekap, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTampilRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembaliRekap)
                    .addComponent(btnCetakiRekap))
                .addContainerGap())
        );

        panelRekap.add(panelTampilRekap, "card3");

        panelDataRekap.setBackground(new java.awt.Color(255, 255, 255));
        panelDataRekap.setPreferredSize(new java.awt.Dimension(800, 476));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Nomor Kergiatan");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Petugas");

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setText("Pasien");

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 204));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Rekap Kegiatan");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 204));
        jLabel35.setText("Kegiatan");

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 204));
        jLabel36.setText("Tanggal Kegiatan");

        txtNoRekap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRekapKegiatan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRekapTanggal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbRekapPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbRekapPetugas.setForeground(new java.awt.Color(0, 0, 204));

        cmbRekapPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbRekapPasien.setForeground(new java.awt.Color(0, 0, 204));

        btnRekapSimpanData.setBackground(new java.awt.Color(255, 255, 255));
        btnRekapSimpanData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnRekapSimpanData.setForeground(new java.awt.Color(0, 0, 204));
        btnRekapSimpanData.setText("Simpan");
        btnRekapSimpanData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRekapSimpanData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnRekapSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapSimpanDataActionPerformed(evt);
            }
        });

        btnRekapHapusData.setBackground(new java.awt.Color(255, 255, 255));
        btnRekapHapusData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnRekapHapusData.setForeground(new java.awt.Color(0, 0, 204));
        btnRekapHapusData.setText("Hapus");
        btnRekapHapusData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRekapHapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapHapusDataActionPerformed(evt);
            }
        });

        btnRekapReset.setBackground(new java.awt.Color(255, 255, 255));
        btnRekapReset.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnRekapReset.setForeground(new java.awt.Color(0, 0, 204));
        btnRekapReset.setText("Reset");
        btnRekapReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRekapReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapResetActionPerformed(evt);
            }
        });

        btnRekapEditData.setBackground(new java.awt.Color(255, 255, 255));
        btnRekapEditData.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnRekapEditData.setForeground(new java.awt.Color(0, 0, 204));
        btnRekapEditData.setText("Update");
        btnRekapEditData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRekapEditData.setPreferredSize(new java.awt.Dimension(100, 35));
        btnRekapEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRekapEditDataActionPerformed(evt);
            }
        });

        btnTampilRekap.setBackground(new java.awt.Color(255, 255, 255));
        btnTampilRekap.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        btnTampilRekap.setForeground(new java.awt.Color(0, 0, 204));
        btnTampilRekap.setText("Tampil Data");
        btnTampilRekap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTampilRekap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilRekapActionPerformed(evt);
            }
        });

        btnCariRekap.setBackground(new java.awt.Color(255, 255, 255));
        btnCariRekap.setForeground(new java.awt.Color(255, 255, 255));
        btnCariRekap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_pack/042-heart-4.png"))); // NOI18N
        btnCariRekap.setBorder(null);
        btnCariRekap.setBorderPainted(false);
        btnCariRekap.setContentAreaFilled(false);
        btnCariRekap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariRekap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariRekapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDataRekapLayout = new javax.swing.GroupLayout(panelDataRekap);
        panelDataRekap.setLayout(panelDataRekapLayout);
        panelDataRekapLayout.setHorizontalGroup(
            panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataRekapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataRekapLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel33)
                            .addComponent(jLabel17))
                        .addGap(29, 29, 29)
                        .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDataRekapLayout.createSequentialGroup()
                                .addComponent(txtNoRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbRekapPasien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRekapPetugas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRekapKegiatan)
                            .addComponent(txtRekapTanggal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(panelDataRekapLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelDataRekapLayout.createSequentialGroup()
                        .addComponent(btnTampilRekap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRekapSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRekapEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRekapHapusData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRekapReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        panelDataRekapLayout.setVerticalGroup(
            panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataRekapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel34)
                .addGap(33, 33, 33)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNoRekap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCariRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRekapPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRekapPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRekapKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRekapTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addGroup(panelDataRekapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTampilRekap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRekapSimpanData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRekapHapusData)
                    .addComponent(btnRekapReset)
                    .addComponent(btnRekapEditData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelRekap.add(panelDataRekap, "card2");

        mainPanel.add(panelRekap, "card3");

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDashboard);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_dashboardMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDashboard);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_logoMouseClicked

// ============================== Method untuk control perpindahan panel pasien ============================== 

   private void pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(panelTampilPasien);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_pasienMouseClicked

    private void btnTampilPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilPasienActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelTampilPasien);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnTampilPasienActionPerformed

    private void btnKembaliPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPasienActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDataPasien);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnKembaliPasienActionPerformed

// ============================== Method untuk control perpindahan panel petugas ============================== 

    private void btnKembaliPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPetugasActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDataPetugas);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnKembaliPetugasActionPerformed

    private void btnTampilPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilPetugasActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelTampilPetugas);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnTampilPetugasActionPerformed

    private void petugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petugasMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelTampilPetugas);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_petugasMouseClicked

// ============================== method untuk membuka menu lainnya =======================================    
    private void tentangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tentangMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(panelTentang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_tentangMouseClicked

    private void jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        tampilTabelJadwal();
        mainPanel.add(panelJadwal);
        mainPanel.repaint();
        mainPanel.revalidate();        
    }//GEN-LAST:event_jadwalMouseClicked

// ============================== Method untuk control perpindahan panel rekap ============================== 

   private void btnKembaliRekapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliRekapActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDataRekap);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnKembaliRekapActionPerformed

    private void btnTampilRekapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilRekapActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelTampilRekap);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnTampilRekapActionPerformed

    private void rekapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rekapMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelTampilRekap);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_rekapMouseClicked

// ============================== Method untuk akses data pasien ==============================      

// Method untuk menyimpan data pasien       
    private void btnPasienSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienSimpanDataActionPerformed
        String nomor = txtNoPasien.getText();
        String nama = txtNamaPasien.getText();
        String jk = (String) cmbJK.getSelectedItem();
        String goldar = (String) cmbGoldar.getSelectedItem();
        String usia = txtUsia.getText();
        String date = txtDate.getText();
        String keluhan = txtKeluhan.getText();
        
        String querySimpan = "INSERT INTO pasien VALUES('"+nomor+"', '"+nama+"', '"+jk+"', '"+goldar+"', '"+usia+"', '"+date+"', '"+keluhan+"')";
        dbPasien.simpanData(querySimpan);      
        tampilTabelPasien();       
    }//GEN-LAST:event_btnPasienSimpanDataActionPerformed

// method untuk mengedit data pasien
    private void btnPasienEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienEditDataActionPerformed
        String nomor = txtNoPasien.getText();
        String nama = txtNamaPasien.getText();
        String jk = (String) cmbJK.getSelectedItem();
        String goldar = (String) cmbGoldar.getSelectedItem();
        String usia = txtUsia.getText();
        String date = txtDate.getText();
        String keluhan = txtKeluhan.getText();
        
        String queryEdit = "UPDATE pasien SET nama_pasien = '" + nama + "', jenis_kelamin = '" + jk + 
                "', goldar = '" + goldar + "', usia = '" + usia + "',tanggal_masuk = '" + date + 
                "', keluhan = '" + keluhan + "' WHERE nomor = " + nomor + " ;";        
        dbPasien.editData(queryEdit );
        tampilTabelPasien(); 
    }//GEN-LAST:event_btnPasienEditDataActionPerformed

// method untuk menghapus data pasien
    private void btnPasienHapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienHapusDataActionPerformed
        String queryHapus = "DELETE FROM pasien WHERE nomor = '"+txtNoPasien.getText()+"' ;";
        dbPasien.hapusData(queryHapus);
        tampilTabelPasien(); 
    }//GEN-LAST:event_btnPasienHapusDataActionPerformed

// method untuk mencari data pasien
    private void btnCariPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPasienActionPerformed
        String id = txtNoPasien.getText();
        String queryCari = "SELECT * FROM pasien WHERE nomor = '" + id + "'";
        dbPasien.pasienSearchData(txtNoPasien, txtNamaPasien, cmbJK, cmbGoldar, txtUsia, txtDate, txtKeluhan, queryCari);        
    }//GEN-LAST:event_btnCariPasienActionPerformed

// method untuk mereset text field input pasien
    private void btnPasienResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienResetActionPerformed
        dbPasien.pasienResetTampil(txtNoPasien, txtNamaPasien, cmbJK, cmbGoldar, txtUsia, txtDate, txtKeluhan);
    }//GEN-LAST:event_btnPasienResetActionPerformed

// ============================== Method untuk akses data petugas==============================    

    private void btnPetugasSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasSimpanDataActionPerformed
        String nomor = txtNoPetugas.getText();
        String nama = txtNamaPetugas.getText();
        String jk = (String) cmbJKPetugas.getSelectedItem();
        String bidang = (String) cmbBidang.getSelectedItem();
        String ruangan = (String) cmbRuangan.getSelectedItem();
        String jdwl = (String) cmbJadwal.getSelectedItem();
        String jam = (String) cmbJam.getSelectedItem();
        
        String querySimpan = "INSERT INTO petugas VALUES('"+nomor+"', '"+nama+"', '"+jk+"', '"+bidang+"', '"+ruangan+"', '"+jdwl+"', '"+jam+"')";
        dbPetugas.simpanData(querySimpan);      
        tampilTabelPetugas();
    }//GEN-LAST:event_btnPetugasSimpanDataActionPerformed

    private void btnPetugasHapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasHapusDataActionPerformed
        String queryHapus = "DELETE FROM petugas WHERE nomor_petugas = '"+txtNoPetugas.getText()+"' ;";
        dbPasien.hapusData(queryHapus);
        tampilTabelPetugas();
    }//GEN-LAST:event_btnPetugasHapusDataActionPerformed

    private void btnPetugasResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasResetActionPerformed
        dbPetugas.petugasResetTampil(txtNoPetugas, txtNamaPetugas, cmbJKPetugas, cmbBidang, cmbRuangan, cmbJadwal, cmbJam);
    }//GEN-LAST:event_btnPetugasResetActionPerformed

    private void btnPetugasEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPetugasEditDataActionPerformed
        String nomor = txtNoPetugas.getText();
        String nama = txtNamaPetugas.getText();
        String jk = (String) cmbJKPetugas.getSelectedItem();
        String bidang = (String) cmbBidang.getSelectedItem();
        String ruangan = (String) cmbRuangan.getSelectedItem();
        String jdwl = (String) cmbJadwal.getSelectedItem();
        String jam = (String) cmbJam.getSelectedItem();
        
        String queryEdit = "UPDATE petugas SET nama_petugas = '" + nama + 
                "', jk_petugas = '" + jk + "', bidang_petugas = '" + bidang + "', ruang_petugas = '" + ruangan +        
                "',jadwal_petugas = '" + jdwl + "', jam_kerja = '" + jam + "' WHERE nomor_petugas = " + nomor + " ;";
        dbPetugas.editData(queryEdit );
        tampilTabelPetugas();
    }//GEN-LAST:event_btnPetugasEditDataActionPerformed

    private void btnCariPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPetugasActionPerformed
        String id = txtNoPetugas.getText();
        String queryCari = "SELECT * FROM petugas WHERE nomor_petugas = '" + id + "'";
        dbPetugas.petugasSearchData(txtNoPetugas, txtNamaPetugas, cmbJKPetugas, cmbBidang, cmbRuangan, cmbJadwal, cmbJam, queryCari);
    }//GEN-LAST:event_btnCariPetugasActionPerformed
// ============================== Method untuk tampil jadwal petugas==============================  

    private void btnSeninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeninActionPerformed
        dbPetugas.jadwal("Senin", tblJadwal);
    }//GEN-LAST:event_btnSeninActionPerformed

    private void btnSelasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelasaActionPerformed
        dbPetugas.jadwal("Selasa", tblJadwal);
    }//GEN-LAST:event_btnSelasaActionPerformed

    private void btnRabuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRabuActionPerformed
        dbPetugas.jadwal("Rabu", tblJadwal);
    }//GEN-LAST:event_btnRabuActionPerformed

    private void btnKamisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKamisActionPerformed
        dbPetugas.jadwal("Kamis", tblJadwal);
    }//GEN-LAST:event_btnKamisActionPerformed

    private void btnJumatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJumatActionPerformed
        dbPetugas.jadwal("Jumat", tblJadwal);
    }//GEN-LAST:event_btnJumatActionPerformed

    private void btnSabtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSabtuActionPerformed
        dbPetugas.jadwal("Sabtu", tblJadwal);
    }//GEN-LAST:event_btnSabtuActionPerformed

    private void btnDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayActionPerformed
        dbPetugas.jadwal("Weekday", tblJadwal);
    }//GEN-LAST:event_btnDayActionPerformed

    private void btnMingguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMingguActionPerformed
        dbPetugas.jadwal("Minggu", tblJadwal);
    }//GEN-LAST:event_btnMingguActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        dbPetugas.jadwal("Weekend", tblJadwal);
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullActionPerformed
        dbPetugas.jadwal("Setiap Hari", tblJadwal);
    }//GEN-LAST:event_btnFullActionPerformed

// =================================== Method Logout ======================================    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

// ============================== Method untuk akses data rekap ==============================  

    private void btnRekapSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapSimpanDataActionPerformed
        String nomor = txtNoRekap.getText();
        String namaPetugas = (String) cmbRekapPetugas.getSelectedItem();
        String namaPasien = (String) cmbRekapPasien.getSelectedItem();
        String kegiatan = txtRekapKegiatan.getText();
        String tglKegiaatn = txtRekapTanggal.getText();
       
        String querySimpan = "INSERT INTO rekap VALUES('"+nomor+"', '"+namaPetugas+"', '"+namaPasien+"', '"+kegiatan+"', '"+tglKegiaatn+"');";
        dbRekap.simpanData(querySimpan);      
        tampilTabelRekap();
    }//GEN-LAST:event_btnRekapSimpanDataActionPerformed

    private void btnRekapHapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapHapusDataActionPerformed
        String queryHapus = "DELETE FROM rekap WHERE nomor_rekap = '"+txtNoRekap.getText()+"' ;";
        dbRekap.hapusData(queryHapus);
        tampilTabelRekap();
    }//GEN-LAST:event_btnRekapHapusDataActionPerformed

    private void btnRekapResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapResetActionPerformed
        dbRekap.rekapResetTampil(txtNoRekap, cmbRekapPetugas, cmbRekapPasien, txtRekapKegiatan, txtRekapTanggal);
    }//GEN-LAST:event_btnRekapResetActionPerformed

    private void btnRekapEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRekapEditDataActionPerformed
        String nomor = txtNoRekap.getText();
        String namaPetugas = (String) cmbRekapPetugas.getSelectedItem();
        String namaPasien = (String) cmbRekapPasien.getSelectedItem();
        String kegiatan = txtRekapKegiatan.getText();
        String tglKegiatan = txtRekapTanggal.getText();
        
        String queryEdit = "UPDATE rekap SET nama_petugas = '" + namaPetugas + 
                "', nama_pasien = '" + namaPasien + "', kegiatan = '" + kegiatan + "', tanggal_rekap = '" + tglKegiatan +        
                "' WHERE nomor_rekap = " + nomor + " ;";
        dbRekap.editData(queryEdit );
        tampilTabelRekap();
    }//GEN-LAST:event_btnRekapEditDataActionPerformed

    private void btnCariRekapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariRekapActionPerformed
        String id = txtNoRekap.getText();
        String queryCari = "SELECT * FROM rekap WHERE nomor_rekap = '" + id + "'";
        dbRekap.rekapSearchData(txtNoRekap, cmbRekapPetugas, cmbRekapPasien, txtRekapKegiatan, txtRekapTanggal, queryCari);
    }//GEN-LAST:event_btnCariRekapActionPerformed

// ============================== Method untuk cetak data ==============================       
    
    private void btnCetakPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPasienActionPerformed
        try{
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportSimp2kk.jasper"), null, koneksi());
            JasperViewer.viewReport(jp, false);
        }catch(JRException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnCetakPasienActionPerformed

    private void btnCetakiRekapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakiRekapActionPerformed
        try{
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportRekap.jasper"), null, koneksi());
            JasperViewer.viewReport(jp, false);
        }catch(JRException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnCetakiRekapActionPerformed

    private void btnCetakPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPetugasActionPerformed
        try{
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportPetugas.jasper"), null, koneksi());
            JasperViewer.viewReport(jp, false);
        }catch(JRException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnCetakPetugasActionPerformed

// Fungsi main===========================================================================================
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);      
                
            }
        });
        
    }
// Fungsi main===========================================================================================    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JToggleButton btnCariPasien;
    private javax.swing.JToggleButton btnCariPetugas;
    private javax.swing.JToggleButton btnCariRekap;
    private javax.swing.JButton btnCetakPasien;
    private javax.swing.JButton btnCetakPetugas;
    private javax.swing.JButton btnCetakiRekap;
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnFull;
    private javax.swing.JButton btnJumat;
    private javax.swing.JButton btnKamis;
    private javax.swing.JButton btnKembaliPasien;
    private javax.swing.JButton btnKembaliPetugas;
    private javax.swing.JButton btnKembaliRekap;
    private javax.swing.JButton btnMinggu;
    private javax.swing.JButton btnPasienEditData;
    private javax.swing.JButton btnPasienHapusData;
    private javax.swing.JButton btnPasienReset;
    private javax.swing.JButton btnPasienSimpanData;
    private javax.swing.JButton btnPetugasEditData;
    private javax.swing.JButton btnPetugasHapusData;
    private javax.swing.JButton btnPetugasReset;
    private javax.swing.JButton btnPetugasSimpanData;
    private javax.swing.JButton btnRabu;
    private javax.swing.JButton btnRekapEditData;
    private javax.swing.JButton btnRekapHapusData;
    private javax.swing.JButton btnRekapReset;
    private javax.swing.JButton btnRekapSimpanData;
    private javax.swing.JButton btnSabtu;
    private javax.swing.JButton btnSelasa;
    private javax.swing.JButton btnSenin;
    private javax.swing.JButton btnTampilPasien;
    private javax.swing.JButton btnTampilPetugas;
    private javax.swing.JButton btnTampilRekap;
    private javax.swing.JComboBox<String> cmbBidang;
    private javax.swing.JComboBox<String> cmbGoldar;
    private javax.swing.JComboBox<String> cmbJK;
    private javax.swing.JComboBox<String> cmbJKPetugas;
    private javax.swing.JComboBox<String> cmbJadwal;
    private javax.swing.JComboBox<String> cmbJam;
    private javax.swing.JComboBox<String> cmbRekapPasien;
    private javax.swing.JComboBox<String> cmbRekapPetugas;
    private javax.swing.JComboBox<String> cmbRuangan;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPanePasien;
    private javax.swing.JScrollPane jScrollPanePetugas;
    private javax.swing.JScrollPane jScrollPanelRekap;
    private javax.swing.JLabel jTampilPasien;
    private javax.swing.JLabel jTampilPetugas;
    private javax.swing.JLabel jTampilRekap;
    private javax.swing.JLabel jadwal;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelDataPasien;
    private javax.swing.JPanel panelDataPetugas;
    private javax.swing.JPanel panelDataRekap;
    private javax.swing.JPanel panelJadwal;
    private javax.swing.JPanel panelPasien;
    private javax.swing.JPanel panelPetugas;
    private javax.swing.JPanel panelRekap;
    private javax.swing.JPanel panelTampilPasien;
    private javax.swing.JPanel panelTampilPetugas;
    private javax.swing.JPanel panelTampilRekap;
    private javax.swing.JPanel panelTentang;
    private javax.swing.JLabel pasien;
    private javax.swing.JLabel petugas;
    private javax.swing.JLabel rekap;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTable tblJadwal;
    private javax.swing.JTable tblPasien;
    private javax.swing.JTable tblPetugas;
    private javax.swing.JTable tblRekap;
    private javax.swing.JLabel tentang;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtKeluhan;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNamaPetugas;
    private javax.swing.JTextField txtNoPasien;
    private javax.swing.JTextField txtNoPetugas;
    private javax.swing.JTextField txtNoRekap;
    private javax.swing.JTextField txtRekapKegiatan;
    private javax.swing.JTextField txtRekapTanggal;
    private javax.swing.JTextField txtUsia;
    // End of variables declaration//GEN-END:variables

// kode untuk load data tabel pasien dari database  
    private void tampilTabelPasien() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = koneksi();
            
            String query2 = "SELECT * FROM pasien WHERE nomor != 0;";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            DefaultTableModel tm;
            tm = (DefaultTableModel) tblPasien.getModel();
            tm.setRowCount(0);
            while (rs2.next()) {
                String nomor = rs2.getString("nomor");
                String nama = rs2.getString("nama_pasien");
                String jk = rs2.getString("jenis_kelamin");
                String goldar = rs2.getString("goldar");
                String usia= rs2.getString("usia");
                String tgl = rs2.getString("tanggal_masuk");
                String keluhan = rs2.getString("keluhan");
                tm.addRow(new Object[]{nomor, nama, jk, goldar, usia, tgl, keluhan});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!", "Input Data Status", 0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// method untuk memuat data dari database    
    private void tampilTabelPetugas() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = koneksi();
            
            String query2 = "SELECT * FROM petugas WHERE nomor_petugas != 0;";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            DefaultTableModel tm;
            tm = (DefaultTableModel) tblPetugas.getModel();
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
    
    
    private void tampilTabelJadwal() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = koneksi();
            String query2 = "SELECT * FROM petugas WHERE nomor_petugas != 0;";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            DefaultTableModel tm;
            tm = (DefaultTableModel) tblJadwal.getModel();
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
    
    private void tampilTabelRekap() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = koneksi();
            
            String query2 = "SELECT * FROM rekap ";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            DefaultTableModel tm;
            tm = (DefaultTableModel) tblRekap.getModel();
            tm.setRowCount(0);
            while (rs2.next()) {
                String nomor = rs2.getString("nomor_rekap");
                String namaPetugas = rs2.getString("nama_petugas");
                String namaPasien = rs2.getString("nama_pasien");
                String kegiatan = rs2.getString("kegiatan");
                String tanggal = rs2.getString("tanggal_rekap");
                         
                tm.addRow(new Object[]{nomor, namaPetugas, namaPasien, kegiatan, tanggal});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! Periksa Kembali Data Anda!", "Input Data Status", 0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void loadPetugas() {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");            
            cn = koneksi();
            
            String query2 = "SELECT * FROM petugas";
            Statement st2 = cn.createStatement();
            ResultSet rs = st2.executeQuery(query2);
            
            while(rs.next()){
                String nama_petugas = rs.getString("nama_petugas");
                System.out.println(nama_petugas);
                cmbRekapPetugas.addItem(nama_petugas);
            }
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    private void loadPasien() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = koneksi();
            String query2 = "SELECT * FROM pasien";
            Statement st2 = cn.createStatement();
            ResultSet rs = st2.executeQuery(query2);
            
            while(rs.next()){
                String nama_pasien = rs.getString("nama_pasien");
                
                cmbRekapPasien.addItem(nama_pasien);
            }
        }catch(SQLException e){
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public Connection koneksi(){
        Connection cn = null;
        
        String url = "jdbc:mysql://localhost:3306/simp2kk"; 
        String user = "root";
        String password = "";
        if (cn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return cn;
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("066-mobile.png")));
    }
}
