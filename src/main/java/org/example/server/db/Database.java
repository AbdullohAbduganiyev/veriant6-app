package org.example.server.db;

import org.example.server.model.Group;
import org.example.server.model.User;

import java.util.ArrayList;
import java.util.List;

public interface Database {
    List<User> users = new ArrayList<>();
    List<Group> groups = new ArrayList<>();
}
