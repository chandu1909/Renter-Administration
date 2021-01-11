package com.csp.RenterAdministration.controller;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.service.ToolRegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    ToolRegistrationService toolRegistrationService;

    @PostMapping("/addTool")
    public JSONObject addToolController(@RequestBody Tool tool){
        JSONObject toolRegistered = new JSONObject();
        try{
            toolRegistered = toolRegistrationService.registerTool(tool);
        }catch (Exception e){
            LOGGER.error("exception occurred while adding the new tool: ", e.getStackTrace());
        }

        return toolRegistered;
    }

}
