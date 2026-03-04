package latihan_pbo.latihan3;

public class main extends BangunDatar {
    public static void main(String[] args) {
        //persegi Panjang
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();

        pp.setPanjang(4);
        pp.setLebar(5);
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        //Persegi 
        Persegi ps = new Persegi();
        ps.setSisi(4);
        System.out.println("Luas Persegi: " + ps.hitungLuas());
        System.out.println("Keliling Persegi: " + ps.hitungKeliling());

        //Lingkaran
        Lingkaran l = new Lingkaran();
        l.setJariJari(7);
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
        System.out.println("Keliling Lingkaran: " + l.hitungKeliling());

        //segiti
        Segitiga s = new Segitiga();
        s.setAlas(5);
        s.setTinggi(4);
        System.out.println("Luas Segitiga: " + s.hitungLuas());
        System.out.println("Keliling Segitiga: " + s.hitungKeliling());
        

    
    }
}