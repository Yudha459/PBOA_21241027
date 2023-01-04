import javax.sound.sampled.SourceDataLine;

class Mahasiswa{

    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;

    Mahasiswa(String Nama, String NIM, String Jurusan, Double IPK, int Umur){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.IPK = IPK;
        this.umur = Umur;
    }
    //method tanpa return dan paramater
    void show(){
        System.out.println("Nama : "+ this.Nama);
        System.out.println("NIM : "+ this.NIM);
        System.out.println("Jurusan : "+ this.Jurusan);
        System.out.println("IPK : " + this.IPK);
        System.out.println("Umur :"+ this.umur);
    } 
    //method tanpa return dengan parameter
    void ubahnama(String Nama){
        this.Nama = Nama;
    }
    //method dengan return tanpa parameter
    String getNama(){
        return this.Nama;
    }
    // method dengan return dan paramater
    String kenalan(String Prodi){
        return "Hai nama saya " + this.Nama + " NIM saya " + this.NIM + " Dan saya dari prodi " + Prodi;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Lalu", "21241022", "PTI", 3.9, 18);
        mhs1.show();
        mhs1.ubahnama("Kaspun");
        mhs1.show();
        System.out.println(mhs1.getNama());
        String pesan = mhs1.kenalan("Pendidikan teknologi Informasi");
        System.out.println(pesan);
    }
}
