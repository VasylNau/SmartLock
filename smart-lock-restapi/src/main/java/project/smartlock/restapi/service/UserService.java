package project.smartlock.restapi.service;

import project.smartlock.data.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUser(Long id);

    UserDto getByEmail(String email);

    UserDto registerUser(UserDto user);

    UserDto updateUser(Long id, UserDto user);
}
