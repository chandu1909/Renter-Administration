package com.csp.RenterAdministration.model;

/** @Author chandra sekhar Polavarapu */
public class UpdatePrice {
  private long id;
  private double pricePerDay;
  private double pricePerHour;

  public UpdatePrice() {}

  public UpdatePrice(long id, double pricePerDay, double pricePerHour) {
    this.id = id;
    this.pricePerDay = pricePerDay;
    this.pricePerHour = pricePerHour;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
}
