/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class Results {

    private Integer result_ID;
    private String pora;
   
  
    public Results() {
    }

    public Results(Integer result_ID, String pora) {
        this.result_ID = result_ID;
        this.pora = pora;
       
    }

    /**
     * @return the result_ID
     */
    public Integer getResult_ID() {
        return result_ID;
    }

    /**
     * @param result_ID the result_ID to set
     */
    public void setResult_ID(Integer result_ID) {
        this.result_ID = result_ID;
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
