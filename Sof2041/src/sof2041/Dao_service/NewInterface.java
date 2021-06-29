/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.Dao_service;

import java.util.ArrayList;
import java.util.List;
import sof2041.object.ChucVu;
import sof2041.object.NhanVien;
import sof2041.object.PhongBan;
import sof2041.object.user;

/**
 *
 * @author Admin
 */
public interface NewInterface {
    List<user> getlistuser();
    List<NhanVien> getlstnhanvien();
    List<ChucVu>getlstchucvu();
    List<PhongBan> getlstphongban();
    user adduser (String user , String pass , int role,String manv);
    
}
