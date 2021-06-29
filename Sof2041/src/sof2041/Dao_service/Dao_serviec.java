/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.Dao_service;

import java.util.List;
import sof2041.object.user;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sof2041.conect.DBconnect;
import sof2041.object.ChucVu;
import sof2041.object.NhanVien;
import sof2041.object.PhongBan;

/**
 *
 * @author Admin
 */
public class Dao_serviec implements NewInterface {

    List<user> lstuser ;
    List<NhanVien> lstnhanvien;
    List<ChucVu> lstchucvu;
    List<PhongBan> lstphongban ;
    Connection con;

    public Dao_serviec() {
        try {
            con = DBconnect.getconnect("QLthongtin");
        } catch (Exception e) {
            System.out.println("LỖI " + e);
        }
    }

    @Override
    public List<user> getlistuser() {
        lstuser = new ArrayList<>();
        String sql = "SELECT * FROM dbo.taikhan";
        try {
            Connection con = DBconnect.getconnect("QLthongtin");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lstuser.add(new user(rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getString(5)));
            }
            return lstuser;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<NhanVien> getlstnhanvien() {
       lstnhanvien = new ArrayList<>();
        String sql = "SELECT * FROM dbo.nhanvien";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lstnhanvien.add(new NhanVien(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getFloat(10)));

            }
            return lstnhanvien;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<ChucVu> getlstchucvu() {
        String sql = "SELECT * FROM dbo.CHUCVU";
        try {
            lstchucvu = new ArrayList<>();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lstchucvu.add(new ChucVu(rs.getString(1), rs.getString(2)));
            }
            return lstchucvu;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<PhongBan> getlstphongban() {
       lstphongban = new ArrayList<>();
        String sql = "SELECT * FROM dbo.phongban";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                lstphongban.add(new PhongBan(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return lstphongban;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public user adduser(String user, String pass, int role, String manv) {
        String sql = "INSERT INTO dbo.taikhan(taikhoan, matkhau, vaitro, manv) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, role);
            ps.setString(4, manv);
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Thêm tài khoản thành công", "thông báo ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean checkrong(String string) {
        if (string.isBlank()) {
            return false;
        }
        return true;
    }

}
