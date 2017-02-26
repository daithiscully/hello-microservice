package scully.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/hello")
public class HelloWorld {


    @RequestMapping(method = RequestMethod.GET)
    public String getGreeting() {
        return "Hello World, this is a greeting from the developer";
    }

}
