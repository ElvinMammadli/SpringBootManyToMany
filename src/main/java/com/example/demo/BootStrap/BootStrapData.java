package com.example.demo.BootStrap;

import com.example.demo.Model.Author;
import com.example.demo.Model.Book;
import com.example.demo.Repository.AuthorRepository;
import com.example.demo.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;


public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository,BookRepository bookRepository) {
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author Elvin = new Author("Elvin","Mammadli");
        Book dee = new Book("Find him","123123");
        Elvin.getBooks().add(dee);
        dee.getAuthors().add(Elvin);
    }
}
