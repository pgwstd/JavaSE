/**
 * Created by 潘光伟 on 2022/5/16 21:27.
 */
import java.util.Scanner;
public class test_5_16_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("输入身份证号码：");
        String id=sc.next();
        idyanzheng(id);
    }
    public static void idyanzheng(String id){
        Scanner sc=new Scanner(System.in);
        boolean tr=true;
        boolean trr=true;
        while (tr) {
            if (id.length() == 18) {
                tr = false;
            }else{
                System.out.println("身份证的长度应该为18位,不合法。");
                id=sc.next();
            }
        }

        String substring = id.substring(6, 14);
        String nian=id.substring(6,10);
        String yue=id.substring(10,12);
        String r=id.substring(12,14);
        int intnian=Integer.parseInt(nian);
        int intyue=Integer.parseInt(yue);
        int intr=Integer.parseInt(r);
        while (trr) {
            if (intnian <= 2022 && intyue > 0 && intyue <= 12 && intr > 0 && intr <= 31) {
                System.out.println("出生日期:\t\t\t" + intnian + "年" + intyue + "月" + intr + "日");
                if(id.charAt(16)%2==1){
                    System.out.println("男");
                }else {
                    System.out.println("女");
                }
                trr = false;
            } else {
                System.out.println("身份证生日无效。");
                id = sc.next();
                substring = id.substring(6, 14);
                nian = id.substring(6, 10);
                yue = id.substring(10, 12);
                r = id.substring(12, 14);
                intnian = Integer.parseInt(nian);
                intyue = Integer.parseInt(yue);
                intr = Integer.parseInt(r);
            }
        }

    }

}

