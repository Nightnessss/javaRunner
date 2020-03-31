package com.fehead.questions.bitoperation;

/**
 * @author Nightnessss 2020/3/31 19:22
 */
public class Bit {

    public static void main(String[] args) {

        // 0101
        int a = 5;

        // 0011
        int b = 3;

        // 0111
        System.out.println(a | b);
        // 0001
        System.out.println(a & b);
        // 0110
        System.out.println(a ^ b);
    }
}
