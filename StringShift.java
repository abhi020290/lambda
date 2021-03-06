
package com.company;

import java.util.ArrayList;

public class StringShift {

    public static void main(String[] args) {
        System.out.println(getShiftedString("abcdefg",2,0));
        System.out.println(getRightShiftedString("cdefgab",0,2));

    }

    public static String getShiftedString(String s, int leftShifts, int rightShifts) {

        String result = s.substring(leftShifts);

        for (int i = 0; i < leftShifts; i++) {

            result += s.charAt(i);

        }
        return result;
    }

    public static String getRightShiftedString(String s, int leftShifts, int rightShifts) {

        String result = s.substring(0,s.length()-rightShifts);

        System.out.println(result);
        String finalRestut = new String();
        for (int i = s.length()-rightShifts ; i < s.length(); i++) {

            finalRestut += s.charAt(i);

        }
        return finalRestut+result;
    }

}

