package com.isasyr;

import java.util.Scanner;

public class Main {
    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.letterGrade());
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
    public String triangleVarious(){
        //Klavyeden girilen bir ücegenin cesidini veren uygulama yazının.
        int firstEdge,secondEdge,thirdEdge;
        System.out.print("Enter firstEdge : ");
        firstEdge=scanner.nextInt();
        System.out.print("Enter secondEdge : ");
        secondEdge=scanner.nextInt();
        System.out.print("Enter thirdEdge : ");
        thirdEdge=scanner.nextInt();
        if (firstEdge == secondEdge && secondEdge == thirdEdge)
            return "equilateral";
        else if(firstEdge != secondEdge && secondEdge !=thirdEdge)
            return "scalene";
        else
            return "isosceles";
    }
    public String letterGrade(){
        //midterm exam %40 and finalExam %60
        int midtermExam;
        int finalExam;
        System.out.print("Enter Midterm Exam : ");
        midtermExam=scanner.nextInt();
        System.out.print("Enter Final Exam : ");
        finalExam=scanner.nextInt();
        if ((midtermExam*0.4+finalExam*0.6)<50)
            return "failed";
        else
            return "passed";
        

    }
}
