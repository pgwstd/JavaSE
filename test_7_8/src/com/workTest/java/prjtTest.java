package com.workTest.java;

public class prjtTest {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,23,4,55,62,77,332,123};
        int key = 55;
        testUtil x = new testUtil();
        System.out.println(x.arrMax(arr));
       testUtil y = new testUtil();
       y.print(arr);
        System.out.println(y.arrMin(arr));
        testUtil n = new testUtil();
        System.out.println(n.arrSeach(arr,key));
    }
}
