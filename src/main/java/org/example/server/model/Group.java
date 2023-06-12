package org.example.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group extends BaseModel{
    @NonNull
    private String name;

    @NonNull
    private String username;

    @NonNull
    private String ownerId;

    private final List<String> membersIdList;
    private final List<String> adminsIdList;
    private final List<String> blockedUsers;

    public Group(String name, String ownerId, String username) {
        this.name = name;
        this.ownerId = ownerId;
        this.username = username;

        membersIdList = new ArrayList<>();
        membersIdList.add(ownerId);

        adminsIdList = new ArrayList<>();
        blockedUsers = new ArrayList<>();
    }
}
