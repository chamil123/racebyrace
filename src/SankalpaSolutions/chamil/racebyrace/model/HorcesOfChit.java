/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class HorcesOfChit {

    private Integer horcesOfChit_ID;
    private int horcesOfChit_ItemID;
    private int chitRegistration_ID;
    private String horcesOfChit_HorseName;
    private String horcesOfChit_Pora;

    public HorcesOfChit() {
    }

    public HorcesOfChit(Integer horcesOfChit_ID, int horcesOfChit_ItemID, int chitRegistration_ID, String horcesOfChit_HorseName, String horcesOfChit_Pora) {
        this.horcesOfChit_ID = horcesOfChit_ID;
        this.horcesOfChit_ItemID = horcesOfChit_ItemID;
        this.chitRegistration_ID = chitRegistration_ID;
        this.horcesOfChit_HorseName = horcesOfChit_HorseName;
        this.horcesOfChit_Pora = horcesOfChit_Pora;
    }

    /**
     * @return the horcesOfChit_ID
     */
    public Integer getHorcesOfChit_ID() {
        return horcesOfChit_ID;
    }

    /**
     * @param horcesOfChit_ID the horcesOfChit_ID to set
     */
    public void setHorcesOfChit_ID(Integer horcesOfChit_ID) {
        this.horcesOfChit_ID = horcesOfChit_ID;
    }

    /**
     * @return the horcesOfChit_ItemID
     */
    public int getHorcesOfChit_ItemID() {
        return horcesOfChit_ItemID;
    }

    /**
     * @param horcesOfChit_ItemID the horcesOfChit_ItemID to set
     */
    public void setHorcesOfChit_ItemID(int horcesOfChit_ItemID) {
        this.horcesOfChit_ItemID = horcesOfChit_ItemID;
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
     * @return the horcesOfChit_HorseName
     */
    public String getHorcesOfChit_HorseName() {
        return horcesOfChit_HorseName;
    }

    /**
     * @param horcesOfChit_HorseName the horcesOfChit_HorseName to set
     */
    public void setHorcesOfChit_HorseName(String horcesOfChit_HorseName) {
        this.horcesOfChit_HorseName = horcesOfChit_HorseName;
    }

    /**
     * @return the horcesOfChit_Pora
     */
    public String getHorcesOfChit_Pora() {
        return horcesOfChit_Pora;
    }

    /**
     * @param horcesOfChit_Pora the horcesOfChit_Pora to set
     */
    public void setHorcesOfChit_Pora(String horcesOfChit_Pora) {
        this.horcesOfChit_Pora = horcesOfChit_Pora;
    }
    
}
