package ru.mbragin.marketbidder.controller.controller;

import org.springframework.http.MediaType;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: mbragin
 */
public abstract class AbstractController implements IController {


    @ExceptionHandler(Exception.class)
    public void handleException(HttpServletResponse response, Exception exception) throws IOException {
        exception.printStackTrace();
    }
}
