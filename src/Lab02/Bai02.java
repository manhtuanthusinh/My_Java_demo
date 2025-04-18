package Lab02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        /*cho pt ax^2+bx+c = 0
        Viet chuong trinh nhap vao 3 so nguyen, tinh nghiem */
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính phương trình bậc 2");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.printf("Phuong trinh %dx^2 +%dx +%d=0 ", a, b, c);
        float delta = (float) b * b - 4 * a * c;
        if (delta > 0) {
            float x1 = (float) (-b + Math.sqrt(delta) / (2 * a));
            float x2 = (float) (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("Phuong trinh 2 nghiem: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x = (float) -b / 2 * a;
            System.out.println("Phuong trinh nghiem kep: x = " + x);
        }
        sc.close();
    }
}
