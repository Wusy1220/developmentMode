package cn.wsy.mymode;

import cn.wsy.mymode.strategyMode.BusCalculate;
import cn.wsy.mymode.strategyMode.SubwayCalculate;
import cn.wsy.mymode.strategyMode.TransportControl;

/**
 * 这里提供所有设计模式的测试方法
 *
 * Created by wsy on 2016/2/19.
 */
public class AllModeTestUtil {

    /**
     * 利用传统模式设计
     */
    public void strategyModeTest(){
        TransportControl transportSub = new TransportControl(new SubwayCalculate());
        transportSub.calculating(25);

        TransportControl transportBus = new TransportControl(new BusCalculate());
        transportBus.calculating(55);
    }

    /**
     * 非传统模式设计
     */
    public void strategyMode_tradition_Test(int tranFlag,int km ){
        //车类型标志
//        int tranFlag = 0;//1 巴士 2的士 3地铁
//        int km = 25;//行走路程
        if (tranFlag == 1){
            if (km < 10){
                ///..一种价格
            }else if (km>10 && km<25){
                //..一种价格
            }//else if...
        }else if(tranFlag == 2){
            if (km < 3){
                ///..一种价格
            }else if (km>3 && km<20){
                //..一种价格
            }//else if...
        }else if(tranFlag == 3){
            if (km < 15){
                ///..一种价格
            }else if (km>15 && km<40){
                //..一种价格
            }//else if...
        }

    }

}
