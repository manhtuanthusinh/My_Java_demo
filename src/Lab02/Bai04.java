package Lab02;

import java.util.Scanner;

public class Bai04 {
    public static void Bai01() {
        System.out.println("Bạn đã chọn tính năng 1");
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

    public static void Bai02() {
        System.out.println("Bạn đã chọn tính năng 2");
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

    public static void Bai03() {
        System.out.println("Bạn đã chọn tính năng 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính tiền điện: ");
        System.out.println("Enter a: ");
        float a = sc.nextFloat();
        if (a <= 100) {
            float money = (a * 1000);
            System.out.printf("%.3f", money);
        } else {
            float money = (100 * 1000 + (a - 100) * 1500);
            System.out.printf("%.3f", money);
        }
        sc.close();
    }

    public static void main(String[] args) {
        /*Viết chương trình tổ chức menu:
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Yêu cầu:
        - Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên*/
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.print("Lựa chọn:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                Bai01();
                break;
            case 2:
                Bai02();
                break;
            case 3:
                Bai03();
                break;
            case 4:
                System.out.println("Ket thuc");
                break;
            default:
                System.out.println("thoát chương trình");
                System.exit(0);

        }
    }
}
