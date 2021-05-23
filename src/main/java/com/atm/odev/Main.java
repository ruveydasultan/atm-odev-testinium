package com.atm.odev;
import com.atm.odev.islemler.BakiyeIslemleri;
import com.atm.odev.islemler.GirisYap;
import com.atm.odev.musteri.Musteriler;

public class Main{

    public static void main(String[] args) {

        System.out.println("Hoşgeldiniz.. Müşteri No Giriniz: ");
        String musteriNo = GirisYap.musteriNoGir();
        BakiyeIslemleri.islemSec(Musteriler.musteriListesi().get(musteriNo));

    }
}


