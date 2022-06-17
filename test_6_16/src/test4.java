/**
 * Created by 潘光伟 on 2022/6/17 22:07.
 */
//文件a.txt复制到b.txt
import java.io.*;
public class test4 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("/Users/panguangwei/java_homework/test_6_16/src/a.txt");
        File outputFile = new File("/Users/panguangwei/java_homework/test_6_16/src/b.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
            in.close();
            out.close();
        }
    }
}