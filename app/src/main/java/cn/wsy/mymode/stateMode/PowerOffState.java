package cn.wsy.mymode.stateMode;

import android.util.Log;

/**
 * 关机的操作
 * Created by wsy on 2016/2/23.
 */
public class PowerOffState implements TvStateControl{

    private final String TAG = "PowerOffState";

    @Override
    public void upVolume() {
        Log.i(TAG,"关机咯");
    }

    @Override
    public void downVolume() {
        Log.i(TAG,"关机咯");
    }

    @Override
    public void nextChannel() {
        Log.i(TAG,"关机咯");
    }

    @Override
    public void beforeChannel() {
        Log.i(TAG,"关机咯");
    }
}
