package geometri;

public class PersegiPanjang{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    double luaspersegipanjang(){
        return panjang * lebar;
    }
     
    double kelilingpersegipanjang(){
        return 2 * (panjang + lebar);
    }
}
