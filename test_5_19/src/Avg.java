/**
 * Created by 潘光伟 on 2022/5/19 08:34.
 */
//解析出“数据结构89分，离散数学92分，Java编程86分，组成原理76分”的成绩，计算并输出平均分
public class Avg {
    public static void main(String[] args) {
        String str = "数据结构89分,离散数学92分,Java编程86分,组成原理76分";
        String[] strings = str.split(",");
        int sum = 0;
        for (String s : strings) {
            sum += Integer.parseInt(s.substring(0, s.length() - 1));
        }
        System.out.println(sum / strings.length);
    }
}
