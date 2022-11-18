import java.util.Scanner;

public class ratingYe {
    Scanner scanner = new Scanner(System.in);
    public String rateIt(){
        for (animeObject animeObject : library.anime) {
            System.out.println(animeObject.toString());
        }
        System.out.println("\nWhich anime would you like to rate?");



    }

}

