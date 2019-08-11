package com.samcreators.favoritelistservices.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samcreators.favoritelistservices.web.model.AppDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AppController.class)
class AppControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getAppById() throws Exception {
        mockMvc.perform(get("/api/v1/app/" + UUID.randomUUID().toString())
            .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewFavoriteApp() throws Exception{
        AppDto appDto = AppDto.builder().build();
        String appDtoJson = objectMapper.writeValueAsString(appDto);

        mockMvc.perform(post("/api/v1/app/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(appDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateAppById() throws Exception {
        AppDto appDto = AppDto.builder().build();
        String appDtoJson = objectMapper.writeValueAsString(appDto);

        mockMvc.perform(put("/api/v1/app/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(appDtoJson))
                .andExpect(status().isNoContent());
    }
}