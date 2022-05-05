

/**
 * Created by 潘光伟 on 2022/5/5 18:49.
 */
public class TotalArea {
    Geometry[] tuxing;
    double totalArea=0;
    public void setTuxing(Geometry[]t) {
        tuxing=t;
    }
    public double computerTotalArea() {
        for(int i=0;i<tuxing.length;i++) {
            totalArea+=tuxing[i].getArea();
            //用循环语句让tuxing的元素调用getArea方法，并将返回的值累加到totalArea
        }
        return totalArea;
    }
}
