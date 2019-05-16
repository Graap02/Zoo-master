package retail;
import money.Wallet;

import java.util.Scanner;
public class Gift_Shop {

    public static void gift_shop() {
        Wallet wallet1 = new Wallet(100);
        boolean running = true;
        int userChoice;
        double[] item = {4.50, 7.25, 8.00, 9.25, 6.00};
        String[] menu = {"Panda watch","Turtle T-Shirt","Elephant Umbrella", "Zebra water bottle","Crock crocks"};
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
                    System.out.println("One Panda Watch $" + item[0]);
                    wallet1.setTotalWallet(item[0]);
                    break;
                case 2:
                    System.out.println("One Turtle T-Shirt $" + item[1]);
                    wallet1.setTotalWallet(item[1]);
                    break;
                case 3:
                    System.out.println("One Elephant Umbrella $" + item[2]);
                    wallet1.setTotalWallet(item[2]);
                    break;
                case 4:
                    System.out.println("One Zebra water bottle $" + item[3]);
                    wallet1.setTotalWallet(item[3]);
                    break;
                case 5:
                    System.out.println("One Crock crocks $" + item[4]);
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
