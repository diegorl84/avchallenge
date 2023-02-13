package com.avenuecode.challenge.service;

import com.avenuecode.challenge.fetcher.rx.ZipcodeWebClientRx;
import com.avenuecode.challenge.model.City;
import com.avenuecode.challenge.utils.ZipcodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZipFetcher {
    @Autowired
    private ZipcodeWebClientRx zipcodeWebClientRx;
    @Autowired
    private ZipcodeUtils zipcodeUtils;

    public City getZipcodeInformation() {
      return zipcodeWebClientRx.getZipCode(zipcodeUtils.buildZipcodeURL("94105")).block();
    }


}
