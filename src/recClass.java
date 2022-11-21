public class recClass {
    public static animeObject answer;
    public static animeObject userInput;
    public static String name;
    static String recommend(){
        library.commitLib();
        System.out.println("What is the name of the anime you watched?");
        name= ratingYe.scanner.nextLine();
        System.out.println("What season did you watch?");
        String season= ratingYe.scanner.nextLine();
        System.out.println("What genre was this anime?");
        String genre = ratingYe.scanner.nextLine();
        System.out.println("What other genre could it be considered?");
        String genre2= ratingYe.scanner.nextLine();
        System.out.println("When was the anime released?");
        int relDate= ratingYe.scanner.nextInt();
        System.out.println("What would you rate this anime out of 10?");
        double rating = ratingYe.scanner.nextDouble();

        userInput= new animeObject(name,season,genre, genre2,relDate,rating);

        int loop = 0;

        while (loop< library.anime.size()){
            if (library.anime.get(loop).getGenre().equals(genre)){
                answer= library.anime.get(loop);
            } else if (library.anime.get(loop).getGenre2().equals(genre2)) {
                answer= library.anime.get(loop);
            }
            loop++;
        }
        library.anime.add(userInput);
        return "You should watch this next >:D --->" + answer.toString() + "\n";
    }

    public static void main(String[] args) {
        String recommendation="";
        recommendation= recommend();
        System.out.println(recommendation);
        for (animeObject animeObject : library.anime) {
            System.out.println(animeObject.toString());
        }

    }

}
