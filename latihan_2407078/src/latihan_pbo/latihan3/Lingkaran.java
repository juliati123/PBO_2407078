package latihan_pbo.latihan3;

public class Lingkaran extends BangunDatar {
    public double hitungLuas() {
        return 3.14 * Math.pow(getJariJari(), 2);
    }

    public double hitungKeliling() {
        return 2 * 3.14 * getJariJari();
     }
    
}
