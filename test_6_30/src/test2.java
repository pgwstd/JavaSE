
import java.lang.*;  //引入java的核心类库
import java.io.*;  //引入java的IO类库

public class test2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader inReader = new InputStreamReader(System.in);  //创建一个输入流读取器对象
        BufferedReader bStream = new BufferedReader(inReader);
        FileOutputStream fWrite = new FileOutputStream("student.txt", true);
        String rString;
        do {
            System.out.println("\n Please enter :");
            System.out.flush();

            rString = bStream.readLine();

            System.out.println("Hello User>This is:");
            fWrite.write(rString.getBytes());
            System.out.println("> " + rString);
        } while (rString.length() != 0);

    }

}

