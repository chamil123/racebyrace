/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Country {

    private int country_ID;
    private String country_Name;

    public Country() {
    }

    public Country(int country_ID, String country_Name) {
        this.country_ID = country_ID;
        this.country_Name = country_Name;
    }

    public Country(String country_Name) {

        this.country_Name = country_Name;
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
     * @return the country_Name
     */
    public String getCountry_Name() {
        return country_Name;
    }

    /**
     * @param country_Name the country_Name to set
     */
    public void setCountry_Name(String country_Name) {
        this.country_Name = country_Name;
    }
}
