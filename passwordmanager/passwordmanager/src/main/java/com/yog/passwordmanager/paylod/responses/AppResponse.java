package com.yog.passwordmanager.paylod.responses;

public record AppResponse<T>(int statusCode, String message, T data) {

}
