/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.view;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import sof2041.conect.DBconnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.BreakTree;
import sof2041.Dao_service.Dao_serviec;
import sof2041.object.ChucVu;
import sof2041.object.NhanVien;
import sof2041.object.PhongBan;

/**
 *
 * @author Admin
 */
public class mainfrom extends javax.swing.JFrame {

    login li = new login();
    Connection con;
    Dao_serviec _Dao = new Dao_serviec();
    String head[] = {"Mã NV", "Họ tên", "Ngày Sinh", "Địa chỉ", "Dân Tộc", "Chức vụ", "Giới tính", "Số Điện thoại", "Mã PB", "Lương"};
    DefaultTableModel model;
    DefaultComboBoxModel<Object> combochucvu = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<Object> combophongban = new DefaultComboBoxModel<>();
    addchucvu adcv = new addchucvu();
    addnhanvien adnv = new addnhanvien();
    addphongban adpb = new addphongban();
    adduser adus = new adduser();
    viewnhanvien viewnv = new viewnhanvien();
    changpass changpass = new changpass();
    infophongban iff = new infophongban();
    /**
     * Creates new form mainfrom
     */
    public mainfrom() {
        initComponents();
        try {
            con = DBconnect.getconnect("QLthongtin");
        } catch (Exception e) {
            System.out.println("LỖI " + e);
        }
//        model.setRowCount(0);
        filltable();

        fillcombo();
        setLocationRelativeTo(this);
//        getnhanvien();

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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUser = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuThongke = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnunhanvien = new javax.swing.JMenu();
        mniListNV = new javax.swing.JMenuItem();
        mniadnv = new javax.swing.JMenuItem();
        mniupdate = new javax.swing.JMenuItem();
        mnuThemkhac = new javax.swing.JMenu();
        mniaddcv = new javax.swing.JMenuItem();
        mniadphongban = new javax.swing.JMenuItem();
        mnuInfo = new javax.swing.JMenu();
        mniifphongban = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN ");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản Lý Nhân viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 19, 183, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\anh\\1200px-FPT_Polytechnic.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1310, 600));

        mnuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mnuUser.setText("Tài khoản ");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        jMenuItem2.setText("Thêm tài khoản");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuUser.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Key.png"))); // NOI18N
        jMenuItem3.setText("đổi mật khẩu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuUser.add(jMenuItem3);

        jMenuBar1.add(mnuUser);

        mnuThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar chart.png"))); // NOI18N
        mnuThongke.setText("Thống kê");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Numbered list.png"))); // NOI18N
        jMenuItem4.setText("Tổng số nhân viên");
        mnuThongke.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Application form.png"))); // NOI18N
        jMenuItem5.setText("Thống kê theo chức vụ");
        mnuThongke.add(jMenuItem5);

        jMenuBar1.add(mnuThongke);

        mnunhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mnunhanvien.setText("Nhân viên");

        mniListNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        mniListNV.setText("Danh sách nhân viên");
        mniListNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListNVActionPerformed(evt);
            }
        });
        mnunhanvien.add(mniListNV);

        mniadnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add to basket.png"))); // NOI18N
        mniadnv.setText("thêm nhân viên");
        mniadnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniadnvActionPerformed(evt);
            }
        });
        mnunhanvien.add(mniadnv);

        mniupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Upload.png"))); // NOI18N
        mniupdate.setText("Cập nhập thông tin nhân viên");
        mniupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniupdateActionPerformed(evt);
            }
        });
        mnunhanvien.add(mniupdate);

        jMenuBar1.add(mnunhanvien);

        mnuThemkhac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        mnuThemkhac.setText("Thêm khác");

        mniaddcv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        mniaddcv.setText("thêm chức vụ");
        mniaddcv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniaddcvActionPerformed(evt);
            }
        });
        mnuThemkhac.add(mniaddcv);

        mniadphongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Company.png"))); // NOI18N
        mniadphongban.setText("Thêm phòng ban");
        mniadphongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniadphongbanActionPerformed(evt);
            }
        });
        mnuThemkhac.add(mniadphongban);

        jMenuBar1.add(mnuThemkhac);

        mnuInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        mnuInfo.setText("Thông tin  ");

        mniifphongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Book.png"))); // NOI18N
        mniifphongban.setText("Thông tin Phòng ban");
        mniifphongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniifphongbanActionPerformed(evt);
            }
        });
        mnuInfo.add(mniifphongban);

        jMenuBar1.add(mnuInfo);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        jMenu2.setText("Thoát ");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniaddcvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniaddcvActionPerformed
        adcv.setVisible(true);
    }//GEN-LAST:event_mniaddcvActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        adus.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        changpass.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mniadphongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniadphongbanActionPerformed
        // TODO add your handling code here:
        adpb.setVisible(true);
    }//GEN-LAST:event_mniadphongbanActionPerformed

    private void mniListNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListNVActionPerformed
        // TODO add your handling code here:
        viewnv.setVisible(true);
    }//GEN-LAST:event_mniListNVActionPerformed

    private void mniadnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniadnvActionPerformed
        // TODO add your handling code here:
        adnv.setVisible(true);
    }//GEN-LAST:event_mniadnvActionPerformed

    private void mniupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniupdateActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mniupdateActionPerformed
    login lg = new login();
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
            this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mniifphongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniifphongbanActionPerformed
        // TODO add your handling code here:
        iff.setVisible(true);
    }//GEN-LAST:event_mniifphongbanActionPerformed

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
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainfrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainfrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mniListNV;
    private javax.swing.JMenuItem mniaddcv;
    private javax.swing.JMenuItem mniadnv;
    private javax.swing.JMenuItem mniadphongban;
    private javax.swing.JMenuItem mniifphongban;
    private javax.swing.JMenuItem mniupdate;
    private javax.swing.JMenu mnuInfo;
    private javax.swing.JMenu mnuThemkhac;
    private javax.swing.JMenu mnuThongke;
    private javax.swing.JMenu mnuUser;
    private javax.swing.JMenu mnunhanvien;
    // End of variables declaration//GEN-END:variables
//public void getnhanvien() {
//        String sql = "SELECT * FROM dbo.nhanvien WHERE  manv LIKE " + "'" + li.manv + "'";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, li.manv);
//
//            ResultSet rs = ps.executeQuery();
//            txtmanv.setText(rs.getString(1));
//            txtfullname.setText(rs.getString(2));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    private void filltable() {
        model = new DefaultTableModel(head, 0);
        for (NhanVien x : _Dao.getlstnhanvien()) {
            model.addRow(new Object[]{x.getManv(), x.getHoten(), x.getNgaysinh(),
                x.getDiachi(), x.getDantoc(), x.getMachucvu(), x.getGioitinh(), x.getSdt().trim(),
                x.getMapb(), x.getLuong()});
//            System.out.println("x" + x);
        }
    }

    private void fillcombo() {

        for (ChucVu x : _Dao.getlstchucvu()) {
            combochucvu.addElement(x.getTencv());
//            System.out.println("x" + x.toString().trim());
        }
        for (PhongBan x : _Dao.getlstphongban()) {
            combophongban.addElement(x.getTenpb());
//            System.out.println("x" + x.toString().trim());
        }
    }

    public boolean checkrong(String string) {
        if (string.isBlank()) {
            JOptionPane.showMessageDialog(this, "không được để trống ");
            return false;
        }
        return true;
    }
}