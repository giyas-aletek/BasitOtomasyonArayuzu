package otomasyon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Idari extends javax.swing.JFrame {

    public Idari() {
        initComponents();
        show_ogrnci();
        show_Akademisyen();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ogrenci_Tablo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Akadmisyen_Tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_User Settings_83395~1.png"))); // NOI18N
        jButton1.setText("Gucelleme");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user-settings-interface-symbol~1.png"))); // NOI18N
        jButton2.setText("Guncelleme");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_remove user_41358~1.png"))); // NOI18N
        jButton3.setText("Silme");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_remove user_81197~1.png"))); // NOI18N
        jButton4.setText("Silme");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_Add Friend_3340618~1.png"))); // NOI18N
        jButton5.setText("Ekleme");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_Add User_81102~1.png"))); // NOI18N
        jButton7.setText("Ekleme");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Ogrenci_Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Ogrenci_Tablo);

        Akadmisyen_Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Akadmisyen_Tablo);

        jLabel1.setText("Ogrenci");

        jLabel2.setText("Akademisyen");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_calender_960629~1.png"))); // NOI18N
        jButton8.setText("Tum Rendevular Goster");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("CIKIS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/noun_Refresh_2785543~1.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Sifre Degistir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TumRendevular t = new TumRendevular();
        t.setLocationRelativeTo(this);
        t.setVisible(true);     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OgrenciFormu of = new OgrenciFormu();
        of.setLocationRelativeTo(this);
        of.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AkademisyenFormu af = new AkademisyenFormu();
        af.setLocationRelativeTo(this);
        af.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r = Akadmisyen_Tablo.getSelectedRow();
        DefaultTableModel dataModel = (DefaultTableModel) Akadmisyen_Tablo.getModel();
        String sicil = dataModel.getValueAt(r, 0).toString();
        String anabilim = dataModel.getValueAt(r, 1).toString();
        String unvan = dataModel.getValueAt(r, 2).toString();
        String isim = dataModel.getValueAt(r, 3).toString();
        String soyisim = dataModel.getValueAt(r, 4).toString();
        String eposta = dataModel.getValueAt(r, 5).toString();
        String telefon = dataModel.getValueAt(r, 6).toString();
        Akademisyen_Guncelleme af= new Akademisyen_Guncelleme(sicil, anabilim, unvan, isim, soyisim, eposta, telefon,r);
        af.setLocationRelativeTo(this);
        af.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = Ogrenci_Tablo.getSelectedRow();
        DefaultTableModel dataModel = (DefaultTableModel) Ogrenci_Tablo.getModel();
        String No = dataModel.getValueAt(r, 0).toString();
        String isim = dataModel.getValueAt(r, 1).toString();
        String soyisim =  dataModel.getValueAt(r, 2).toString();
        String bolum = dataModel.getValueAt(r, 3).toString();
        String kayitYili = dataModel.getValueAt(r, 4).toString();
        String eposta = dataModel.getValueAt(r, 5).toString();
        String telefon = dataModel.getValueAt(r, 6).toString();
        Ogrenci_Guncelleme of = new Ogrenci_Guncelleme(No, isim, soyisim, bolum, kayitYili, eposta, telefon,r);
        of.setLocationRelativeTo(this);
        of.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int r = Ogrenci_Tablo.getSelectedRow();
        //File f = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen.TXT").getFile());
        //File temp = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen_temp.TXT").getFile());
        File f = new File("E:\\veriTaban\\akademisyen.txt");
        File temp = new File("E:\\veriTaban\\akademisyen_temp.txt");
        String satir="";
        //String silinecek="";
        DefaultTableModel dataModel = (DefaultTableModel) Ogrenci_Tablo.getModel();
        dataModel.removeRow(r);
        
        try {
            for (int i = 0; i < dataModel.getColumnCount(); i++) {
            satir+= dataModel.getValueAt(r, i)+"/";
            }
        satir+= dataModel.getValueAt(r, dataModel.getColumnCount());
            PrintWriter p = new PrintWriter(temp);
            Scanner k = new Scanner(f);
            while (k.hasNext()) {
                String next = k.nextLine().trim();
                if (satir.equals(next))
                    continue;
                p.println(next);
                
            }
            temp.renameTo(f);
            JOptionPane.showMessageDialog(null, "akademisyen Basariyla Silindi", "Silme", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "hata Olustu", "Silme", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int r = Ogrenci_Tablo.getSelectedRow();
        //File f = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.TXT").getFile());
        //File f = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.TXT").getFile());
        File f = new File("E:\\veriTaban\\ogrenci.txt");
        //File temp = new File("E:\\veriTaban\\ogrenci_temp.txt");
        String satir="";
        String silinecek="";
        String XX="";
        PrintWriter p = null;
        DefaultTableModel dataModel = (DefaultTableModel) Ogrenci_Tablo.getModel();
        try {
            
            for (int i = 0; i < dataModel.getColumnCount()-1;i++) {
            silinecek+= dataModel.getValueAt(r, i)+"/";
            }
            silinecek+= dataModel.getValueAt(r, dataModel.getColumnCount()-1);
            System.out.println(silinecek);
            silinecek = silinecek.trim();
            
            Scanner k = new Scanner(f);
            while (k.hasNext()) {
                satir="";
                String next = k.nextLine();
                String ke[]=next.split("/");
                for (int i = 0; i < ke.length-1; i++) {
                    satir= satir +ke[i].trim()+"/";
                    //System.out.println(ke[i].trim()+"-*-*-*");
                }
                satir+=ke[ke.length-1].trim();
                
                if (silinecek.equalsIgnoreCase(satir)){
                    System.out.println("BULUNDU *******************");
                    //System.out.println("//"+next+"//");
                    
                }
                else{
                    XX+=next+"\n";
                }
                    
            }
            System.out.println("---------");
            System.out.println(XX);
            
            p = new PrintWriter(f);
            p.println(XX);
            p.close();
            
            JOptionPane.showMessageDialog(null, "Ogrenci Basariyla Silindi", "Silme", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "hata Olustu", "Silme", JOptionPane.INFORMATION_MESSAGE);
            
        }
        finally{
            
            //dataModel.removeRow(r);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setEnabled(false);
        this.setVisible(false);
        Idari idari = new Idari();
        idari.setLocationRelativeTo(null);
        idari.setVisible(true);
        idari.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Idari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Akadmisyen_Tablo;
    private javax.swing.JTable Ogrenci_Tablo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private void show_ogrnci() {
        //File f = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.TXT").getFile());
        File f = new File("E:\\veriTaban\\ogrenci.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) Ogrenci_Tablo.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines =br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void show_Akademisyen() {
        //File f = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen.TXT").getFile());
        File f = new File("E:\\veriTaban\\akademisyen.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) Akadmisyen_Tablo.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines =br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
