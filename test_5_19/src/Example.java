/**
 * Created by 潘光伟 on 2022/5/26 09:17.
 */
public class Example {
        public static void main(String args[]) {
            ChinaPeople chinaPeople=new ChinaPeople();
            AmericanPeople americanPeople=new AmericanPeople();
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
            beijingPeople.beigingOpera();
            beijingPeople.chinaGongfu();

        }

    }
