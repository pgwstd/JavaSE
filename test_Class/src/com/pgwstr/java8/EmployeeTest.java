package com.pgwstr.java8;

/**
 * @author pgwstr
 * @date 2022/8/4 8:02 PM
 */

public class EmployeeTest {
    public static void main(String[] args) {
      Employee manager =  new Manager("五五",100,99,10);
      manager.work();
      Manager manager1 = new Manager("王五",111,22123,1);
      manager1.work();
    }
}
