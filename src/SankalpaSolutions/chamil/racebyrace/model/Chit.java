/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Chit {

    private Integer chit_ID;
    private int chitRegistration_ID;
    private String chitRegistration_chitNumber;
    private double chit_Amount;
    private double chit_Paymrnt;
    private double chit_TotalNotRuns;

    public Chit() {
    }

    public Chit(Integer chit_ID, int chitRegistration_ID, String chitRegistration_chitNumber, double chit_Amount, double chit_Paymrnt, double chit_TotalNotRuns) {
        this.chit_ID = chit_ID;
        this.chitRegistration_ID = chitRegistration_ID;
        this.chitRegistration_chitNumber = chitRegistration_chitNumber;
        this.chit_Amount = chit_Amount;
        this.chit_Paymrnt = chit_Paymrnt;
        this.chit_TotalNotRuns = chit_TotalNotRuns;
    }

   

    /**
     * @return the chit_ID
     */
    public Integer getChit_ID() {
        return chit_ID;
    }

    /**
     * @param chit_ID the chit_ID to set
     */
    public void setChit_ID(Integer chit_ID) {
        this.chit_ID = chit_ID;
    }

    /**
     * @return the chitRegistration_ID
     */
    public int getChitRegistration_ID() {
        return chitRegistration_ID;
    }

    /**
     * @param chitRegistration_ID the chitRegistration_ID to set
     */
    public void setChitRegistration_ID(int chitRegistration_ID) {
        this.chitRegistration_ID = chitRegistration_ID;
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
     * @return the chit_Amount
     */
    public double getChit_Amount() {
        return chit_Amount;
    }

    /**
     * @param chit_Amount the chit_Amount to set
     */
    public void setChit_Amount(double chit_Amount) {
        this.chit_Amount = chit_Amount;
    }

    /**
     * @return the chit_Paymrnt
     */
    public double getChit_Paymrnt() {
        return chit_Paymrnt;
    }

    /**
     * @param chit_Paymrnt the chit_Paymrnt to set
     */
    public void setChit_Paymrnt(double chit_Paymrnt) {
        this.chit_Paymrnt = chit_Paymrnt;
    }

    /**
     * @param chit_TotalNotRuns the chit_TotalNotRuns to set
     */
    public void setChit_TotalNotRuns(double chit_TotalNotRuns) {
        this.chit_TotalNotRuns = chit_TotalNotRuns;
    }

    /**
     * @return the chit_TotalNotRuns
     */
    public double getChit_TotalNotRuns() {
        return chit_TotalNotRuns;
    }

}
