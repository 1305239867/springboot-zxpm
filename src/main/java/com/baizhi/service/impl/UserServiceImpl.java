package com.baizhi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        // TODO �Զ����ɵķ������
        return userDao.login(name, password);
    }

    @Override
    public void reg(User user) {
        // TODO �Զ����ɵķ������
        userDao.reg(user);
    }

}
