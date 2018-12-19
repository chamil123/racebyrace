/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class ChitRegistration {

    private Integer chitRegistration_ID;
    private int center_ID;
    private String chitRegistration_chitNumber;
    private double chitRegistration_CurrentInvestment;
    private double chitRegistration_ActualInvestment;
    private double chitRegistration_TotLessCommision;
    private String chitRegistration_Date;

    public ChitRegistration() {
    }

    public ChitRegistration(Integer chitRegistration_ID, int center_ID, String chitRegistration_chitNumber, double chitRegistration_CurrentInvestment, double chitRegistration_ActualInvestment, double chitRegistration_TotLessCommision, String chitRegistration_Date) {
        this.chitRegistration_ID = chitRegistration_ID;
        this.center_ID = center_ID;
        this.chitRegistration_chitNumber = chitRegistration_chitNumber;
        this.chitRegistration_CurrentInvestment = chitRegistration_CurrentInvestment;
        this.chitRegistration_ActualInvestment = chitRegistration_ActualInvestment;
        this.chitRegistration_TotLessCommision = chitRegistration_TotLessCommision;
        this.chitRegistration_Date = chitRegistration_Date;
    }

    public ChitRegistration(double chitRegistration_ActualInvestment) {
        this.chitRegistration_ActualInvestment = chitRegistration_ActualInvestment;
    }

    public ChitRegistration(int center_ID) {
        this.center_ID = center_ID;
    }

  
    /**
     * @return the chitRegistration_ID
     */
    public Integer getChitRegistration_ID() {
        return chitRegistration_ID;
    }

    /**
     * @param chitRegistration_ID the chitRegistration_ID to set
     */
    public void setChitRegistration_ID(Integer chitRegistration_ID) {
        this.chitRegistration_ID = chitRegistration_ID;
    }

    /**
     * @return the center_ID
     */
    public int getCenter_ID() {
        return center_ID;
    }

    /**
     * @param center_ID the center_ID to set
     */
    public void setCenter_ID(int center_ID) {
        this.center_ID = center_ID;
    }

    /**
     * @return the chitRegistration_chitNumber
     */
    public String getChitRegistration_chitNumber() {
        return chitRegistration_chitNumber;
    }

    /**
     * @param chitRegistration_chitNumber the chitRegistration_chitNumber to set
     */
    public void setChitRegistration_chitNumber(String chitRegistration_chitNumber) {
        this.chitRegistration_chitNumber = chitRegistration_chitNumber;
    }

    /**
     * @return the chitRegistration_CurrentInvestment
     */
    public double getChitRegistration_CurrentInvestment() {
        return chitRegistration_CurrentInvestment;
    }

    /**
     * @param chitRegistration_CurrentInvestment the
     * chitRegistration_CurrentInvestment to set
     */
    public void setChitRegistration_CurrentInvestment(double chitRegistration_CurrentInvestment) {
        this.chitRegistration_CurrentInvestment = chitRegistration_CurrentInvestment;
    }

    /**
     * @return the chitRegistration_ActualInvestment
     */
    public double getChitRegistration_ActualInvestment() {
        return chitRegistration_ActualInvestment;
    }

    /**
     * @param chitRegistration_ActualInvestment the
     * chitRegistration_ActualInvestment to set
     */
    public void setChitRegistration_ActualInvestment(double chitRegistration_ActualInvestment) {
        this.chitRegistration_ActualInvestment = chitRegistration_ActualInvestment;
    }

    /**
     * @return the chitRegistration_Date
     */
    public String getChitRegistration_Date() {
        return chitRegistration_Date;
    }

    /**
     * @param chitRegistration_Date the chitRegistration_Date to set
     */
    public void setChitRegistration_Date(String chitRegistration_Date) {
        this.chitRegistration_Date = chitRegistration_Date;
    }

    /**
     * @return the chitRegistration_TotLessCommision
     */
    public double getChitRegistration_TotLessCommision() {
        return chitRegistration_TotLessCommision;
    }

    /**
     * @param chitRegistration_TotLessCommision the chitRegistration_TotLessCommision to set
     */
    public void setChitRegistration_TotLessCommision(double chitRegistration_TotLessCommision) {
        this.chitRegistration_TotLessCommision = chitRegistration_TotLessCommision;
    }
}
