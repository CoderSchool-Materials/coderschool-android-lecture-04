package com.kungfoolabs.fragment;

import android.util.Log;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by ckung on 3/7/17.
 */

public class LoginManager {

    protected static LoginManager instance;

    public static synchronized  LoginManager getInstance() {
        if(instance == null) {
            instance = new LoginManager();
        }

        return instance;
    }

    public class User {}

    public interface Callback {
        public void success();
    }

    protected User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return (currentUser != null);
    }

    public void authentication(String username, String password, Callback callback) {

        //AsyncTask
        currentUser = new User();
        callback.success();

        EventBus.getDefault().post(new AuthEvent());
    }
}
