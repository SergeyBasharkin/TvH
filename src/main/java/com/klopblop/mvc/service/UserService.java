package com.klopblop.mvc.service;

import com.klopblop.mvc.Repositories.UserDao;
import com.klopblop.mvc.models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 24.09.2016.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void registration(UserInfo userInfo){
        userDao.save(userInfo);
    }
}
