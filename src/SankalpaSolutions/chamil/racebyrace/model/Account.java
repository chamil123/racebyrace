/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Account {

    private Integer account_ID;
    private String account_Name;

    public Account() {
    }

    public Account(String account_Name) {
        this.account_Name = account_Name;
    }

    public Account(Integer account_ID, String account_Name) {
        this.account_ID = account_ID;
        this.account_Name = account_Name;
    }

    /**
     * @return the account_ID
     */
    public Integer getAccount_ID() {
        return account_ID;
    }

    /**
     * @param account_ID the account_ID to set
     */
    public void setAccount_ID(Integer account_ID) {
        this.account_ID = account_ID;
    }

    /**
     * @return the account_Name
     */
    public String getAccount_Name() {
        return account_Name;
    }

    /**
     * @param account_Name the account_Name to set
     */
    public void setAccount_Name(String account_Name) {
        this.account_Name = account_Name;
    }
}
