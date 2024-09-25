package com.xeno;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void threading() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Hello I'm Thread #1 and I'm Currently running! :) ....");
                        Thread.sleep(1000);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Hello I'm Thread #2 and I'm Currently running! :) ....");
                        Thread.sleep(1000);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
    public static void swapping() {
        int x = 3;
        int y = 7;

        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y+"\n");

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Value of x after swapping is "+x);
        System.out.println("Value of y after swapping is "+y);
    }
    public static int passingValue(int x, int y) {
        return x + y;
    }
    public static void pushAndPop() {
        Scanner in = new Scanner(System.in);
        Stack<String> list = new Stack<String>();

        while(true) {
            System.out.println("====================== PUSH & POP ======================\n" +
                    "1. PUSH\n" +
                    "2. POP\n" +
                    "3. VIEW ITEMS\n" +
                    "4. EXIT");
            System.out.print("========================================================\n" +
                    ">>> ");

            int choice = in.nextInt();

            System.out.println("========================================================");

            switch (choice) {
                case 1:
                    System.out.print(">>> ");
                    String input = in.next();
                    list.push(input);
                    break;

                case 2:
                    System.out.print(">>> ");
                    String item = in.next();
                    list.remove(item);
                    break;

                case 3:
                    list.forEach(i -> {
                        System.out.println(">>> "+i);
                    });
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void arrayAndLoop() {
        int arr[] = {5, 1, 2, 10, 7, 3, 8, 6, 4, 9};

        for(int i=0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void casting() {
        double x = 3.14;
        byte y = 127;
        int z = y;

        System.out.println("Converted to lower value "+(int)x);
        System.out.println("Converted to higher value "+y);
    }
    public static void searching(int x) {
        int[] list = {1,6,2,9,3,5,8,7,10,4};

        for(int i : list) {
            if(i == x) {
                System.out.println(x+" exists in the list!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        pushAndPop();
    }
}
