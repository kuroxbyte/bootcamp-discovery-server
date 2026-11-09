package dev.bootcamp.discoveryserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestClient;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifica que el registro arranque y publique su panel de control.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DiscoveryServerApplicationTests {

    @LocalServerPort
    private int port;

    @Test
    void servesEurekaDashboard() {
        String dashboard = RestClient.create("http://localhost:" + port)
                .get()
                .uri("/")
                .retrieve()
                .body(String.class);

        assertThat(dashboard).contains("Eureka");
    }
}
