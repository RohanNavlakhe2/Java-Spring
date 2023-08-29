package com.yog.passwordmanager.paylod.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record SignupRequest(@Email String emailId, @NotBlank String password) {
}
