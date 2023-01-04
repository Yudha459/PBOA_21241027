class Display{
    private String nama;
    static String type = "layar ";

    Display (String nama){
        this.nama = nama;
    }
    void show (){
        System.out.println("Nama Display : "+ this.nama);
    }
    //Setter
    public void setType(String type){
        Display.type = type;
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        Display tampil1 = new Display("Monitor");
        Display tampil2 = new Display("LCD");

        System.out.println("Menampilkan static atribut");
        System.out.println(tampil1.type);
        System.out.println(tampil2.type);
        System.out.println(Display.type);

        tampil1.setType("LCD");
        System.out.println(Display.type);
    }
}
