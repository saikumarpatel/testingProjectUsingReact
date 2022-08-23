package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, String>{

}
