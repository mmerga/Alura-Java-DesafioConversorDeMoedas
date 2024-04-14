package Domain.Models;

import com.google.gson.annotations.SerializedName;

public class ConversionRates {
    @SerializedName("ARS")
    private double ars;
    @SerializedName("BOB")
    private double bob;
    @SerializedName("BRL")
    private double brl;
    @SerializedName("CLP")
    private double clp;
    @SerializedName("COP")
    private double cop;
    @SerializedName("USD")
    private double usd;

    public ConversionRates(){}

    public ConversionRates(double ars, double usd, double cop, double clp, double bob, double brl) {
        this.ars = ars;
        this.usd = usd;
        this.cop = cop;
        this.clp = clp;
        this.bob = bob;
        this.brl = brl;
    }

    public double getArs() {
        return ars;
    }

    public void setArs(double ars) {
        this.ars = ars;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getCop() {
        return cop;
    }

    public void setCop(double cop) {
        this.cop = cop;
    }

    public double getClp() {
        return clp;
    }

    public void setClp(double clp) {
        this.clp = clp;
    }

    public double getBrl() {
        return brl;
    }

    public void setBrl(double brl) {
        this.brl = brl;
    }

    public double getBob() {
        return bob;
    }

    public void setBob(double bob) {
        this.bob = bob;
    }

    @Override
    public String toString() {
        return "ConversionRates{" +
                "ars=" + ars +
                ", bob=" + bob +
                ", brl=" + brl +
                ", clp=" + clp +
                ", cop=" + cop +
                ", usd=" + usd +
                '}';
    }
}
