package latihan_pbo.latihan3;

public class Segitiga extends BangunDatar {
    public double hitungLuas() {
        return 0.5 * getAlas() * getTinggi();
    }

    public double hitungKeliling() {
        return getAlas() + getTinggi() + Math.sqrt(Math.pow(getAlas(), 2) + Math.pow(getTinggi(), 2));
     }
    
}
