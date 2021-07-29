package com.gudkov.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(DemoController.class)
class DemoControllerTest extends BaseMockMvcTest {

    @Test
    public void demoGreetingMappingTest() throws Exception {
        ResultActions response = mockMvc.perform(
                get("/v1/demo/greeting")
                        .contentType(MediaType.APPLICATION_JSON)
                        .queryParam("name", "test"));
        assertOkResponse(response);
    }
}
