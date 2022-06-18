import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketOption;
import java.net.StandardProtocolFamily;

/**
 * Created by 潘光伟 on 2022/6/18 20:25.
 */
public class Example {
    public static void main(String[] args) {
        Rect rect = new Rect();
        double w = 12.76;
        double h = 25.28;
        rect.setWidth(w);
        rect.setHeight(h);
        System.out.println("矩形的宽是: " + rect.getWidth()+"高是: " + rect.getHeight());
        System.out.println("矩形的面积:"+rect.getArea());
        System.out.println("更改传参的值");
        w=100;
        h=256;
        System.out.println("矩形的宽是:"+rect.getWidth()+"高是:"+rect.getHeight());
    }
}
