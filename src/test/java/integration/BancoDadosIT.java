package integration;


import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
class BancoDadosIT {

    @Container
    static PostgreSQLContainer<?> postgres =
            new PostgreSQLContainer<>("postgres:16-alpine")
                    .withDatabaseName("teste")
                    .withUsername("usuario")
                    .withPassword("senha");

    @Test
    void verificarConexaoBanco() {
        assertTrue(postgres.isRunning());
    }
}
