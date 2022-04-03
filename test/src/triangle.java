public class triangle {
    private int a0,b0,c0;
    private int maxEdge;
    private int zhouchang;

    public int getA0() {
        return a0;
    }

    public int getZhouchang(int a0,int b0,int c0) {
        zhouchang+=a0+b0+c0;
        return zhouchang;
    }

    public void setZhouchang(int zhouchang) {
        this.zhouchang = zhouchang;
    }

    public void setA0(int a0) {
        this.a0 = a0;
    }

    public int getB0() {
        return b0;
    }

    public void setB0(int b0) {
        this.b0 = b0;
    }

    public int getC0() {
        return c0;
    }

    public void setC0(int c0) {
        this.c0 = c0;
    }
    public void perimeter(int a0,int b0,int c0){
        getZhouchang(a0,b0,c0);
        System.out.println(zhouchang);
    }
    public void Isosceles(int a0,int b0,int c0){
        if (a0==b0&&a0==c0){
            System.out.println( "是等边三角形");
        }else if(a0==b0||b0==c0){
            System.out.println("是等腰三角形");
        }
        else {
            System.out.println("不是等腰三角形也不是等边三角形");
        }
    }
    public void Longest(int a0,int b0,int c0){
        int max=a0;
        if(max<b0){
            max=b0;
        }
        if (max<c0){
            max=c0;
        }
        System.out.println("最长边是"+max);
    }
}