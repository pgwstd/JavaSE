/**
 * Created by 潘光伟 on 2022/5/26 08:59.
 */
public class ChinaPeople extends People {
    public void sayHello() {
        System.out.println("你好");
    }
    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高是"+height+"厘米");
    }
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均体重是"+weight+"公斤");
    }
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
    }

