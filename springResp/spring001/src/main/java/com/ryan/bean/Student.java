package com.ryan.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable {
    private String[] books;
    private Set<String> bookSet;
    private List<String> bookList;
    private Map<String, String> bookMap;
    private List<Book> bookList2;
}
