package com.esraa.hp.mvpudemy.login.ui.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.esraa.hp.mvpudemy.R;
import com.esraa.hp.mvpudemy.login.ui.presenter.LoginActivityPresenterInterface;
import com.esraa.hp.mvpudemy.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityView{
    /*in order to get the presenter in this class we need to declare a field to
    * hold the instance of the presenter and also make dagger aware of it
    * so that it can inject the presenter at run time*/
    @Inject
    LoginActivityPresenterInterface presenter;
    EditText firstName;
    EditText lastName;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((App) getApplication()).getApplicationComponent().inject(this);
        firstName =findViewById(R.id.edit1);
        lastName = findViewById(R.id.edit2);
        login =  findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //set the presenter for the view
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastName.getText().toString();
    }


    @Override
    public void showInputError() {
        Toast.makeText(LoginActivity.this,"First name or last name cannot be empty",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(LoginActivity.this,"User saved!",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setFirstName(String fname) {
        firstName.setText(fname);
    }

    @Override
    public void setLastName(String lname) {
       lastName.setText(lname);
    }
}
