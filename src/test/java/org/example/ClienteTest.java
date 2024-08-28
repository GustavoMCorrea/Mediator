package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A CooperTáxi agradece seu contato e informamos.\n"+
                        ">>O Taxista está seguindo para o seu endereço:",
                cliente.agendarCorrida("do Centro para Shopping Jardim norte"));
    }

    @Test
    void deveReclamarSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A CooperTáxi agradece seu contato e informamos.\n"+
                        ">>Pedimos desculpas e vamos procurar melhorar o serviço da reclamação: Lentidão no trajeto",
                cliente.reclamarCorrida("Lentidão no trajeto"));
    }

    @Test
    void deveSugerirSecretaria() {
        Cliente cliente = new Cliente();
        assertEquals("A CooperTáxi agradece seu contato e informamos.\n"+
                        ">>Sua corrida : para Parque Halfred foi cancelada",
                cliente.cancelarCorrida("para Parque Halfred"));
    }

}