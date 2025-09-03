package com.sunnycodes.auth;

import com.sunnycodes.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
