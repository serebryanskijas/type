package org.itstep;

public class Identifieres {

    public static void main(String[] args) {
        /*
        abcd
        efg
        hijk
        lmnop
        qrs
        tuv
        wx
        yz
         */
/*//        Объявить переменные, необходимые для вычисления стоимости покупки, состоящей из нескольких тетрадей, карандашей и линейки
        double totalsum, notebook, pricenotebook, pensil, pricepensil, ruller, priseruller;
        int countnotebook, countpensil, countruller;

//        В программе нужно зафиксировать какое-то состояние

        boolean state;


        *//* масса стального куба.
        int a, ro, mass;
        a =1; ro=7800;
        mass = (int) (ro * Math.pow(a,3));
        System.out.println(mass);*//*

//        Задать произвольные букву и строку
        char c = 'a';
        String s = "Hello";
        System.out.println(s);

//        Масса электрона равна 9,1093837015⋅10^−31 кг и Масса Земли равна 5.972⋅10^24 кг
        double massElectron = 9.1093837015e-31;
        double massEarth = 5.972e24;
        System.out.println(massElectron);
        System.out.println(massEarth);

//        Популяция Земли равна 7674538134
        long l = 7_674_538_134l;
        System.out.println(l);*/

        System.out.println("-------------Lesson 3, primitive types------------------");
//
/*
//        При нажатии на кнопку загорается светодиод (buttonState, ledState)|
        boolean buttonState, ledState;

//        Цифру числа нужно преобразовать в букву
        int number, dijet;
        char letter;
*/

        System.out.printf("Boolean: min = %b, max = %b, range = %d %n" , Boolean.FALSE, Boolean.TRUE, 1);
        System.out.printf("Byte: min = %d, max = %d, range = %d %n" , Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
        System.out.printf("Short: min = %d, max = %d, range = %d %n" , Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
        System.out.printf("Integer: min = %d, max = %d, range = %d %n" , Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES);
        System.out.printf("Long: min = %d, max = %d, range = %d %n" , Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES);
        System.out.printf("Char: min = %c, max = %c, range = %d %n" , Character.MIN_VALUE, Character.MAX_VALUE, Character.BYTES);
        System.out.printf("Float: min = %f, max = %f, range = %d %n" , Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES);
        System.out.printf("Double: min = %f, max = %f, range = %d %n" , Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MIN_NORMAL);


    }

}
