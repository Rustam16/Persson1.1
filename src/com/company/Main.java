package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nameOfBoy = "Адыл";
        System.out.println(nameOfBoy);

        final int NUM = 45;
        System.out.println(NUM);

        String WORD = "Привет";
        System.out.println(WORD);

        System.out.println(nameOfBoy + NUM + WORD);
            if (NUM <= 0)
            System.out.println("вы сохранили отрицательное число");

          else if (NUM >=0)
        System.out.println("вы сохранили положительное число");

        else {
            System.out.println("вы сохранили нуль");

        }


            Scanner in = new Scanner(System.in);
            System.out.print("ведит ваше имя:");

            Scanner scan = new Scanner(System.in);
            String name = ("Адыл");
            System.out.println(name);

            System.out.println("Привет" + name);

            int num = in.nextInt();

            {


                System.out.println("the end");


            }

    }
}