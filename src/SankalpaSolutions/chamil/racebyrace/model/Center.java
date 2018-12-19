/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

import java.io.Serializable;

/**
 *
 * @author Win 8
 */
public class Center implements Serializable {

    private int account_ID;
    private String center_ID;
    private String center_Name;
    private String center_com;
    private String center_paperCash;
    private String center_loan;
    private String center_noCom;
    private String center_lessCom;
    private String center_exp;

    public Center() {
    }

    public Center(String center_Name) {
        this.center_Name = center_Name;
    }

    public Center(String center_ID, String center_Name) {
        this.center_ID = center_ID;
        this.center_Name = center_Name;
    }

    public Center(int account_ID, String center_Name) {
        this.account_ID = account_ID;
        this.center_Name = center_Name;
    }

    public Center(int account_ID, String center_Name, String center_ID) {
        this.account_ID = account_ID;
        this.center_Name = center_Name;
        this.center_ID = center_ID;
    }

    public Center(int account_ID, String center_ID, String center_Name, String center_com, String center_paperCash, String center_loan, String center_noCom, String center_lessCom, String center_exp) {
        this.account_ID = account_ID;
        this.center_ID = center_ID;
        this.center_Name = center_Name;
        this.center_com = center_com;
        this.center_paperCash = center_paperCash;
        this.center_loan = center_loan;
        this.center_noCom = center_noCom;
        this.center_lessCom = center_lessCom;
        this.center_exp = center_exp;
    }

    /**
     * @return the account_ID
     */
    public int getAccount_ID() {
        return account_ID;
    }

    /**
     * @param account_ID the account_ID to set
     */
    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }

    /**
     * @return the center_ID
     */
    public String getCenter_ID() {
        return center_ID;
    }

    /**
     * @param center_ID the center_ID to set
     */
    public void setCenter_ID(String center_ID) {
        this.center_ID = center_ID;
    }

    /**
     * @return the center_Name
     */
    public String getCenter_Name() {
        return center_Name;
    }

    /**
     * @param center_Name the center_Name to set
     */
    public void setCenter_Name(String center_Name) {
        this.center_Name = center_Name;
    }

    /**
     * @return the center_com
     */
    public String getCenter_com() {
        return center_com;
    }

    /**
     * @param center_com the center_com to set
     */
    public void setCenter_com(String center_com) {
        this.center_com = center_com;
    }

    /**
     * @return the center_paperCash
     */
    public String getCenter_paperCash() {
        return center_paperCash;
    }

    /**
     * @param center_paperCash the center_paperCash to set
     */
    public void setCenter_paperCash(String center_paperCash) {
        this.center_paperCash = center_paperCash;
    }

    /**
     * @return the center_loan
     */
    public String getCenter_loan() {
        return center_loan;
    }

    /**
     * @param center_loan the center_loan to set
     */
    public void setCenter_loan(String center_loan) {
        this.center_loan = center_loan;
    }

    /**
     * @return the center_noCom
     */
    public String getCenter_noCom() {
        return center_noCom;
    }

    /**
     * @param center_noCom the center_noCom to set
     */
    public void setCenter_noCom(String center_noCom) {
        this.center_noCom = center_noCom;
    }

    /**
     * @return the center_lessCom
     */
    public String getCenter_lessCom() {
        return center_lessCom;
    }

    /**
     * @param center_lessCom the center_lessCom to set
     */
    public void setCenter_lessCom(String center_lessCom) {
        this.center_lessCom = center_lessCom;
    }

    /**
     * @return the center_exp
     */
    public String getCenter_exp() {
        return center_exp;
    }

    /**
     * @param center_exp the center_exp to set
     */
    public void setCenter_exp(String center_exp) {
        this.center_exp = center_exp;
    }
}
