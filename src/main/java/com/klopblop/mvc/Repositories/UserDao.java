package com.klopblop.mvc.Repositories;

import com.klopblop.mvc.models.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Admin on 24.09.2016.
 */
//dao object
public interface UserDao extends CrudRepository<UserInfo, Long> {
}
