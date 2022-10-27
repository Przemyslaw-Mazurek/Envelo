package com.kanye;

import com.kanye.controller.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class KanyeApplication implements CommandLineRunner {
    private final Controller controller;

    public static void main(String[] args) {
        SpringApplication.run(KanyeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        controller.run();
    }
}
