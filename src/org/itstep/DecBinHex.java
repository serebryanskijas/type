package org.itstep;

public class DecBinHex {
    public static void main(String[] args) {

        int id = 2;
        int io = 010;
        int ih = 0xa;
        int ib = 0b100;
        char c = 'a';
        String s = "STROKA";
        double d1 = 1.2E20;
        System.out.println(s);

        System.out.printf("From Dec to Bin: %s%n", Integer.toBinaryString(id));

        for (int i = 0; i < 16; i++)
            System.out.println(Integer.toBinaryString(i));

        System.out.println("Convert from binary to decimal");
        s = "1010101";
        int nulDec = Integer.parseInt(s, 2);
        System.out.println(nulDec);

        System.out.println("Get one digit from a binary literal");
        int numberBin = 0b0101;
        int bit = numberBin & 1;
        System.out.println(bit);

        int bit1 = (numberBin >> 1) & 1;
        System.out.println(bit1);

        //Bitwise operations on a binary
        //Logical NOT
        byte number1 = 0b0101;
        int result = ~number1;
        String sresult = Integer.toBinaryString(result);
        sresult = sresult.substring(28);
        System.out.println(sresult);

        //Logical AND
        byte number2 = 0b0100;
        int result1 = number1 & number2;
        String sresult1 = Integer.toBinaryString(result1);
        System.out.println(sresult1);

        //Logical OR
        int result2 = number1 | number2;
        System.out.println(Integer.toBinaryString(result2));

        int x, y;
        x = 1;
        y = --x;
        System.out.println(x + " " + y);
    }
}
