package com.aalhabib01.xyz.BloodDonationBackend.jwt.controller;

import com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.request.LoginForm;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.request.SignUpForm;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.response.DataResponse;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.dto.response.JwtResponse;
import com.aalhabib01.xyz.BloodDonationBackend.jwt.services.SignUpAndSignInService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private SignUpAndSignInService signUpAndSignInService;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {
        return signUpAndSignInService.signIn(loginRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<JwtResponse> registerUser(@Valid @RequestBody SignUpForm signUpRequest){
        return signUpAndSignInService.signUp(signUpRequest);
    }

    @GetMapping("/data")
    public DataResponse getData(){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setData("Hello World");

        return dataResponse;
    }

}
