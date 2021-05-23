package com.atm.odev.musteri;

public class KurumsalMusteri extends Musteri{
    private String sirketAdi;

    public KurumsalMusteri(String musteriNo, String tcKimlikNo, String adSoyad, float hesapBakiyesi, String sirketAdi) {
        super(musteriNo, tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }


    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Sirket Adi: " + getSirketAdi());
    }
}
