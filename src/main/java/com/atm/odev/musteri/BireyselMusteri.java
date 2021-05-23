package com.atm.odev.musteri;

public class BireyselMusteri extends Musteri{

    private String evAdresi;

    public BireyselMusteri(String musteriNo, String tcKimlikNo, String adSoyad, float hesapBakiyesi, String evAdresi) {
        super(musteriNo, tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi= evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void yazdir() {
        super.yazdir();
        System.out.println("Ev Adresi: " +getEvAdresi());
    }
}
