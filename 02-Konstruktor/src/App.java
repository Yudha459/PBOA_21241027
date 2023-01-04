import javax.sound.sampled.SourceDataLine;

class Mahasiswa{

    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;

    Mahasiswa(String InputNama, String InputNIM, String InputJurusan, Double InputIPK, int InputUmur){
        Nama = InputNama;
        NIM = InputNIM;
        Jurusan = InputJurusan;
        IPK = InputIPK;
        umur = InputUmur;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa(null, null, null, null, 0);
    }
}
