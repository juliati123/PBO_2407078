package Tugas_06_04_26;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    // Constructor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }

    // Getter
    public int getTinggi() {
        return tinggi;
    }

    // Method hitung volume
    public int hitungVolume() {
        return hitungLuas() * tinggi;
    }

     public int hitungLuas() {
        return getPanjang() * getLebar();
} 
}