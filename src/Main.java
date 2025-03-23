import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter age: ");
//        int age = sc.nextInt();
//        System.out.println("Enter height: ");
//        int height = sc.nextInt();
//        System.out.println("My name is " + name + " age is " + age + " height is " + height);
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of students in class 1: ");
        int num1 = sc.nextInt();
        System.out.println("Number of students in class 2: ");
        int num2 = sc.nextInt();
        System.out.println("Class with more students has: " + Math.max(num1, num2));
        sc.close();
    }
}
