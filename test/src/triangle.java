import java.util.Scanner;
class triangle {
         int a0,b0,c0,maxEdge,zhouchang,pr;
         void 赋值(int a0,int b0,int c0){
                 Scanner pr=new Scanner(System.in);
                 a0= pr.nextInt();
                 b0= pr.nextInt();
                 c0= pr.nextInt();
                 if ((a0+b0<c0) ||  (a0>b0+c0)){
                     System.out.println("输入的边长有误，请重新输入！");
                 }
         }

         void 判断(int a0,int b0,int c0){
               if (a0==b0 && b0==c0){
                   String judgement = "是等边三角形";
               }
               else if (a0==b0 || b0==c0){
                   String judgement = "是等腰三角形";
               }
               else{
                   String judgement = "否";
               }
         }
         void 查询(int zhouchang,char judgment,int maxEdge){
             Scanner sc=new Scanner(System.in);
             pr=sc.nextInt();
               if (pr==1){
                   System.out.println("周长:"+zhouchang);
               }
               else if (pr==2){
                   System.out.println(judgment);
               }
               else
                   System.out.println("最长的边长是:"+maxEdge);
         }

}


