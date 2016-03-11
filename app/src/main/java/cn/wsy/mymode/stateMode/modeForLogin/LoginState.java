package cn.wsy.mymode.stateMode.modeForLogin;

/**
 * 涉及到登录操作的行为动作
 * Created by wsy on 2016/2/23.
 */
public interface LoginState {

    /**
     * 进入个人中心
     */
    public void toPersonalCenter();

    /**
     * 进行评论
     */
    public void commenting();

    /**
     * 进行转发
     */
    public void transpondMsg();

}
