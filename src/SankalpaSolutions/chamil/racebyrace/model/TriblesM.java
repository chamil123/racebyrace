/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class TriblesM {

    private int chitRegistration_ID;
    private String tribles_ItemID;
    private String tribles_To;
    private String tribles_For;
    private String tribles_Amount;
    private String tribles_Value;
    private String tribles_Type;

    public TriblesM(int chitRegistration_ID, String tribles_ItemID, String tribles_To, String tribles_For, String tribles_Amount, String tribles_Value, String tribles_Type) {
        this.chitRegistration_ID = chitRegistration_ID;
        this.tribles_ItemID = tribles_ItemID;
        this.tribles_To = tribles_To;
        this.tribles_For = tribles_For;
        this.tribles_Amount = tribles_Amount;
        this.tribles_Value = tribles_Value;
        this.tribles_Type = tribles_Type;
    }

    public TriblesM() {
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
     * @return the tribles_ItemID
     */
    public String getTribles_ItemID() {
        return tribles_ItemID;
    }

    /**
     * @param tribles_ItemID the tribles_ItemID to set
     */
    public void setTribles_ItemID(String tribles_ItemID) {
        this.tribles_ItemID = tribles_ItemID;
    }

    /**
     * @return the tribles_To
     */
    public String getTribles_To() {
        return tribles_To;
    }

    /**
     * @param tribles_To the tribles_To to set
     */
    public void setTribles_To(String tribles_To) {
        this.tribles_To = tribles_To;
    }

    /**
     * @return the tribles_For
     */
    public String getTribles_For() {
        return tribles_For;
    }

    /**
     * @param tribles_For the tribles_For to set
     */
    public void setTribles_For(String tribles_For) {
        this.tribles_For = tribles_For;
    }

    /**
     * @return the tribles_Amount
     */
    public String getTribles_Amount() {
        return tribles_Amount;
    }

    /**
     * @param tribles_Amount the tribles_Amount to set
     */
    public void setTribles_Amount(String tribles_Amount) {
        this.tribles_Amount = tribles_Amount;
    }

    /**
     * @return the tribles_Value
     */
    public String getTribles_Value() {
        return tribles_Value;
    }

    /**
     * @param tribles_Value the tribles_Value to set
     */
    public void setTribles_Value(String tribles_Value) {
        this.tribles_Value = tribles_Value;
    }

    /**
     * @return the tribles_Type
     */
    public String getTribles_Type() {
        return tribles_Type;
    }

    /**
     * @param tribles_Type the tribles_Type to set
     */
    public void setTribles_Type(String tribles_Type) {
        this.tribles_Type = tribles_Type;
    }
    
}
