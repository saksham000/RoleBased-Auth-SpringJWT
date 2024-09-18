package com.rolebaseauth.jwtrolebased.authController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rolebaseauth.jwtrolebased.entity.User;
import com.rolebaseauth.jwtrolebased.repository.UserRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/auth")
public class AuthController {

    private final AuthService authService;
    private final UserRepo userRepo;

    @PostMapping(path = "/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody  RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping(path = "/authenticate")
    public ResponseEntity<AuthenticationResponse> auth(@RequestBody  AuthenticationRequest request) {
        return ResponseEntity.ok(authService.authenticate(request));
    }

    @GetMapping(path = "all")
    public List<User> returnAllData(){
        return userRepo.findAll();

    }
}
