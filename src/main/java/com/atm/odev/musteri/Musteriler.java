package com.atm.odev.musteri;

import java.util.HashMap;

public class Musteriler {

    public static Musteri bireyselMusteri1(){
        return new BireyselMusteri("1093838","444745930", "ruveyda anacoglu" , 200.0f ,"ata mah.");
    }
    public static Musteri bireyselMusteri2(){
        return new BireyselMusteri("1074746","22974673592" , "sakir ertugrul" , 4567.63f , "ugur mumcu mah." );
    }

    public static Musteri bireyselMusteri3(){
        return new BireyselMusteri("1083737","43678394736" , "tarık anacoglu" , 6782.038f, "sekerpınar mah.");
    }

    public static Musteri kurumsalMusteri1(){
        return new KurumsalMusteri("1073737","23418208624" , "sibel becet" , 7883.98f, "ulusoy mah.");
    }

    public static Musteri kurumsalMusteri2(){
        return new KurumsalMusteri("1066463","325667" ,"kerem alp" , 0.0f, "kuzguncuk mah.");
    }


    public static HashMap<String, Musteri> musteriListesi(){
        HashMap<String, Musteri> musteriHashMap =new HashMap<String, Musteri>();
        musteriHashMap.put(Musteriler.bireyselMusteri1().getMusteriNo(), Musteriler.bireyselMusteri1());
        musteriHashMap.put(Musteriler.bireyselMusteri2().getMusteriNo(), Musteriler.bireyselMusteri2());
        musteriHashMap.put(Musteriler.bireyselMusteri3().getMusteriNo(), Musteriler.bireyselMusteri3());
        musteriHashMap.put(Musteriler.kurumsalMusteri1().getMusteriNo(), Musteriler.kurumsalMusteri1());
        musteriHashMap.put(Musteriler.kurumsalMusteri2().getMusteriNo(), Musteriler.kurumsalMusteri2());
        return musteriHashMap;
    }

}
