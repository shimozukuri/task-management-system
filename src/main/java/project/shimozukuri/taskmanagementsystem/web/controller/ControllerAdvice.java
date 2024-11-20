package project.shimozukuri.taskmanagementsystem.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import project.shimozukuri.taskmanagementsystem.domain.exception.AccessDeniedException;
import project.shimozukuri.taskmanagementsystem.domain.exception.ExceptionBody;
import project.shimozukuri.taskmanagementsystem.domain.exception.ResourceNotFoundException;

@RestControllerAdvice
@Slf4j
public class ControllerAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionBody handleResourceNotFoundException(ResourceNotFoundException e) {
        log.error(e.getMessage(), e);
        return new ExceptionBody(e.getMessage());
    }

    @ExceptionHandler(
            {AccessDeniedException.class,
                    org.springframework.security.access.AccessDeniedException.class}
    )
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ExceptionBody handleAccessDeniedException(AccessDeniedException e) {
        log.error(e.getMessage(), e);
        return new ExceptionBody(e.getMessage());
    }

}
