package academy.digital.demo01.controller;

import academy.digital.demo01.model.Greeting;
import academy.digital.demo01.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "WORLD") String name){
        return greetingService.getGreeting(name);
    }
    
}
