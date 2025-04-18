package Lab02;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        /* Cho phuong trinh ax+b = 0
    Viet phuong trinh nhap vao 2 so nguyen a,b. Tinh nghiem ptrinh tren */
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính phương trình bậc nhất");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.printf("Phuong trinh %dx + %d = 0", a, b);
        if (a == 0 && b == 0) {
            System.out.println("vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("vo nghiem");
        } else {
            float x = (float) -b / a;
            System.out.printf("\nNghiem = %.3f", x);
        }
        sc.close();
    }
}














