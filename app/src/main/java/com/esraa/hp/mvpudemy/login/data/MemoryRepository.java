package com.esraa.hp.mvpudemy.login.data;

import com.esraa.hp.mvpudemy.login.data.LoginRepository;
import com.esraa.hp.mvpudemy.login.data.User;



public class MemoryRepository implements LoginRepository {

    //here we are implementing the necessary methods from our interface contract
    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user = new User("Fox", "Mulder");
            user.setId(0);
            return user;
        } else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }
}
