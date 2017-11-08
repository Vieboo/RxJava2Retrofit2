package com.vieboo.rxretrofit;

import android.app.Application;

/**
 * Created by Administrator on 2017/11/8.
 */

public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }
}
