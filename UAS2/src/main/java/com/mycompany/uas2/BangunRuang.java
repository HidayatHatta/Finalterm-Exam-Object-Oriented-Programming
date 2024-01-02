package com.mycompany.uas2;

abstract class BangunRuang {
    abstract double hitungVolume();
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;
    private double v = 22.0/7.0;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return v * jariJari * jariJari * tinggi;
    }
}