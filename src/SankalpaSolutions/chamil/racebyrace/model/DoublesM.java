/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class DoublesM {

    private int chitRegistration_ID;
    private String doubles_ItemID;
    private String doubles_To;
    private String doubles_For;
    private String doubles_Amount;
    private String doubles_Value;
    private String doubles_Type;

    public DoublesM() {
    }

    public DoublesM(int chitRegistration_ID, String doubles_ItemID, String doubles_To, String doubles_For, String doubles_Amount, String doubles_Value, String doubles_Type) {
        this.chitRegistration_ID = chitRegistration_ID;
        this.doubles_ItemID = doubles_ItemID;
        this.doubles_To = doubles_To;
        this.doubles_For = doubles_For;
        this.doubles_Amount = doubles_Amount;
        this.doubles_Value = doubles_Value;
        this.doubles_Type = doubles_Type;
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
     * @return the doubles_ItemID
     */
    public String getDoubles_ItemID() {
        return doubles_ItemID;
    }

    /**
     * @param doubles_ItemID the doubles_ItemID to set
     */
    public void setDoubles_ItemID(String doubles_ItemID) {
        this.doubles_ItemID = doubles_ItemID;
    }

    /**
     * @return the doubles_To
     */
    public String getDoubles_To() {
        return doubles_To;
    }

    /**
     * @param doubles_To the doubles_To to set
     */
    public void setDoubles_To(String doubles_To) {
        this.doubles_To = doubles_To;
    }

    /**
     * @return the doubles_For
     */
    public String getDoubles_For() {
        return doubles_For;
    }

    /**
     * @param doubles_For the doubles_For to set
     */
    public void setDoubles_For(String doubles_For) {
        this.doubles_For = doubles_For;
    }

    /**
     * @return the doubles_Amount
     */
    public String getDoubles_Amount() {
        return doubles_Amount;
    }

    /**
     * @param doubles_Amount the doubles_Amount to set
     */
    public void setDoubles_Amount(String doubles_Amount) {
        this.doubles_Amount = doubles_Amount;
    }

    /**
     * @return the doubles_Value
     */
    public String getDoubles_Value() {
        return doubles_Value;
    }

    /**
     * @param doubles_Value the doubles_Value to set
     */
    public void setDoubles_Value(String doubles_Value) {
        this.doubles_Value = doubles_Value;
    }

    /**
     * @return the doubles_Type
     */
    public String getDoubles_Type() {
        return doubles_Type;
    }

    /**
     * @param doubles_Type the doubles_Type to set
     */
    public void setDoubles_Type(String doubles_Type) {
        this.doubles_Type = doubles_Type;
    }
}
