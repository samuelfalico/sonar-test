package com.solinftec.sonartest;

import com.solinftec.sonartest.utils.TestConfigImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

class SonarTestApplicationTests extends TestConfigImpl {
	
	@Autowired
    ApplicationContext applicationContext;

    @Test
    void test() {
        Assertions.assertNotNull(applicationContext);
    }

}
