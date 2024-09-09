package W13;

import java.util.Scanner;

public class W13_02_introArray {
    public static void main(String[] args) {
        String []barndCars = new String[3];
        Scanner kb = new Scanner(System.in);
        
        barndCars[0] = "Toyota";
        barndCars[1] = "OOO";
        barndCars[2] = "Nissan";
        
        System.out.println("Old Brand of cars in array are:");
        for (int i = 0; i < barndCars.length; i++) {
            System.out.print(barndCars[i] + " / ");           
        }
        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i = 0; i <barndCars.length; i++) {
            System.out.println("Enter " + (i+1) + ": ");
            barndCars[i] = kb.next(); 
        }

        barndCars[2] = "Mclaren";
        System.out.println("\nNew Brand of cars in array are:");
        for (String car : barndCars) {
            System.out.print(car  + " / ");
        }

    }

}