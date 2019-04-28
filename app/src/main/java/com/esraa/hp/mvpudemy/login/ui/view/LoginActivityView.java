package com.esraa.hp.mvpudemy.login.ui.view;

/**
 * Created by HP on 2019-01-14.
 */

public interface LoginActivityView {
    //This is a marker mvp interface for the login feature
    //This interface will not have any implementation
    //It's just a container for our other important interfaces
    //This is a good convention to follow but not necessary
    /*The main benefit here is that we can see the interface holds the other important interfaces
    * like View , Presenter and Model*/

     String getFirstName();
     String getLastName();

     void showInputError();
     void showUserSavedMessage();

     void setFirstName(String fname);
     void setLastName(String lname);




}
