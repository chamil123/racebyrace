/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class RaceCard {

    private Integer raceCard_ID;
    private int country_ID;
    private String pora;
    private String raceCard_PoraNumber;
    private String raceCard_HorseName;

    public RaceCard() {
    }

    public RaceCard(String raceCard_HorseName) {
        this.raceCard_HorseName = raceCard_HorseName;
    }
    public RaceCard(String pora,String raceCard_HorseName) {
        this.pora = pora;
         this.raceCard_HorseName = raceCard_HorseName;
    }

    public RaceCard(Integer raceCard_ID, int country_ID, String pora, String raceCard_PoraNumber, String raceCard_HorseName) {
        this.raceCard_ID = raceCard_ID;
        this.country_ID = country_ID;
        this.pora = pora;
        this.raceCard_PoraNumber = raceCard_PoraNumber;
        this.raceCard_HorseName = raceCard_HorseName;
    }

    /**
     * @return the raceCard_ID
     */
    public Integer getRaceCard_ID() {
        return raceCard_ID;
    }

    /**
     * @param raceCard_ID the raceCard_ID to set
     */
    public void setRaceCard_ID(int raceCard_ID) {
        this.raceCard_ID = raceCard_ID;
    }

    /**
     * @return the country_ID
     */
    public int getCountry_ID() {
        return country_ID;
    }

    /**
     * @param country_ID the country_ID to set
     */
    public void setCountry_ID(int country_ID) {
        this.country_ID = country_ID;
    }

    /**
     * @return the pora
     */
    public String getPora() {
        return pora;
    }

    /**
     * @param pora the pora to set
     */
    public void setPora(String pora) {
        this.pora = pora;
    }

    /**
     * @return the raceCard_PoraNumber
     */
    public String getRaceCard_PoraNumber() {
        return raceCard_PoraNumber;
    }

    /**
     * @param raceCard_PoraNumber the raceCard_PoraNumber to set
     */
    public void setRaceCard_PoraNumber(String raceCard_PoraNumber) {
        this.raceCard_PoraNumber = raceCard_PoraNumber;
    }

    /**
     * @return the raceCard_HorseName
     */
    public String getRaceCard_HorseName() {
        return raceCard_HorseName;
    }

    /**
     * @param raceCard_HorseName the raceCard_HorseName to set
     */
    public void setRaceCard_HorseName(String raceCard_HorseName) {
        this.raceCard_HorseName = raceCard_HorseName;
    }
}
