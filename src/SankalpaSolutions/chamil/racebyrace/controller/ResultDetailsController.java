/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.ResultDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win 8
 */
public class ResultDetailsController {

    public static int addResultDetails(ResultDetails add) throws ClassNotFoundException, SQLException {
        String quary = "insert into resultdetails values(?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getResultDetails_ID());
        stm.setObject(2, add.getResult_ID());
        stm.setObject(3, add.getResultDetails_result());
        stm.setObject(4, add.getResultDetails_HorseName());
        stm.setObject(5, add.getResultDetails_Win());
        stm.setObject(6, add.getResultDetails_Place());
        return stm.executeUpdate();

    }

    public static List<ResultDetails> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from resultdetails";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<ResultDetails> resultdetailsList = new ArrayList<ResultDetails>();
        while (res.next()) {
            ResultDetails resultdetails = new ResultDetails(res.getInt("ResultDetails_ID"), res.getInt("result_ID"), res.getString("ResultDetails_result"), res.getString("ResultDetails_HorseName"), res.getString("ResultDetails_Win"), res.getString("ResultDetails_Place"));
            resultdetailsList.add(resultdetails);
        }
        return resultdetailsList;
    }
}
