/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Bracket {
    private int chitRegistration_ID;
    private String bracket_ItemID;
    private String bracket_To;
    private String bracket_For;
    private String bracket_Amount;
    private String bracket_Type;

    public Bracket() {
    }

    public Bracket(int chitRegistration_ID, String bracket_ItemID, String bracket_To, String bracket_For, String bracket_Amount, String bracket_Type) {
        this.chitRegistration_ID = chitRegistration_ID;
        this.bracket_ItemID = bracket_ItemID;
        this.bracket_To = bracket_To;
        this.bracket_For = bracket_For;
        this.bracket_Amount = bracket_Amount;
        this.bracket_Type = bracket_Type;
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
     * @return the bracket_ItemID
     */
    public String getBracket_ItemID() {
        return bracket_ItemID;
    }

    /**
     * @param bracket_ItemID the bracket_ItemID to set
     */
    public void setBracket_ItemID(String bracket_ItemID) {
        this.bracket_ItemID = bracket_ItemID;
    }

    /**
     * @return the bracket_To
     */
    public String getBracket_To() {
        return bracket_To;
    }

    /**
     * @param bracket_To the bracket_To to set
     */
    public void setBracket_To(String bracket_To) {
        this.bracket_To = bracket_To;
    }

    /**
     * @return the bracket_For
     */
    public String getBracket_For() {
        return bracket_For;
    }

    /**
     * @param bracket_For the bracket_For to set
     */
    public void setBracket_For(String bracket_For) {
        this.bracket_For = bracket_For;
    }

    /**
     * @return the bracket_Amount
     */
    public String getBracket_Amount() {
        return bracket_Amount;
    }

    /**
     * @param bracket_Amount the bracket_Amount to set
     */
    public void setBracket_Amount(String bracket_Amount) {
        this.bracket_Amount = bracket_Amount;
    }

    /**
     * @return the bracket_Type
     */
    public String getBracket_Type() {
        return bracket_Type;
    }

    /**
     * @param bracket_Type the bracket_Type to set
     */
    public void setBracket_Type(String bracket_Type) {
        this.bracket_Type = bracket_Type;
    }

    
    
}
