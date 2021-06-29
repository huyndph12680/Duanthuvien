/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.view;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import sof2041.object.NhanVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import sof2041.Dao_service.Dao_serviec;
import sof2041.conect.DBconnect;
import sof2041.object.ChucVu;
import sof2041.object.PhongBan;
import sof2041.object.user;

/**
 *
 * @author Admin
 */
public class addnhanvien extends javax.swing.JFrame {

    List<ChucVu> lstcv = new ArrayList<>();
    Dao_serviec _dao = new Dao_serviec();
    Connection con;
    List<NhanVien> lstnhanvien = new ArrayList<>();
    DefaultComboBoxModel<Object> combochucvu = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<Object> combophongban = new DefaultComboBoxModel<>();

    /**
     * Creates new form addnhanvien
     */
    public addnhanvien() {
        initComponents();
        try {
            con = DBconnect.getconnect("QLthongtin");
        } catch (Exception e) {
            System.out.println("LỖI " + e);
        }
        setLocationRelativeTo(this);
        cboPhongban.setModel((DefaultComboBoxModel) combophongban);
        cbochucvu.setModel((DefaultComboBoxModel) combochucvu);
        fillcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        txtdateofbriday = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdantoc = new javax.swing.JTextField();
        rdbnam = new javax.swing.JRadioButton();
        rdbnu = new javax.swing.JRadioButton();
        txtsdt = new javax.swing.JTextField();
        cboPhongban = new javax.swing.JComboBox<>();
        cbochucvu = new javax.swing.JComboBox<>();
        btnsave = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        lblchucvu = new javax.swing.JLabel();
        lblphongban = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã NV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Lương");

        jLabel8.setText("Quê quán");

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        jLabel9.setText("Ngày sinh ( theo mẫu 01/01/2001)");

        jLabel10.setText("Giới tính");

        jLabel11.setText("Dân tộc");

        jLabel12.setText("SĐT");

        jLabel13.setText("Phòng ban");

        jLabel14.setText("Chức Vụ");

        buttonGroup1.add(rdbnam);
        rdbnam.setText("Nam");

        buttonGroup1.add(rdbnu);
        rdbnu.setText("Nữ");
        rdbnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnuActionPerformed(evt);
            }
        });

        cboPhongban.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPhongbanItemStateChanged(evt);
            }
        });

        cbochucvu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbochucvuItemStateChanged(evt);
            }
        });
        cbochucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvuActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnsave.setText("Lưu Lại ");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnthoat.setText("thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        lblchucvu.setText("maCV");

        lblphongban.setText("Mapb");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsdt)
                                    .addComponent(txtdantoc)
                                    .addComponent(txtfullname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtmanv, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdbnam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbnu)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cbochucvu, 0, 219, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtsalary))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPhongban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsave)
                        .addGap(33, 33, 33)
                        .addComponent(btnthoat)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblphongban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblchucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdateofbriday, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdateofbriday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rdbnam)
                            .addComponent(rdbnu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboPhongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblphongban)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbochucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(lblchucvu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnthoat))
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbnuActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if (checkrong(txtdantoc.getText()) || checkrong(txtdiachi.getText()) || checkrong(txtfullname.getText()) || checkrong(txtmanv.getText())
                || checkrong(txtsalary.getText()) || checkrong(txtsdt.getText()) ||  checknumber(txtsalary.getText())) {
            try {
                 for (NhanVien x : _dao.getlstnhanvien()) {
//                System.out.println(x);
                if (txtmanv.getText().equals(x.getManv().toString().trim())) {
                    JOptionPane.showMessageDialog(this, "Mã Nhân viên trùng", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    break;
                }    
            } 
                    String sql = "INSERT INTO dbo.nhanvien(manv, hoten, ngaysinh, diachi, gioitinh, dantoc, sdt, mapb, machucvu, luong)\n"
                            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
                    try {
                        PreparedStatement ps = con.prepareStatement(sql);
                        ps.setString(1, txtmanv.getText());
                        ps.setString(2, txtfullname.getText());
                        ps.setString(3, txtdateofbriday.getText());
                        ps.setString(4, txtdiachi.getText());
                        ps.setInt(5, rdbnam.isSelected() ? 1 : 0);
                        ps.setString(6, txtdantoc.getText());
                        ps.setString(7, txtsdt.getText());
                        ps.setString(8, lblphongban.getText());
                        ps.setString(9, lblchucvu.getText());
                        ps.setString(10, txtsalary.getText());
                        int i = ps.executeUpdate();
                        if (i > 0) {
                            JOptionPane.showMessageDialog(this, "thêm thành công !", "thông báo ", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "không thành công ");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                
           
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "không được để trống ");
        }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cboPhongbanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPhongbanItemStateChanged
        // TODO add your handling code here:
        int index = cboPhongban.getSelectedIndex();
        if (index != -1) {
            PhongBan pb = _dao.getlstphongban().get(index);
            lblphongban.setText(pb.getMapb());
        }

    }//GEN-LAST:event_cboPhongbanItemStateChanged
//    viewnhanvien view = new viewnhanvien();
    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
//       view.setVisible(true);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void cbochucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvuActionPerformed
        // TODO add your handling code here:
//           

    }//GEN-LAST:event_cbochucvuActionPerformed

    private void cbochucvuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbochucvuItemStateChanged
        // TODO add your handling code here:
//           try {
//            System.out.println(evt);
        int index = cbochucvu.getSelectedIndex();
        if (index != -1) {
            System.out.println(index);
//                System.out.println("test: " +_dao.getlstchucvu().size());
            ChucVu cv = _dao.getlstchucvu().get(index);
            lblchucvu.setText(cv.getMacv());
//                System.out.println("in " + index);
//                System.out.println("cv " + cv.getMacv());
//                System.out.println("cv " + cbochucvu.getSelectedItem());
        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_cbochucvuItemStateChanged
    public boolean checkrong(String string) {
        if (string.isBlank()) {

            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(addnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnhanvien().setVisible(true);
            }
        });
    }
public boolean checknumber(String string) {
        try {
            Float price = Float.parseFloat(string);
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, string + " phải nhập bằng số !");
            return true;
        }
}
    private void fillcombo() {
        for (ChucVu x : _dao.getlstchucvu()) {
            combochucvu.addElement(x.getTencv());
//            System.out.println("x"+x);
        }
        for (PhongBan x : _dao.getlstphongban()) {
            combophongban.addElement(x.getTenpb().trim());
//            System.out.println("x"+x);
        }
    }

    public String returcombochucvu() {
        for (ChucVu x : _dao.getlstchucvu()) {

        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnthoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboPhongban;
    private javax.swing.JComboBox<String> cbochucvu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblchucvu;
    private javax.swing.JLabel lblphongban;
    private javax.swing.JRadioButton rdbnam;
    private javax.swing.JRadioButton rdbnu;
    private javax.swing.JTextField txtdantoc;
    private javax.swing.JTextField txtdateofbriday;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}
