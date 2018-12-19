/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.model;

/**
 *
 * @author Win 8
 */
public class ResultDetails {
    private Integer ResultDetails_ID;
    private int result_ID;
    private String ResultDetails_result;
    private String ResultDetails_HorseName;
    private String ResultDetails_Win;
    private String ResultDetails_Place;

    public ResultDetails() {
    }

    public ResultDetails(Integer ResultDetails_ID, int result_ID, String ResultDetails_result, String ResultDetails_HorseName, String ResultDetails_Win, String ResultDetails_Place) {
        this.ResultDetails_ID = ResultDetails_ID;
        this.result_ID = result_ID;
        this.ResultDetails_result = ResultDetails_result;
        this.ResultDetails_HorseName = ResultDetails_HorseName;
        this.ResultDetails_Win = ResultDetails_Win;
        this.ResultDetails_Place = ResultDetails_Place;
    }

    /**
     * @return the ResultDetails_ID
     */
    public Integer getResultDetails_ID() {
        return ResultDetails_ID;
    }

    /**
     * @param ResultDetails_ID the ResultDetails_ID to set
     */
    public void setResultDetails_ID(Integer ResultDetails_ID) {
        this.ResultDetails_ID = ResultDetails_ID;
    }

    /**
     * @return the result_ID
     */
    public int getResult_ID() {
        return result_ID;
    }

    /**
     * @param result_ID the result_ID to set
     */
    public void setResult_ID(int result_ID) {
        this.result_ID = result_ID;
    }

    /**
     * @return the ResultDetails_result
     */
    public String getResultDetails_result() {
        return ResultDetails_result;
    }

    /**
     * @param ResultDetails_result the ResultDetails_result to set
     */
    public void setResultDetails_result(String ResultDetails_result) {
        this.ResultDetails_result = ResultDetails_result;
    }

    /**
     * @return the ResultDetails_HorseName
     */
    public String getResultDetails_HorseName() {
        return ResultDetails_HorseName;
    }

    /**
     * @param ResultDetails_HorseName the ResultDetails_HorseName to set
     */
    public void setResultDetails_HorseName(String ResultDetails_HorseName) {
        this.ResultDetails_HorseName = ResultDetails_HorseName;
    }

    /**
     * @return the ResultDetails_Win
     */
    public String getResultDetails_Win() {
        return ResultDetails_Win;
    }

    /**
     * @param ResultDetails_Win the ResultDetails_Win to set
     */
    public void setResultDetails_Win(String ResultDetails_Win) {
        this.ResultDetails_Win = ResultDetails_Win;
    }

    /**
     * @return the ResultDetails_Place
     */
    public String getResultDetails_Place() {
        return ResultDetails_Place;
    }

    /**
     * @param ResultDetails_Place the ResultDetails_Place to set
     */
    public void setResultDetails_Place(String ResultDetails_Place) {
        this.ResultDetails_Place = ResultDetails_Place;
    }
    
}
