package project.shimozukuri.taskmanagementsystem.web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import project.shimozukuri.taskmanagementsystem.domain.user.Role;
import project.shimozukuri.taskmanagementsystem.domain.user.User;

import java.util.*;
import java.util.stream.Collectors;

public final class JwtEntityFactory {

    public static JwtEntity create(
            final User user
    ) {
        return new JwtEntity(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles()))
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(
            final List<Role> roles
    ) {
        return roles.stream()
                .map(Enum::name)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

}
