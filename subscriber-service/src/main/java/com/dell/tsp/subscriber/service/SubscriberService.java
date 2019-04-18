package com.dell.tsp.subscriber.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dell.tsp.subscriber.model.Subscriber;
import com.dell.tsp.subscriber.repository.SubscriberRepository;

public class SubscriberService {

	private static Logger LOG = LoggerFactory.getLogger(SubscriberService.class);
	
	private SubscriberRepository subscriberRepository;

	@Autowired
	public SubscriberService(SubscriberRepository subscriberRepository) {
		this.subscriberRepository = subscriberRepository;
	}

	public Subscriber create(Subscriber subscriber) {
		return new Subscriber();
	}
}
