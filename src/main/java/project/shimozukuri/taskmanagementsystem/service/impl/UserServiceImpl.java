package project.shimozukuri.taskmanagementsystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.shimozukuri.taskmanagementsystem.domain.exception.ResourceNotFoundException;
import project.shimozukuri.taskmanagementsystem.domain.user.Role;
import project.shimozukuri.taskmanagementsystem.domain.user.User;
import project.shimozukuri.taskmanagementsystem.repository.UserRepository;
import project.shimozukuri.taskmanagementsystem.service.UserService;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User getById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException(
                        String.format("User with id '%s' not found.", userId)
                )
        );
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() ->
                new ResourceNotFoundException(
                        String.format("User '%s' not found.", username)
                )
        );
    }

    @Override
    public User create(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new IllegalStateException("User already exists.");
        }

        if (!user.getPassword().equals(user.getPasswordConfirm())) {
            throw new IllegalStateException(
                    "Password and password confirmation do not match."
            );
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Set<Role> roles = Set.of(Role.ROLE_USER);
        user.setRoles(roles);
        userRepository.save(user);
        return user;
    }

}
