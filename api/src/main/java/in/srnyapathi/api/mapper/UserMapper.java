package in.srnyapathi.api.mapper;

import in.srnyapathi.domain.model.Permission;
import org.mapstruct.Mapper;

import in.srnyapathi.api.model.UserDTO;
import in.srnyapathi.domain.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDto(User user);

    User toDomain(UserDTO userDTO);

    List<UserDTO> toDTOList(Iterable<User> users);




}
