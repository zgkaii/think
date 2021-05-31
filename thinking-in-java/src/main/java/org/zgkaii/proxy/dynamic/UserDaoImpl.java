package org.zgkaii.proxy.dynamic;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/27 00:28
 * @Description:
 **/
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("------保存用户------");
    }
}
