package Tugas_cafe;
import java.util.Scanner;

class Cafe {
    private int espresso;
    private int susu;
    private int foam;
    private int airPanas;
    private int coklat;
    private int teh;
    private int gula;

    // Constructor
    public Cafe(int espresso, int susu, int foam, int airPanas, int coklat, int teh, int gula) {
        this.espresso = espresso;
        this.susu = susu;
        this.foam = foam;
        this.airPanas = airPanas;
        this.coklat = coklat;
        this.teh = teh;
        this.gula = gula;
    }

    // Menentukan menu berdasarkan kombinasi bahan
    public String tentukanMenu() {
        if (espresso > 0 && foam == 1 && susu == 0 && airPanas == 0) {
            return "1. MACCHIATO\nTakaran: 1 shot espresso + 2 shot susu + ½ shot foam";
        } else if (espresso > 0 && foam >= 3 && susu > 0) {
            return "2. CAPPUCCINO\nTakaran: 1 shot espresso + 3 shot foam + 2 shot susu";
        } else if (espresso > 0 && foam == 2 && susu > 0) {
            return "3. CAFE LATTE\nTakaran: 1 shot espresso + 2 shot susu + 2 shot foam";
        } else if (espresso > 0 && airPanas > 0 && susu == 0 && foam == 0) {
            return "4. AMERICANO\nTakaran: 1 shot espresso + 150ml air panas";
        } else if (espresso > 0 && coklat > 0 && susu > 0) {
            return "5. MOCHA\nTakaran: 1 shot espresso + 100ml susu + 1 sdm bubuk coklat";
        } else if (teh > 0 && susu > 0 && gula > 0) {
            return "6. TEH SUSU MANIS\nTakaran: 1 kantong teh + 100ml susu + 1 sdm gula";
        } else if (espresso > 0 && gula > 0 && susu == 0 && foam == 0) {
            return "7. ESPRESSO MANIS\nTakaran: 1 shot espresso + 1 sdm gula";
        } else if (espresso > 0 && susu > 0 && coklat > 0 && foam > 0) {
            return "8. MOCHA LATTE\nTakaran: 1 shot espresso + 2 shot susu + 1 sdm bubuk coklat + 2 shot foam";
        } else if (teh > 0 && gula > 0 && susu == 0) {
            return "9. TEH MANIS\nTakaran: 1 kantong teh + 1 sdm gula + 150ml air panas";
        } else {
            return "Menu Tidak Diketahui";
        }
    }

    // Membandingkan bahan untuk analisis sederhana
    public String perbandinganBahan() {
        if (foam > susu) {
            return "Foam lebih banyak daripada susu.";
        } else if (susu > foam) {
            return "Susu lebih banyak daripada foam.";
        } else {
            return "Takaran susu dan foam seimbang.";
        }
    }
}

public class MainCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah espresso: ");
        int espresso = input.nextInt();

        System.out.print("Masukkan jumlah susu: ");
        int susu = input.nextInt();

        System.out.print("Masukkan jumlah foam: ");
        int foam = input.nextInt();

        System.out.print("Masukkan jumlah air panas: ");
        int airPanas = input.nextInt();

        System.out.print("Masukkan jumlah coklat: ");
        int coklat = input.nextInt();

        System.out.print("Masukkan jumlah teh: ");
        int teh = input.nextInt();

        System.out.print("Masukkan jumlah gula: ");
        int gula = input.nextInt();

        Cafe cafe = new Cafe(espresso, susu, foam, airPanas, coklat, teh, gula);

        System.out.println("\n=====HASIL ======");
        System.out.println(cafe.tentukanMenu());
        System.out.println(cafe.perbandinganBahan());

        input.close();
    }
}