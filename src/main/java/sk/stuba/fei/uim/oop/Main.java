package sk.stuba.fei.uim.oop;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x=5;
        int []y= new int[]{1,2,3};

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testArray(y);
        System.out.println(Arrays.toString(y));

        testArraySpread("test",1,2,3,4,5,6,7,8);
    }

    public static void testPrimitive(int cislo){
        cislo=10;
        System.out.println(cislo);
    }

    public static void testArray(int []array){
        array[0]=10;
        System.out.println(Arrays.toString(array));
    }

    public static void testArraySpread(String text,int... array){
        System.out.println(text);
        System.out.println(Arrays.toString(array));
    }
}
