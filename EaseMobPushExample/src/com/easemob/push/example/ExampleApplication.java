package com.easemob.push.example;

import com.easemob.push.EaseMobPush;

import android.app.Application;
import android.util.Log;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {             
         super.onCreate();
         Log.i("app", "initialize EaseMob Push Service");         
         EaseMobPush.init(this);
    }

}