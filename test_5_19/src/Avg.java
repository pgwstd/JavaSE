/**
 * Created by 潘光伟 on 2022/5/19 08:34.
 */
//解析出“数据结构89分，离散数学92分，Java编程86分，组成原理76分”的成绩，计算并输出平均分
    import java.util.regex.*;
public class Avg {
    public static void main(String[] args) {
        String str = "数据结构89分，离散数学92分，Java编程86分，组成原理76分";
        Pattern p = Pattern.compile("\\d+(,\\d{3})*");
        Matcher m = p.matcher(str);
        int sum=0;
        int count=0;
        while (m.find()) {
            String s = m.group();
            sum+=Integer.parseInt(s);
            count++;
        }
        System.out.println("平均分为："+sum/count);
    }
}
