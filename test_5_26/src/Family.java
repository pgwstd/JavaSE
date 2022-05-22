//Family类负责创建“家庭”对象zhangSanFamilyhangSanFamily
public class Family {
    TV homeTV;
    void buyTV(TV tv) {
        homeTV=tv;
    }
    void remoteControl(int m) {
        homeTV.setChannel(m);
    }
    void seeTV() {
        homeTV.showProgram();
    }

}