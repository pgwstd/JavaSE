/**
 * Created by 潘光伟 on 2022/5/5 19:24.
 */
public class Weather {
    WeatherState  state;
    public void show() {
        state.showState();
    }
    public void setState(WeatherState s) {
        state = s;
    }

}
