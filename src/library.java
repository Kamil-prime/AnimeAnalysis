import java.util.ArrayList;

public class library {
    public static ArrayList<animeObject> anime = new ArrayList<animeObject>();

    static animeObject spyXFamily = new animeObject("Spy x Family", "S2","Action", "Shounen", 2022, 8.67);
    static animeObject chainsawMan = new animeObject("Chainsaw Man", "S1", "Action","Supernatural", 2022, 8.88);
    static animeObject cowboyBebop = new animeObject("Cowboy Bebop", "S1", "Action", "SCi-Fi", 1999, 8.75);
    static animeObject onePiece = new animeObject("One Piece", "", "Shounen", "Adventure", 1999, 8.67);

    public static void main(String[] args) {
        anime.add(spyXFamily);
        anime.add(chainsawMan);
        anime.add(cowboyBebop);
        anime.add(onePiece);
        for (animeObject animeObject : anime) {
            System.out.println(animeObject.toString());
        }

    }
}


