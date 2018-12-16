package project.smartlock.restapi.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.smartlock.data.dto.UserDto;
import project.smartlock.restapi.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        ResponseEntity<UserDto> responseEntity;
        try {
            UserDto requestedUser = userService.getUser(id);
            responseEntity = new ResponseEntity<>(requestedUser, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            log.info("User '{}' not found", id);
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserDto user) {
        ResponseEntity<UserDto> responseEntity;
        try {
            UserDto updatedUser = userService.updateUser(id, user);
            responseEntity = new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            log.info("User '{}' not found", id);
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

}
