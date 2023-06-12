package org.example.server.service;

import org.example.server.dto.RegisterDTO;
import org.example.server.dto.Response;
import org.example.server.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers(); // just admin
    User getUserById(String userId);
    Response editUser(String userId, User user);
    Response deleteUser(String userId);

    // extra functions
    User getUserByUsername(String username);

    // admin
    List<User> getBlockedUsers();
    List<User> nonBlockedUsers();
    Response blockUser(String userId);
    Response unblockUser(String userId);

    //
    List<User> getBlockedUsersOfGroup(String groupId);
    List<User> getNotBlockedUsersOfGroup(String groupId);
}
