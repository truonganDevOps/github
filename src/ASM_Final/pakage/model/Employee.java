package ASM_Final.pakage.model;

import java.io.Serializable;

public class Employee implements Serializable{
    
    private String MaNV,hoTen,email;
    private int tuoi;
    private double luong;
    private String fileHinh;

    public String getFileHinh() {
        return fileHinh;
    }

    public void setFileHinh(String fileHinh) {
        this.fileHinh = fileHinh;
    }

    public Employee() {
    }

    public Employee(String MaNV, String hoTen, String email, int tuoi, double luong) {
        this.MaNV = MaNV;
        this.hoTen = hoTen;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
