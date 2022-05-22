/**
 * Created by 潘光伟 on 2022/5/26 09:06.
 */
public class AmericanPeople extends People {
    public void speakHello() {
        System.out.println("How do you do?");
    }
    public void averageHeight() {
        height=176;
        System.out.println("American is average height:"+height+" cm");
    }
    public void averageWeight() {
        weight=75;
        System.out.println("American is average weight:"+weight+" kg");
    }
    public void americanBoxing(){
        System.out.println("直拳、钩拳、组合拳");
    }
}
