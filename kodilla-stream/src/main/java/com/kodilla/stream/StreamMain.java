package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();{
            poemBeautifier.beautify ("Wlazł kotek na plotek i mruga", (uglyString) -> uglyString + "ładna to piosenka, niedługa ");
            poemBeautifier.beautify("Ala ma kota", (uglyString) -> uglyString + "a kot ma Alę");
            poemBeautifier.beautify("USA", (uglyString) -> toLowerCase(uglyString));
            poemBeautifier.beautify("kodowania",(uglyString) -> "ABC" + uglyString);
            poemBeautifier.beautify("legia", (uglyString) -> toUpperCase(uglyString));
            poemBeautifier.beautify("Java", (uglyString) -> uglyString +"ABC");

        }
    }
}