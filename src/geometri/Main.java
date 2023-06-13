package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran adhy = new Lingkaran(7);
        PersegiPanjang haryadi = new PersegiPanjang(5, 7);
        
        System.out.println("Luas Lingkaran: "+adhy.luaslingkaran());
        System.out.println("Keliling Lingkaran: "+adhy.kelilinglingkaran());
        System.out.println("Luas Persegi Panjang: "+haryadi.luaspersegipanjang());
        System.out.println("Keliling Persegi Panjang: "+haryadi.kelilingpersegipanjang());
        
    }
}
