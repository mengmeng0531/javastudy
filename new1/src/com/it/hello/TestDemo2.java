package com.it.hello;

import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
         sumTest();
}

public static void sumTest (){
    int sum = 0;
    int i;
    int j;
    while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        i = sc.nextInt();
        System.out.print("请输入第二个数:");
        j = sc.nextInt();

         sum = i * j;

        System.out.println("乘机为：" + sum);
    }
}
}
