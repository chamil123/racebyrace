/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Chamil Pathirana
 */
public class Horse {

    private Integer horse_id;
    private String horse_name;
    private int pora_ID;
    private int country_ID;
    private int horse_counter;

    public Horse(String horse_name, int pora_ID) {

        this.horse_name = horse_name;
        this.pora_ID = pora_ID;

    }

    public Horse(Integer horse_id, String horse_name, int pora_ID, int country_ID) {
        this.horse_id = horse_id;
        this.horse_name = horse_name;
        this.pora_ID = pora_ID;
        this.country_ID = country_ID;
    }

    public Horse(Integer horse_id, String horse_name, int pora_ID, int country_ID, int horse_counter) {
        this.horse_id = horse_id;
        this.horse_name = horse_name;
        this.pora_ID = pora_ID;
        this.country_ID = country_ID;
        this.horse_counter = horse_counter;
    }

    /**
     * @return the horse_id
     */
    public Integer getHorse_id() {
        return horse_id;
    }

    /**
     * @param horse_id the horse_id to set
     */
    public void setHorse_id(Integer horse_id) {
        this.horse_id = horse_id;
    }

    /**
     * @return the horse_name
     */
    public String getHorse_name() {
        return horse_name;
    }

    /**
     * @param horse_name the horse_name to set
     */
    public void setHorse_name(String horse_name) {
        this.horse_name = horse_name;
    }

    /**
     * @return the pora_ID
     */
    public int getPora_ID() {
        return pora_ID;
    }

    /**
     * @param pora_ID the pora_ID to set
     */
    public void setPora_ID(int pora_ID) {
        this.pora_ID = pora_ID;
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
     * @return the horse_counter
     */
    public int getHorse_counter() {
        return horse_counter;
    }

    /**
     * @param horse_counter the horse_counter to set
     */
    public void setHorse_counter(int horse_counter) {
        this.horse_counter = horse_counter;
    }

}
