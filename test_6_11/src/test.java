/**
 * Created by 潘光伟 on 2022/6/11 13:18.
 */
//文本的复制和追回
//原有old.txt文件，内容为“沉迷学习，无法自拔”，要求将全部内容复制到新建文件new.txt，并在new.txt文件末尾追加新内容“good good study,day day up!
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException{
        File old = new File("/Users/panguangwei/java_homework/test_6_11/src/old.text");
        File newFile = new File("/Users/panguangwei/java_homework/test_6_11/src/new.text");
        FileInputStream fis = new FileInputStream(old);
        FileOutputStream fos = new FileOutputStream(newFile);
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }
        fis.close();
        fos.write("good good study,day day up!".getBytes());
        fos.close();
    }

}
