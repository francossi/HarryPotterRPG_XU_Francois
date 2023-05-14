package com.example.harrypotterrpg_xu_francois.Console;

public enum Color {
    BLUE("\033[94m"),
    RED("\033[31m"),
    GREEN("\033[92m"),
    BACK("\033[0m");
    final String color;
    Color(String color) {
        this.color = color;
    }
}
