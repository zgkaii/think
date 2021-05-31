package org.zgkaii.proxy.statics;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:29
 * @Description:
 **/
public class UserProxy {

    private UserDao userDao;

    public UserProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public void proxy() {
        System.out.println("------代理开始------");
        userDao.save();
        System.out.println("------代理结束------");
    }
}
