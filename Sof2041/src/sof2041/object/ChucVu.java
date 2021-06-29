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
public class ChucVu {
    private String macv,tencv;

    public ChucVu() {
    }

    public ChucVu(String macv, String tencv) {
        this.macv = macv;
        this.tencv = tencv;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "macv=" + macv + ", tencv=" + tencv + '}';
    }
    
    
}
