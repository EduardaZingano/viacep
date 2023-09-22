package com.dbserver.viacep.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @BeforeAll
    public static void setUp() {
       RestAssured.baseURI = "https://viacep.com.br/ws";
    }

    @Test
    @DisplayName("Deve verificar se cep passado na url é válido e ainda verifica se a palavra desejada se encontra no corpo da requisição")
    public void testCepValido() {
        String cep = "91420300";
        Response resposta = RestAssured.get("/{cep}/json", cep);

        assertEquals(200, resposta.getStatusCode());
        assertTrue(resposta.getBody().asString().contains("Porto Alegre"));
    }

    @Test
    @DisplayName("Deve verificar se cep passado na url é inválido")
    public void testCepInvalido() {
        String cep = "123456789";
        Response resposta = RestAssured.get("/{cep}/json", cep);

        assertEquals(400, resposta.getStatusCode());
    }
}
