package cn.jk.study.spring7.service.impl;

import cn.jk.study.spring7.service.UserService;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class UserServiceImpl implements UserService {
    private static int id = 1;
    @Override
    public int add() {
        System.out.println("add the user: "+id);
        return id++;
    }

    @Override
    public void update(int id) {
        System.out.println("update the user: "+id);
    }

    @Override
    public void delete(int id) {
        System.out.println("delete the user: "+id);
    }
}
