package cn.wsy.mymode.stateMode.modeForLogin;

import android.util.Log;

/**
 * 登出操作
 * Created by wsy on 2016/2/23.
 */
public class LoginOutState implements LoginState{

    private final String TAG =  "LoginedState";

    @Override
    public void toPersonalCenter() {
        Log.i(TAG,"进入个人中心失败，进入登录界面");
    }

    @Override
    public void commenting() {
        Log.i(TAG,"进行评论失败，进入登录界面");
    }

    @Override
    public void transpondMsg() {
        Log.i(TAG,"进行转发失败,进入登录界面");
    }
}
