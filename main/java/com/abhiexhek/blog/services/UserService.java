package com.abhiexhek.blog.services;

import com.abhiexhek.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
