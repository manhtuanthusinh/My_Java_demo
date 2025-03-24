package Lab01;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        int chu_vi = 2 * (a + b);
        int dien_tich = a * b;
        System.out.println("Chu vi: " + chu_vi + " Dien tich: " + dien_tich + "\n" + " Canh lon: " + Math.max(a, b));
        sc.close();
    }
}
