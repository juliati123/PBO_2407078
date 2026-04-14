package latihan_pbo.Tugas1_2407078;

import java.util.Scanner;

public class MainBangunDatar {

    // ================== PERSEGI (PRIVATE) ==================
    private static class Persegi {
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

    // ================== PERSEGI PANJANG (PRIVATE) ==================
    private static class PersegiPanjang {
        private double panjang;
        private double lebar;

        public PersegiPanjang(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public double hitungLuas() {
            return panjang * lebar;
        }

        public double hitungKeliling() {
            return 2 * (panjang + lebar);
        }
    }

    // ================== SEGITIGA (PUBLIC) ==================
    public static class Segitiga {
        public double alas;
        public double tinggi;
        public double sisiA;
        public double sisiB;
        public double sisiC;

        public Segitiga(double alas, double tinggi,
                        double sisiA, double sisiB, double sisiC) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.sisiA = sisiA;
            this.sisiB = sisiB;
            this.sisiC = sisiC;
        }

        public double hitungLuas() {
            return 0.5 * alas * tinggi;
        }

        public double hitungKeliling() {
            return sisiA + sisiB + sisiC;
        }
    }

    // ================== LINGKARAN (PUBLIC) ==================
    public static class Lingkaran {
        private double jariJari;

        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }

        public double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }

        public double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }
    }

    // ================== MAIN ==================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== PROGRAM MENGHITUNG LUAS & KELILING ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan pilihan: ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();

            Persegi p = new Persegi(sisi);
            System.out.println("Luas = " + p.hitungLuas());
            System.out.println("Keliling = " + p.hitungKeliling());
        }

        else if (pilihan == 2) {
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();

            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();

            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
            System.out.println("Luas = " + pp.hitungLuas());
            System.out.println("Keliling = " + pp.hitungKeliling());
        }

        else if (pilihan == 3) {
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            System.out.print("Masukkan sisi A: ");
            double a = input.nextDouble();

            System.out.print("Masukkan sisi B: ");
            double b = input.nextDouble();

            System.out.print("Masukkan sisi C: ");
            double c = input.nextDouble();

            Segitiga s = new Segitiga(alas, tinggi, a, b, c);
            System.out.println("Luas = " + s.hitungLuas());
            System.out.println("Keliling = " + s.hitungKeliling());
        }

        else if (pilihan == 4) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();

            Lingkaran l = new Lingkaran(r);
            System.out.println("Luas = " + l.hitungLuas());
            System.out.println("Keliling = " + l.hitungKeliling());
        }

        else {
            System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}