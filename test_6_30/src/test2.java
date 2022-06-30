
import java.lang.*;  //引入java的核心类库
import java.io.*;  //引入java的IO类库

public class test2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader inReader = new InputStreamReader(System.in);  //创建一个输入流读取器对象
        BufferedReader bStream = new BufferedReader(inReader);  //创建一个缓冲输入流对象
        FileOutputStream fWrite = new FileOutputStream("student.txt", true);  //创建一个文件输出流对象，true表示追加写入
        String rString;  //定义一个字符串变量
        do {
            System.out.println("\n Please enter :");
            System.out.flush();  //刷新缓冲区

            rString = bStream.readLine();  //读取一行字符串

            System.out.println("Hello User>This is:");
            fWrite.write(rString.getBytes());  //将读取的字符串写入文件
            System.out.println("> " + rString);   //输出读取的字符串
        } while (rString.length() != 0);

    }

}

