package project.shimozukuri.taskmanagementsystem.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.shimozukuri.taskmanagementsystem.domain.user.User;
import project.shimozukuri.taskmanagementsystem.service.AuthService;
import project.shimozukuri.taskmanagementsystem.service.UserService;
import project.shimozukuri.taskmanagementsystem.web.dto.auth.JwtRequest;
import project.shimozukuri.taskmanagementsystem.web.dto.auth.JwtResponse;
import project.shimozukuri.taskmanagementsystem.web.dto.user.UserDto;
import project.shimozukuri.taskmanagementsystem.web.mappers.UserMapper;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping("/login")
    public JwtResponse login(
            @Validated @RequestBody final JwtRequest loginRequest
    ) {
        return authService.login(loginRequest);
    }

    @PostMapping("/register")
    public UserDto register(
            @Validated @RequestBody final UserDto userDto
    ) {
        User user = userMapper.toEntity(userDto);
        User createdUser = userService.create(user);
        return userMapper.toDto(createdUser);
    }

    @PostMapping("/refresh")
    public JwtResponse refresh(
            @RequestBody final String refreshToken
    ) {
        return authService.refresh(refreshToken);
    }

}
