package com.practice.myappvs.services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.myappvs.entities.books;

import java.util.*;
@Component
public class bookservice {
    private  static List<books>li=new ArrayList<>();
    static
    {
        li.add(new books(2, "dbms", "gaurav"));
        li.add(new books(3, "os", "xyz"));
        li.add(new books(4, "DAA", "abc"));

    }
    public List<books> getAllBooks()
    {
           return li;
    }
    public  books getBookbyId(int iden)
    {
           books b=new books();
           for(books c:li)
           {
            if(iden==c.id)
            {
               b=c;
            }
           
           }
           return b;
    }
    public void addbooks(books b)
    {
        li.add(b);
    }
     public List<books> deletebooks(int id)
    {
        for(books b:li)
        {
            if(b.id==id)
            {
               li.remove(b);
               break;
            }
        }
        return li;
    }
    public books updatebook(int id)
    {
        books c=new books();
        for(books b:li)
        {
            if(b.id==id)
            {
                b.setAuthor(b.getAuthor());
                b.setName(b.getName());
                c=b;
                break;
            }
        }
        return c;
    }
        
}
