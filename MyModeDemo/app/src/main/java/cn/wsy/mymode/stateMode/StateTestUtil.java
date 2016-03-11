package cn.wsy.mymode.stateMode;

import android.util.Log;

import cn.wsy.mymode.ModeTest;

/**
 * 测试类
 * Created by wsy on 2016/2/23.
 */
public class StateTestUtil implements ModeTest {

    private final String TAG = "StateTestUtil";

    @Override
    public void traditionalTest() {
        int tvState = 0;//0 开机 1关机
        //调声音
        upVolume(tvState);
        //调频道
        nextChannel(tvState);
    }

    @Override
    public void modeTest() {
        //注入状态操作
        TvControl tvControl = new TvControl(new PowerOnState());
        //调声音 开机
        tvControl.upVolume();
        //关机 再操作
        tvControl.setStateControl(new PowerOffState());
        tvControl.nextChannel();
    }

    //传统
    public void upVolume(int state) {
        if (state == 0) {
            Log.i(TAG, "音量提高中..,");
        }else{
            Log.i(TAG, "关机啦..,");
        }
    }

    public void downVolume(int state) {
        if (state == 0) {
            Log.i(TAG,"音量降低中..,");
        }else{
            Log.i(TAG, "关机啦..,");
        }
    }

    public void nextChannel(int state) {
        if (state == 0) {
            Log.i(TAG,"下一个频道..,");
        }else{
            Log.i(TAG, "关机啦..,");
        }
    }

    public void beforeChannel(int state) {
        if (state == 0) {
            Log.i(TAG,"上一个频道..,");
        }else{
            Log.i(TAG, "关机啦..,");
        }
    }

}
