package com.atm.odev.islemler;
import com.atm.odev.musteri.Musteri;
import com.atm.odev.musteri.Musteriler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BakiyeIslemleri {

    static Scanner scan = new Scanner(System.in);
    public static float bakiyeGir(Musteri musteri){

        while (true){
            try
            {
                return scan.nextFloat();
            }
            catch (InputMismatchException e)
            {
                scan.next();
                System.out.println("Lütfen bir sayı giriniz.");
            }
        }

    }


    public static void paraYatir(Musteri musteri){
            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
            float miktar = bakiyeGir(musteri);
            float bakiye = musteri.getHesapBakiyesi();
            musteri.setHesapBakiyesi(bakiye + miktar);
            System.out.println("Güncel Bakiyeniz: " + musteri.getHesapBakiyesi());
    }

    public static void paraCek(Musteri musteri){
        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        float miktar = bakiyeGir(musteri);
        float bakiye = musteri.getHesapBakiyesi();

        if(miktar > bakiye){
            System.out.println("Yetersiz Bakiye.. \n İslem yapılamıyor.\n");
        }else {
            musteri.setHesapBakiyesi(bakiye - miktar);
        }
        System.out.println("Güncel Bakiyeniz: " + musteri.getHesapBakiyesi());

    }




    public static void islemSec(Musteri musteri){
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1- Para Yatırma \n" +
                "2- Para Çekme" );
        String islemNo = scan.nextLine();

        switch (islemNo){
            case "1":
                BakiyeIslemleri.paraYatir(musteri);
                scan.nextLine();
                break;
            case "2":
                BakiyeIslemleri.paraCek(musteri);
                scan.nextLine();
                break;
            default:
                System.out.println("Yanlıs işlem seçimi.");
                break;
        }
        yeniIslem(musteri);

    }

    public static void yeniIslem(Musteri musteri){

        System.out.println("Yeni bir işlem yapmak istiyor musunuz? e/h");
            String yanit = scan.nextLine();
                switch (yanit){
                    case "e":
                        islemSec(musteri);
                        break;
                    case "h":
                        System.out.println("Cıkıs yapılıyor..");
                        break;
                    default:
                        System.out.println("Yanlıs işlem seçimi.");
                        yeniIslem(musteri);
                        break;
                }

    }

}
