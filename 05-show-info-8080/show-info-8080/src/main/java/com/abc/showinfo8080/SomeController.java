package com.abc.showinfo8080;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.Map;

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

    @RequestMapping("/params")
    public String paramsHandle(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String key : parameterMap.keySet()) {
            sb.append(key).append(": ");
            for (String val : parameterMap.get(key)) {
                sb.append(val).append(", ");
            }
            sb.append("<br>");
        }
        return sb.toString();
    }
}
