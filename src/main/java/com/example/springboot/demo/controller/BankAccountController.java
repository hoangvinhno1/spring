package com.example.springboot.demo.controller;

import com.example.springboot.demo.dao.BankAccountDAO;
import com.example.springboot.demo.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {
    @Autowired
    BankAccountDAO bankAccountDAO;

    @GetMapping("/infor/{id}")
    public BankAccount getInforById(@PathVariable Long id){
        return bankAccountDAO.findById(id);
    }
}
