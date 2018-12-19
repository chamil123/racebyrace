/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Pora {
    private Integer pora_ID;
    private int country_ID;
    private String pora;

    public Pora() {
    }

    public Pora(Integer pora_ID, int country_ID, String pora) {
        this.pora_ID = pora_ID;
        this.country_ID = country_ID;
        this.pora = pora;
    }
    public Pora( String pora) {

        this.pora = pora;
    }

    /**
     * @return the pora_ID
     */
    public Integer getPora_ID() {
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
    
    
}
