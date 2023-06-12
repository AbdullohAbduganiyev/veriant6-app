package org.example.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.example.server.enums.Role;

@AllArgsConstructor
@Data
public class User extends BaseModel {
    @NonNull
    private String fullName;
    @NonNull
    private String username;
    private @NonNull String password;

    private @NonNull Role role;
    private boolean blocked;
    {
        role = Role.USER;
        blocked = false;
    }
}
