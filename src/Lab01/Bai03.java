package Lab01;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        double the_tich = a * a * a;
        System.out.printf("The tich is: " + String.format("%.3f", the_tich));
        sc.close();
    }
}
