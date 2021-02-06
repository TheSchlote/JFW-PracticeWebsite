package com.LadyDeBugCreations.Website.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller
{
    @GetMapping("/Hello")
    public String getController()
    {
        return "index.html";
    }

    @GetMapping("/Joey")
    public String getControllerJoey()
    {
        return "Joey.html";
    }

}
