package academy.digital.demo01.service.impl;

import academy.digital.demo01.model.Greeting;
import academy.digital.demo01.service.GreetingService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final AtomicLong counter= new AtomicLong();
    private static final String template = "HELLO  %s";

    @Override
    public Greeting getGreeting(String  name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
