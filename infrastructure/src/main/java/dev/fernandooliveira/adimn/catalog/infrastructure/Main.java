package dev.fernandooliveira.adimn.catalog.infrastructure;

import dev.fernandooliveira.adimn.catalog.application.UserCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UserCase().execute());
    }
}