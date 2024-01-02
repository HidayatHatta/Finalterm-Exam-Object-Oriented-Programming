package com.mycompany.uas2;
import java.util.Scanner;

public class UAS2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Volume Balok");
        System.out.println("2. Hitung Volume Tabung");
        System.out.println("0. Keluar");

        int pilihan;
        do {
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    hitungVolumeBalok(scanner);
                    break;
                case 2:
                    hitungVolumeTabung(scanner);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }

    private static void hitungVolumeBalok(Scanner scanner) {
        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        BangunRuang balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Volume Balok: " + balok.hitungVolume());
    }

    private static void hitungVolumeTabung(Scanner scanner) {
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();

        BangunRuang tabung = new Tabung(jariJari, tinggi);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
    }
}

