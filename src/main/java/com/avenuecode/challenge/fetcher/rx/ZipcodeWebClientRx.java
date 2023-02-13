package com.avenuecode.challenge.fetcher.rx;


import com.avenuecode.challenge.model.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ZipcodeWebClientRx {
    private WebClient webClient = WebClient.builder()
            .build();
    public Mono<City> getZipCode(String url){
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(City.class);
    }
}
