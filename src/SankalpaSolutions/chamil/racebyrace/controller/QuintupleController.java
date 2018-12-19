/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.QuintupleM;

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
public class QuintupleController {
      public static int addDoubles(QuintupleM add) throws ClassNotFoundException, SQLException {
        String quary = "insert into quintuples values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getQuintuple_ItemID());
        stm.setObject(3, add.getQuintuple_To());
        stm.setObject(4, add.getQuintuple_For());
        stm.setObject(5, add.getQuintuple_Amount());
        stm.setObject(6, add.getQuintuple_Value());
        stm.setObject(7, add.getQuintuple_Type());
        return stm.executeUpdate();

    }  public static List<QuintupleM> searchAllQuintuplesByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from quintuples WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<QuintupleM> quintupleMList = new ArrayList<QuintupleM>();
        while (res.next()) {
            QuintupleM quin = new QuintupleM(res.getInt("chitRegistration_ID"), res.getString("quintuple_ItemID"), res.getString("quintuple_To"), res.getString("quintuple_For"), res.getString("quintuple_Amount"), res.getString("quintuple_Value"), res.getString("quintuple_Type"));
            quintupleMList.add(quin);
        }
        return quintupleMList;

    }
}
