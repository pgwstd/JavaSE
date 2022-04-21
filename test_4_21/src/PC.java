//
// Created by 潘光伟 on 2022/4/21.
//


public class PC {

    CPU cpu;

    HardDisk HD;

    /*
     * 用setCPU(CPU c)方法将参数c的值赋值给cpu
     */
    void setCPU(CPU c) {

        cpu = c;

    }

    /*
     * 用setHardDisk(HardDisk h)方法将参数h的值赋值给HD
     */
    void setHardDisk(HardDisk h) {

        HD = h;

    }

    /*
     * show()方法显示cpu的速度和硬盘的容量
     */
    void show() {

        System.out.println("CPU速度:" + cpu.getSpeed());

        System.out.print("硬盘容量:" + HD.getAmount());

    }

}


