import java.io.*;
public class test_6 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("test_6_30/src/a.txt");
        File outputFile = new File("test_6_30/src/b.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1)
        out.write(c);
        in.close();
        out.close();
    }

}