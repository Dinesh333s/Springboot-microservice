package net.floppy.departmentservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {//Custom Error Response
    private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorCode;
}
