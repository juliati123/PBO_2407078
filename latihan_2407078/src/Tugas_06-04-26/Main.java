public class Main {
    public static void main(String[] args) {

        // membuat object
        BangunRuang bangun = new BangunRuang(10, 5, 4);

        // tampilkan luas
        System.out.println("Luas Alas = " + bangun.hitungLuas());

        // tampilkan volume
        System.out.println("Volume = " + bangun.hitungVolume());
    }
}
