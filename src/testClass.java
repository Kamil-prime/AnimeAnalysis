import java.util.Scanner;

public class testClass {
    public static Scanner scanner2 = new Scanner(System.in);
    public static void runTest(){
        library.commitLib();
        System.out.println("~~~~Welcome To Anime Analysis~~~~\n");
        System.out.println("Would you like to rate an anime or get a recommendation?");
        String input= ratingYe.scanner.nextLine();

        input= input.toLowerCase();
        if (input.equals("rate an anime")){
            ratingYe.rateIt();
        }else if(input.equals("get a recommendation")){
            System.out.println(recClass.recommend());
            System.out.println("The anime you watched is now a part of our library!");
            System.out.println("Would you like to re-rate the anime you watched? (yes or no)");
            String answer= scanner2.nextLine();
            answer= answer.toLowerCase();
            if (answer.equals("yes")){
                ratingYe.rateIt(recClass.name);
            } else if (answer.equals("no")) {
                System.out.println("~~~~Thank you for visiting Anime Analysis~~~~\n~~~Cya Later!!~~~");
            }
        }

    }

    public static void main(String[] args) {
        runTest();
    }
}
