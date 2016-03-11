package cn.wsy.mymode.stateMode;

/**
 * 电视机控制类
 * Created by wsy on 2016/2/23.
 */
public class TvControl {

    TvStateControl stateControl;

    public TvControl(TvStateControl stateControl) {
        this.stateControl = stateControl;
    }

    /**
     * 这里作为切换状态接口
     * @param stateControl
     */
    public void setStateControl(TvStateControl stateControl) {
        this.stateControl = stateControl;
    }

    public void upVolume() {
        stateControl.upVolume();
    }

    public void downVolume() {
        stateControl.downVolume();
    }

    public void nextChannel() {
        stateControl.nextChannel();
    }

    public void beforeChannel() {
        stateControl.beforeChannel();
    }
}
