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
public class PhongBan {
   private String mapb,tenpb,diachipb,sdtpb;

    public PhongBan() {
    }

    public PhongBan(String mapb, String tenpb, String diachipb, String sdtpb) {
        this.mapb = mapb;
        this.tenpb = tenpb;
        this.diachipb = diachipb;
        this.sdtpb = sdtpb;
    }

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getTenpb() {
        return tenpb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    public String getDiachipb() {
        return diachipb;
    }

    public void setDiachipb(String diachipb) {
        this.diachipb = diachipb;
    }

    public String getSdtpb() {
        return sdtpb;
    }

    public void setSdtpb(String sdtpb) {
        this.sdtpb = sdtpb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PhongBan{mapb=").append(mapb);
        sb.append(", tenpb=").append(tenpb);
        sb.append(", diachipb=").append(diachipb);
        sb.append(", sdtpb=").append(sdtpb);
        sb.append('}');
        return sb.toString();
    }
   
}
