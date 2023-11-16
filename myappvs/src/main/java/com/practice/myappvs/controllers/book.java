package com.practice.myappvs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.myappvs.entities.books;
import com.practice.myappvs.services.bookservice;

@RestController
public class book {
    @Autowired
    public bookservice bs;

     @GetMapping("/book")
    public  List <books> getbooks()
    {
      
       return this.bs.getAllBooks();
    }
    @GetMapping("/book/{id}")
    public books getBook(@PathVariable("id") int id)
    {
        return bs.getBookbyId(id);
    }
    @PostMapping("/book")
    public books addbook(@RequestBody books b)
    {
            this.bs.addbooks(b);
             return b;
    }
    @DeleteMapping("/book/{id}")
    public List<books> deletebook(@PathVariable("id")int id)
    {
          return  this.bs.deletebooks(id);
           
        
    }
    @PutMapping("/book/{id}")
    public books updatebook(@PathVariable("id")int id)
    {
         
           return  this.bs.updatebook(id);
            
        
    }


    
}
