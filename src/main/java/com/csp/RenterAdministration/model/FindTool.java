package com.csp.RenterAdministration.model;

/**
 * @Author chandra sekhar Polavarapu
 */
public class FindTool {
    private long id;
    private int quantiy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public FindTool() {
    }

    public FindTool(long id, int quantiy) {
        this.id = id;
        this.quantiy = quantiy;
    }
}
