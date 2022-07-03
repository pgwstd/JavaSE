
class mm {
    void fte(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}

public class test_5 {
    public static void main(String args[]) {
        int a[] = {45, 89, 7, 6, 0};
        mm pp = new mm();
        pp.fte(a);
    }
}


