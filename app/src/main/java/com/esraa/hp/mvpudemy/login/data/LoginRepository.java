package com.esraa.hp.mvpudemy.login.data;

import com.esraa.hp.mvpudemy.login.data.User;


public interface LoginRepository {
    //we will save the user and get it from the computer memory

    User getUser();
    void saveUser(User user);
}
