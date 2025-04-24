package Lab03;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot so:");
        int a = sc.nextInt();
        System.out.println("Bang cuu chuong");

        for (int i = 0; i <= 10; i++) {
            System.out.printf(" %d x %d = %d ", a, i, a * i);
            System.out.printf("\n");
        }
        sc.close();
    }
}
