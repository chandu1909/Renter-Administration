package com.csp.RenterAdministration.model;

import com.csp.RenterAdministration.config.ENUMS.Status.avilabilityStatus;

import javax.persistence.*;
import java.sql.Date;

/** @Author chandra sekhar Polavarapu */
@Entity
@Table(name = "Tools")
public class Tool {

  @Column @Id @GeneratedValue long toolId;
  @Column private String toolName;
  @Column private String category;
  @Column private double pricePerDay;
  @Column private double pricePerHour;
  @Column private Date unavailableStartDate;
  @Column private Date unavailableEndDate;

  @Column
  @Enumerated(EnumType.ORDINAL)
  private avilabilityStatus status;

  public Tool(
      long toolId,
      String toolName,
      String category,
      double pricePerDay,
      double pricePerHour,
      Date unavailableStartDate,
      Date unavailableEndDate,
      avilabilityStatus status) {
    this.toolId = toolId;
    this.toolName = toolName;
    this.category = category;
    this.pricePerDay = pricePerDay;
    this.pricePerHour = pricePerHour;
    this.unavailableStartDate = unavailableStartDate;
    this.unavailableEndDate = unavailableEndDate;
    this.status = status;
  }

  public long getToolId() {
    return toolId;
  }

  public void setToolId(long toolId) {
    this.toolId = toolId;
  }

  public String getToolName() {
    return toolName;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(double pricePerHour) {
    this.pricePerHour = pricePerHour;
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

  public avilabilityStatus getStatus() {
    return status;
  }

  public void setStatus(avilabilityStatus status) {
    this.status = status;
  }

  public Tool() {}
}
