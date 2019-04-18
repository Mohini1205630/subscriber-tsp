package com.dell.tsp.subscriber.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dell.tsp.subscriber.entity.OfferEntity;
import com.dell.tsp.subscriber.entity.ServiceGroupEntity;
import com.dell.tsp.subscriber.entity.SubscriberEntity;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity, Long>{

}

