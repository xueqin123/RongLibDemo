package qin.xue.ronglibdemo;

import android.app.Application;
import android.util.Log;

import io.rong.imlib.RongIMClient;
import io.rong.imlib.RongIMClient.ConnectCallback;

/**
 * Created by qinxue on 2018/7/3.
 */

public class LibTestApplication extends Application {
    private static final String TAG = LibTestApplication.class.getName();
    public static final String APP_KEY = "sfci50a7s4q5i";
    public static final String USER_TOKEN_1 = "xKVD3KOPl2fABJ7TmXzJJK5VbzBm9J5AteeZN+MbeIsewrb07hVFMnBkcc5GvzDgTFPVWauINNqV8GB7+3x38w==";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate()");
        RongIMClient.init(this, APP_KEY);
        RongIMClient.connect(USER_TOKEN_1, new ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                Log.i(TAG, "onTokenIncorrect()");
            }

            @Override
            public void onSuccess(String s) {
                Log.i(TAG, "onSuccess()");
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.i(TAG, "onError() errorCode: " + errorCode);
            }
        });
    }
}
