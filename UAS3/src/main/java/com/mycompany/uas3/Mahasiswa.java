package com.mycompany.uas3;
import java.util.ArrayList;

class Mahasiswa {
    String nama;
    String nim;
    ArrayList<String> mataKuliah = new ArrayList<>();

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tambahMataKuliah(String mataKuliah) {
        this.mataKuliah.add(mataKuliah);
    }
    
    public String getMataKuliahString() {
        StringBuilder result = new StringBuilder();
        for (String mk : mataKuliah) {
            result.append(mk).append(", ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }
}