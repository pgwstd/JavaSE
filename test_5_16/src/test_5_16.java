/**
 * Created by 潘光伟 on 2022/5/16 20:36.
 */
import java.util.Scanner;
public class test_5_16 {
        public static void main(String args[]) {
            System.out.println("请输入一行文本：");
            int a=0;
            int b=0;
            int c=0;
            Scanner reader=new Scanner(System.in);
            String str=reader.nextLine();
            String regex="[\\s\\d\\p{Punct}]+";
            String words[]=str.split(regex);
            for(int i=0;i<words.length;i++) {
                //以字母w开头的单词数
                if (words[i].startsWith("w")) {
                    a++;
                }
                //单词中含o字符串的单词数
                if (words[i].contains("o")) {
                    b++;
                }
                //长度为3的单词数
                if (words[i].length() == 3) {
                    c++;
                }
            }
                System.out.println("以字母w开头的单词数"+a);
                System.out.println("单词中含o字符串的单词数"+b);
                System.out.println("长度为3的单词数"+c);

        }
    }

