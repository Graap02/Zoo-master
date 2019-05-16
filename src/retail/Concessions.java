package retail;
import money.Wallet;

import java.util.Scanner;
public class Concessions {

    public static void concessions() {
        Wallet wallet1 = new Wallet(100);
        boolean running = true;
        int userChoice;
        double[] item = {1.75, 2.00, 1.5, 1.25, .5};
        String[] menu = {"nachos","hotdog","corndog", "soda","water"};
        Scanner input = new Scanner(System.in);
        while(running) {
            System.out.println("Welcome to the concessions! What would you like?");
            System.out.println("How much money available " + wallet1.getWallet());
            System.out.println("If you wish to leave, press 6");
            for(int i= 0; i<item.length; i++){
                    menu(item[i], menu[i], i);
            }
            userChoice = input.nextInt();
            switch(userChoice){
                case 1:
                    System.out.println("One nacho $" + item[0]);
                    wallet1.setTotalWallet(item[0]);
                    break;
                case 2:
                    System.out.println("One hotdog $" + item[1]);
                    wallet1.setTotalWallet(item[1]);
                    break;
                case 3:
                    System.out.println("One corndog $" + item[2]);
                    wallet1.setTotalWallet(item[2]);
                    break;
                case 4:
                    System.out.println("One soda $" + item[3]);
                    wallet1.setTotalWallet(item[3]);
                    break;
                case 5:
                    System.out.println("One water $" + item[4]);
                    wallet1.setTotalWallet(item[4]);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Not available");

            }
        }
    }
    public static void menu(double j, String s, int i){
        System.out.println((i+1) + ") " + s + " price is " + j);
    }
}
