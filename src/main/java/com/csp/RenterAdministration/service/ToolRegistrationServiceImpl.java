package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.FindTool;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.responseBuilder.ResponseBuilder;
import com.csp.RenterAdministration.respository.ToolDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.csp.RenterAdministration.config.ENUMS.Status.avilabilityStatus.AVAILABLE;

/**
 * @Author chandra sekhar Polavarapu @Description: This class contains the logic to add the new
 * tools to the database.
 */
@Service
public class ToolRegistrationServiceImpl implements ToolRegistrationService {

  @Autowired ToolDb toolDb;
  Logger LOGGER = LoggerFactory.getLogger(ToolRegistrationServiceImpl.class);

  /**
   * @Description: This method should add new tool to the database and publish the same message to
   * messaging queue so that Inventory service will consume it when a new one has been added.
   *
   * @param tool
   * @return
   * @throws Exception
   */
  @Override
  public JSONObject registerTool(Tool tool) throws Exception {
    ResponseBuilder responseBuilder = new ResponseBuilder();
    try {
      tool.setStatus(AVAILABLE);
      toolDb.save(tool);
      LOGGER.info("New tool has been added and inventory will be updated!");
    } catch (Exception e) {
      LOGGER.error("Exception while updating the tool: ", e.getMessage());
      return responseBuilder.failureResponse();
    }

    return responseBuilder.successResponse();
  }

  @Override
  public JSONObject deleteTool(FindTool deleteTool) {
    ResponseBuilder responseBuilder = new ResponseBuilder();
    if (toolDb.existsById(deleteTool.getId())) {
      try {
        toolDb.deleteById((deleteTool.getId()));
        LOGGER.info("Tool has been deleted");
        return responseBuilder.successResponse();
      } catch (Exception e) {
        LOGGER.error(e.getMessage());
      }
    }
    LOGGER.error("Error occurred while deleting the tool !!");
    return responseBuilder.failureResponse();
  }
}
