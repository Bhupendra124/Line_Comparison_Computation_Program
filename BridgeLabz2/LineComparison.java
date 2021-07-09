package com.BridgeLabz2;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x1");
        float x1 = s.nextFloat();

        System.out.println("Enter y1");
        float y1 = s.nextFloat();

        System.out.println("Enter x2");
        float x2 = s.nextFloat();

        System.out.println("Enter y2");
        float y2 = s.nextFloat();

        System.out.println("Enter x3");
        float x3 = s.nextFloat();

        System.out.println("Enter y3");
        float y3 = s.nextFloat();

        System.out.println("Enter x4");
        float x4 = s.nextFloat();

        System.out.println("Enter y4");
        float y4 = s.nextFloat();

        // calculatin part
        double Length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        String str1 = Double.toString(Length1);
        double Length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        String str2 = Double.toString(Length2);
        System.out.println(str1.equals(str2));
    }}




