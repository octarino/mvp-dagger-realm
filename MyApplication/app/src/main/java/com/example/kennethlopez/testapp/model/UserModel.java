package com.example.kennethlopez.testapp.model;


import com.example.kennethlopez.testapp.vo.User;
import com.testapp.android.App;

import io.realm.Realm;

public class UserModel extends BaseModel {

    public UserModel (App app) {
        super();
        app.getAppComponent().inject(this);
    }

    public void save(final User user) {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(user);
            }
        });
    }
}
