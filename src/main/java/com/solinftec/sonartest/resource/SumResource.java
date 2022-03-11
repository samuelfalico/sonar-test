package com.solinftec.sonartest.resource;

import com.solinftec.sonartest.service.SumService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumResource {

    private final SumService sumService;

    public SumResource(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping
    public ResponseEntity<Integer> result(@RequestParam("number1") int i, @RequestParam("number2") int j) {
        return ResponseEntity.ok(sumService.sum(i, j));
    }
}
