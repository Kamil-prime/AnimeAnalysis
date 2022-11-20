import java.util.Scanner;

public class ratingYe {
    static Scanner scanner = new Scanner(System.in);

    static void rateIt(){
        int i = 0;
        while(i< library.anime.size()){
            System.out.println(library.anime.get(i).toString());
            i++;
        }
        i= 0;
        System.out.println("\nWhich anime would you like to rate?");
        String name= scanner.nextLine();
        while(i< library.anime.size()){
           if (library.anime.get(i).getName().equals(name)){
                System.out.println("Would you like to rate " + name + " up or down?");
                String answer= scanner.nextLine();
                answer= answer.toLowerCase();
                if (answer.equals("up")){
                    library.anime.get(i).setRate(library.anime.get(i).getRate()+0.25);
                    System.out.println(library.anime.get(i).toString() + "\nThank you for your feedback!");


                }else if (answer.equals("down")){
                    library.anime.get(i).setRate(library.anime.get(i).getRate()-0.25);
                    System.out.println(library.anime.get(i).toString()+ "\nThank you for your feedback!");
                }
               if (!library.anime.get(i).getName().equals(name)){
                   System.out.println("Sorry we don't have that anime in our library. Would you like to pick another? (yes or no) ");
                   String answer2= scanner.nextLine();
                   answer2= answer2.toLowerCase();
                   if (answer2.equals("yes")){
                       rateIt();
                   }else{
                       System.out.println("Thank you for your time!");
                       break;
                   }
            }

            }
            i++;

        }



    }

    public static void main(String[] args) {
        library.anime.add(library.spyXFamily);
        library.anime.add(library.chainsawMan);
        library.anime.add(library.cowboyBebop);
        library.anime.add(library.onePiece);

        System.out.println(library.anime.size());
        System.out.println(library.anime.get(1).getName().equals("Chainsaw Man"));
        rateIt();
    }
}

