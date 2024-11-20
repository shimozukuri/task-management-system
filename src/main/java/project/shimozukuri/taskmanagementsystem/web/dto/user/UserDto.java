package project.shimozukuri.taskmanagementsystem.web.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String username;

    private String password;

    private String passwordConfirm;

}
