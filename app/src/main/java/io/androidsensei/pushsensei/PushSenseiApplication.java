package io.androidsensei.pushsensei;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;

public class PushSenseiApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "LecoN4AVUB9dm2vPxS8Md1Tw2a40quBw1LYhDsD2", "ArPE3scMBH2XdIjmNH2ml9TdE6a9m3Vmhbu2JLxs");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
