package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/interest")
public class InterestCalculationController {
    @Autowired
    private InterestCalculationService service;

    @PostMapping("/calculate")
    public InterestCalculation calculateInterest(@RequestBody InterestCalculation calculation) {
        return service.calculateInterest(calculation);
    }

    @GetMapping("/history")
    public List<InterestCalculation> getAllCalculations() {
        return service.getAllCalculations();
    }
}
