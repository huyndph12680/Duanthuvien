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
public class user {
    private String user;
    private String pass;
    private boolean role;
    private String manv;

    public user() {
    }

    public user(String user, String pass, boolean role, String manv) {
        this.user = user;
        this.pass = pass;
        this.role = role;
        this.manv = manv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("user{user=").append(user);
        sb.append(", pass=").append(pass);
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
    
    
}
