package com.csp.RenterAdministration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chandra sekhar Polavarapu @Description: This class acts as controller for all the apis
 * used by Renter to manage his account including Adding items to the inventory, pricing, changing
 * avilability dates, giving reviews to the Rentee etc.
 */
@RestController
@RequestMapping("/renter")
public class RenterAccountController {
    private final Logger LOGGER = LoggerFactory.getLogger(RenterAccountController.class);


}
