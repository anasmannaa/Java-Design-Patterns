/*This class is not part of the memento design pattern. It is just for you to run and test the pattern working*/

package com.anasmannaa;

public class Main {

    public static void main(String[] args) {

        var document = new Document();
        var history = new History();

        document.setContent("demo content");
        document.setFontName("Helvatica");
        document.setFontSize(12);
        history.push(document.createState());
        System.out.println(document);

        document.setContent("2nd version of content");
        history.push(document.createState());
        System.out.println(document);

        document.setContent("3rd version of content");
        document.setFontName("Tahoma");
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
