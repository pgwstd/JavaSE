/**
 * Created by 潘光伟 on 2022/6/16 19:13.
 */
import java.lang.*;
import java.io.*;
public class test2 {
        public static void main(String arg[]) extends IOException {
            InputStreamReader inReader=new InputStreamReader(System.in);
            BufferedReader bfred=new BufferedReader(inReader);
            FileOutputStream fWrite=new FileOutputStream("test.txt");
            String rString;
            do {
                System.out.println("\n Please enter :");
                System.out.flush();
                rString=bStream.readLine();
                System.out.println("Hello User>This is:");
                fWrite.write(rString.getBytes());
                System.out.println("> "+rString);
            }while(rString.length()!=0);
        }

    }
