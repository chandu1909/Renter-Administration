package com.csp.RenterAdministration.controller;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.FindTool;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.model.UnavailablityEntity;
import com.csp.RenterAdministration.model.UpdatePrice;
import com.csp.RenterAdministration.service.RenterOperationsService;
import com.csp.RenterAdministration.service.ToolRegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author chandra sekhar Polavarapu @Description: This class acts as controller for all the apis
 * used by Renter to manage his account including Adding items to the inventory, pricing, changing
 * avilability dates, giving reviews to the Rentee etc.
 */
@RestController
@RequestMapping("/renter")
public class RenterAccountController {
  private final Logger LOGGER = LoggerFactory.getLogger(RenterAccountController.class);
  @Autowired ToolRegistrationService toolRegistrationService;
  @Autowired RenterOperationsService renterOperationsService;

  @PostMapping("/addTool")
  public JSONObject addToolController(@RequestBody Tool tool) {
    JSONObject toolRegistered = new JSONObject();
    try {
      toolRegistered = toolRegistrationService.registerTool(tool);
    } catch (Exception e) {
      LOGGER.error("exception occurred while adding the new tool: ", e.getMessage());
    }

    return toolRegistered;
  }

  @PostMapping("/deleteTool")
  public JSONObject removeToolController(@RequestBody FindTool deleteTool) {
    JSONObject deletedTool = new JSONObject();
    deletedTool = toolRegistrationService.deleteTool(deleteTool);
    return deletedTool;
  }

  @PostMapping("/updatePricePerDay")
  public JSONObject updatePricePerDayController(@RequestBody UpdatePrice updatePrice) {
    JSONObject performUpdate = new JSONObject();
    performUpdate = toolRegistrationService.updatePrice(updatePrice);
    return performUpdate;
  }

  @PostMapping("/makeUnavailable")
  public JSONObject makeToolUnavailableController(
      @RequestBody UnavailablityEntity unavailablityEntity) {
    JSONObject result = new JSONObject();
    if (Objects.nonNull(unavailablityEntity)) {
      result = toolRegistrationService.makeToolUnavailable(unavailablityEntity);
    } else {
      LOGGER.error("Input is empty. Cannot proceed further ! ");
    }
    return result;
  }
  //This returns the list of all the tools owned a specific user/ Renter
  @PostMapping("/listToolsByRenter")
  public JSONObject listToolsByRenterController(long renterId ){
    renterOperationsService.listOfTools(renterId);
    return new JSONObject();
  }

  @PostMapping("/totalEarningsSummary")
  public JSONObject totalEarningsSummaryController(){
    //if I can get renter ID from the frontend, I can list out all the tools by that renter ID and calculate the totals.

    return new JSONObject();
  }
}
