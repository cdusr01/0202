package ru.skyrkov.L1;

import java.util.Scanner;

public class L1t3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество яиц = ");
        int eggs = in.nextInt();
        if (eggs > 3){
            System.out.println("Рекомендую приготовить омлет.");
        }
        else {
            System.out.println("Рекомендую позавтракать бутербродами.");
        }
        System.out.println("Приятного аппетита!");
    }
}
