package com.courses;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(999);
        int a, b;
        int counter = 0;
        int counter1 = 0;
        System.out.println("Мы будем проверять встречается ли цифра А реже чем цифра Б в случайном числе");
        System.out.print("Для этого введем А: ");
        a = in.nextInt();
        System.out.print("\nи Б: ");
        b = in.nextInt();
        System.out.println(number);
        int first, second, third;
        second = (number / 10) % 10;
        first = (number / 100) % 10;
        third = number % 10;
            if (a == first | a == second | a == third) {
                counter++;
                System.out.println("Цифра А встречается : "+counter);
            } else if (b == first | b == second | b == third) {
                counter1++;
                System.out.println("Цифра Б встречается : "+counter1);
            }
        }
}
