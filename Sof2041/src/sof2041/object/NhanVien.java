/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sof2041.object;

/**
 *
 * @author Admin
 */
public class NhanVien {
   private String manv;
   String hoten;
   String ngaysinh;
   String diachi;
   int gioitinh;
   String dantoc;
   String sdt;
   String mapb;
   String machucvu;
   private float luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, String ngaysinh, String diachi, int gioitinh, String dantoc, String sdt, String mapb, String machucvu, float luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.dantoc = dantoc;
        this.sdt = sdt;
        this.mapb = mapb;
        this.machucvu = machucvu;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVien{manv=").append(manv);
        sb.append(", hoten=").append(hoten);
        sb.append(", ngaysinh=").append(ngaysinh);
        sb.append(", diachi=").append(diachi);
        sb.append(", gioitinh=").append(gioitinh);
        sb.append(", dantoc=").append(dantoc);
        sb.append(", sdt=").append(sdt);
        sb.append(", mapb=").append(mapb);
        sb.append(", machucvu=").append(machucvu);
        sb.append(", luong=").append(luong);
        sb.append('}');
        return sb.toString();
    }
   
            }
