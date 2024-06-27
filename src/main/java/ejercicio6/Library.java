package ejercicio6;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Integer>books;

    public Library(){
        books = new HashMap<>();
    }

    public void addBook(String book, int quantity){
        books.put(book, books.getOrDefault(book, 0) + quantity);
    }

    public void borrowBook(String book, int quantity)throws BookNotAvailableException{
        if(!books.containsKey(book) || books.get(book)<quantity){
            throw new BookNotAvailableException("Book is not available or insuficient quantity");
        }
    }

    public int getBookQuantity(String book){
        return books.getOrDefault(book, 0);
    }
}
