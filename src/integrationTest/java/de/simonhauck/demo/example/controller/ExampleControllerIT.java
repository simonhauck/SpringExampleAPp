package de.simonhauck.demo.example.controller;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import de.simonhauck.demo.IntegrationTest;
import lombok.extern.slf4j.Slf4j;

public class ExampleControllerIT extends IntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingSuccess() {
        System.out.println("Test");
        ResponseEntity<String> actual = restTemplate.getForEntity("/", String.class);

        assertThat(actual.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actual.getBody()).isEqualTo("{\"message\":\"TestMessage\"}");
    }

}
