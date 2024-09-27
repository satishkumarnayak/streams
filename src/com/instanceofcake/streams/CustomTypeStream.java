package com.instanceofcake.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomTypeStream {

    public static void main(String[] args){

        List<Book>  books = new ArrayList<Book>();

        books.add(new Book("Adam","C++ learn",500, Type.NONFICTION));
        books.add(new Book("Jim","Java learn",400, Type.FICTION));
        books.add(new Book("Martha","Oracle learn",452, Type.HISTORY));
        books.add(new Book("Alex","Harry Potter",600, Type.NOVEL));
        books.add(new Book("Zin","Akbar",350, Type.HISTORY));
        books.add(new Book("Kama","Mark of Zoro",262, Type.FICTION));
        books.add(new Book("Sam","Unstoppable",800, Type.NOVEL));
        books.add(new Book("Ben","7 habits",365, Type.NONFICTION));


    //    books.stream()
    //            .forEach(System.out::println);

  /*      books.stream()
                .filter(x -> x.getType().equals(Type.NOVEL))
                .forEach(System.out::println);*/

     /*   List<Book> novels = books.stream()
                .filter(x -> x.getType().equals(Type.NOVEL))
                .collect(Collectors.toList());

        novels.stream().forEach(System.out::println);*/

     /*   books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);*/

        books.stream()
                .map(Book::getTitle)
                .forEach(System.out::println);

    }
}
