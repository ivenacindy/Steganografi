/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duhduh
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import steganografi.ImageFilter;
import steganografi.Vigenere;
import steganografi.Steganografi;
import sun.net.www.content.image.png;
 
 
public class UserInterface extends javax.swing.JFrame {
   Steganografi model;
    String pesan = "";
    File dirGambarKom;
    String sPath= "";
    String sName ="";
    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
        setLocationRelativeTo(null);
        txtGambar.setText("");
        txtTeks.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        tabMenu = new javax.swing.JTabbedPane();
        pnlKompres = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblGambar = new javax.swing.JLabel();
        lblTeks = new javax.swing.JLabel();
        lblKunci = new javax.swing.JLabel();
        txtGambar = new javax.swing.JTextField();
        txtTeks = new javax.swing.JTextField();
        txtKunci = new javax.swing.JTextField();
        btnGambarBrowse = new javax.swing.JButton();
        btnTeksBrowse = new javax.swing.JButton();
        btnKompres = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        spImageKompres = new javax.swing.JScrollPane();
        lblImageKompres = new javax.swing.JLabel();
        pnlEkstrak = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblGambar1 = new javax.swing.JLabel();
        lblKunci1 = new javax.swing.JLabel();
        txtGambarEkstrak = new javax.swing.JTextField();
        txtKunciEkstrak = new javax.swing.JTextField();
        btnGambarBrowseEkstrak = new javax.swing.JButton();
        btnEkstrak = new javax.swing.JButton();
        lblNamFile = new javax.swing.JLabel();
        txtFileNama = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        spImageEkstrak = new javax.swing.JScrollPane();
        lblImageEkstrak = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(30, 30, 73));

        pnlHeader.setBackground(new java.awt.Color(121, 110, 155));

        lblHeader.setFont(new java.awt.Font("Suruma", 1, 36)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Steganografi Gambar");
        lblHeader.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(166, 171, 190));

        lblGambar.setText("Gambar");

        lblTeks.setText("Teks");

        lblKunci.setText("Kunci");

        txtGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarActionPerformed(evt);
            }
        });

        txtTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeksActionPerformed(evt);
            }
        });

        txtKunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKunciActionPerformed(evt);
            }
        });

        btnGambarBrowse.setText("Pilih");
        btnGambarBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambarBrowseActionPerformed(evt);
            }
        });

        btnTeksBrowse.setText("pilih");
        btnTeksBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeksBrowseActionPerformed(evt);
            }
        });

        btnKompres.setText("Kompres");
        btnKompres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKompresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(lblTeks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKunci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTeksBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnGambarBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKompres, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGambarBrowse))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeksBrowse))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKompres)))
        );

        spImageKompres.setViewportView(lblImageKompres);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageKompres)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageKompres, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlKompresLayout = new javax.swing.GroupLayout(pnlKompres);
        pnlKompres.setLayout(pnlKompresLayout);
        pnlKompresLayout.setHorizontalGroup(
            pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKompresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlKompresLayout.setVerticalGroup(
            pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKompresLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMenu.addTab("Kompres", pnlKompres);

        jPanel4.setBackground(new java.awt.Color(166, 171, 190));

        lblGambar1.setText("Gambar");

        lblKunci1.setText("Kunci");

        txtGambarEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarEkstrakActionPerformed(evt);
            }
        });

        txtKunciEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKunciEkstrakActionPerformed(evt);
            }
        });

        btnGambarBrowseEkstrak.setText("Pilih");
        btnGambarBrowseEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambarBrowseEkstrakActionPerformed(evt);
            }
        });

        btnEkstrak.setText("Ekstrak");
        btnEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkstrakActionPerformed(evt);
            }
        });

        lblNamFile.setText("Nama File Ekstrak");

        txtFileNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFileNamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNamFile, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFileNama, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGambar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKunci1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtGambarEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGambarBrowseEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(117, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtKunciEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGambarEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGambarBrowseEkstrak))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKunciEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFileNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkstrak)))
        );

        spImageEkstrak.setViewportView(lblImageEkstrak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageEkstrak)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageEkstrak, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEkstrakLayout = new javax.swing.GroupLayout(pnlEkstrak);
        pnlEkstrak.setLayout(pnlEkstrakLayout);
        pnlEkstrakLayout.setHorizontalGroup(
            pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEkstrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEkstrakLayout.setVerticalGroup(
            pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEkstrakLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMenu.addTab("Ekstrak", pnlEkstrak);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabMenu))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tabMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGambarBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambarBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        try{
           jfc.setFileFilter(new ImageFilter());
           File file = jfc.getSelectedFile();
           dirGambarKom = file;
           String dir = file.getAbsolutePath(); 
           txtGambar.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Silahkan Pilih file gambar");
        }            
    }//GEN-LAST:event_btnGambarBrowseActionPerformed

    private void txtKunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKunciActionPerformed

    private void txtTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeksActionPerformed

    private void txtGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarActionPerformed

    private void txtGambarEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarEkstrakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarEkstrakActionPerformed

    private void txtKunciEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKunciEkstrakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKunciEkstrakActionPerformed

    private void btnGambarBrowseEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambarBrowseEkstrakActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File file= null;
        try{
           jfc.setFileFilter(new ImageFilter());
           file = jfc.getSelectedFile();
           String dir = file.getAbsolutePath(); 
           txtGambarEkstrak.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Silahkan Pilih file gambar");
        }
       try {
        String image = file.getPath();
        sPath =file.getPath();
        sName = file.getName();
        sPath = sPath.substring(0, sPath.length()-sName.length()-1);
        sName = sName.substring(0, sName.length()-4);
       
        lblImageEkstrak.setIcon(new ImageIcon(ImageIO.read(new File(image))));
       } catch (IOException ex) {
           System.out.println("gagal!!!");
       }
    }//GEN-LAST:event_btnGambarBrowseEkstrakActionPerformed

    private void btnEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkstrakActionPerformed
        // TODO add your handling code here:
        if (txtGambarEkstrak.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Gambar terlebih dahulu!!!");
        }else{
            model = new Steganografi();
            String cipher = model.decode(sPath, sName);
            if(cipher != ""){
                System.out.println("ciphertext :\n" + cipher);
                JOptionPane.showMessageDialog(null, "Ekstrak Pesan Berhasil", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            String key = txtKunciEkstrak.getText();
            String psn;
            if(key.equals("")){
                psn = cipher;
            }else{
                psn = new Vigenere().Dekrip(cipher, key);
            }
            System.out.println("plain \n" + psn);
            try{
                String file = sPath + "/"+txtFileNama.getText()+".txt";
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(psn);
                bw.close();
            } catch (IOException ex) {
                System.out.println("gagal!!");
           }
        }
    }//GEN-LAST:event_btnEkstrakActionPerformed

    private void btnTeksBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeksBrowseActionPerformed
        // TODO add your handling code here:
        String dir1 = null;
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        try{
           jfc.addChoosableFileFilter(new FileNameExtensionFilter("text file", "txt"));
           File file = jfc.getSelectedFile();
           String dir = file.getAbsolutePath();
           dir1=dir;
           txtTeks.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Pilih file text");
        }
        if(txtTeks.getText().equals("")){
            
        }else{
            File file ;
            BufferedReader br = null; 
            try {
                file = new File(dir1);
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                System.out.println("Gagal!!!");
            }

            String st; 
            try {
                while ((st = br.readLine()) != null){
                    pesan += st+"\n";
                }
            } catch (IOException ex) {
                System.out.println("Gagal!!!");
            }
            System.out.println("Plainteks :\n " + pesan );
        }
    }//GEN-LAST:event_btnTeksBrowseActionPerformed

    
    private void btnKompresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKompresActionPerformed
        // TODO add your handling code here:
        if (txtGambar.equals("")){
            System.out.println("anu");
            JOptionPane.showMessageDialog(this, "Pilih Gambar terlebih dahulu!!!");
        }else{
            if(txtKunci.getText().equals("")){
                //do Nothing
            }else
                pesan = new Vigenere().Enkrip(pesan, txtKunci.getText());
            File directory = dirGambarKom;
            try{
                    model = new Steganografi();
                    String text = pesan;
                    String ext  = ImageFilter.getExtension(directory);
                    String name = directory.getName();
                    String path = directory.getPath();
                    path = path.substring(0,path.length()-name.length()-1);

                    name = name.substring(0, name.length()-4);
                    String stegan = JOptionPane.showInputDialog(null,
                            "Masukkan nama file Ekstrak:", "File name",
                            JOptionPane.PLAIN_MESSAGE);
                    if(model.encode(path,name,ext,stegan,text)){
                            JOptionPane.showMessageDialog(null, "Proses Kompres pesan berhasil!", 
                                            "Success!", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Gambar tidak dapat dikompres!", 
                                            "Error!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //display the new image
                    lblImageKompres.setIcon(new ImageIcon(ImageIO.read(new File(path + "/" + stegan + ".png"))));
            }catch(Exception except) {
                    //Pesan Jika proses gagal
                    JOptionPane.showMessageDialog(null, "File tidak dapat dibuka!", 
                            "Error!", JOptionPane.INFORMATION_MESSAGE);
                    }   
        }
    }//GEN-LAST:event_btnKompresActionPerformed

    private void txtFileNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFileNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFileNamaActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkstrak;
    private javax.swing.JButton btnGambarBrowse;
    private javax.swing.JButton btnGambarBrowseEkstrak;
    private javax.swing.JButton btnKompres;
    private javax.swing.JButton btnTeksBrowse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblGambar1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblImageEkstrak;
    private javax.swing.JLabel lblImageKompres;
    private javax.swing.JLabel lblKunci;
    private javax.swing.JLabel lblKunci1;
    private javax.swing.JLabel lblNamFile;
    private javax.swing.JLabel lblTeks;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlEkstrak;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlKompres;
    private javax.swing.JScrollPane spImageEkstrak;
    private javax.swing.JScrollPane spImageKompres;
    private javax.swing.JTabbedPane tabMenu;
    private javax.swing.JTextField txtFileNama;
    private javax.swing.JTextField txtGambar;
    private javax.swing.JTextField txtGambarEkstrak;
    private javax.swing.JTextField txtKunci;
    private javax.swing.JTextField txtKunciEkstrak;
    private javax.swing.JTextField txtTeks;
    // End of variables declaration//GEN-END:variables
}
