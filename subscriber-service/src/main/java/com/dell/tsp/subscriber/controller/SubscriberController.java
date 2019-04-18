package com.dell.tsp.subscriber.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dell.tsp.subscriber.model.OfferDTO;
import com.dell.tsp.subscriber.model.RegistrationDetail;
import com.dell.tsp.subscriber.model.ServiceDTO;
import com.dell.tsp.subscriber.model.ServiceGroupDTO;
import com.dell.tsp.subscriber.model.Subscriber;
import com.dell.tsp.subscriber.service.SubcriberService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping({"/"})
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriberController {
	
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Autowired
    private SubcriberService subscriberService;
	
	
	@RequestMapping(path = "/signin", method = RequestMethod.POST)
    public String signIn(@RequestBody Subscriber subscriber){
		System.out.println("userName: "+subscriber.getMobileNo());
		System.out.println("password: "+subscriber.getPassword());
		subscribers.add(subscriber);
        return "Success sign in";
    }
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
    public String getUserdata(@RequestBody RegistrationDetail user) {
          return "Success "+ user;
    }
    
    @RequestMapping(path = "/payBill", method = RequestMethod.POST)
    public String payBill(@RequestBody OfferDTO offer) {
          return "Success "+ offer;
    }
    
    @RequestMapping(path = "/createOffer",  method= RequestMethod.POST)
    public String createOffer(@RequestBody List<OfferDTO> offerList) {
    	subscriberService.addOfferData(offerList);
        return "Success ";
    }
    
    @RequestMapping(path = "/createService",  method= RequestMethod.POST)
    public String createService(@RequestBody List<ServiceDTO> serviceList) {
    	subscriberService.addServiceData(serviceList);
        return "Success ";
    }
    
    @RequestMapping(path = "/createServiceGroupId",  method= RequestMethod.POST)
    public String createServiceGroupId(@RequestBody List<ServiceGroupDTO> serviceGroupList) {
    	subscriberService.addServiceGroupData(serviceGroupList);
        return "Success ";
    }
	
	
}
