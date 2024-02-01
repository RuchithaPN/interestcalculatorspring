package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterestCalculationService {
    @Autowired
    private InterestCalculationRepository repository;

    public InterestCalculation calculateInterest(InterestCalculation calculation) {
        double interest = calculation.getPrincipal() * calculation.getRate() * calculation.getTime() / 100;
        double total = calculation.getPrincipal() + interest;
        calculation.setInterest(interest);
        calculation.setTotal(total);
        return repository.save(calculation);
    }

    public List<InterestCalculation> getAllCalculations() {
        return repository.findAll();
    }
}

