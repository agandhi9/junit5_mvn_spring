package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("one")
public class MvnJunit5SpringApplicationTests {

    @Test
    void contextLoadTest() {
        System.out.println("contextloadtest");
    }
}
