package org.example.geminicall.controller;

import org.example.geminicall.dto.reqdto;
import org.example.geminicall.dto.resdto;
import org.example.geminicall.model.UserModel;
import org.example.geminicall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<resdto> createUser(@RequestBody reqdto request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    // READ ALL
    @GetMapping("/all")
    public ResponseEntity<List<UserModel>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<resdto> updateUser(
            @PathVariable Long id,
            @RequestBody reqdto request) {
        return ResponseEntity.ok(userService.updateUser(id, request));
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
