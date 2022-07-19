package com.example.sprtingboot.service;

import com.example.sprtingboot.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(long id, User user);
    void removeUser(long id);
}
