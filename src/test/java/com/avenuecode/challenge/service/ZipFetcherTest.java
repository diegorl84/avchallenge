package com.avenuecode.challenge.service;

import com.avenuecode.challenge.model.City;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ZipFetcherTest {

    @Autowired
    private ZipFetcher zipFetcher;

    @Test
    void createClient() {
        City city = zipFetcher.getZipcodeInformation();
        Assertions.assertEquals("San Francisco", city.getPlaces().get(0).getPlaceName());
    }
}