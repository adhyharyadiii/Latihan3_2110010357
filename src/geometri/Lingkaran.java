package geometri;

public class Lingkaran {
    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    double luaslingkaran(){
        return 3.14 * Math.pow(radius, 2);
    }
     
    double kelilinglingkaran(){
        return 2 * 3.14 * radius;
    }
}