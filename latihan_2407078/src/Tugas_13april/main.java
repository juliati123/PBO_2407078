package Tugas_13april;

public class main {
    public static void main(String[] args) {

        BangunDatar bd;

        bd = new persegi(4);
        bd.tampilkan();

        bd = new PersegiPanjang(6, 3);
        bd.tampilkan();

        bd = new Segitiga(8, 5);
        bd.tampilkan();
    }
}