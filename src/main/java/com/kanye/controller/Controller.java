package com.kanye.controller;

import com.kanye.model.RestClient;
import com.kanye.view.View;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Controller {
    private final View view;
    private final RestClient restClient;

    public void run() {
        String input;
        do {
            input = view.getInput();
            if ("next".equalsIgnoreCase(input))
                view.displayMessage(restClient.fetchQuote());
        } while (!"exit".equalsIgnoreCase(input));
    }
}
