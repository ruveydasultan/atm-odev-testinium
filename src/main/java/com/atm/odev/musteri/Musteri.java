package com.atm.odev.musteri;

public class Musteri {
    private String tcKimlikNo;
    private String adSoyad;
    private float hesapBakiyesi;
    private String musteriNo;

    public Musteri(String musteriNo, String tcKimlikNo, String adSoyad, float hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNo = musteriNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }


    public void yazdir(){
        System.out.println("Ad Soyad: " + getAdSoyad() + "\n" +
                "TC Kimlik No: " + getTcKimlikNo()+"\n" +
                "Hesap Bakiyesi: " + getHesapBakiyesi());

    }


}
