package pro.gsilva.catalogo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ControllerAdviceConfig {

    @ExceptionHandler(Exception.class)
    public String handle500Error(Exception ex) {
        log.error(ex.getMessage(), ex);
        return "error-500";
    }
}
