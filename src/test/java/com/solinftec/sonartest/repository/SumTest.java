package com.solinftec.sonartest.repository;

import com.solinftec.sonartest.resource.SumResource;
import com.solinftec.sonartest.service.SumService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SumTest {
    @Autowired
	SumResource sumResource;

    @Autowired
    SumService sumService;
	
    private ResponseEntity<Integer> sum;

    @Test
    void sum() {
        sumService = new SumService();
        sumResource = new SumResource(sumService);

        sum = sumResource.result(3, 2);
        
        Assertions.assertNotNull(sum);
        Assertions.assertEquals(5, sum.getBody());

        Assertions.assertEquals(
                HttpStatus.OK,
                sumResource.result(5, 3).getStatusCode()
        );
    }
}
