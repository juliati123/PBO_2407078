package latihan_pbo.latihan3;

public class Persegi extends BangunDatar {
    
    public double hitungLuas() {
        return getSisi() * getSisi();
    }

    public double hitungKeliling() {
        return 4 * getSisi();
     }
    
}
