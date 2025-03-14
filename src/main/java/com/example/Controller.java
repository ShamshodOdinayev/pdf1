package com.example;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping
    public String getAll() {
        return "Ishladi";
    }

}
