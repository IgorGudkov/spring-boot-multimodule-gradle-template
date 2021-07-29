package com.gudkov.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public abstract class BaseMockMvcTest {

    @Autowired
    protected MockMvc mockMvc;

    protected void assertOkResponse(ResultActions response) throws Exception {
        response.andExpect(status().isOk());
    }
}
