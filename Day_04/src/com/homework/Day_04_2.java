package com.homework;

import java.util.Scanner;

public class Day_04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个0-100的数字");
        int a = sc.nextInt();
        int b = a/10;
        switch (b){
            case 9:
            case 10:
                if (a>100){
                    System.out.println("请输入正确的数字");
                }else {
                    System.out.println("A");
                }
            break;
            case 8:System.out.println("B");
            break;
            case 7:System.out.println("C");
            break;
            case 6:System.out.println("D");
            break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:if (a<0){
                System.out.println("请输入正确的数字");
            }else {
                System.out.println("E");
            }
            break;
            default:
                System.out.println("请输入正确数字：");
        }
    }
}
