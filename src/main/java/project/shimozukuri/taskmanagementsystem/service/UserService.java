package project.shimozukuri.taskmanagementsystem.service;

import project.shimozukuri.taskmanagementsystem.domain.user.User;

public interface UserService {

    User getById(Long userId);

    User getByUsername(String username);

    User create(User user);

}
