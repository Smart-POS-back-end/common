package com.pesona.group.dto.Response;

import lombok.*;
import org.springframework.http.HttpStatus;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GlobalDatabaseActionResult {
    private int code;
    private HttpStatus status;
    private String message;
    private Object payload;
}