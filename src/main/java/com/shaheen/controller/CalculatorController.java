package com.shaheen.controller;

import com.shaheen.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private ServiceFacade serviceFacade;

    @GetMapping("/add/{firstNumber}/{scoundNumber}")
    public int add(@PathVariable("firstNumber") int firstNumber ,@PathVariable("scoundNumber") int scoundNumber ){
       return serviceFacade.getCalculator().add(firstNumber,scoundNumber);
    }

    @GetMapping("/subtract/{firstNumber}/{scoundNumber}")
    public int subtract(@PathVariable("firstNumber") int firstNumber ,@PathVariable("scoundNumber") int scoundNumber ){
        return serviceFacade.getCalculator().subtract(firstNumber,scoundNumber);
    }
    @GetMapping("/multiply/{firstNumber}/{scoundNumber}")
    public int multiply(@PathVariable("firstNumber") int firstNumber ,@PathVariable("scoundNumber") int scoundNumber ){
        return serviceFacade.getCalculator().multiply(firstNumber,scoundNumber);
    }

    @GetMapping("/divide/{firstNumber}/{scoundNumber}")
    public int divide(@PathVariable("firstNumber") int firstNumber ,@PathVariable("scoundNumber") int scoundNumber ){
        return serviceFacade.getCalculator().divide(firstNumber,scoundNumber);
    }
}
