package com.mycompany.uas5;
import java.util.Scanner;

public class UAS5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program menghitung volume dan luas permukaan bola.");
        
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();
        
        System.out.println("Volume bola adalah " + Bola.volumeBola(jariJari));
        System.out.println("Luas permukaan bola adalah " + Bola.luasPermukaanBola(jariJari));
    }
}
