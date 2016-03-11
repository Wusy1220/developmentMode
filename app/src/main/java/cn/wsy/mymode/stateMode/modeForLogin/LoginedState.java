package cn.wsy.mymode.stateMode.modeForLogin;

import android.util.Log;

/**
 * 已经登录
 * Created by wsy on 2016/2/23.
 */
public class LoginedState implements LoginState{

    private final String TAG =  "LoginedState";

    @Override
    public void toPersonalCenter() {
        Log.i(TAG,"进入个人中心界面");
    }

    @Override
    public void commenting() {
        Log.i(TAG,"进行评论");
    }

    @Override
    public void transpondMsg() {
        Log.i(TAG,"进行转发");
    }

}
