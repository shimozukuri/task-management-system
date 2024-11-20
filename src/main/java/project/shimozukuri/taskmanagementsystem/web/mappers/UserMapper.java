package project.shimozukuri.taskmanagementsystem.web.mappers;

import org.mapstruct.Mapper;
import project.shimozukuri.taskmanagementsystem.domain.user.User;
import project.shimozukuri.taskmanagementsystem.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper extends Mappable<User, UserDto> {
}
