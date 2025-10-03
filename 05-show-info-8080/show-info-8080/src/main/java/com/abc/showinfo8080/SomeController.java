package com.abc.showinfo8080;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

@RestController
@RequestMapping("/info")
public class SomeController {

    @RequestMapping("/header")
    public String headerHandle(HttpServletRequest request) {
        String s = "X-Request-Color";
        String header = request.getHeader(s);
        return s + " " + header;
    }

    @RequestMapping("/allHeader")
    public String allHeaderHandle(HttpServletRequest request) {
        // all request headers
        Enumeration<String> headerNames = request.getHeaderNames();

        StringBuilder sb = new StringBuilder();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            sb.append(name).append(": ");
            Enumeration<String> headers = request.getHeaders(name);
            while (headers.hasMoreElements()) {
                sb.append(headers.nextElement()).append(", ");
            }
            sb.append("<br>");
        }
        return sb.toString();
    }
}
