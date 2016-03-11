package cn.wsy.mymode.stateMode;

import android.util.Log;

/**
 * Created by wsy on 2016/2/23.
 */
public class PowerOnState implements TvStateControl {

    private final String TAG = "PowerOnState";

    @Override
    public void upVolume() {
        Log.i(TAG,"音量提高中..,");
    }

    @Override
    public void downVolume() {
        Log.i(TAG,"音量降低中..,");
    }

    @Override
    public void nextChannel() {
        Log.i(TAG,"下一个频道..,");
    }

    @Override
    public void beforeChannel() {
        Log.i(TAG,"上一个频道..,");
    }
}
