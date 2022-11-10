package com.example.ps21601.fpolylibary.model;

public class Sach {
    private int id_sach;
    private String ma_sach, namxb_sach, ten_sach;

    public Sach(int id_sach, String ma_sach, String namxb_sach, String ten_sach) {
        this.id_sach = id_sach;
        this.ma_sach = ma_sach;
        this.namxb_sach = namxb_sach;
        this.ten_sach = ten_sach;
    }

    public int getId_sach() {
        return id_sach;
    }

    public void setId_sach(int id_sach) {
        this.id_sach = id_sach;
    }

    public String getMa_sach() {
        return ma_sach;
    }

    public void setMa_sach(String ma_sach) {
        this.ma_sach = ma_sach;
    }

    public String getNamxb_sach() {
        return namxb_sach;
    }

    public void setNamxb_sach(String namxb_sach) {
        this.namxb_sach = namxb_sach;
    }

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }
}
