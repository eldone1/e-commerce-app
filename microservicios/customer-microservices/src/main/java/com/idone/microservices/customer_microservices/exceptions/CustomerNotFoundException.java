package com.idone.microservices.customer_microservices.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException{
    private final String message;
}
