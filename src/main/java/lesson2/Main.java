package lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CurrencyConverter conversion = new CurrencyConverter(36.55);

        System.out.println("Input your amount in $:");

        if (sc.hasNextInt()) {
            int usd = sc.nextInt();
            System.out.println("Your required amount is " + usd + " $");
            System.out.println("Your converted amount is " + conversion.calculateTotalAmount(usd)+ " UAH" );
        } else {
            System.out.println("Sorry, amount should be number");
        }
    }

}
