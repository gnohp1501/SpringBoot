package io.get.userservice.service;

import io.get.userservice.domain.Role;
import io.get.userservice.domain.User;

import java.util.List;

/**
 * @author NNPhong
 * @since 1/15/2023
 */
public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
