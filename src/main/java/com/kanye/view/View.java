package com.kanye.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class View {
    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        return scanner.next();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
