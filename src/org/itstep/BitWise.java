package org.itstep;

public class BitWise {
    public static void main(String[] args) {
        /*Задание 1. Обнулить бит в первом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
        byte b = 0b1101;
        byte result = (byte) ((~(1 << 0)) & b);
        System.out.println(Integer.toBinaryString(result));


        /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления ис-
         пользовать только побитовые операции. */
        int number = 0b101;
        int n = 7;
        int result1 = (byte) (1 << n);
        System.out.println(result1);


        /*Задание 3. Установить 2-й бит числа N равным 1. Вывести результат
        на консоль в двоичном виде.*/
        byte b1 = 0b1101;
        byte result2 = (byte) ((1 << 1) | b1);
        System.out.println(Integer.toBinaryString(result2));

        /*Задание 4. Инвертировать 1-й бит числа N. Вывести результат на
        консоль в двоичном виде.*/
        byte b2 = 0b1001;
        byte result3 = (byte) ((1 << 1) ^ b2);
        System.out.println(Integer.toBinaryString(result3));

/*Задание 5. Вывести результат число равное разрядности двоичного числа.*/
        byte b3 = 0b101000;
        int hight = 0;
        byte number2 = b3;
        while (number2 != 0) {
            number2 >>= 1;
            hight++;
        }
        System.out.println(hight);

// Определение
        int t = 2000;
        int nul = (int)(Math.log10(t));
        System.out.println(++nul);

        byte b4 = 0b1001;
        byte num = (byte)(Math.log(b4)/Math.log(2));
        System.out.println(++num);


    }
}
