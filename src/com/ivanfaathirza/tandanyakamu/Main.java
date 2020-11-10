package com.ivanfaathirza.tandanyakamu;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung umur dan menampilkan pesan dari masukkan
 * user menggunakan getter dan setter dengan berorientasi objek
 *
 */


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        Age age = new Age(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
}
