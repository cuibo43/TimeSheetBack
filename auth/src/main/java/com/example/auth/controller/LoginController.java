package com.example.auth.controller;

import com.example.auth.dao.UserDAO;
import com.example.auth.domain.userInformation;
import com.example.auth.security.JwtTokenProvider;
import com.example.auth.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    private UserServiceImpl userServiceImpl;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Autowired
    public void setUserDetailsService(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/auth/signin")
    public ResponseEntity signin(@RequestBody userInformation ui) {
        try {
            String username = ui.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, ui.getPassword()));
            String token = jwtTokenProvider.createToken(username);
            Map<Object, Object> model = new HashMap<>();
            model.put("username", username);
            model.put("token", token);
            userInformation ui2=this.userServiceImpl.getUserByUsername(ui.getUsername());
            return ResponseEntity.ok(model);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }

    @PostMapping("/auth")
    public ResponseEntity<String> auth(@RequestHeader("Authorization") String token) {
        String realToken=token != null && token.startsWith("Bearer ") ? token.substring(7) : null;
        return ResponseEntity.ok(jwtTokenProvider.getUsername(realToken));
    }

}
