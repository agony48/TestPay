package testpay.lishan.testpay;

import android.app.Application;

import com.alibaba.mobileim.YWAPI;

/**
 * Created by Administrator on 2016/7/19.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        YWAPI.init(this,"23015524");
    }
}
