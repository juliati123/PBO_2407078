package Tugas_13april;

public class BangunDatar {
     private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
    }

    // Getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

     public void setVarA(double varA) {
        this.varA = varA;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // Method default luas
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan
   public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("========================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("========================");
    }
}

