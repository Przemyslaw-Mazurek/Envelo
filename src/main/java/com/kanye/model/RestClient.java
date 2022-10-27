package com.kanye.model;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RestClient {
    @Value("${kenye.url}")
    private String kenyeUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchQuote() {
        QuoteDto quote = Optional.ofNullable(restTemplate.getForObject(kenyeUrl, QuoteDto.class))
                .orElse(null);
        return !Objects.isNull(quote) ? quote.getQuote() : null;
    }
}
