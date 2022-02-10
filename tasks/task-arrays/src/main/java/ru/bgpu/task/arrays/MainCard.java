package ru.bgpu.task.arrays;

import java.util.Scanner;
import java.util.Random;

public class MainCard {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Number of Players: ");
    int num = in.nextInt();

    for(int n=1;n<=num;n++){
        System.out.println(n + " Player deck is:");
        for(int i=1;i<=5;i++){
            System.out.print(PlayingCard.card((int)(Math.random()*4),(int)(Math.random()*13)));
        }
        System.out.println();
        System.out.println();
    }

    }
}
