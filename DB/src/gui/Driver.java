package gui;

import blc.KisiDB;

/**
 * Created by dedeHan on 27.12.2015.
 */
public class Driver {

    public static void main(String[] args) {
        KisiDB kisiIslemleri = new KisiDB();
        //kisiIslemleri.insertKisi(new Kisi(Long.MIN_VALUE, "Veli", "TELLİ"));
        kisiIslemleri.getAll();
    }
}
