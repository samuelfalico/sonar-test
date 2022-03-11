package com.solinftec.sonartest.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    public Integer sum(Integer number1, Integer number2) {
        return number1 + number2;
    }
}
