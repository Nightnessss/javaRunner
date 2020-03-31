package com.fehead.equals;

/**
 * @author Nightnessss 2020/3/30 17:30
 */
public class Test {

    /**
     * jvm首先会在字符串常量池里面寻找有没有"abc"这个对象
     * 如果有，就把它的地址返回
     * 如果没有，就新建一个并返回地址
     */
    public void eq1() {

        String s1 = "abc";
        String s2 = "abc";
        // true
        System.out.println("s1==s2:" + (s1 == s2));
        // true
        System.out.println("s1.equals(s2):" + (s1.equals(s2)));
        // 96354
        System.out.println("s1:" + s1.hashCode());
        // 96354
        System.out.println("s2:" + s2.hashCode());

    }


    /**
     * jvm先从字符串常量池里面寻找"abc"
     * 如果有，则在堆中创建一个字符串对象，再将对象地址返回
     * 如果无，则在此之前先在字符串常量池创建一个"abc"，再在堆中创建字符串对象（与前一个对象不同
     */
    public void eq2() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        System.out.println("s1:" + s1.hashCode());
        System.out.println("s2:" + s2.hashCode());

    }
}
