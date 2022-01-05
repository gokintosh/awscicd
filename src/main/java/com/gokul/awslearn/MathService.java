package com.gokul.awslearn;


import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Result doAddition(int number1,int number2){
        Result result=new Result(number1+number2,"Finish addition");
        return result;
    }
}
