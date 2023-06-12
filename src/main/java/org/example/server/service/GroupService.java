package org.example.server.service;

import org.example.server.dto.GroupDTO;
import org.example.server.dto.Response;
import org.example.server.model.Group;
import org.example.server.model.User;

import java.util.List;

public interface GroupService {
//    CRUD
    Response createGroup(GroupDTO groupDTO);
    List<Group> getAllGroups();
    Group getGroupById(String groupId);
    Response editGroup(String groupId, GroupDTO groupDTO);
    Response deleteGroup(String groupId);

    // extra function
    // admin, owner


}
