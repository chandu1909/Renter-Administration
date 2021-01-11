package com.csp.RenterAdministration.model;

import javax.persistence.*;

/** @Author chandra sekhar Polavarapu */
@Entity
@Table(name = "Tools")
public class Tool {

  @Column @Id @GeneratedValue long toolId;
  @Column private String toolName;
  @Column private String category;
  @Column private double pricePerDay;
  @Column private double pricePerHour;
  @Column private int quantity;

  public Tool() {}

  public Tool(
      long toolId,
      String toolName,
      String category,
      double pricePerDay,
      double pricePerHour,
      int quantity) {
    this.toolId = toolId;
    this.toolName = toolName;
    this.category = category;
    this.pricePerDay = pricePerDay;
    this.pricePerHour = pricePerHour;
    this.quantity = quantity;
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

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
