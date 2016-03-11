package cn.wsy.mymode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.wsy.mymode.stateMode.StateTestUtil;

public class MainActivity extends AppCompatActivity {

    private AllModeTestUtil modeTestUtil = new AllModeTestUtil();

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView(){
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
    }

    private void initListener(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                modeTestUtil.strategyModeTest();
                modeTestUtil.strategyMode_tradition_Test(0,2);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                LoginTest loginTest = new LoginTest();
//                loginTest.modeTest();
                StateTestUtil stateTestUtil = new StateTestUtil();
                stateTestUtil.modeTest();
            }
        });

    }


}
