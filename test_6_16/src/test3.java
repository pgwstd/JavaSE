/**
 * Created by 潘光伟 on 2022/6/17 21:45.
 */
class mm {
    void fte(int arr[]) {
        //逆序输出
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" "+arr[i]);
        }
    }
}

public  class test3 {
    public static void main(String args[]) {
        int a[]={45,89,7,6,0};
        mm pp = new mm();
        pp.fte(a);
    }
}
