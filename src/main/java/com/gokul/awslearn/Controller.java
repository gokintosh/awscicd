package com.gokul.awslearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MathService mathService;

    @PostMapping("")
    public Result getAdditionResult(@RequestParam(name ="no1" ) int number1,@RequestParam(name ="no1" ) int number2){
        Result result=mathService.doAddition(number1,number2);
        return result;

    }
}
