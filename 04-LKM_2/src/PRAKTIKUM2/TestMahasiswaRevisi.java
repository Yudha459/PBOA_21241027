package PRAKTIKUM2;

public class TestMahasiswaRevisi {
    public static void main(String[] args) {

        // Objek pertama
        Mahasiswa mhsTI= new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        mhsTI.cetak();

        mhsTI.ubah("Kaspun", 2021, "Praya");
        System.out.println("IDENTITAS AKHIR : ");
        mhsTI.cetak();

        //Objek kedua
        Mahasiswa mhsTE = new Mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        mhsTE.cetak();

        mhsTE.ubah("Ansor", 2021, "Kopang");
        System.out.println("\nIDENTITAS AKHIR");
        mhsTE.cetak();
        
    }
}
