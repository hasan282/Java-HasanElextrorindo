package hasanelextrorindo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class FormPenjualan extends javax.swing.JFrame {

    Connection Conz;
    Boolean viewBrg;
    String MainDbs = "elextronic";

    ClassBarang Brg;
    ArrayList<ClassBarang> Barang;
    ClassPelanggan Plgn;
    ArrayList<ClassPelanggan> Pelanggan;

    DefaultTableModel Mod = new DefaultTableModel();
    DefaultTableModel Bar;

    public FormPenjualan() {
        initComponents();
        viewBrg = false;
        TampilTabel();
        DisableForm();
        HideButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tglfaktur = new javax.swing.JTextField();
        nofaktur = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        suppliers = new javax.swing.JComboBox();
        idsupplier = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelz = new javax.swing.JTable();
        btn_all = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        totals = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        lb_total = new javax.swing.JLabel();
        xbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        kodebarang = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namabarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        hargajual = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_info = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_new.setText("New Entry");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_back.setText("Back to Menu");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addGap(18, 18, 18)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save)
                .addGap(18, 18, 18)
                .addComponent(btn_cancel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new)
                    .addComponent(btn_cancel)
                    .addComponent(btn_save)
                    .addComponent(btn_back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("No. Faktur");

        jLabel3.setText("Tanggal Faktur");

        jLabel4.setText("Nama Supplier");

        suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nofaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tglfaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(suppliers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(idsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nofaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglfaktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(idsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabelz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelz);

        btn_all.setText("All");

        btn_detail.setText("Detail");

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        lb_total.setText("Total");

        xbtn.setText("X");
        xbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(xbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_all)
                        .addGap(18, 18, 18)
                        .addComponent(btn_detail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lb_total)
                        .addGap(18, 18, 18)
                        .addComponent(totals, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_detail)
                    .addComponent(btn_all)
                    .addComponent(xbtn))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        kodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebarangActionPerformed(evt);
            }
        });

        jLabel5.setText("Kode Barang");

        jLabel6.setText("Nama Barang");

        jLabel7.setText("Harga Jual");

        jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlahKeyReleased(evt);
            }
        });

        jLabel8.setText("Jumlah");

        jLabel9.setText("Sub Total");

        jLabel10.setText("Discount");

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_info.setText("Info");
        btn_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_infoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(diskon, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_info, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(namabarang)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_add))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_info))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_add)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisableForm(){
        idsupplier.setEditable(false);
        namabarang.setEditable(false);
        hargajual.setEditable(false);
        subtotal.setEditable(false);
        diskon.setEditable(false);
        totals.setEditable(false);
    }

    private void HideButton(){
        btn_save.setVisible(false);
        btn_cancel.setVisible(false);
        btn_add.setVisible(false);
        btn_delete.setVisible(false);
        xbtn.setVisible(false);
        btn_info.setVisible(false);
        
        nofaktur.setEditable(false);
        tglfaktur.setEditable(false);
        jumlah.setEditable(false);
        lb_total.setVisible(false);
        totals.setVisible(false);
    }

    private void ShowButton(){
        btn_save.setVisible(true);
        btn_cancel.setVisible(true);
        btn_add.setVisible(true);
        btn_delete.setVisible(true);
        btn_info.setVisible(true);
        
        nofaktur.setEditable(true);
        tglfaktur.setEditable(true);
        jumlah.setEditable(true);
        lb_total.setVisible(true);
        totals.setVisible(true);
    }

    private void ClearText(){
        nofaktur.setText(null);
        tglfaktur.setText(null);
        suppliers.setSelectedIndex(0);
        kodebarang.setSelectedIndex(0);
        totals.setText(null);
    }

    private void ComboBoxKode(){
        Barang = new ArrayList<>();
        kodebarang.removeAllItems();
        String SqlBarang = "SELECT * FROM tb_barang";
        try{
            Conz = (Connection) hasanelextrorindo.Connector.Connect(MainDbs);
            PreparedStatement Ps = Conz.prepareStatement(SqlBarang);
            ResultSet Res = Ps.executeQuery();
            while(Res.next()){
                Brg = new ClassBarang(
                        Res.getString("id_barang"),
                        Res.getString("nama_barang"),
                        Res.getString("jenis_barang"),
                        Res.getString("satuan"),
                        Integer.parseInt(Res.getString("harga_beli")),
                        Integer.parseInt(Res.getString("harga_jual")),
                        Integer.parseInt(Res.getString("stok"))
                );
                Barang.add(Brg);
            }
            kodebarang.addItem("");
            for(int b = 0; b < Barang.size(); b++){
                kodebarang.addItem(Barang.get(b).getIdBarang());
            }
        } catch(SQLException Ex) {}
    }

    private void ComboBoxPelanggan(){
        Pelanggan = new ArrayList<>();
        suppliers.removeAllItems();
        String SqlSupp = "SELECT * FROM tb_pelanggan";
        try{
            Conz = (Connection) hasanelextrorindo.Connector.Connect(MainDbs);
            PreparedStatement Ps = Conz.prepareStatement(SqlSupp);
            ResultSet Res = Ps.executeQuery();
            while(Res.next()){
                Plgn = new ClassPelanggan(
                        Res.getString("id_pelanggan"),
                        Res.getString("nama_pelanggan"),
                        Res.getString("alamat"),
                        Res.getString("telepon"),
                        Res.getString("email")
                );
                Pelanggan.add(Plgn);
            }
            suppliers.addItem("");
            for(int p = 0; p < Pelanggan.size(); p++){
                suppliers.addItem(Pelanggan.get(p).getNamaPel());
            }
        } catch(SQLException Ex) {}
    }

    private void TampilTabel(){
        String SqlShow = "SELECT no_faktur AS 'No. Faktur', tgl_faktur AS Tanggal, " +
                "nama_pelanggan AS 'Nama Supplier', discount AS Diskon, total AS Total " +
                "FROM faktur_header INNER JOIN tb_pelanggan ON faktur_header.id_pelanggan " +
                "= tb_pelanggan.id_pelanggan";
        try{
            Conz = (Connection) hasanelextrorindo.Connector.Connect(MainDbs);
            Statement st = (Statement) Conz.createStatement();
            ResultSet rs = st.executeQuery(SqlShow);
            tabelz.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private void TabelList(){
        Object[] Col = {"Kode Barang","Nama Barang",
            "Harga Jual","Jumlah","Sub Total","Diskon"};
        Mod.setColumnIdentifiers(Col);
        tabelz.setModel(Mod);
    }

    private void TabelBarang(){
        Bar = new DefaultTableModel();
        Object[] Clm = {"Kode Barang","Nama Barang",
            "Jenis Barang","Harga Jual","Stok"};
        Bar.setColumnIdentifiers(Clm);
        tabelz.setModel(Bar);
        
        Object[] Rows;
        for(int tb = 0; tb < Barang.size(); tb++){
            Rows = new Object[5];
            Rows[0] = Barang.get(tb).getIdBarang().toString();
            Rows[1] = Barang.get(tb).getNamaBarang().toString();
            Rows[2] = Barang.get(tb).getJenis().toString();
            Rows[3] = Integer.toString(Barang.get(tb).getHargaJual()).toString();
            Rows[4] = Integer.toString(Barang.get(tb).getStok()).toString();
            Bar.addRow(Rows);
        }
        /*
        String SqlBarang = "SELECT id_barang AS 'ID Barang', nama_barang AS 'Nama Barang', " +
                "jenis_barang AS Jenis, harga_jual AS Harga, stok AS Stok FROM tb_barang";
        try{
            Conz = (Connection) hasanelextrorindo.Connector.Connect(MainDbs);
            Statement st = (Statement) Conz.createStatement();
            ResultSet rs = st.executeQuery(SqlBarang);
            tabelz.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }*/
    }

    private void SaveData(){
        int TotalRow = Mod.getRowCount();
        String[] idBarang = new String[TotalRow];
        String[] Jumlah = new String[TotalRow];
        String[] SubTotal = new String[TotalRow];
        String[] Disc = new String[TotalRow];
        int[] Diskon = new int[TotalRow];
        int[] StokAwal = new int[TotalRow];
        int[] StokAkhir = new int[TotalRow];
        int TotalDiskon = 0;
        for(int hsn = 0; hsn < TotalRow; hsn++){
            idBarang[hsn] = tabelz.getModel().getValueAt(hsn,0).toString();
            Jumlah[hsn] = tabelz.getModel().getValueAt(hsn,3).toString();
            SubTotal[hsn] = tabelz.getModel().getValueAt(hsn,4).toString();
            Disc[hsn] = tabelz.getModel().getValueAt(hsn,5).toString();
            if(Disc[hsn].equals(" -")){
                Diskon[hsn] = 0;
            } else {
                Diskon[hsn] = Integer.parseInt(Disc[hsn]);
            }
        }
        for(int to = 0; to < TotalRow; to++){
            TotalDiskon = TotalDiskon + Diskon[to];
        }
        for(int st = 0; st < TotalRow; st++){
            for(int ok = 0; ok < Barang.size(); ok++){
                String idBrg = Barang.get(ok).getIdBarang();
                int StokBrg = Barang.get(ok).getStok();
                if(idBarang[st].equals(idBrg)){
                    StokAwal[st] = StokBrg;
                }
            }
        }
        for(int cou = 0; cou < TotalRow; cou++){
            int Jml = Integer.parseInt(Jumlah[cou]);
            StokAkhir[cou] = StokAwal[cou] - Jml;
        }
        String[] SqlUpdate = new String[TotalRow];
        String SqlValue = "";
        String Border = ",";
        String SqlHeader = "INSERT INTO faktur_header VALUES ('" +
                nofaktur.getText().toString() + "', '" + tglfaktur.getText().toString() + "', '" +
                idsupplier.getText().toString() + "', " + TotalDiskon + ", " +
                totals.getText().toString() + ")";
        for(int sql = 0; sql < TotalRow; sql++){
            if(sql == TotalRow - 1){
                Border = ";";
            }
            SqlValue = SqlValue + " ('" + nofaktur.getText().toString() + "', '" +
                    idBarang[sql] + "', " + Jumlah[sql] + ", " + SubTotal[sql] + ")" + Border;
        }
        String SqlDetail = "INSERT INTO faktur_detail VALUES" + SqlValue;
        for(int ups = 0; ups < TotalRow; ups++){
            SqlUpdate[ups] = "UPDATE tb_barang SET stok = " + StokAkhir[ups] +
                    " WHERE id_barang = '" + idBarang[ups] + "'";
        }
        /*
        System.out.println(SqlHeader);
        System.out.println(SqlDetail);
        for(int prn = 0; prn < TotalRow; prn++){
            System.out.println(SqlUpdate[prn]);
        }
        */
        try{
            Conz = (Connection) hasanelextrorindo.Connector.Connect(MainDbs);
            PreparedStatement Pre1 = Conz.prepareStatement(SqlHeader);
            Pre1.execute();
            PreparedStatement Pre2 = Conz.prepareStatement(SqlDetail);
            Pre2.execute();
            for (String Up1 : SqlUpdate) {
                PreparedStatement Pre = Conz.prepareStatement(Up1);
                Pre.execute();
            }
            JOptionPane.showMessageDialog(null,"Terima Kasih");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }

    private void IsiInfo(){
        Timestamp Tm = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat Sm1 = new SimpleDateFormat("yyMMddHHmmss");
        SimpleDateFormat Sm2 = new SimpleDateFormat("yyyy-MM-dd");
        
        nofaktur.setText(Sm1.format(Tm).toString());
        tglfaktur.setText(Sm2.format(Tm).toString());
    }

    private void HitungTotal(){
        int TotalRow = Mod.getRowCount();
        int[] St = new int[TotalRow];
        int[] Dc = new int[TotalRow];
        int Totals = 0;
        String Diskon;
        if(TotalRow != 0){
            for(int A = 0; A < TotalRow; A++){
                St[A] = Integer.parseInt(tabelz.getModel().getValueAt(A, 4).toString());
                Diskon = tabelz.getModel().getValueAt(A, 5).toString();
                if(Diskon.equals(" -")){
                    Dc[A] = 0;
                } else {
                    Dc[A] = Integer.parseInt(Diskon);
                }
            }
            for(int B = 0; B < TotalRow; B++){
                Totals = Totals + St[B] - Dc[B];
            }
            totals.setText(Integer.toString(Totals));
        } else {
            totals.setText(null);
        }
    }

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if(kodebarang.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih Kode Barang !");
            return;
        }
        if(jumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Barang !");
            return;
        }
        BackFromView();
        Object[] Rows = new Object[6];
        
        Rows[0] = kodebarang.getSelectedItem().toString();
        Rows[1] = namabarang.getText().toString();
        Rows[2] = hargajual.getText().toString();
        Rows[3] = jumlah.getText().toString();
        Rows[4] = subtotal.getText().toString();
        Rows[5] = diskon.getText().toString();
        
        Mod.addRow(Rows);
        
        kodebarang.setSelectedIndex(0);
        jumlah.setText(null);
        
        HitungTotal();
        kodebarang.removeItem(Rows[0]);
    }//GEN-LAST:event_btn_addActionPerformed

    private void kodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebarangActionPerformed
        // TODO add your handling code here:
        int itCount = kodebarang.getItemCount();
        jumlah.setText(null);
        subtotal.setText(null);
        diskon.setText(null);
        if(itCount > 0){
        for(int k = 0; k < Barang.size(); k++){
            if(kodebarang.getSelectedItem().equals(Barang.get(k).getIdBarang())){
                namabarang.setText(Barang.get(k).getNamaBarang());
                hargajual.setText(Integer.toString(Barang.get(k).getHargaJual()));
            }
        }}
        if(kodebarang.getSelectedIndex()==0){
            namabarang.setText(null);
            hargajual.setText(null);
        }
    }//GEN-LAST:event_kodebarangActionPerformed

    private void suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersActionPerformed
        // TODO add your handling code here:
        for(int k = 0; k < Pelanggan.size(); k++){
            if(suppliers.getSelectedIndex()==(k+1)){
                idsupplier.setText(Pelanggan.get(k).getIdPel());
            }
        }
        if(suppliers.getSelectedIndex()==0){
            idsupplier.setText(null);
        }
    }//GEN-LAST:event_suppliersActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        btn_new.setVisible(false);
        btn_back.setVisible(false);
        ComboBoxKode();
        ComboBoxPelanggan();
        ShowButton();
        TabelList();
        IsiInfo();
        btn_all.setVisible(false);
        btn_detail.setVisible(false);
    }//GEN-LAST:event_btn_newActionPerformed

    private void jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlahKeyReleased
        // TODO add your handling code here:
        String Jumlah = jumlah.getText();
        int Jual, jml, sbtotal, disc;
        try{
            jml = Integer.parseInt(Jumlah);
        } catch(NumberFormatException Nf){
            jml = 0;
            jumlah.setText("");
        }
        if(kodebarang.getSelectedIndex() == 0 || Jumlah.equals("")){
            subtotal.setText(null);
            diskon.setText(null);
        } else {
            Jual = Integer.parseInt(hargajual.getText());
            sbtotal = jml * Jual;
            subtotal.setText(Integer.toString(sbtotal));
            if(jml < 5){
                diskon.setText(" -");
            } else {
                disc = sbtotal * 5 / 100;
                diskon.setText(Integer.toString(disc));
            }
        }
    }//GEN-LAST:event_jumlahKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int PilihRow = tabelz.getSelectedRow();
        String Kod, Nam;
        if(PilihRow >= 0){
            Kod = tabelz.getModel().getValueAt(PilihRow, 0).toString();
            Nam = tabelz.getModel().getValueAt(PilihRow, 1).toString();
            int DelOpt = JOptionPane.showConfirmDialog(null, "Hapus "+Nam+"?", null, JOptionPane.YES_NO_OPTION);
            if(DelOpt == JOptionPane.YES_OPTION){
                kodebarang.addItem(Kod);
                Mod.removeRow(PilihRow);
                HitungTotal();
            }else{
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void CancelEntry(){
        HideButton();
        ClearText();
        btn_all.setVisible(true);
        btn_detail.setVisible(true);
        btn_new.setVisible(true);
        btn_back.setVisible(true);
        TampilTabel();
        kodebarang.removeAllItems();
        suppliers.removeAllItems();
    }

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        if(Mod.getRowCount() > 0){
            int Opt = JOptionPane.showConfirmDialog(null, "Batalkan Entry Data?", "Perhatian",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(Opt == JOptionPane.YES_OPTION){
                for(int tb = Mod.getRowCount() - 1; tb >= 0; tb--){
                    Mod.removeRow(tb);
                }
                CancelEntry();
            } else {
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            }
        } else {
            CancelEntry();
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        BackFromView();
        if(nofaktur.getText().equals("") || tglfaktur.getText().equals("") || suppliers.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Lengkapi Data Faktur !!");
            return;
        }
        if(Mod.getRowCount() < 1){
            JOptionPane.showMessageDialog(null, "Data Penjualan Belum Ditambahkan");
            return;
        }
        int Opt = JOptionPane.showConfirmDialog(null, "Simpan Data Penjualan?", null, JOptionPane.YES_NO_OPTION);
        if(Opt == JOptionPane.YES_OPTION){
            SaveData();
            for(int tb = Mod.getRowCount() - 1; tb >= 0; tb--){
                Mod.removeRow(tb);
            } CancelEntry();
        } else {
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void BackFromView(){
        TabelList();
        btn_info.setText("Info");
        btn_delete.setVisible(true);
        xbtn.setVisible(false);
        viewBrg = false;
    }

    private void btn_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_infoActionPerformed
        // TODO add your handling code here:
        if(viewBrg == false){
            TabelBarang();
            btn_info.setText("OK");
            btn_delete.setVisible(false);
            xbtn.setVisible(true);
            viewBrg = true;
        } else {
            BackFromView();
        }
    }//GEN-LAST:event_btn_infoActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void xbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbtnActionPerformed
        // TODO add your handling code here:
        BackFromView();
    }//GEN-LAST:event_xbtnActionPerformed

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FormPenjualan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_all;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_info;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hargajual;
    private javax.swing.JTextField idsupplier;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JComboBox kodebarang;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTextField namabarang;
    private javax.swing.JTextField nofaktur;
    private javax.swing.JTextField subtotal;
    private javax.swing.JComboBox suppliers;
    private javax.swing.JTable tabelz;
    private javax.swing.JTextField tglfaktur;
    private javax.swing.JTextField totals;
    private javax.swing.JButton xbtn;
    // End of variables declaration//GEN-END:variables
}
