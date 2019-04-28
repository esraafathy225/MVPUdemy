package com.esraa.hp.mvpudemy.di;

import com.esraa.hp.mvpudemy.login.data.LoginRepository;
import com.esraa.hp.mvpudemy.login.data.MemoryRepository;
import com.esraa.hp.mvpudemy.login.ui.presenter.LoginActivityPresenterInterface;
import com.esraa.hp.mvpudemy.login.ui.view.LoginActivityView;
import com.esraa.hp.mvpudemy.login.ui.presenter.LoginActivityPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class LoginModule {
    /*The module is going to be a dagger class where we will provide the necessary methods for the MVP
    * module to work*/
    //we will hook up constructors so that dagger knows what to inject at runtime

    @Provides
    public LoginActivityPresenterInterface provideLoginActivityPresenter(LoginRepository loginRepository){
        return new LoginActivityPresenter(loginRepository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }
}
