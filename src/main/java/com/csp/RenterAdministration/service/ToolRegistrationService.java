package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import com.csp.RenterAdministration.model.Tool;
import org.springframework.stereotype.Service;

/**
 * @Author chandra sekhar Polavarapu
 */
@Service
public interface ToolRegistrationService {
    JSONObject registerTool(Tool tool) throws Exception;

}
