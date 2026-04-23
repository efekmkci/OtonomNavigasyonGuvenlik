package com.navigasyon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nokta> veriler = new ArrayList<>();

        // --- VERİ SETİ OLUŞTURMA ---
        // A Bölgesi Engelleri (Etiket: -1)
        veriler.add(new Nokta(1, 1, -1));
        veriler.add(new Nokta(2, 1, -1));
        veriler.add(new Nokta(1, 2, -1));

        // B Bölgesi Engelleri (Etiket: 1)
        veriler.add(new Nokta(8, 8, 1));
        veriler.add(new Nokta(9, 8, 1));
        veriler.add(new Nokta(8, 9, 1));

        // --- ALGORİTMA ÇALIŞTIRMA ---
        SVMAlgoritması svm = new SVMAlgoritması();
        System.out.println("Sistem Eğitiliyor... Lütfen bekleyin.");
        svm.egit(veriler);

        System.out.println("-----------------------------------------");
        svm.sonucuYazdir();
        System.out.println("-----------------------------------------");

        // --- OTONOM KARAR MEKANİZMASI (TEST) ---
        System.out.println("\n--- Test Verisi Sorgulama ---");

        // Örnek bir koordinat (Tam orta nokta)
        double testX = 5, testY = 5;

        // Karar Fonksiyonu: f(x,y) = w1*x + w2*y + b
        double sonuc = (svm.w1 * testX) + (svm.w2 * testY) + svm.b;

        System.out.println("Analiz Edilen Koordinat: (" + testX + ", " + testY + ")");
        System.out.println("Algoritma Çıktısı: " + sonuc);

        if (sonuc > 0) {
            System.out.println("KARAR: Araç B bölgesine (pozitif taraf) yakın. Sağa manevra yapmalı!");
        } else {
            System.out.println("KARAR: Araç A bölgesine (negatif taraf) yakın. Sola manevra yapmalı!");
        }
    }
}