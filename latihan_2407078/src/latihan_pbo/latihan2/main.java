package latihan_pbo.latihan2;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(9);
        pp.setLebar(10);

        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
    }
}