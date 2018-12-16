package project.smartlock.restapi.service.impl;

import org.springframework.stereotype.Service;
import project.smartlock.data.dto.UserDto;
import project.smartlock.restapi.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    @Override
    public UserDto getByEmail(String email) {
        return null;
    }

    @Override
    public UserDto registerUser(UserDto user) {
        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto user) {
        return null;
    }
}
