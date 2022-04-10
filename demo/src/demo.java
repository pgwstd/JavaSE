//
// Created by 潘光伟 on 2022/4/10.
//

import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        //新建一个时间数组
        int[] time = new int[3];
        //输入时间
        System.out.println("请输入时间：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            time[i] = scanner.nextInt();

        }
        //输出时间
        System.out.println("时间为：" + time[0] + ":" + time[1] + ":" + time[2]);
        System.out.println("Hello World!");
    }

}
