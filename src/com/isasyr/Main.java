package com.isasyr;

import java.util.Scanner;

public class Main {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.numberAverage());
    }
    public double numberAverage(){
        //Klavyeden girilen 3 sayının ortalaması.
        System.out.print("First Number: ");
        int firstNumber=scanner.nextInt();
        System.out.print("Second Number: ");
        int secondNumber=scanner.nextInt();
        System.out.print("Third Number: ");
        int thirdNumber=scanner.nextInt();
        return (firstNumber+secondNumber+thirdNumber/3.0);
    }
}
