
package latihan_pbo.Tugas1_2407078;

import Tugas1_2407078.BangunDatar;

public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}