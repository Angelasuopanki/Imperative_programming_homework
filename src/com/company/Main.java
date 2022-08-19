package com.company;

public class Main {

    public static void main(String[] args) {
        homework82();
    }

    static void homework2() {
        int a = 3;
        int b = 3;
        if (a == b)
            System.out.println((a + b) * (a + b));
        else
            System.out.println(a + b);
    }

    static void homework31() {
        int n = 37;
        int x = 1;
        for (int i = 10; i <= 37; i = i + 3)
            System.out.println(i);
    }

    static void homework32() {
        int n = 900;
        int x = 1;
        for (int i = 998; i >= 900; i = i - 2)
            System.out.println(i);
    }

    static void homework33() {
        int val = 1;
        int n;
        for (n = 1; n <= 20; n++) {
            System.out.println(val);
            val = val * (-1);
        }
    }

    static void homework34() {
        int n;
        for (n = 1; n <= 20; n++) {
            System.out.println(7);
            System.out.println(7);
            System.out.println(9);

        }
    }
    static void homework4(){
        String action = "next action: ";
        int t = 22;
        if (t<17)
            System.out.println(action + "hit");
        else if (t>21)
            System.out.println(action + "bust");
        else
            System.out.println(action + "stay");
    }
    static void homework5(){
        int a = 100;
        int b = 10;
        if (a >= 100 && b <=50)
            System.out.println(1);
        else
            System.out.println(0);

    }
    static void homework6(){
        int weight = 7;
        if (weight<=2)
            System.out.println(3);
        else if (weight > 5)
            System.out.println(9+((weight-5)*3));
        else
            System.out.println(3+((weight-2)*2));
    }
    static void homework7 (){

    }
    static void homework81 (){
        int a = 7;
        int n;
        int t = 3;
        for (n=1; n<a; n++){
            t = t*3;
        }
        System.out.println(t);
    }
    static void homework82(){
        int a = 5;
        int n;
        int t = 7;
        for (n=1; n<a; n++){

        }
        System.out.println();
    }
    }


