package de.simonhauck.demo.example.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import liquibase.pro.packaged.E;

@ExtendWith(MockitoExtension.class)
public class ExampleControllerTest {

    @InjectMocks
    private ExampleController classUnderTest;

    @Test
    public void greeting() {
        HelloWorldDto actual = classUnderTest.greeting();

        Assertions.assertThat(actual.getMessage()).isEqualTo("TestMessageNew");
    }
}