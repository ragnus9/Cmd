package com.Kalkulator;

import java.util.Scanner;

public class Main
{
    private static  Calculate cal = new Calculate();
    private static Scanner take = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Podaj pierwszą liczbe"); cal.setLiczba1(take.nextInt());
        System.out.print("Podaj pierwszą liczbe"); cal.setLiczba2(take.nextInt());
        System.out.print(cal.Dodaj());
    }
}
