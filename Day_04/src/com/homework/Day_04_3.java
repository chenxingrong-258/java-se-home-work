package com.homework;

import java.util.Scanner;

public class Day_04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字:");
        double b = sc.nextDouble();
        System.out.println("请输入运算符号:");
        String c = sc.next();
        switch (c){
            case "+":
                if (a+b==(int)a+(int) b)
                    System.out.println((int)a+(int)b);
                else
                    System.out.println(a+b);
                break;
            case "-":
                if (a-b==(int)a-(int)b)
                    System.out.println((int)a-(int)b);
                else
                    System.out.println(a-b);
                break;
            case "*":
                if (a*b==(int)(a*b))
                    System.out.println((int)(a*b));
                else
                    System.out.println(a*b);
                break;
            case "/":
                if (b==0)
                    System.out.println("无法进行除法运算");
                else if (a/b==(int)(a/b))
                    System.out.println((int)(a/b));
                else
                    System.out.println(a/b);
                break;
        }


    }
}
