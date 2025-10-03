package com.abc.fallback;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 降级处理
 */
@RestController
public class FallbackController {
    @RequestMapping("/gatewayFallback")
    public String fallback() {
        return "gateway fallback";
    }
}
