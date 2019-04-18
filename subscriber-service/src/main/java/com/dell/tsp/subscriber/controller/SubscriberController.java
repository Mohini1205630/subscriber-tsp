package com.dell.tsp.subscriber.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dell.tsp.subscriber.model.LoginDTO;
import com.dell.tsp.subscriber.model.OfferDTO;
import com.dell.tsp.subscriber.model.RegistrationDetail;
import com.dell.tsp.subscriber.service.LoginService;


@RestController
@RequestMapping({"/"})
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriberController {
	
	private static Logger LOG = LoggerFactory.getLogger(SubscriberController.class);
	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(path = "/signin", method = RequestMethod.POST)
    public String signIn(@RequestBody LoginDTO subscriber){
		/*
		 * String status = loginService.getLogin(subscriber.getUserName(),
		 * subscriber.getPassWord());
		 */
        return loginService.getLoginDetails(subscriber.getUserName(), 
        		subscriber.getPassWord());
    }
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
    public String getUserdata(@RequestBody RegistrationDetail user) {
          return "Success "+ user;
    }
    
    @RequestMapping(path = "/payBill", method = RequestMethod.POST)
    public String payBill(@RequestBody OfferDTO offer) {
          return "Success "+ offer;
    }
	
}
