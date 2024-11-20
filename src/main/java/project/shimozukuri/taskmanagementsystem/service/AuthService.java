package project.shimozukuri.taskmanagementsystem.service;

import project.shimozukuri.taskmanagementsystem.web.dto.auth.JwtRequest;
import project.shimozukuri.taskmanagementsystem.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
