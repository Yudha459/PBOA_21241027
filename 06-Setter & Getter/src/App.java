class ling{
    private double diameter;

    public ling(double diameter){
        this.diameter =diameter;
    }
    //Getter
    public double Getjari(){
        return this.diameter/2;
    }
    //Setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }
    public double getHitunganluas(){
        return 3.14*Getjari()*Getjari();
    }
    public double getHitungankeliling(){
        return 2*3.14*Getjari();
    }
   
    public void display(){
        System.out.println("Diameter       :"+ this.diameter);
        System.out.println("Jari-Jari      :"+Getjari());
        System.out.println("Luas           :"+getHitunganluas());
        System.out.println("Keliling       :"+getHitungankeliling());
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====nilai dari diameter=====");
        ling lingkaran = new ling(3.6);
        lingkaran.display();
        System.out.println("====nilai dari jari-jari=====");
        lingkaran.setJari2(5);
        lingkaran.display();
    }
}
