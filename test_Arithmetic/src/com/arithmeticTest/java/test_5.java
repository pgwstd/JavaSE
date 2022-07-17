package com.arithmeticTest.java;
/*
牛牛商场促销活动：
满100全额打9折；
满500全额打8折；
满2000全额打7折；
满5000全额打6折；
且商场有抹零活动，不足一元的部分不需要付款（类型强制转换）
牛大姨算不清楚自己应该付多少钱，请你帮忙算一下
 */
import java.util.Scanner;
public class test_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        //write your code here......
        if(price >= 100 && price < 500){
            cost = (int) (price * 0.9);
        }
        else if(price >= 500 && price < 2000){
            cost = (int) (price * 0.8);
        }
        else if (price >= 2000 && price < 5000) {
            cost = (int) (price * 0.7);
        }
        else if(price >= 5000){
            cost = (int) (price * 0.6);
        }
        else{
            cost = price;
        }
        System.out.println(cost);
    }
}
