package com.csp.RenterAdministration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** @Author chandra sekhar Polavarapu */

@Entity
@Table(name = "Earnings")
public class Earnings {
  // How do I write logic to get the total from all tools owned by a specific renter
  @Column @Id private long toolId;
  @Column private double earningsFromTool;

  public Earnings() {}

  public Earnings(long toolId, double earningsFromTool) {
    this.toolId = toolId;
    this.earningsFromTool = earningsFromTool;
  }

  public long getToolId() {
    return toolId;
  }

  public void setToolId(long toolId) {
    this.toolId = toolId;
  }

  public double getEarningsFromTool() {
    return earningsFromTool;
  }

  public void setEarningsFromTool(double earningsFromTool) {
    this.earningsFromTool = earningsFromTool;
  }
}
