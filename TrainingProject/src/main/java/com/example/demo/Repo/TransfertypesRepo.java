package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Transfertypes;

@Repository
public interface TransfertypesRepo extends JpaRepository<Transfertypes, String> {

}
