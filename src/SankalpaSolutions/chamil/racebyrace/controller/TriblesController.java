/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.controller;

import SankalpaSolutions.chamil.racebyrace.dbConnection.MysqlDbConnection;
import SankalpaSolutions.chamil.racebyrace.model.TriblesM;

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
public class TriblesController {

    public static int addDoubles(TriblesM add) throws ClassNotFoundException, SQLException {
        String quary = "insert into tribles values(?,?,?,?,?,?,?)";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        stm.setObject(1, add.getChitRegistration_ID());
        stm.setObject(2, add.getTribles_ItemID());
        stm.setObject(3, add.getTribles_To());
        stm.setObject(4, add.getTribles_For());
        stm.setObject(5, add.getTribles_Amount());
        stm.setObject(6, add.getTribles_Value());
        stm.setObject(7, add.getTribles_Type());
        return stm.executeUpdate();

    }

    public static List<TriblesM> searchAllTriblesByIDNumber(int IDNumber) throws ClassNotFoundException, SQLException {
        String quary = "select * from tribles WHERE chitRegistration_ID='" + IDNumber + "'";
        Connection conn = MysqlDbConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(quary);
        ResultSet res = stm.executeQuery();
        List<TriblesM> tribleMList = new ArrayList<TriblesM>();
        while (res.next()) {
            TriblesM trible = new TriblesM(res.getInt("chitRegistration_ID"), res.getString("tribles_ItemID"), res.getString("tribles_To"), res.getString("tribles_For"), res.getString("tribles_Amount"), res.getString("tribles_Value"), res.getString("tribles_Type"));
            tribleMList.add(trible);
        }
        return tribleMList;

    }
}
