import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {

        String[] drinks = {" ", "Whiskey", "Vodka", "Cognac", "Champagne", "Cocktail", "Shots with liquor", "Coca cola", "Water in glass", "Don't drink."};
        Scanner sc = new Scanner(System.in);

        System.out.println("How much cash should I take tonight?");
        System.out.println(" ");

        System.out.println("Now you can enter amount of money : ");
        System.out.println("1-5000");
        System.out.println("2-7500");
        System.out.println("3-10900");
        System.out.println("4-20000");

        int cash = sc.nextInt();
        switch (cash) {
            case 1:
                cash = 5000;
                System.out.println("You have 5000 for the night. Good luck.");
                break;
            case 2:
                cash = 7500;
                System.out.println("You have 7500 for the night. Good luck.");
                break;
            case 3:
                cash = 10900;
                System.out.println("You have 10900 for the night. Good luck.");
                break;
            case 4:
                cash = 20000;
                System.out.println("You have 20000 for the night. Good luck. Have a good night.");
                break;
            default:
                System.out.println("You entered the wrong input. Try again.");
                return;
        }
        int specialDiscountTicket = 1;

        System.out.println("You enter the club.");
        System.out.println("In the club plays music that you like.");
        System.out.println("There are a lot of beautiful people in the club, there are a lot of beautiful men and women.");
        System.out.println("Also you notice a campaign of some jerks, that you didn't like.");
        System.out.println("You can make a choice: ");
        System.out.println("1-Go to the bar.");
        System.out.println("2-Go to the dance floor.");
        int choice3 = sc.nextInt();
        switch (choice3) {
            case 1:
                System.out.println("You approach the bar, and sit at the bar.");
                System.out.println(" ");
                System.out.println("After a while , the barman comes up to you and asks.");
                System.out.println("Barman : What you like to drink ?");
                System.out.println("Tell what you like:");
                System.out.println("1 - Whiskey");
                System.out.println("2 - Vodka");
                System.out.println("3 - Cognac");
                System.out.println("4 - Champagne");
                System.out.println("5 - Cocktail with discount (if you have a ticket)");
                System.out.println("6 - Shots with liquor");
                System.out.println("7 - Coca cola");
                System.out.println("8 - Water in glass");
                System.out.println("9 - Don't drink.");


                int drinkChoice = sc.nextInt();
                if (drinks[drinkChoice] == drinks[1]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 1000. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your whiskey.");
                            cash = cash - 1000;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[2]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 500. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your vodka.");
                            cash = cash - 500;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[3]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 650. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your cognac.");
                            cash = cash - 650;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[4]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 750. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your champagne.");
                            cash = cash - 750;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[5]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight you can take it free, with discount ticket. Do you have it?");
                    System.out.println("You have:" + " " + specialDiscountTicket);
                    System.out.println("1- Yes I have it.");
                    System.out.println("2- No I haven't.");
                    int answerAboutDiscountTicket = sc.nextInt();
                    switch (answerAboutDiscountTicket) {
                        case 1:
                            System.out.println("Barman: Okay, this is your cocktail");
                            System.out.println("Now you have 0 discount ticket.");
                            System.out.println("Barman: Anything else?");
                            break;
                        case 2:
                            System.out.println("Okay. Do you want it  anyway. Tonight it 400?");
                            System.out.println("1- Yes.");
                            System.out.println("2- No.");
                            int answerAboutCocktail = sc.nextInt();
                            switch (answerAboutCocktail) {
                                case 1:
                                    System.out.println("Barman: Okay , this is your cocktail.");
                                    cash = cash - 400;
                                    break;
                                case 2:
                                    System.out.println("Okay. Anything else?");
                                    break;
                            }
                    }
                } else if (drinks[drinkChoice] == drinks[6]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 1200. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your shots.");
                            cash = cash - 1200;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[7]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 200. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your cola.");
                            cash = cash - 200;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[8]) {
                    System.out.println("Barman:" + " " + drinks[drinkChoice] + " " + "tonight 250. Would you like it?");
                    System.out.println("1-Yes.");
                    System.out.println("2-No.");
                    int answerBarmen1 = sc.nextInt();
                    switch (answerBarmen1) {
                        case 1:
                            System.out.println("Barman : Okay , this is your water in glass.");
                            cash = cash - 250;
                            System.out.println("Your wallet :" + cash);
                            break;
                        case 2:
                            System.out.println("Barman: Okay, anything else?");
                            break;
                    }
                } else if (drinks[drinkChoice] == drinks[9]) {
                    System.out.println("Barman: Ok, well call me if you suddenly want something");
                    break;
                }
                System.out.println("Barmen leaves to serve other guests");
                System.out.println(" ");
                System.out.println("For a while you stand and watch the people in the club.");
                System.out.println(" ");
                System.out.println("Then you notice 3 beautiful girls(guys).");
                System.out.println("First: dancing in a center of a club.");
                System.out.println("Second: sitting and drinking a cocktail in front of a table with those jerks.");
                System.out.println("Third: sitting at the other end of the bar.");
                System.out.println("You are also increasingly annoyed by those jerks who drink vodka at a table in the corner of the club.");

        }
    }
}