/**
 * Created by 潘光伟 on 2022/6/18 20:20.
 */
public class Rect {
    double width = 0;
    double height = 0;
    double area = 0;
    void setWidth(double width){
        if (width > 0) {
            this.width = width;
        }
    }
    void setHeight(double height){
        if (height > 0) {
            this.height = height;
        }
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    double getArea(){
        area = width * height;
        return area;
    }
}
