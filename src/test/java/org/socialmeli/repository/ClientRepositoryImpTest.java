package org.socialmeli.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.socialmeli.entity.Client;
import org.socialmeli.repository.implementation.ClientRepositoryImp;
import org.socialmeli.repository.implementation.VendorRepositoryImp;
import org.socialmeli.util.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.annotation.DirtiesContext;

import jakarta.validation.OverridesAttribute.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ClientRepositoryImpTest {
    @Autowired
    VendorRepositoryImp vendorRepositoryImp;
    @Autowired
    ClientRepositoryImp clientRepositoryImp;
    
    //Tests unitarios del repositorio
    
    /*
     * @Test
    @DisplayName("")
    void testFindAll() {
        List<Client> allClients = clientRepositoryImp.findAll();
        assertNotNull(allClients);
        assertEquals(4, allClients.size());
    }
     */

    @Test
    @DisplayName("fffff")
    void testSave() {
    Integer expectedId = 5;
    Client client = new Client();

    Integer savedUserId = clientRepositoryImp.save(client);

    assertNotNull(savedUserId);
    assertNotEquals(expectedId, savedUserId);
    }

    @Test
    @DisplayName("jkjkjk")
    void testFindOne() {
    Client client = new Client();
    client.setUserName("Test User");

    Integer savedUserId = clientRepositoryImp.save(client);

    Client foundClient = clientRepositoryImp.findOne(savedUserId);

    assertNotNull(foundClient);
    assertEquals(savedUserId, foundClient.getUserId());
    }

    @Test
    @DisplayName("asasas")
    void testDeleteOne() {
    Client client = new Client();
    client.setUserName("Test User");

    Integer savedUserId = clientRepositoryImp.save(client);

    clientRepositoryImp.deleteOne(savedUserId);

    Client deletedClient = clientRepositoryImp.findOne(savedUserId);

    assertNull(deletedClient);
    }
}
