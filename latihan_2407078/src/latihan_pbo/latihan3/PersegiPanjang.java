package latihan_pbo.latihan3;

    
public class PersegiPanjang extends BangunDatar {
    
    public double hitungLuas() {
        return getPanjang() * getLebar();
    }

    public double hitungKeliling() {
        return 2 * (getPanjang() + getLebar());
     }
    }