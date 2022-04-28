package test;

/**
 * Created by 潘光伟 on 2022/4/28 19:50.
 */
public class ExamPle {
    public static void main(String args[]) {
        ChinaPeople chinaPeople=new ChinaPeople();
        AmercanPeople americanPeople=new AmercanPeople();
        BeijingPeople beijingPeople=new BeijingPeople();
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera() ;
        beijingPeople.chinaGongfu();
    }

}
