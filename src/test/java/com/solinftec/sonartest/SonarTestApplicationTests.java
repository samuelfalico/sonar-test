package com.solinftec.sonartest;

import com.solinftec.sonartest.service.SumService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarTestApplicationTests {

	SumService sumService;
    @BeforeEach
    public void setUp() throws Exception {
        sumService = new SumService();
    }
    @Test
    public void testAdd() {
        Assertions.assertEquals(6, sumService.sum(5, 1));
    }

}
