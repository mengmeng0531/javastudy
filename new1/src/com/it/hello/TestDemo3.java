package com.it.hello;

import java.util.Scanner;

public class TestDemo3 {
    /*

    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
         m = sc.nextInt();
        System.out.print("请输入第二个数：");
         n = sc.nextInt();
         while ((m - n) != 0)
         {
          if(m > n)
          {
              m = m - n;
          }else
              n = n - m;
         }
        System.out.println("最的公约数为：" + m);
    }
    */

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("你输输入第一个数：");
            m = sc.nextInt();
            System.out.print("你输输入第二个数：");
            n = sc.nextInt();
            int min = (m <= n) ? m : n;
            for (int i = min; i >= 1; i++) {
                if ((m % i == 0) && (n % i == 0)) {


                    System.out.println("最大公约数为：" + i);
                }else
                {
                    System.out.println("没有公约数");

                }



            }

        }


    }
}

