package com.solinftec.sonartest.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    public Integer sum(int number1, int number2) {
        return number1 + number2;
    }
}
