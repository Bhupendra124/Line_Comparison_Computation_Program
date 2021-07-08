package com.BridgeLabz;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("$$$WELCOME TO LINE_COMPARISON PROGRAM$$$$");
        Scanner sc=new Scanner(System.in);
                //Asking user to Enter co ordinate
        System.out.println("Enter (x1 y1) co-ordinates :");
        float x1 = sc.nextFloat(),y1 = sc.nextFloat();

        System.out.println("Enter (x2,y2) co-ordinates: ");
        float x2 = sc.nextFloat(),y2 = sc.nextFloat();
         //Calculating Line model
        System.out.println("Length at 2 Points::" +"("+x1+","+y1+")"+"and"+"("+x2+","+y2+")");
        double Length_line=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        System.out.println("Length of a line::"+Length_line);

        }

        }


