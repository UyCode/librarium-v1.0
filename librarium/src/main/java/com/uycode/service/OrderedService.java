package com.uycode.service;

import com.uycode.dao.BookDAO;
import com.uycode.dao.OrderedDAO;
import com.uycode.entity.Book;
import com.uycode.entity.Ordered;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderedService {

    @Autowired
    private OrderedDAO orderDAO;

    @Autowired
    private BookDAO bookDAO;

    public List<Ordered> listOrdered(){
        List<Ordered> ordereds = orderDAO.findAll();
        return ordereds;
    }

    /*public List<Book> findBooksByUid(Integer uid){
        List<Integer> booksId= orderDAO.findAllBidByUid(uid);

        System.out.println(books);
        return books;

    }*/
}
