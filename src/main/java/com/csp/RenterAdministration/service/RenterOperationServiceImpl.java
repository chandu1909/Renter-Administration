package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.respository.ToolDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

/** @Author chandra sekhar Polavarapu */
@Service
public class RenterOperationServiceImpl implements RenterOperationsService {
  @Autowired ToolDb toolDb;
  private Collection<Long> listOfTools;

  @Override
  public JSONObject listOfTools(long renterId) {
    // This method should call a query which results a list of items
      listOfTools = toolDb.getToolsByRenterId(renterId);
    System.out.println(listOfTools);
    return null;
  }
}
