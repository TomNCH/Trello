package com.manager.service;

import com.manager.model.User;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    User save(User user);

    void remove(Long id);
}
