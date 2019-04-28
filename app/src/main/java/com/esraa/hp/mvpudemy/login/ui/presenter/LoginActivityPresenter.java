package com.esraa.hp.mvpudemy.login.ui.presenter;

import android.support.annotation.Nullable;

import com.esraa.hp.mvpudemy.login.data.LoginRepository;
import com.esraa.hp.mvpudemy.login.data.MemoryRepository;
import com.esraa.hp.mvpudemy.login.ui.view.LoginActivityView;
import com.esraa.hp.mvpudemy.login.data.User;

import javax.inject.Inject;

public class LoginActivityPresenter implements LoginActivityPresenterInterface {

    //we make view instance to control from our presenter
    @Nullable
    private LoginActivityView view;
    @Inject
    LoginRepository loginRepository;

    public LoginActivityPresenter(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void setView(LoginActivityView view) {
     this.view=view;
    }

    @Override
    public void loginButtonClicked() {
        if (view != null) {
            if (view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")) {
                view.showInputError();
            } else {

                loginRepository.saveUser(new User(view.getFirstName(), view.getLastName()));
                view.showUserSavedMessage();

            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = loginRepository.getUser();

        if (user != null) {
            if (view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }

    }
    }
