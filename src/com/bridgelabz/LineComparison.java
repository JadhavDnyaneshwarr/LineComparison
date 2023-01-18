package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("welcome to Line Comparison computation program");
        int x1 = 2;
        int y1 = 3;
        int x2 = 8;
        int y2 = 9;
        int X = (int) Math.pow((x2 - x1), 2);
        int Y = (int) Math.pow((y2 - y1), 2);
        int lengthOfLine = (int) Math.sqrt(X + Y);
        System.out.println("length of line= " + lengthOfLine);
    }
}
