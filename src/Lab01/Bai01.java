package Lab01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your student");
        String name = sc.nextLine();
        System.out.println("Enter the age of your student");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student's Class:");
        String className = sc.nextLine();
        System.out.println("Student name: " + name + "\n" + "Student age: " + age + "\n" + "Student class: " + className);
        sc.close();
    }
}

