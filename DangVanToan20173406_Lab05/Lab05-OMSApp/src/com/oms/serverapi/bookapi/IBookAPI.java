package com.oms.serverapi.bookapi;

import com.oms.bean.Book;

import java.util.ArrayList;
import java.util.Map;


public interface IBookAPI {
    public ArrayList<Book> getBooks(Map<String, String> queryParams);

    public Book updateBook(Book book);
}
