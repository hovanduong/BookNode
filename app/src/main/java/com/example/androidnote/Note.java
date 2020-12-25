package com.example.androidnote;

public class Note {
    private String tieude;
    private String ngay;
    private String noidung;

    public Note(String tieude, String ngay, String noidung) {
        this.tieude = tieude;
        this.ngay = ngay;
        this.noidung = noidung;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
