package com.dell.tsp.subscriber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dell.tsp.subscriber.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer>{

}
