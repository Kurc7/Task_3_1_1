package com.example.sprtingboot.service;

import com.example.sprtingboot.Dao.UserDaoImp;
import com.example.sprtingboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDaoImp userDaoImp;

    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Override
    public User getUser(long id) {
        return userDaoImp.getUser(id);
    }

    @Override
    public void removeUser(long id) {
        userDaoImp.removeUser(id);
    }

    @Override
    public void updateUser(long id, User user) {
        userDaoImp.updateUser(id, user);
    }

    @Override
    public void saveUser(User user) {
        userDaoImp.saveUser(user);
    }
}
