/**
 * Created by 潘光伟 on 2022/5/13 20:05.
 */
import java.util.Scanner;

// 交通工具类
abstract class Vehicle {
    int speed = 0;
    abstract public void go(int speed);
}

// 飞机类
class Aircraft extends Vehicle {
    @Override
    public void go(int speed) {
        this.speed = speed;
        System.out.println("We can fly to our destination, the speed is "+ this.speed +"km/h");
    }
}

// 汽车类
class Car extends Vehicle {
    @Override
    public void go(int speed) {
        this.speed = speed;
        System.out.println("We can drive to our destination, the speed is "+ this.speed +"km/h");
    }
}

// 步行类
class Run extends Vehicle {
    @Override
    public void go(int speed) {
        this.speed = speed;
        System.out.println("We can run to our destination, the speed is "+ this.speed +"km/h");
    }
}


public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle test = null;
        int speed;
        switch (sc.next()) {
            case "car":
                speed = sc.nextInt();
                test = new Car();
                test.go(speed);
                break;
            case "run":
                speed = sc.nextInt();
                test = new Run();
                test.go(speed);
                break;
            case "aircraft":
                speed = sc.nextInt();
                test = new Aircraft();
                test.go(speed);
                break;
            default :
                System.out.println("Error");
                break;
        }

    }
}

