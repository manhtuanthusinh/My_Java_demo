package Lab03;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so:");
        int a = sc.nextInt();
        boolean isprime = true;
        if (a <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println("la so nguyen to");
        } else {
            System.out.println("khong la so nguyen to");
        }
        sc.close();
    }
}

