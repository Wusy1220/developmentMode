package cn.wsy.mymode.strategyMode;

import android.util.Log;

/**
 * Created by wsy on 2016/2/19.
 */
public class TaxiCalculatie implements CalculateUtil {

    private final String TAG = this.getClass().getName();

    @Override
    public int calculating(int km) {
        Log.i(TAG, "的士行程 " + km + "公里,价格为**");
        //复杂计算..
        return 0;
    }
}
