/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenyewaanstudiomgrproud;

/**
 *
 * @author aryos
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.awt.Container;
import aplikasipenyewaanstudiomgrproud.koneksi;
import javax.swing.JOptionPane;
import java.io.File;

public class DataOperator extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form DataOperator
     */
    public DataOperator() {
        initComponents();
        datatableoperator();
        setLocationRelativeTo(this);
    }
   
    protected void aktif() {
        txtidop.setEnabled(true);
        txtnamaop.setEnabled(true);
        txtalmop.setEnabled(true);
        txtnotelpop.setEnabled(true);
        txtidop.requestFocus();
    }
    
    protected void kosong() {
        txtidop.setText("");
        txtnamaop.setText("");
        txtalmop.setText("");
        txtnotelpop.setText("");
    }
    
    protected void datatableoperator() {
        Object[] Baris = {"Id Operator", "Nama Operator", "Alamat Operator", "No telp operator"};
        tabmode = new DefaultTableModel(null, Baris);
        tabeloperator.setModel(tabmode);
        String sql = "select * from dataoperator";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("id_operator");
                String b = hasil.getString("nama_operator");
                String c = hasil.getString("alamat_operator");
                String d = hasil.getString("notelp_operator");
                String[] data = {a, b, c, d};
                tabmode.addRow(data);
            }
        } catch (Exception e) {

        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidop = new javax.swing.JTextField();
        txtnamaop = new javax.swing.JTextField();
        txtnotelpop = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalmop = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeloperator = new javax.swing.JTable();
        btnsaveop = new javax.swing.JButton();
        btneditop = new javax.swing.JButton();
        btndeleteop = new javax.swing.JButton();
        btnbackop = new javax.swing.JButton();
        btndeleteop1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA OPERATOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 51));

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        jLabel2.setText("ID OPERATOR");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        jLabel3.setText("ALAMAT OPERATOR");

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        jLabel4.setText("NAMA OPERATOR");

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        jLabel5.setText("NO.TELP OPERATOR");

        txtidop.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N

        txtnamaop.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N

        txtnotelpop.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N

        txtalmop.setColumns(20);
        txtalmop.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        txtalmop.setRows(5);
        jScrollPane1.setViewportView(txtalmop);

        tabeloperator.setFont(new java.awt.Font("Perpetua", 0, 12)); // NOI18N
        tabeloperator.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeloperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeloperatorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeloperator);

        btnsaveop.setBackground(new java.awt.Color(255, 255, 255));
        btnsaveop.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        btnsaveop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        btnsaveop.setText("SAVE");
        btnsaveop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveopActionPerformed(evt);
            }
        });

        btneditop.setBackground(new java.awt.Color(255, 255, 255));
        btneditop.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        btneditop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.jpg"))); // NOI18N
        btneditop.setText("EDIT");
        btneditop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditopActionPerformed(evt);
            }
        });

        btndeleteop.setBackground(new java.awt.Color(255, 255, 255));
        btndeleteop.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        btndeleteop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/clear.png"))); // NOI18N
        btndeleteop.setText("CLEAR");
        btndeleteop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteopActionPerformed(evt);
            }
        });

        btnbackop.setBackground(new java.awt.Color(255, 255, 255));
        btnbackop.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        btnbackop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        btnbackop.setText("BACK");
        btnbackop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackopActionPerformed(evt);
            }
        });

        btndeleteop1.setBackground(new java.awt.Color(255, 255, 255));
        btndeleteop1.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        btndeleteop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        btndeleteop1.setText("DELETE");
        btndeleteop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteop1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btndeleteop))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnsaveop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneditop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndeleteop1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbackop))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnotelpop, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnamaop)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtidop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnamaop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndeleteop)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnotelpop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsaveop)
                            .addComponent(btneditop)
                            .addComponent(btndeleteop1))
                        .addGap(22, 22, 22))
                    .addComponent(btnbackop, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveopActionPerformed
        // TODO add your handling code here:
        String sql = "insert into dataoperator values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtidop.getText());
            stat.setString(2, txtnamaop.getText());
            stat.setString(3, txtalmop.getText());
            stat.setString(4, txtnotelpop.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtidop.requestFocus();
            datatableoperator();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_btnsaveopActionPerformed

    private void tabeloperatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeloperatorMouseClicked
        // TODO add your handling code here:
        int bar = tabeloperator.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();

        txtidop.setText(a);
        txtnamaop.setText(b);
        txtalmop.setText(c);
        txtnotelpop.setText(d);
    }//GEN-LAST:event_tabeloperatorMouseClicked

    private void btndeleteopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteopActionPerformed
        // TODO add your handling code here:
        kosong();
        datatableoperator();
    }//GEN-LAST:event_btndeleteopActionPerformed

    private void btneditopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditopActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update dataoperator set nama_operator=?,alamat_operator=?,notelp_operator=? where id_operator =?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnamaop.getText());
            stat.setString(2, txtalmop.getText());
            stat.setString(3, txtnotelpop.getText());
            stat.setString(4, txtidop.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            txtidop.requestFocus();
            datatableoperator();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_btneditopActionPerformed

    private void btndeleteop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteop1ActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            String sql = "Delete From dataoperator where id_operator ='" + txtidop.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil Dihapus");
                kosong();
                txtidop.requestFocus();
                datatableoperator();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" + e);
            }
        }
    }//GEN-LAST:event_btndeleteop1ActionPerformed

    private void btnbackopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackopActionPerformed
        // TODO add your handling code here:
        new menuutama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackopActionPerformed

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
            java.util.logging.Logger.getLogger(DataOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataOperator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbackop;
    private javax.swing.JButton btndeleteop;
    private javax.swing.JButton btndeleteop1;
    private javax.swing.JButton btneditop;
    private javax.swing.JButton btnsaveop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabeloperator;
    private javax.swing.JTextArea txtalmop;
    private javax.swing.JTextField txtidop;
    private javax.swing.JTextField txtnamaop;
    private javax.swing.JTextField txtnotelpop;
    // End of variables declaration//GEN-END:variables
}
