package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Email cannot be Null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be Null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    @NotNull(message = "Password cannot be Null")
    @Size(min = 8, message = "Password not be less than two characters")
    private String pwd;
}
