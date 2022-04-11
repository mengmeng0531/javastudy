package com.it.hello;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {

        System.out.println("1、登录");
        System.out.println("2、注册");
        System.out.print("请输入操作命令：");
        Scanner sctype = new Scanner(System.in);
        int command = sctype.nextInt();
        switch (command){
            case 1:
                System.out.println("登录功能");
                break;
            case 2:
                System.out.println("注册功能");
                break;
            default:
                System.out.println("命令有误");
        }
    }
}
