package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency,String> {

}
