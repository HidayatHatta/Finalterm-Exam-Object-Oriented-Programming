package com.mycompany.uas5;

public class Bola {
    public static double volumeBola(double r){
        double volume = 4.0/3.0 * 22.0/7.0 * r * r;
        return volume;
    }
    public static double luasPermukaanBola(double r){
        double luas = 4 * 22.0/7.0 * r * r;
        return luas;
    }
}
