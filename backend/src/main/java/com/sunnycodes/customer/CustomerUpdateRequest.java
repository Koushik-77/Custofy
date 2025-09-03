package com.sunnycodes.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
