package in.srnyapathi.api.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.srnyapathi.api.mapper.UserMapper;
import in.srnyapathi.api.model.UserDTO;
import in.srnyapathi.domain.service.UserService;
import lombok.RequiredArgsConstructor;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
     
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        var usr =userService.createUser(userMapper.toDomain(userDTO));
        return ResponseEntity.ok(userMapper.toDto(usr));
    }


    @GetMapping(value = "/{id}",consumes = "application/json",produces = "application/json")
    public ResponseEntity<UserDTO> getUserById(@PathVariable String id) {
        var user = userService.getUserById(id);
        return ResponseEntity.ok(userMapper.toDto(user));
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
        var updatedUser = userService.updateUser(userMapper.toDomain(userDTO));
        return ResponseEntity.ok(userMapper.toDto(updatedUser));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping(produces = "application/json")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        var users = userService.getAllUsers();
        return ResponseEntity.ok(userMapper.toDTOList(users));
    }
    
}
