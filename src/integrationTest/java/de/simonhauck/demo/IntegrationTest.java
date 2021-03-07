package de.simonhauck.demo;

import static org.springframework.boot.test.context.SpringBootTest.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource("classpath:/application-test.yaml")
public class IntegrationTest {
}
