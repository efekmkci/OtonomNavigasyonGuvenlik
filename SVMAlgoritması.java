package com.navigasyon;

import java.util.List;

public class SVMAlgoritması {
    // Main sınıfından erişebilmek için public yaptık
    public double w1 = 0, w2 = 0, b = 0;
    private double ogrenmeOrani = 0.001;
    private int iterasyon = 10000;

    public void egit(List<Nokta> noktalar) {
        for (int i = 0; i < iterasyon; i++) {
            for (Nokta n : noktalar) {
                // SVM Hinge Loss Kontrolü
                double sart = n.etiket * (w1 * n.x + w2 * n.y + b);

                if (sart >= 1) {
                    // Güvenli bölge: Katsayıları küçült (Regülarizasyon)
                    w1 -= ogrenmeOrani * (2 * 0.01 * w1);
                    w2 -= ogrenmeOrani * (2 * 0.01 * w2);
                } else {
                    // Hatalı veya koridor içi: Katsayıları güncelle
                    w1 += ogrenmeOrani * (n.etiket * n.x - 2 * 0.01 * w1);
                    w2 += ogrenmeOrani * (n.etiket * n.y - 2 * 0.01 * w2);
                    b += ogrenmeOrani * n.etiket;
                }
            }
        }
    }

    public void sonucuYazdir() {
        System.out.println("Hesaplanan En Güvenli Sınır Denklemi:");
        System.out.println(w1 + " * x + " + w2 + " * y + (" + b + ") = 0");
    }
}