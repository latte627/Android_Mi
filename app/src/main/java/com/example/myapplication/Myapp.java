package com.example.myapplication;

import android.app.Application;

public class Myapp extends Application {

    public static Application instanceGlobal;
    @Override
    public void onCreate(){
        super.onCreate();
        instanceGlobal=this;
        initSDK();
    }

    void initSDK(){

    }
}
