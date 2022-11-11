package org.example;

public class Main {
    public static void main(String[] args) {
       Parser parser = new Parser();
       parser.setUrl("https://nanegative.ru/avia-i-zh-d");
       parser.Start();
       parser.Print();
       parser.End();
    }
}