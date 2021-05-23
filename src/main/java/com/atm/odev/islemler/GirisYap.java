package com.atm.odev.islemler;

import com.atm.odev.musteri.Musteriler;

import java.util.Scanner;

public class GirisYap {
    static Scanner scan = new Scanner(System.in);

    public static String musteriNoGir(){
        String musteriNo;
        while (true){
            musteriNo = scan.nextLine();
            if(Musteriler.musteriListesi().containsKey(musteriNo)){
                Musteriler.musteriListesi().get(musteriNo).yazdir();
                break;
            }
            else {
                System.out.println("Böyle bir müşteri bulunmamaktadır. \n" +
                        "Lütfen varolan bir müşteri no giriniz.");
            }
        }

        return musteriNo;
    }

}

