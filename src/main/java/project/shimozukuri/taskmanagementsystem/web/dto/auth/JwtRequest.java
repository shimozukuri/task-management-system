package project.shimozukuri.taskmanagementsystem.web.dto.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequest {

    private String username;

    private String password;
}
