import java.util.ArrayList;
class player{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<>();
    private String nama;

    player (String nama){
        this.nama = nama;
        numberOfPlayer++;
        player.nameList.add(this.nama);
    }

    void show(){
        System.out.println("Player Nama : "+ this.nama);
    }

    //membuat static method
    static void ShowNumberOfPlayer(){
        System.out.println("Number Of Player : "+ player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return player.nameList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
    //instasiasi
        player player1 = new player("messi");
        player player2 = new player("Mbappe");


        player.ShowNumberOfPlayer();
        player.getNames();
    }
}
