package com.thoughtworks.fraudService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class FraudManagementControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkFraud() throws Exception {
        mockMvc.perform(post("/checkFraud")
                .content("{\"amount\":100," +
                        "\"beneficiary\":" +
                        "{\"accountHolderName\":\"user1\"," +
                        "\"accountNumber\":12345," +
                        "\"ifscCode\":\"HDFC1234\"}," +
                        "\"payee\":" +
                        "{\"accountHolderName\":\"user1\"," +
                        "\"accountNumber\":12345," +
                        "\"ifscCode\":\"HDFC1234\"}}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }
}
