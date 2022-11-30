/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikonsol;

import java.util.Scanner;
import model.Mahasiswa;

/**
 *
 * @author Alvin Hendrawan
 */
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[0];

        int jumlah, pilih, i;
        double utsInput, uasInput;

        do {
            System.out.println("1. Memasukkan Data");
            System.out.println("2. Menampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Menu dipilih: ");
            pilih = scanner.nextInt();

            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("Jumlah data: ");
                    jumlah = scanner.nextInt();
                    mahasiswa = new Mahasiswa[jumlah];
                    for (i = 0; i < jumlah; i++) {
                        scanner.nextLine();
                        mahasiswa[i] = new Mahasiswa();
                        System.out.println("Data ke-" + (i + 1) + ": ");
                        System.out.print("NIM: ");
                        mahasiswa[i].setNim(scanner.nextLine());
                        System.out.print("Nama: ");
                        mahasiswa[i].setNama(scanner.nextLine());
                        System.out.print("UTS: ");
                        utsInput = scanner.nextDouble();
                        System.out.print("UAS: ");
                        uasInput = scanner.nextDouble();

                        mahasiswa[i].setUts(utsInput);
                        mahasiswa[i].setUas(uasInput);
                    }
                    break;
                case 2:
                    System.out.println("Data yang tersimpan: ");
                    i = 0;
                    while (i < mahasiswa.length) {
                        System.out.println("Data ke-" + (i+1) + ": ");
                        System.out.println("NIM: " + mahasiswa[i].getNim());
                        System.out.println("Nama: " + mahasiswa[i].getNama());
                        System.out.println("UTS: " + mahasiswa[i].getUts());
                        System.out.println("UAS: " + mahasiswa[i].getUas());
                        System.out.println("Nilai Akhir: " + mahasiswa[i].getNilaiAkhir());
                        System.out.println("Grade: " + mahasiswa[i].getGrade());
                        System.out.println("Status: " + mahasiswa[i].getStatusLulus());
                        i++;
                    }
                    break;
                case 0:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Menu yang dipilih salah");
            }
            System.out.println();
        } while (pilih != 0);
    }
}
