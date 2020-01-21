package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.User;


@Repository
public interface IRegisterDao extends JpaRepository<User, String> {

}
