/**
 * Created by 潘光伟 on 2022/5/19 08:27.
 */
public class FindMess {
    public static void main(String args[]) {
        String mess = "书名:Java程序设计,出版时间:2011.10.01,"+
                "出版社:清华大学出版社,价格:29.8 元,页数:389页";
        //判断mess中是否含有"程序"
        if( mess.indexOf("程序") != -1 ) {
            System.out.println("图书信息包含有\"程序\"");
        }
        //mess调用indexOf(String s,int start)返回mess中第2个冒号的位置
        int index=mess.indexOf(":",mess.indexOf(":")+1);
        String date = mess.substring(index+1,index+11);
        System.out.println(date);
        //mess调用indexOf(String s)返回首次出现"价格"的位置
        int pricePosition=mess.indexOf("价格");
        int endPosition=mess.indexOf("元");
        //截取从首次出现"价格"的位置后第3个字符到“元”之前的字符序列
        String priceMess = mess.substring(pricePosition+3,endPosition);
        System.out.println("图书价格:"+priceMess);
        double price=Double.parseDouble(priceMess);
        if(price>=29) {
            System.out.println("图书价格"+price+"大于或等于29元");
        }
        else {
            System.out.println("图书价格"+price+"小于29元");
        }
        //mess调用laseIndexOf(String s,int start)返回最后一个冒号位置
        index = mess.lastIndexOf(":");
        endPosition=mess.lastIndexOf("页");
        String pageMess = mess.substring(index+1,endPosition);
        //把pageMess转换为整形数据
        int p = Integer.parseInt(pageMess);
        if(p>=360) {
            System.out.println("图书的页数"+p+"大于或等于360");
        }
        else {
            System.out.println("图书的页数"+p+"小于360");
        }
    }

}
