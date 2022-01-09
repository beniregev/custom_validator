package com.beniregev.customvalidator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse {
    private Object data;
    private HttpStatus status;
    private String message;
}
