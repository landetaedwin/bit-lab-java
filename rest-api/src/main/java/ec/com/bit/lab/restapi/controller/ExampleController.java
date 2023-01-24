package ec.com.bit.lab.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {
    @GetMapping("")
    public String getAll() throws Exception {
        return "Hello world";
    }

}
