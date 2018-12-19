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
public class SingleM {
       private int chitRegistration_ID;
    private String singles_ItemID;
    private String singles_To;
    private String singles_For;
    private String singles_Amount;
    private String singles_Value;
    private String singles_Type;

    public SingleM(int chitRegistration_ID, String singles_ItemID, String singles_To, String singles_For, String singles_Amount, String singles_Value, String singles_Type) {
        this.chitRegistration_ID = chitRegistration_ID;
        this.singles_ItemID = singles_ItemID;
        this.singles_To = singles_To;
        this.singles_For = singles_For;
        this.singles_Amount = singles_Amount;
        this.singles_Value = singles_Value;
        this.singles_Type = singles_Type;
    }

    public SingleM() {
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
     * @return the singles_ItemID
     */
    public String getSingles_ItemID() {
        return singles_ItemID;
    }

    /**
     * @param singles_ItemID the singles_ItemID to set
     */
    public void setSingles_ItemID(String singles_ItemID) {
        this.singles_ItemID = singles_ItemID;
    }

    /**
     * @return the singles_To
     */
    public String getSingles_To() {
        return singles_To;
    }

    /**
     * @param singles_To the singles_To to set
     */
    public void setSingles_To(String singles_To) {
        this.singles_To = singles_To;
    }

    /**
     * @return the singles_For
     */
    public String getSingles_For() {
        return singles_For;
    }

    /**
     * @param singles_For the singles_For to set
     */
    public void setSingles_For(String singles_For) {
        this.singles_For = singles_For;
    }

    /**
     * @return the singles_Amount
     */
    public String getSingles_Amount() {
        return singles_Amount;
    }

    /**
     * @param singles_Amount the singles_Amount to set
     */
    public void setSingles_Amount(String singles_Amount) {
        this.singles_Amount = singles_Amount;
    }

    /**
     * @return the singles_Value
     */
    public String getSingles_Value() {
        return singles_Value;
    }

    /**
     * @param singles_Value the singles_Value to set
     */
    public void setSingles_Value(String singles_Value) {
        this.singles_Value = singles_Value;
    }

    /**
     * @return the singles_Type
     */
    public String getSingles_Type() {
        return singles_Type;
    }

    /**
     * @param singles_Type the singles_Type to set
     */
    public void setSingles_Type(String singles_Type) {
        this.singles_Type = singles_Type;
    }
    
}
