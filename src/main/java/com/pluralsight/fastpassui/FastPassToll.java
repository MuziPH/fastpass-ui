package com.pluralsight.fastpassui;

/**
 * FastPassToll
 */
public class FastPassToll {

    private String fastPassId;
    private String stationId;
    private Float amountPaid;


    public FastPassToll() {
    }


    public FastPassToll(String fastPassId, String stationId, Float amountPaid) {
        this.fastPassId = fastPassId;
        this.stationId = stationId;
        this.amountPaid = amountPaid;
    }

    public String getFastPassId() {
        return this.fastPassId;
    }

    public void setFastPassId(String fastPassId) {
        this.fastPassId = fastPassId;
    }

    public String getStationId() {
        return this.stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Float getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

}