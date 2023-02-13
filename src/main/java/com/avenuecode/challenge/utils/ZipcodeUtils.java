package com.avenuecode.challenge.utils;

import com.avenuecode.challenge.config.ChallengeConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ZipcodeUtils {

    private static final String DASH = "/";

    @Autowired
    private ChallengeConfiguration challengeConfiguration;

    //TODO: Use URIBuilder
    public String buildZipcodeURL(String zipCode){
       return new StringBuilder(challengeConfiguration.getZipcodeEndpoint()).append(DASH).append(zipCode).toString();
    }
}
