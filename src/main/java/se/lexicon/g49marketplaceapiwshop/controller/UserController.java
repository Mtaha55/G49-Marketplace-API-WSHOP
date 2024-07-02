package se.lexicon.g49marketplaceapiwshop.controller;


import se.lexicon.g49marketplaceapiwshop.dto.UserDto;
import se.lexicon.g49marketplaceapiwshop.entity.User;
import se.lexicon.g49marketplaceapiwshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        User savedUser = userService.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
