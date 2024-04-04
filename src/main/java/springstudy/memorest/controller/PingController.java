package springstudy.memorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springstudy.memorest.domain.Ping;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("ping")
    public Ping ping(@RequestParam(value = "name", defaultValue = "Kdogs") String name) {
        return new Ping(counter.getAndIncrement(), String.format(template, name));
    }
}
