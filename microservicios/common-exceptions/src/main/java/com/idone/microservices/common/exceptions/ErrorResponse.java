package com.idone.microservices.common.exceptions;

import java.util.Map;

public record ErrorResponse(Map<String,String> error) {
    
}
