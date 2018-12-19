/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.Maths.Doubles;
import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.DoublesM;
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
public class DoublesController {

    public static int addDoubles(DoublesM add) throws ClassNotFoundException, SQLException {
        String quary = "insert into doubles values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getDoubles_ItemID());
        stm.setObject(3, add.getDoubles_To());
        stm.setObject(4, add.getDoubles_For());
        stm.setObject(5, add.getDoubles_Amount());
        stm.setObject(6, add.getDoubles_Value());
        stm.setObject(7, add.getDoubles_Type());
          return stm.executeUpdate();

    }
     public static List<DoublesM> searchAllDoublesByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from doubles WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<DoublesM> doublesMList = new ArrayList<DoublesM>();
        while (res.next()) {
            DoublesM doubles = new DoublesM(res.getInt("chitRegistration_ID"), res.getString("doubles_ItemID"), res.getString("doubles_To"), res.getString("doubles_For"), res.getString("doubles_Amount"), res.getString("doubles_Value"), res.getString("doubles_Type"));
            doublesMList.add(doubles);
        }
        return doublesMList;

    }
}
