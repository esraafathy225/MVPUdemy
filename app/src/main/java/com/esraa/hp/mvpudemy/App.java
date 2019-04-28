package com.esraa.hp.mvpudemy;

import android.app.Application;

import com.esraa.hp.mvpudemy.di.ApplicationComponent;
import com.esraa.hp.mvpudemy.di.ApplicationModule;
import com.esraa.hp.mvpudemy.di.DaggerApplicationComponent;
import com.esraa.hp.mvpudemy.di.LoginModule;


public class App extends Application{
    //define application object where dagger will live throughout the entire life span of the app
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //needs to run once to generate it
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
