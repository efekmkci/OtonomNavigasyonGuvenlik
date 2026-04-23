package com.navigasyon;

public class Nokta {
    double x, y;
    int etiket; // -1 (A Bölgesi) veya 1 (B Bölgesi)

    public Nokta(double x, double y, int etiket) {
        this.x = x;
        this.y = y;
        this.etiket = etiket;
    }
}