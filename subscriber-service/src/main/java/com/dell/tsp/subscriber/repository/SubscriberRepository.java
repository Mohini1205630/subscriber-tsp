package com.dell.tsp.subscriber.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dell.tsp.subscriber.entity.SubscriberEntity;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity, Long>{

}

