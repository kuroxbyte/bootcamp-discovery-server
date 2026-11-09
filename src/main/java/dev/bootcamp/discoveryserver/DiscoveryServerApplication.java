package dev.bootcamp.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Registro de APIs (Eureka Server) de los microservicios del banco.
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerApplication {

    /**
     * Arranca el servidor de registro.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
