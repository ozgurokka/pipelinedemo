package com.ozgur.okka.pipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ozgurokka on 12/19/21 4:07 PM
 */
@RestController
public class Controller {
    @GetMapping("/demo")
    public String getDemo(){
        return "Pipe Line Test Demo v4";
    }
}
