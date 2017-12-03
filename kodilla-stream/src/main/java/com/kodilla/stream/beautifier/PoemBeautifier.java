package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void beautify(String uglyString, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(uglyString);
        System.out.println("beautified string: " + result);
    }
}


