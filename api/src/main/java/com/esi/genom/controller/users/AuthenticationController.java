package com.esi.genom.controller.users;

import com.esi.genom.configuration.TokenProvider;
import com.esi.genom.entities.users.ApiResponse;
import com.esi.genom.entities.users.AuthToken;
import com.esi.genom.entities.users.LoginUser;
import com.esi.genom.entities.users.User;
import com.esi.genom.services.users.UserService;	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import static com.esi.genom.configuration.Constants.TOKEN_PREFIX;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ApiResponse<AuthToken>  register(@RequestBody LoginUser loginUser) throws AuthenticationException {

        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUser.getUsername(),
                        loginUser.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        final User user = userService.findByUsername(loginUser.getUsername());
        System.out.print(user);

        return new ApiResponse<>(200, "success", new AuthToken(token, user.getUsername()));

    }

}