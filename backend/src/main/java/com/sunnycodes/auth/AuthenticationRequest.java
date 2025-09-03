package com.sunnycodes.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
