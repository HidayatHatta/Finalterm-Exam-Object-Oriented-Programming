package com.mycompany.uas1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Matakuliah {
    private String idMatakuliah;
    private String namaMatakuliah;
    private int semester;
    private String kelas;
    private String dosen;
    List<Matakuliah> daftarMataKuliah = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Matakuliah() {
    }

    public Matakuliah(String idMatakuliah, String namaMatakuliah, int semester, String kelas, String dosen) {
        this.idMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.semester = semester;
        this.kelas = kelas;
        this.dosen = dosen;
    }

    public String getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(String idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public void displayMatakuliah() {
        if (idMatakuliah == null) {
            System.out.println("Daftar Matakuliah tidak ada.");
        } else {
            System.out.println("ID Matakuliah: " + idMatakuliah);
            System.out.println("Nama Matakuliah: " + namaMatakuliah);
            System.out.println("Semester: " + semester);
            System.out.println("Kelas: " + kelas);
            System.out.println("Dosen: " + dosen);
        }
    }

    public void tambahMatakuliah() {
        System.out.print("ID Mata Kuliah: ");
        String idMataKuliah = scanner.nextLine();

        System.out.print("Nama Mata Kuliah: ");
        String namaMataKuliah = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();

        System.out.print("Dosen: ");
        String dosen = scanner.nextLine();

        Matakuliah newMatakuliah = new Matakuliah(idMataKuliah, namaMataKuliah, semester, kelas, dosen);
        daftarMataKuliah.add(newMatakuliah);

        System.out.println("Mata Kuliah berhasil ditambahkan.");
    }

    public void tampilkanMatakuliah() {
        System.out.println("Info Mata Kuliah:");
        for (Matakuliah mk : daftarMataKuliah) {
            mk.displayMatakuliah();
        }
    }

    public void ubahMatakuliah() {
        System.out.print("ID Mata Kuliah yang akan diubah: ");
        String idMataKuliah = scanner.nextLine();

        for (Matakuliah mk : daftarMataKuliah) {
            if (mk.getIdMatakuliah().equals(idMataKuliah)) {
                System.out.print("Nama Mata Kuliah: ");
                String namaMataKuliah = scanner.nextLine();
                mk.setNamaMatakuliah(namaMataKuliah);

                System.out.print("Semester: ");
                int semester = scanner.nextInt();
                mk.setSemester(semester);
                scanner.nextLine();

                System.out.print("Kelas: ");
                String kelas = scanner.nextLine();
                mk.setKelas(kelas);

                System.out.print("Dosen: ");
                String dosen = scanner.nextLine();
                mk.setDosen(dosen);

                System.out.println("Mata Kuliah berhasil diubah.");
                return;
            }
        }

        System.out.println("Mata Kuliah dengan ID " + idMataKuliah + " tidak ditemukan.");
    }

    public void hapusMataKuliah() {
        System.out.print("ID yang akan dihapus: ");
        String idMataKuliah = scanner.nextLine();

        Iterator<Matakuliah> iterator = daftarMataKuliah.iterator();
        while (iterator.hasNext()) {
            Matakuliah mk = iterator.next();
            if (mk.getIdMatakuliah().equals(idMataKuliah)) {
                iterator.remove();
                System.out.println("Mata Kuliah dengan ID " + idMataKuliah + " berhasil dihapus.");
                return;
            }
        }

        System.out.println("Mata Kuliah dengan ID " + idMataKuliah + " tidak ditemukan.");
    }

}
