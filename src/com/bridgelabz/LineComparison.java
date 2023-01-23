package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("welcome to Line Comparison computation program");
        //line-1 coordinate
        int x1 = 2;
        int y1 = 5;
        int x2 = 8;
        int y2 = 9;
        //line-2 coordinate
        int a1 = 3;
        int b1 = 3;
        int a2 = 5;
        int b2 = 9;
        Double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - b1) + (b2 - b1) * (b2 - b1));
        System.out.println("length of line1 = " + lengthOfLine1);
        System.out.println("length of line2 = " + lengthOfLine2);
        if (lengthOfLine1.compareTo(lengthOfLine2) > 0) {
            System.out.println("line-1 greater than line-2");
        } else if (lengthOfLine1.compareTo(lengthOfLine2) < 0) {
            System.out.println("line-2 greater than line-1");
        } else {
            System.out.println("Both are equal");
        }
    }
}
