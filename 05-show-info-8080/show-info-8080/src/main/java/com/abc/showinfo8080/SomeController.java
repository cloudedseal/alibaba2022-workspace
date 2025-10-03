package com.abc.showinfo8080;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class SomeController {

    @RequestMapping("/header")
    public String headerHandle(HttpServletRequest request) {
        String s = "X-Request-Color";
        String header = request.getHeader(s);
        return s + " " + header;
    }
}
