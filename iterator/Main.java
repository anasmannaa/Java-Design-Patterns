package com.anasmannaa;

public class Main {

    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "product one"));
        collection.add(new Product(2, "Product Two"));
        collection.add(new Product(3, "Product Three"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
