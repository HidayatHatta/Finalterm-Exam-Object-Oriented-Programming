package com.mycompany.uas3;
import java.util.ArrayList;
import java.util.Scanner;

public class UAS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + i + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

            while (true) {
                System.out.print("Mata Kuliah (tekan enter untuk selesai): ");
                String mataKuliah = scanner.nextLine();

                if (mataKuliah.isEmpty()) {
                    break;
                }

                mahasiswa.tambahMataKuliah(mataKuliah);
            }

            daftarMahasiswa.add(mahasiswa);
        }

        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = daftarMahasiswa.get(i);

            System.out.println("\nMahasiswa " + (i + 1) + ":");
            System.out.println("Nama  : " + mahasiswa.nama);
            System.out.println("NIM   : " + mahasiswa.nim);
            System.out.println("Mata Kuliah: " + mahasiswa.getMataKuliahString());
        }

        scanner.close();
    }
}
