package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.responseBuilder.ResponseBuilder;
import com.csp.RenterAdministration.respository.ToolDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author chandra sekhar Polavarapu
 * @Description: This class contains the logic to add the new tools to the database.
 */
@Service
public class ToolRegistrationServiceImpl implements ToolRegistrationService{

    @Autowired
    ToolDb toolDb;
    Logger LOGGER = LoggerFactory.getLogger(ToolRegistrationServiceImpl.class);

    @Override
    public JSONObject registerTool(Tool tool) throws Exception {
        ResponseBuilder responseBuilder = new ResponseBuilder();
        try{
            toolDb.save(tool);
            LOGGER.info("New tool has been added and inventory will be updated!");
        }catch (Exception e){
            LOGGER.error("Exception while updating the tool: ", e.getMessage());
            return responseBuilder.failureResponse();
        }

        return responseBuilder.successResponse();
    }
}
