public class App {
    public static void main(String[] args) throws Exception {

    //instasiasi atau menciptakan objek

    Hero hero1 = new Hero();
    hero1.nama = " Iron man";
    hero1.display();

    HeroStrength hero2 = new HeroStrength();
    hero2.nama = "Spiderman";
    hero2.display();
    
    HeroIntel hero3 = new HeroIntel();
    hero3.nama = "Doraemon";
    hero3.display();

    }
}
