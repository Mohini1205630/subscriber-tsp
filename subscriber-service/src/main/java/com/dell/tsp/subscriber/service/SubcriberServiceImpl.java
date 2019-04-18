package com.dell.tsp.subscriber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dell.tsp.subscriber.entity.OfferEntity;
import com.dell.tsp.subscriber.entity.ServiceEntity;
import com.dell.tsp.subscriber.entity.ServiceGroupEntity;
import com.dell.tsp.subscriber.model.OfferDTO;
import com.dell.tsp.subscriber.model.ServiceDTO;
import com.dell.tsp.subscriber.model.ServiceGroupDTO;
import com.dell.tsp.subscriber.model.Subscriber;
import com.dell.tsp.subscriber.repository.LoginRepository;
import com.dell.tsp.subscriber.repository.OfferRepository;
import com.dell.tsp.subscriber.repository.ServiceGroupRepository;
import com.dell.tsp.subscriber.repository.ServiceRepository;

@Service
public class SubcriberServiceImpl implements SubcriberService{
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	OfferRepository offerRepository;
	
	@Autowired
	ServiceRepository serviceRepository;
	
	@Autowired
	ServiceGroupRepository serviceGroupRepository;
	

	@Override
	public void addOfferData(List<OfferDTO> offerList) {
		
		for(OfferDTO offer : offerList) {
			offerRepository.save(new OfferEntity(offer.getOfferId(), offer.getOfferName(), 
					offer.getValidityInDays(), offer.getServiceGroupId(), offer.getPrice()));
		}
	}

	@Override
	public void addServiceData(List<ServiceDTO> serviceList) {
		for(ServiceDTO service : serviceList) {
			serviceRepository.save(new ServiceEntity(service.getServiceId(),
					service.getServiceName(), service.getServiceDesc()));
		}
		
	}

	@Override
	public void addServiceGroupData(List<ServiceGroupDTO> serviceGroupList) {
		for(ServiceGroupDTO service : serviceGroupList) {
			serviceGroupRepository.save(new ServiceGroupEntity(service.getServiceGroupId(),
					service.getServices()));
		}
	}

}
