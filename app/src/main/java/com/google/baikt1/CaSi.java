package com.google.baikt1;

public class CaSi {
    private String tentacgia;
    private String tenquocgia;
    private String nghedanh;
    private String sosao;
    private int hinh;

    public CaSi( String tentacgia, String tenquocgia, String nghedanh, String sosao, int hinh) {
        this.tentacgia = tentacgia;
        this.tenquocgia = tenquocgia;
        this.nghedanh = nghedanh;
        this.sosao = sosao;
        this.hinh = hinh;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTenquocgia() {
        return tenquocgia;
    }

    public void setTenquocgia(String tenquocgia) {
        this.tenquocgia = tenquocgia;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
