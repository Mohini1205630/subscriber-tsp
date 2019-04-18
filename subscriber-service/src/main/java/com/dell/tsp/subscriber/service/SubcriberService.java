package com.dell.tsp.subscriber.service;

import java.util.List;

import com.dell.tsp.subscriber.model.OfferDTO;
import com.dell.tsp.subscriber.model.ServiceDTO;
import com.dell.tsp.subscriber.model.ServiceGroupDTO;

public interface SubcriberService {
	public void addServiceData(List<ServiceDTO> serviceList);
	public void addOfferData(List<OfferDTO> offerList);
	public void addServiceGroupData(List<ServiceGroupDTO> serviceGroupList);
}
