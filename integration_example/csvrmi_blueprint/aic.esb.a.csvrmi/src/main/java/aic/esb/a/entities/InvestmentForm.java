package aic.esb.a.entities;

import java.io.Serializable;

/**
 *
 * @author Gerald Schermann
 */

public class InvestmentForm implements Serializable {
    
    private String id;
    private String name;
    private String description;
    private int min_duration;
    private RiskLevel risklevel;
    private double min_deposit;
    private int revenue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMin_deposit() {
        return min_deposit;
    }

    public void setMin_deposit(double min_deposit) {
        this.min_deposit = min_deposit;
    }

    public int getMin_duration() {
        return min_duration;
    }

    public void setMin_duration(int min_duration) {
        this.min_duration = min_duration;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public RiskLevel getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(RiskLevel risklevel) {
        this.risklevel = risklevel;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Risklevel: " + this.risklevel.toString();
    }
    
    
}
