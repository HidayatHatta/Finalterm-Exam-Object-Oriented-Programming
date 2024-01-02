package com.mycompany.uas1;
import java.util.ArrayList;
import java.util.Scanner;

public class UAS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Matakuliah> listMatakuliah = new ArrayList<>();
        Matakuliah matakuliah = new Matakuliah();

        int choice;
        do {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Tambah Matakuliah");
            System.out.println("2. Hapus Matakuliah");
            System.out.println("3. Ubah Matakuliah");
            System.out.println("4. Tampilkan Informasi Matakuliah");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matakuliah.tambahMatakuliah();
                    break;
                case 2:
                    matakuliah.hapusMataKuliah();
                    break;
                case 3:
                    matakuliah.ubahMatakuliah();
                    break;
                case 4:
                    matakuliah.tampilkanMatakuliah();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (choice != 5);

        scanner.close();
    }
}
