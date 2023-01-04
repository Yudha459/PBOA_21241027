
class Mahasiswa {
    public String nama;
    private double nilai;

    Mahasiswa (String nama, double nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    void display(){
        System.out.println("Nama : "+ this.nama);
        System.out.println("Nama : "+ this.nilai);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("KASPUN", 8.7);
        mhs1.display();
    }
}
