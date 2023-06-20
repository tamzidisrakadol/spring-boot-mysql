package com.example.demospringdatajsp.dao;

import com.example.demospringdatajsp.modal.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {


}
