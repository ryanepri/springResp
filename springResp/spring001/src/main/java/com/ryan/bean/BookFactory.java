package com.ryan.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {


    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("bookName-factory");
        book.setAuthor("RyanEpri-factory");
        return book;
    }

    public Class<?> getObjectType() {
        return null;
    }


}
