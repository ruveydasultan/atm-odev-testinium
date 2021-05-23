package com.atm.odev;
import com.atm.odev.islemler.BakiyeIslemleri;
import com.atm.odev.musteri.Musteri;
import com.atm.odev.musteri.Musteriler;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz.. Müşteri No Giriniz: ");
        Scanner scan = new Scanner(System.in);
        String musteriNo = scan.nextLine();

        Musteriler.musteriListesi().get(musteriNo).yazdir();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1- Para Yatırma \n" +
                "2- Para Çekme" );
        String islemNo = scan.nextLine();

        switch (islemNo){
            case "1":
                BakiyeIslemleri.paraYatir(Musteriler.musteriListesi().get(musteriNo));
                break;
            case "2":
                BakiyeIslemleri.paraCek(Musteriler.musteriListesi().get(musteriNo));
                break;
        }


    }
}


