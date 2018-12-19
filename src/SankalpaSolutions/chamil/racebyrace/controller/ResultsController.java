/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.Results;
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
public class ResultsController {

    public static int addResults(Results add) throws ClassNotFoundException, SQLException {
        String quary = "insert into results values(?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getResult_ID());
        stm.setObject(2, add.getPora());
    
        return stm.executeUpdate();

    }

    public static int serchMaxItem() throws ClassNotFoundException, SQLException {
        String quary = "SELECT MAX(result_ID)FROM results";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        int max = 1;
        while (res.next()) {
            max = res.getInt("MAX(result_ID)");
            max++;
        }
        return max;
    }

    public static List<Results> serchAllItem() throws ClassNotFoundException, SQLException {
        String quary = "select * from results";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<Results> resultsList = new ArrayList<Results>();
        while (res.next()) {
            Results results = new Results(res.getInt("result_ID"), res.getString("pora"));
            resultsList.add(results);
        }
        return resultsList;
    }
}
