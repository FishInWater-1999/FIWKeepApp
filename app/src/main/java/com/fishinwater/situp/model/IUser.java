package com.fishinwater.situp.model;

import com.fishinwater.situp.callback.MyStringCallback;
import com.fishinwater.situp.classes.UserBean;
import com.zhy.http.okhttp.callback.StringCallback;

/**
 * @author fishinwater-1999
 * @version 2019-11-13
 */
public interface IUser {

    void login(UserBean userBean, StringCallback stringCallback);

    void resist(UserBean userBean, StringCallback stringCallback);

    void update(IUser user, MyStringCallback stringCallback);

    void delete(IUser user, MyStringCallback stringCallback);

    boolean isLogged();

}
