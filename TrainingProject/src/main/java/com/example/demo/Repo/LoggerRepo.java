package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Logger;


@Repository
public interface LoggerRepo extends JpaRepository<Logger, Integer>{

}
