package com.csp.RenterAdministration.model;

import java.sql.Date;

/**
 * @Author chandra sekhar Polavarapu
 */
public class UnavailablityEntity {

    public long getToolId() {
        return ToolId;
    }

    public void setToolId(long toolId) {
        ToolId = toolId;
    }

    public Date getUnavailableStartDate() {
        return unavailableStartDate;
    }

    public void setUnavailableStartDate(Date unavailableStartDate) {
        this.unavailableStartDate = unavailableStartDate;
    }

    public Date getUnavailableEndDate() {
        return unavailableEndDate;
    }

    public void setUnavailableEndDate(Date unavailableEndDate) {
        this.unavailableEndDate = unavailableEndDate;
    }

    private long ToolId;
    private Date unavailableStartDate;
    private Date unavailableEndDate;

}
