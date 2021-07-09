package com.BridgeLabz1;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("$$$WELCOME TO LINE_COMPARISON PROGRAM$$$$");

        Scanner sc = new Scanner(System.in);
        //Asking user to Enter co ordinate

        System.out.println("Enter (x1 y1) co-ordinates :");
        float x1 = sc.nextFloat(), y1 = sc.nextFloat();

        System.out.println("Enter (x2,y2) co-ordinates: ");
        float x2 = sc.nextFloat(), y2 = sc.nextFloat();

        System.out.println("Enter (x3,y3) co-ordinates: ");
        float x3 = sc.nextFloat(), y3 = sc.nextFloat();

        System.out.println("Enter (x4,y4) co-ordinates: ");
        float x4 = sc.nextFloat(), y4 = sc.nextFloat();


        // Calculation
        System.out.println("the cordinates of line 1 are::" + "(" + x1 + "," + y1 + ")" + "and" + "(" + x2 + "," + y2 + ")");
        double Lengthline = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Length of a line::" + Lengthline);
        System.out.println("the cordinates of line 2 are::" + "(" + x3 + "," + y3 + ")" + "and" + "(" + x4 + "," + y4 + ")");
        double Lengthline1 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
        System.out.println("Length of a line ::" + Lengthline1);
    }
}