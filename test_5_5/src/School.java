/**
 * Created by 潘光伟 on 2022/5/5 19:01.
 */
public class School implements ComputerAverage {
   //重写public double average(double x[])方法,返回数组x[]的元素的算术平均
    @Override
    public double average(double x[]){
       double sum=0,avg=0;
       for (int i=0;i<x.length;i++){
           sum+=x[i];
           avg=sum/x.length;
       }
       return avg;
    }
}

