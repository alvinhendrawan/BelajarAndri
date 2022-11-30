/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alvin Hendrawan
 */
public class Mahasiswa {

    private String nim, nama;
    private double uts, uas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return ((0.4 * uts) + (0.6 * uas));
    }

    public String getGrade() {
        if (getNilaiAkhir() >= 80) {
            return "A";
        } else if (getNilaiAkhir() >= 70) {
            return "B";
        } else if (getNilaiAkhir() >= 60) {
            return "C";
        } else if (getNilaiAkhir() >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String getStatusLulus() {
        if (getGrade().equalsIgnoreCase("A") || getGrade().equalsIgnoreCase("B")
                || getGrade().equalsIgnoreCase("C")) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}
