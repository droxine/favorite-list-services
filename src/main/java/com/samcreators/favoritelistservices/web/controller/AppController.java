package com.samcreators.favoritelistservices.web.controller;

import com.samcreators.favoritelistservices.web.model.AppDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/app")
public class AppController {

    @GetMapping("/{appId}")
    public ResponseEntity<AppDto> getAppById(@PathVariable("appId") UUID appId) {
        //TO-DO Impl
        return new ResponseEntity<>(AppDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewFavoriteApp(AppDto appDto) {
        //TO-DO Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{appId}")
    public ResponseEntity updateAppById(){
        //TO-DO
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
