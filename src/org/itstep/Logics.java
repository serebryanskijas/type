package org.itstep;

public class Logics {
    public static void main(String[] args) {

       /*     Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
                 1. Первые два числа равны между собой и не равны третьему;
        int a = 111, b = 222, c = 333;
        if (a==b && a!=c) System.out.println();*/
//2. Второе или третье число больше первого;
        int a1 = 222;

//3. Первое не меньше второго, а второе не больше третьего;
//4. Все числа разные;
//5. Первое - четное, второе - нечетное, третье - отрицательное;

/*
Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
1. Может ли конь переместиться с первой на вторую клетку?*/
        int x1 = 2, x2 = 1, y1 = 3, y2 = 1;

        int x3 = Math.abs(x1 - x2);
        int y3 = Math.abs(y1 - y2);
        if (((x3 == 1) && (y3 == 2)) || ((x3 == 2) && (y3 == 1)))
            System.out.println("Может");
        else System.out.println("do't do it");

//2. Может ли слон переместиться с первой на вторую клетку?
        int x11= 2, x22 = 1, y11 = 3, y22 = 4;

        int x33 = Math.abs(x11 - x22);
        int y33 = Math.abs(y11 - y22);
        if (((x33 == 1) && (y33 == 1)) || ((x33 == 2) && (y33 == 2)))
            System.out.println("Может");
        else System.out.println("do't do it");


//3. Может ли ладья переместиться с первой на вторую клетку?
        int x111= 2, x222 = 2, y111 = 3, y222 = 4;
        int x333 = Math.abs(x111 - x222);
        int y333 = Math.abs(y111 - y222);
        if (((x333 == 0) && (y333 >= 1)) || ((x333 >= 1) && (y333 == 0)))
            System.out.println("True");
        else System.out.println("False");

//4. Может ли король переместиться с первой на вторую клетку?
        int x1111= 2, x2222 = 3, y1111 = 3, y2222 = 3;
        int x3333 = Math.abs(x1111 - x2222);
        int y3333 = Math.abs(y1111 - y2222);
        if (((x3333 == 0) && (y3333 == 1)) || ((x3333 == 1) && (y3333 == 0)) || ((x3333 == 1) && (y3333 == 0)))
            System.out.println("True");
        else System.out.println("False");


    }

}