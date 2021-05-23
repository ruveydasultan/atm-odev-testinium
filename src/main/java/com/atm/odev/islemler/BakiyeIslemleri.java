package com.atm.odev.islemler;
import com.atm.odev.musteri.Musteri;
import java.util.Scanner;

public class BakiyeIslemleri {

    static Scanner scan = new Scanner(System.in);
    public static void paraYatir(Musteri musteri){
        System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
        float tutar = scan.nextFloat();
        float bakiye = musteri.getHesapBakiyesi();
        musteri.setHesapBakiyesi(bakiye + tutar);
        System.out.println("Güncel Bakiyeniz: " + musteri.getHesapBakiyesi());
    }

    public static void paraCek(Musteri musteri){
        System.out.println("Çekmek istediğiniz miktarı giriniz: ");
        float tutar = scan.nextFloat();
        float bakiye = musteri.getHesapBakiyesi();

        if(tutar > bakiye){
            System.out.println("Yetersiz Bakiye.. \n İslem yapılamıyor.\n");
        }else {
            musteri.setHesapBakiyesi(bakiye - tutar);
        }
        System.out.println("Güncel Bakiyeniz: " + musteri.getHesapBakiyesi());

    }

}
