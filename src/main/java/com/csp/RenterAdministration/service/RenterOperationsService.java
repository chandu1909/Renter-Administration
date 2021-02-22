package com.csp.RenterAdministration.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author chandra sekhar Polavarapu
 */
@Service
public interface RenterOperationsService {

    JSONObject listOfTools(long renterId);

}
