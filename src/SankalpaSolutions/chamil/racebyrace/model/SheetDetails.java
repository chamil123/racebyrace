/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class SheetDetails {

    private Integer sheetDetails_ID;
    private String sheetDetails_Date;
    private String center_ID;
    private double sheetDetails_FC;
    private double sheetDetails_Cash;
    private double sheetDetails_Excess;
    private double sheetDetails_PD;

    public SheetDetails() {
    }

    public SheetDetails(Integer sheetDetails_ID, String sheetDetails_Date, String center_ID, double sheetDetails_FC, double sheetDetails_Cash, double sheetDetails_Excess, double sheetDetails_PD) {
        this.sheetDetails_ID = sheetDetails_ID;
        this.sheetDetails_Date = sheetDetails_Date;
        this.center_ID = center_ID;
        this.sheetDetails_FC = sheetDetails_FC;
        this.sheetDetails_Cash = sheetDetails_Cash;
        this.sheetDetails_Excess = sheetDetails_Excess;
        this.sheetDetails_PD = sheetDetails_PD;
    }

   
    

    /**
     * @return the sheetDetails_ID
     */
    public Integer getSheetDetails_ID() {
        return sheetDetails_ID;
    }

    /**
     * @param sheetDetails_ID the sheetDetails_ID to set
     */
    public void setSheetDetails_ID(Integer sheetDetails_ID) {
        this.sheetDetails_ID = sheetDetails_ID;
    }

    /**
     * @return the sheetDetails_Date
     */
    public String getSheetDetails_Date() {
        return sheetDetails_Date;
    }

    /**
     * @param sheetDetails_Date the sheetDetails_Date to set
     */
    public void setSheetDetails_Date(String sheetDetails_Date) {
        this.sheetDetails_Date = sheetDetails_Date;
    }

    /**
     * @return the center_ID
     */
    public String getCenter_ID() {
        return center_ID;
    }

    /**
     * @param center_ID the center_ID to set
     */
    public void setCenter_ID(String center_ID) {
        this.center_ID = center_ID;
    }

    /**
     * @return the sheetDetails_FC
     */
    public double getSheetDetails_FC() {
        return sheetDetails_FC;
    }

    /**
     * @param sheetDetails_FC the sheetDetails_FC to set
     */
    public void setSheetDetails_FC(double sheetDetails_FC) {
        this.sheetDetails_FC = sheetDetails_FC;
    }

    /**
     * @return the sheetDetails_Excess
     */
    public double getSheetDetails_Excess() {
        return sheetDetails_Excess;
    }

    /**
     * @param sheetDetails_Excess the sheetDetails_Excess to set
     */
    public void setSheetDetails_Excess(double sheetDetails_Excess) {
        this.sheetDetails_Excess = sheetDetails_Excess;
    }

    /**
     * @return the sheetDetails_PD
     */
    public double getSheetDetails_PD() {
        return sheetDetails_PD;
    }

    /**
     * @param sheetDetails_PD the sheetDetails_PD to set
     */
    public void setSheetDetails_PD(double sheetDetails_PD) {
        this.sheetDetails_PD = sheetDetails_PD;
    }

    /**
     * @return the sheetDetails_Cash
     */
    public double getSheetDetails_Cash() {
        return sheetDetails_Cash;
    }

    /**
     * @param sheetDetails_Cash the sheetDetails_Cash to set
     */
    public void setSheetDetails_Cash(double sheetDetails_Cash) {
        this.sheetDetails_Cash = sheetDetails_Cash;
    }
    
}
