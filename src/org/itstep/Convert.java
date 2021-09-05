package org.itstep;

import javax.swing.*;

public class Convert {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a binary number");
        int number = Integer.parseInt(str, 2);
        String strDec = Integer.toString(number);
        String strHex = Integer.toHexString(number);
        String message = String.format("Dec : %s%n Hex :%s", strDec, strHex);
        JOptionPane.showMessageDialog(null, message);
    }
}
