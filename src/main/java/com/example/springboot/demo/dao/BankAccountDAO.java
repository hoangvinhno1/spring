package com.example.springboot.demo.dao;

import com.example.springboot.demo.entity.BankAccount;
import com.example.springboot.demo.model.BankAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BankAccountDAO {
    @Autowired
    private EntityManager entityManager;

    public BankAccountDAO() {
    }

    public BankAccount findById(Long id){
        return this.entityManager.find(BankAccount.class,id);
    }

    public List<BankAccountInfo> listBankAccountInfo() {
        String sql = "Select new " + BankAccountInfo.class.getName() //
                + "(e.id,e.fullName,e.balance) " //
                + " from " + BankAccount.class.getName() + " e ";
        System.out.println("sql: "+sql);
        Query query = entityManager.createQuery(sql, BankAccountInfo.class);
        return query.getResultList();
    }
}
