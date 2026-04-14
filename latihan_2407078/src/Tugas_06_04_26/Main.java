package Tugas_06_04_26;
public class Main {
    public static void main(String[] args) {
        BangunRuang bangun = new BangunRuang(10, 5, 4);

        System.out.println("Luas Alas = " + bangun.hitungLuas());
        System.out.println("Volume = " + bangun.hitungVolume());
    }
}
