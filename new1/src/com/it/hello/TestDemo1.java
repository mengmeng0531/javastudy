package com.it.hello;

public class TestDemo1 {
    public static void main(String[] args) {
        int i = 9;
        int j = 9;
        while (i >= 1)
        {
            while ((j <= i) && (j > 0))
            {
                System.out.print(i + "*" + j + "=" + j*j + " " );
                j--;

            }
            System.out.println("行");
            i--;
            j = i;

        }
    }
}
