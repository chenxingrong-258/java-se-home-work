package com.homework;

import java.util.Scanner;

public class Day_04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int a = sc.nextInt();
        if (a%3==0&&a%5!=0){
            System.out.println("乒");
        }else if (a%5==0&&a%3!=0) {
            System.out.println("乓");
        }else if (a%5==0&&a%3==0) {
            System.out.println("乒乓");
        }else {
            System.out.println("请重新输入一个数字:");
        }

    }
}
