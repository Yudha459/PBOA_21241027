package PRAKTIKUM4;
class HitunganLingkaran {
    int jarijari;
    double phi;
    double keliling,luas;

    HitunganLingkaran(int jarijari){
        this.jarijari = jarijari;
        this.phi = 3.14;
        this.keliling=2*phi*jarijari;
        this.luas=phi*jarijari*jarijari;
    }
    void show(){
       System.out.println("========LINGKARAN========");
       System.out.println("Jari-jari Lingkaran : " + this.jarijari+" cm"); 
       System.out.println("Keliling Lingkaran : " + this.keliling+" cm"); 
       System.out.println("Luas Lingkaran : " + this.luas+" cm2"); 
    }
}
public class Lingkaran {
    public static void main(String[] args) {
        HitunganLingkaran hl = new HitunganLingkaran(7);
        hl.show();
    }
}