package cn.wsy.mymode.stateMode.modeForLogin;

/**
 * 登录控制类
 * Created by wsy on 2016/2/23.
 */
public class LoginControl {

    LoginState loginedState;

    public LoginControl(LoginState loginedState) {
        this.loginedState = loginedState;
    }

    public void setLoginedState(LoginState loginedState) {
        this.loginedState = loginedState;
    }

    public void toPersonalCenter() {
        loginedState.toPersonalCenter();
    }

    public void commenting() {
        loginedState.commenting();
    }

    public void transpondMsg() {
        loginedState.transpondMsg();
    }
}
