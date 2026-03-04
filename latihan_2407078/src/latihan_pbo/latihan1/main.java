package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;
   

    //constructor
    Cafe (String nama, String alamat ){
        this.nama = nama;
        this.alamat = alamat;
    
        System.out.println( "nama cafenya adalah: " + nama);
        System.out.println("alamat cafenya dimana: " + alamat);
        System.out.println("=================");

        //method
       
    }
     public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
     void buka(){
            System.out.println("============");
            System.out.println("cafe sudah buka");
        }



}

public class main {
    public static void main(String[] args) {

        Cafe Cafe1 = new Cafe( "kenangan", "cirebon");
        Cafe Cafe2 = new Cafe(  "Tabo", "cirebon");
        Cafe Cafe3 = new Cafe(  "Tomoro", "cirebon");
        Cafe1.buka();
    }
}