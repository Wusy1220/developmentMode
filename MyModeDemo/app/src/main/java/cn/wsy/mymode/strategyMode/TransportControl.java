package cn.wsy.mymode.strategyMode;

/**
 * 交通工具价格控制类
 * Created by wsy on 2016/2/19.
 */
public class TransportControl {

    private CalculateUtil calculateUtil;

    public TransportControl(CalculateUtil calculateUtil) {
        this.calculateUtil = calculateUtil;
    }

    public int calculating(int km){
        return calculateUtil.calculating(km);
    }

}
