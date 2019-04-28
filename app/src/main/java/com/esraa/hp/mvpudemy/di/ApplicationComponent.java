package com.esraa.hp.mvpudemy.di;

import com.esraa.hp.mvpudemy.login.ui.view.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {ApplicationModule.class,LoginModule.class})

public interface ApplicationComponent {
    //where dagger knows where to inject the dependencies to
    //in dagger2 the injector class is called component
    //This component assigns references in our activities,services,fragments

    void inject(LoginActivity target);
}
