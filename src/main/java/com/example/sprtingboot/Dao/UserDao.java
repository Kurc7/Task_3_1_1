package com.example.sprtingboot.Dao;

import com.example.sprtingboot.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(long id);
    void removeUser(long id);
    void updateUser(long id, User user);
    void saveUser(User user);
}
