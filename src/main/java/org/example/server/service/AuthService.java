package org.example.server.service;

import org.example.server.dto.LoginDTO;
import org.example.server.dto.RegisterDTO;
import org.example.server.dto.Response;

public interface AuthService {
    Response register(RegisterDTO registerDTO);
    Response login(LoginDTO loginDTO);
}
