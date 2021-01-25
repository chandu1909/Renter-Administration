package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.FindTool;
import com.csp.RenterAdministration.model.Tool;
import com.csp.RenterAdministration.model.UnavailablityEntity;
import com.csp.RenterAdministration.model.UpdatePrice;
import org.springframework.stereotype.Service;

/** @Author chandra sekhar Polavarapu */
@Service
public interface ToolRegistrationService {
  JSONObject registerTool(Tool tool) throws Exception;

  JSONObject deleteTool(FindTool deleteTool);

  JSONObject updatePrice(UpdatePrice updatePrice);

  JSONObject makeToolUnavailable(UnavailablityEntity unavailablityEntity);
}
