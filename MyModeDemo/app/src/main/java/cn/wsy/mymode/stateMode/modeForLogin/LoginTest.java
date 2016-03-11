package cn.wsy.mymode.stateMode.modeForLogin;

import cn.wsy.mymode.ModeTest;

/**
 * Created by wsy on 2016/2/23.
 */
public class LoginTest implements ModeTest{
    @Override
    public void traditionalTest() {

    }

    @Override
    public void modeTest() {
        LoginControl loginControl = new LoginControl(new LoginOutState());
        //默认没有登录
        loginControl.toPersonalCenter();
        //登录后 再操作
        loginControl.setLoginedState(new LoginedState());
        loginControl.toPersonalCenter();
    }
}
