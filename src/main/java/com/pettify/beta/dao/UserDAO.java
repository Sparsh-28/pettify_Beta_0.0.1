package com.pettify.beta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pettify.beta.entity.UserEntity;

public interface UserDAO extends JpaRepository<UserEntity, Integer>{

}
