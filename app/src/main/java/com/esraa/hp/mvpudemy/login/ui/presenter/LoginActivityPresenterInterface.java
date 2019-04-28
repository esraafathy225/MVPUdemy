package com.esraa.hp.mvpudemy.login.ui.presenter;


import com.esraa.hp.mvpudemy.login.ui.view.LoginActivityView;

public interface LoginActivityPresenterInterface {
    void setView(LoginActivityView view);
    void loginButtonClicked();
    void getCurrentUser();
}
