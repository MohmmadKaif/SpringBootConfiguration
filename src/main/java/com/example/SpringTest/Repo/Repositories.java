package com.example.SpringTest.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringTest.Entities.Students;

public interface Repositories extends CrudRepository<Students,Integer >{

}
