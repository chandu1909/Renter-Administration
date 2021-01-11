package com.csp.RenterAdministration.responseBuilder;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author chandra sekhar Polavarapu
 */
public class ResponseBuilder {
    public JSONObject successResponse() {
        JSONObject successResponse = new JSONObject();
        successResponse.put("status", "Success");
        successResponse.put("code", 0);
        return successResponse;
    }
    public JSONObject failureResponse() {
        JSONObject failureResponse = new JSONObject();
        failureResponse.put("status", "Failed");
        failureResponse.put("code", 1);
        return failureResponse;
    }
}
