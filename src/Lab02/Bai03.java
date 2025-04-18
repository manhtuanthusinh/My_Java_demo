package Lab02;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        /*nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
        - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
                - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500*/
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
}
