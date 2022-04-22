//
// Created by 潘光伟 on 2022/4/21.
//


import java.util.Scanner;

public class Vehicle {
    private int speed;
    private String direction;

    public Vehicle(){
        speed = 0;
        direction = "North";
    }

    public void setSpeed(int sum) {
        if (sum <= 120) {
            speed = sum;
        }
    }

    public void setDirection(int sum) {
        switch (sum) {
            case 1:
                direction = "North";
                break;
            case 2:
                direction = "South";
                break;
            case 3:
                direction = "East";
                break;
            case 4:
                direction = "West";
                break;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public String getdirection(){
        return direction;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 1) {
            vehicle.setSpeed(b);
        } else {
            vehicle.setDirection(b);
        }

        System.out.print("setSpeed speed=" + vehicle.getSpeed());
        System.out.print("\t");
        System.out.print("direction=" + vehicle.getdirection());
    }
}
