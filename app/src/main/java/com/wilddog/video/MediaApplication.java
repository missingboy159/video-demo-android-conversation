package com.wilddog.video;

import android.app.Application;

/**
 * Created by chaihua on 16-8-22.
 */
public class MediaApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        //Wilddog.setAndroidContext(getApplicationContext());
        //WilddogVideo.setAndroidContext(getApplicationContext());
    }


}
