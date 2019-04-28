package com.esraa.hp.mvpudemy.di;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {

    //This is where dagger will keep track of the dependencies
    //It must be annotated with @Module so the dagger knows it's a module
    private Application application;

    public ApplicationModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }

}
