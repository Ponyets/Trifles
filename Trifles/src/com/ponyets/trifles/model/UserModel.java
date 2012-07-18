package com.ponyets.trifles.model;

import com.appspot.api.services.peopleendpoint.model.People;

public class UserModel {
    private static UserModel sInstance = new UserModel();

    private People mWhoAmI;

    public static UserModel getInstance() {
        return sInstance;
    }

    private UserModel() {
    }

    public People getWhoAmI() {
        return mWhoAmI;
    }

    public boolean isLogin() {
        return mWhoAmI != null;
    }

    public void setWhoAmI(People whoAmI) {
        mWhoAmI = whoAmI;
    }

}
