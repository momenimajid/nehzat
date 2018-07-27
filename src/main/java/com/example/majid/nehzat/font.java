package com.example.majid.nehzat;

import android.app.Application;
public class font extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        uk.co.chrisjenx.calligraphy.CalligraphyConfig.initDefault(new uk.co.chrisjenx.calligraphy.CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iransans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
