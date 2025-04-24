package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua array:");
        // khoi tao array va size
        int size = sc.nextInt();
        int[] newarray = new int[size];
        System.out.println("nhap cac phan tu");

        for (int i = 0; i < size; i++) {
            newarray[i] = sc.nextInt();
        }
        int max = newarray[0];
        // max value
        for (int i = 0; i < newarray.length; i++) {
            max = Math.max(max, newarray[i]);
        }
        // min value
        int min = newarray[0];
        for (int i = 0; i < newarray.length; i++) {
            min = Math.min(min, newarray[i]);
        }
        sc.close();
        // print
        System.out.println(Arrays.toString(newarray));
        System.out.println("max =" + max);
        System.out.println("min =" + min);
    }
}
