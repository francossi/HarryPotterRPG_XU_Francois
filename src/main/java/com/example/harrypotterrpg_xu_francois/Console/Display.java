package com.example.harrypotterrpg_xu_francois.Console;

public class Display {
    public Display() {
    }
    public void printTextAll(String text){
        System.out.println(text);
    }
    public void printText(String text) {
        System.out.println();
        System.out.println(text);
    }
    public void printTextWithColor(String text, Color color){
        System.out.println(color.color + text + Color.BACK.color);
    }
    public String textWithColor(String text, Color color){
        StringBuilder sb = new StringBuilder();
        sb.append(color.color).append(text).append(Color.BACK.color);
        return sb.toString();
    }
    public String wrapText(String text, String wrapper) {
        StringBuilder sb = new StringBuilder();
        sb.append(wrapper).append("\n");
        sb.append(text).append("\n");
        sb.append(wrapper).append("\n");
        return sb.toString();
    }
    public void printTextWithWrapper(String text, String wrapper){
        printText(wrapper);
        printText(text);
        printText(wrapper);
    }
    public static void main(String[] args) {
        Display display = new Display();
        display.printTextWithColor("Hello", Color.BLUE);
        display.printTextWithWrapper("Choose your players", "=".repeat(80));
    }

}